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

package io.rxmicro.http.client;

import io.rxmicro.common.util.Formats;
import io.rxmicro.http.error.HttpErrorException;

import static io.rxmicro.common.util.Requires.require;

/**
 * A class signaling that the HTTP client didn’t receive a response from the server in given time.
 *
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
public final class HttpClientTimeoutException extends HttpErrorException {

    public static final int STATUS_CODE = 504;

    /**
     * Creates a HTTP error with error message.
     * <p>
     * For all child classes which extend the HttpErrorException class, when creating an exception instance the stack trace is not filled,
     * as this information is redundant.
     * <p>
     * (<i>This behavior is achieved by using the {@link RuntimeException#RuntimeException(String, Throwable, boolean, boolean)}.</i>)
     * <p>
     * <i>(FYI: This constructor uses {@link Formats#format(String, Object...)} method to format error message.)</i>
     *
     * @param message the error message template
     * @param args the error message template argument
     * @throws NullPointerException if {@code message} is {@code null}
     */
    public HttpClientTimeoutException(final String message,
                                      final Object... args) {
        super(STATUS_CODE, require(message), args);
    }
}
