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

package io.rxmicro.data.detail;

import io.rxmicro.data.local.InvalidMethodReturnTypeException;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * Used by generated code that created by the {@code RxMicro Annotation Processor}.
 *
 * @author nedis
 * @hidden
 * @since 0.1
 */
public abstract class AbstractDataRepository {

    protected final Supplier<Throwable> useOptionalExceptionSupplier(final Class<?> reactiveType,
                                                                     final Class<?> resultType) {
        return () -> new InvalidMethodReturnTypeException(
                "Method must return ?<?<?>> instead of ?<?>, because null is not valid business value",
                reactiveType.getSimpleName(), Optional.class.getSimpleName(), resultType.getSimpleName(),
                reactiveType.getSimpleName(), resultType.getSimpleName()
        );
    }
}
