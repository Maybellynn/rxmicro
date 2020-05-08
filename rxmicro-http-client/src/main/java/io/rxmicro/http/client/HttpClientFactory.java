/*
 * Copyright (c) 2020. https://rxmicro.io
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

package io.rxmicro.http.client;

import io.rxmicro.config.Secrets;

/**
 * Utility class that must be used to get an instance of the low-level reactive HTTP client
 *
 * @author nedis
 * @since 0.1
 * @see HttpClient
 * @see HttpClientContentConverter
 * @see Secrets
 */
public interface HttpClientFactory {

    /**
     * Creates a new instance of low-level reactive {@link HttpClient}
     *
     * @param loggerClass the logger class
     * @param httpClientConfig the HTTP client config. See {@link HttpClientConfig}
     * @param secrets the specified secrets. See {@link Secrets}
     * @param contentConverter the specified content converter. See {@link HttpClientContentConverter}
     * @return a new instance of low-level reactive {@link HttpClient}
     */
    HttpClient create(Class<?> loggerClass,
                      HttpClientConfig httpClientConfig,
                      Secrets secrets,
                      HttpClientContentConverter contentConverter);
}
