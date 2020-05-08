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

package io.rxmicro.annotation.processor.rest.client.component;

import io.rxmicro.annotation.processor.rest.client.model.RestClientMethodSignature;
import io.rxmicro.annotation.processor.rest.model.ParentUrl;

import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.TypeElement;
import java.util.List;
import java.util.Map;

/**
 * @author nedis
 * @since 0.1
 */
public interface RestClientMethodSignatureBuilder {

    List<RestClientMethodSignature> build(ModuleElement restControllerModule,
                                          TypeElement restClientInterface,
                                          ParentUrl parentUrl,
                                          Map.Entry<TypeElement, List<ExecutableElement>> overriddenMethodCandidates);
}
