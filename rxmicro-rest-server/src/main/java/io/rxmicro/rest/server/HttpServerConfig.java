/*
 * Copyright 2019 http://rxmicro.io
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

package io.rxmicro.rest.server;

import io.rxmicro.http.HttpConfig;
import io.rxmicro.http.ProtocolSchema;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
public class HttpServerConfig extends HttpConfig {

    private boolean startTimeTrackerEnabled = true;

    public HttpServerConfig() {
        setHost("0.0.0.0");
    }

    public boolean isStartTimeTrackerEnabled() {
        return startTimeTrackerEnabled;
    }

    public HttpServerConfig setStartTimeTrackerEnabled(final boolean startTimeTrackerEnabled) {
        this.startTimeTrackerEnabled = startTimeTrackerEnabled;
        return this;
    }

    @Override
    public HttpServerConfig setSchema(final ProtocolSchema schema) {
        return (HttpServerConfig) super.setSchema(schema);
    }

    @Override
    public HttpServerConfig setHost(final String host) {
        return (HttpServerConfig) super.setHost(host);
    }

    @Override
    public HttpServerConfig setPort(final int port) {
        return (HttpServerConfig) super.setPort(port);
    }

    @Override
    public HttpServerConfig setConnectionString(final String connectionString) {
        return (HttpServerConfig) super.setConnectionString(connectionString);
    }
}
