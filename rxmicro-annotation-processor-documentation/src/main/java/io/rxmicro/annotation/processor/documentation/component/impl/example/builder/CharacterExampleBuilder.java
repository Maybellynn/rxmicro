/*
 * Copyright (c) 2020. http://rxmicro.io
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

package io.rxmicro.annotation.processor.documentation.component.impl.example.builder;

import com.google.inject.Singleton;
import io.rxmicro.annotation.processor.documentation.component.impl.example.TypeExampleBuilder;
import io.rxmicro.annotation.processor.rest.model.RestModelField;

import javax.lang.model.type.TypeMirror;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
@Singleton
public final class CharacterExampleBuilder implements TypeExampleBuilder {

    @Override
    public boolean isSupported(final RestModelField restModelField,
                               final TypeMirror typeMirror) {
        return Character.class.getName().equals(typeMirror.toString());
    }

    @Override
    public String getExample(final RestModelField restModelField,
                             final TypeMirror typeMirror) {
        return "y";
    }
}
