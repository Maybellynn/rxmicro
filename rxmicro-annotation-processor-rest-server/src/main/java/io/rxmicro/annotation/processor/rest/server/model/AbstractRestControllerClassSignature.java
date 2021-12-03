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

package io.rxmicro.annotation.processor.rest.server.model;

import io.rxmicro.annotation.processor.common.model.TypeSignature;
import io.rxmicro.annotation.processor.rest.model.RestClassSignature;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.lang.model.element.TypeElement;

import static io.rxmicro.common.util.ExCollections.unmodifiableList;

/**
 * @author nedis
 * @since 0.10
 */
public abstract class AbstractRestControllerClassSignature extends TypeSignature implements RestClassSignature {

    private final List<RestControllerMethodSignature> methodSignatures;

    protected AbstractRestControllerClassSignature(final List<RestControllerMethodSignature> methodSignatures) {
        this.methodSignatures = unmodifiableList(methodSignatures);
    }

    @Override
    public final Set<TypeElement> getFromHttpDataModelTypes() {
        return methodSignatures.stream()
                .flatMap(m -> m.getRequestModel().getRequestType().stream())
                .collect(Collectors.toSet());
    }

    @Override
    public final Set<TypeElement> getToHttpDataModelTypes() {
        return methodSignatures.stream()
                .flatMap(m -> m.getResponseModel().getResultType().stream())
                .collect(Collectors.toSet());
    }

    @Override
    public final List<RestControllerMethodSignature> getMethodSignatures() {
        return methodSignatures;
    }
}
