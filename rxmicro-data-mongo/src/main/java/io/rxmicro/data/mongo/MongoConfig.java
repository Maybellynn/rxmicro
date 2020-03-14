/*
 * Copyright (c) 2020. http://rxmicro.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rxmicro.data.mongo;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import io.rxmicro.config.Config;
import org.bson.codecs.configuration.CodecRegistry;

import java.util.Set;
import java.util.TreeSet;

import static io.rxmicro.common.util.Formats.format;
import static io.rxmicro.common.util.Requires.require;
import static io.rxmicro.config.Networks.validatePort;
import static io.rxmicro.data.mongo.internal.RxMicroCodecRegistries.DEFAULT_CODEC_REGISTRIES;
import static java.util.Comparator.comparing;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
public final class MongoConfig extends Config {

    public static final String DEFAULT_HOST = "localhost";

    public static final int DEFAULT_PORT = 27017;

    public static final String DEFAULT_DB = "db";

    private final Set<CodecRegistry> codecRegistries = new TreeSet<>(comparing(o -> o.getClass().getName()));

    private final MongoClientSettings.Builder builder = MongoClientSettings.builder()
            .applyConnectionString(new ConnectionString(format("mongodb://?:?", DEFAULT_HOST, DEFAULT_PORT)));

    private String host = DEFAULT_HOST;

    private int port = DEFAULT_PORT;

    private String database = DEFAULT_DB;

    public MongoConfig() {
        codecRegistries.addAll(DEFAULT_CODEC_REGISTRIES);
    }

    /**
     * Sets the server host name
     *
     * @param host host name
     * @return A reference to this {@code MongoConfig}
     */
    public MongoConfig setHost(final String host) {
        this.host = require(host);
        builder.applyConnectionString(new ConnectionString(getConnectionString()));
        return this;
    }

    /**
     * Sets the server port
     *
     * @param port server port
     * @return A reference to this {@code MongoConfig}
     */
    public MongoConfig setPort(final int port) {
        this.port = validatePort(port);
        builder.applyConnectionString(new ConnectionString(getConnectionString()));
        return this;
    }

    public String getDatabase() {
        return database;
    }

    /**
     * Sets the database name
     *
     * @param database database name
     * @return A reference to this {@code MongoConfig}
     */
    public MongoConfig setDatabase(final String database) {
        this.database = require(database);
        return this;
    }

    public String getConnectionString() {
        return format("mongodb://?:?", host, port);
    }

    public Set<CodecRegistry> getCodecRegistries() {
        return codecRegistries;
    }

    public MongoClientSettings.Builder getMongoClientSettingsBuilder() {
        return builder;
    }

    public MongoClientSettings buildMongoClientSettings() {
        return builder
                .codecRegistry(fromRegistries(codecRegistries.toArray(new CodecRegistry[0])))
                .build();
    }

    @Override
    public String toString() {
        return "MongoConfig {" +
                "connectionString='" + getConnectionString() + '\'' +
                ", database='" + database + '\'' +
                '}';
    }
}
