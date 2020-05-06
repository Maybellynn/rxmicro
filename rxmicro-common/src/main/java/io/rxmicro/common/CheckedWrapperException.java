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

package io.rxmicro.common;

import io.rxmicro.common.util.Formats;

/**
 * Wrapper for checked exceptions
 *
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
public final class CheckedWrapperException extends RxMicroException {

    /**
     * Creates a new {@link CheckedWrapperException} instance with error message and cause.
     * <p>
     * <i>(FYI: This constructor uses {@link Formats#format(String, Object...)} method to format error message.)</i>
     *
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method).
     * @param message error message template
     * @param args error message template arguments
     * @throws NullPointerException if {@code message} or {@code cause} is {@code null}
     */
    public CheckedWrapperException(final Throwable cause,
                                   final String message,
                                   final Object... args) {
        super(cause, message, args);
    }

    /**
     * Creates a new {@link CheckedWrapperException} instance with cause only.
     *
     * @param cause the cause (which is saved for later retrieval by the {@link #getCause()} method).
     * @throws NullPointerException if {@code cause} is {@code null}
     */
    public CheckedWrapperException(final Throwable cause) {
        super(cause);
    }

    /**
     * Returns {@code true} if current instance contains a cause one of the specified throwable class
     *
     * @param throwableClass the specified throwable class
     * @return {@code true} if current instance contains a cause one of the specified throwable class
     */
    public boolean isCause(final Class<? extends Throwable> throwableClass) {
        return getCause() != null && throwableClass.isAssignableFrom(getCause().getClass());
    }
}
