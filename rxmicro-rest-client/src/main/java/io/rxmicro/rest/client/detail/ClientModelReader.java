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

package io.rxmicro.rest.client.detail;

import io.rxmicro.rest.local.FromStringValueConverter;

import java.util.List;

/**
 * Used by generated code that created by the {@code RxMicro Annotation Processor}.
 *
 * @author nedis
 * @hidden
 * @since 0.1
 */
@SuppressWarnings("unused")
public abstract class ClientModelReader<T> extends FromStringValueConverter {

    public T readSingle(final HttpResponse response) {
        throw new AbstractMethodError("The RxMicro Annotation Processor did not generate an implementation of this method!");
    }

    public List<T> readList(final HttpResponse response) {
        throw new AbstractMethodError("The RxMicro Annotation Processor did not generate an implementation of this method!");
    }
}
