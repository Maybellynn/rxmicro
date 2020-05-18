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

package io.rxmicro.annotation.processor.rest.server.component.impl.method;

import com.google.inject.Singleton;
import io.rxmicro.annotation.processor.common.model.ClassHeader;
import io.rxmicro.annotation.processor.rest.server.model.RestControllerMethodSignature;

/**
 * @author nedis
 * @since 0.1
 */
@Singleton
public final class ProcessorRestControllerMethodBodyBuilder extends AbstractParametrizedRestControllerMethodBodyBuilder {

    @Override
    public boolean isSupport(final RestControllerMethodSignature methodSignature) {
        return methodSignature.getRequestModel().requestModelExists() &&
                methodSignature.getResponseModel().getResultType().isPresent();
    }

    @Override
    protected void customizeClassHeaderBuilder(final ClassHeader.Builder classHeaderBuilder) {
        // do nothing
    }

    @Override
    protected String getTemplateName() {
        return "rest/server/method/$$RestControllerProcessorMethodBodyTemplate.javaftl";
    }
}
