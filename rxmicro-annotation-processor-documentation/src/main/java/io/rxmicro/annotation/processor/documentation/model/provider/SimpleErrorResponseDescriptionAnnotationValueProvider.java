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

package io.rxmicro.annotation.processor.documentation.model.provider;

import io.rxmicro.documentation.SimpleErrorResponse;

/**
 * @author nedis
 * @since 0.9
 */
public final class SimpleErrorResponseDescriptionAnnotationValueProvider extends AbstractSimpleErrorResponseAnnotationValueProvider {

    public SimpleErrorResponseDescriptionAnnotationValueProvider(final SimpleErrorResponse annotation) {
        super(annotation);
    }

    @Override
    public String getAnnotationValueParameterName() {
        return "description";
    }

    @Override
    public String getValue() {
        return annotation.description();
    }
}
