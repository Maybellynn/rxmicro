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

import io.rxmicro.annotation.processor.common.model.AnnotatedModelElement;
import io.rxmicro.annotation.processor.common.model.ModelFieldType;
import io.rxmicro.annotation.processor.rest.model.RestModelField;

import java.lang.annotation.Annotation;
import java.util.Set;
import javax.lang.model.element.TypeElement;

/**
 * @author nedis
 * @since 0.5
 */
public interface RestModelFieldBuilder<A extends Annotation> {

    RestModelField build(ModelFieldType modelFieldType,
                         TypeElement typeElement,
                         AnnotatedModelElement annotated,
                         A annotation,
                         Set<String> modelNames,
                         int nestedLevel);
}