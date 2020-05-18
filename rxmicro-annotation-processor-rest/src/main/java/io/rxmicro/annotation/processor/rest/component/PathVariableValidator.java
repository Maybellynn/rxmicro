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

package io.rxmicro.annotation.processor.rest.component;

import io.rxmicro.annotation.processor.rest.model.HttpMethodMapping;
import io.rxmicro.rest.model.UrlSegments;

import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

/**
 * @author nedis
 * @since 0.1
 */
public interface PathVariableValidator {

    void validateThatPathVariablesNotMissingOrRedundant(Element owner,
                                                        HttpMethodMapping httpMethodMapping,
                                                        UrlSegments urlSegments,
                                                        TypeElement typeElement);

    void validateThatPathVariablesNotFound(Element owner,
                                           HttpMethodMapping httpMethodMapping,
                                           TypeElement typeElement);
}
