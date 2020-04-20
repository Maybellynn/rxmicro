/*
 * Copyright 2019 https://rxmicro.io
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

package io.rxmicro.config;

/**
 * Defines sources for configuration.
 *
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
public enum ConfigSource {

    /**
     * Hardcoded config using annotations.
     *
     * @see DefaultConfigValue
     */
    DEFAULT_CONFIG_VALUES,

    /**
     * Config from classpath:rxmicro.properties
     */
    RXMICRO_CLASS_PATH_RESOURCE,

    /**
     * Config from classpath:${name_space}.properties
     */
    SEPARATE_CLASS_PATH_RESOURCE,

    /**
     * Config from env variables
     *
     * export name_space.property=value
     */
    ENVIRONMENT_VARIABLES,

    /**
     * Config from file: ~/rxmicro.properties
     */
    RXMICRO_FILE_AT_THE_HOME_DIR,

    /**
     * Config from file: ~/.rxmicro/rxmicro.properties
     */
    RXMICRO_FILE_AT_THE_RXMICRO_CONFIG_DIR,

    /**
     * Config from file: ./rxmicro.properties
     */
    RXMICRO_FILE_AT_THE_CURRENT_DIR,

    /**
     * Config from file: ~/${name_space}.properties
     */
    SEPARATE_FILE_AT_THE_HOME_DIR,

    /**
     * Config from file: ~/.rxmicro/${name_space}.properties
     */
    SEPARATE_FILE_AT_THE_RXMICRO_CONFIG_DIR,

    /**
     * Config from file: ./${name_space}.properties
     */
    SEPARATE_FILE_AT_THE_CURRENT_DIR,

    /**
     * Config from Java system properties
     *
     * java ... -Dname_space.property=value ...
     */
    JAVA_SYSTEM_PROPERTIES
}