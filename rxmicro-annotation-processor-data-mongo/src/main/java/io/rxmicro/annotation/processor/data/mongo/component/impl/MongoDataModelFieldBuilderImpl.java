/*
 * Copyright 2019 http://rxmicro.io
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

package io.rxmicro.annotation.processor.data.mongo.component.impl;

import com.google.inject.Singleton;
import io.rxmicro.annotation.processor.common.model.AnnotatedModelElement;
import io.rxmicro.annotation.processor.common.model.ModelFieldType;
import io.rxmicro.annotation.processor.common.model.error.InterruptProcessingException;
import io.rxmicro.annotation.processor.data.component.impl.AbstractDataModelFieldBuilder;
import io.rxmicro.annotation.processor.data.mongo.model.MongoDataModelField;
import io.rxmicro.annotation.processor.data.mongo.model.MongoDataObjectModelClass;
import io.rxmicro.data.mongo.DocumentId;
import org.bson.Document;

import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.type.TypeMirror;
import java.util.Optional;

import static io.rxmicro.annotation.processor.common.util.Elements.asTypeElement;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
@Singleton
public final class MongoDataModelFieldBuilderImpl extends AbstractDataModelFieldBuilder<MongoDataModelField, MongoDataObjectModelClass> {

    @Override
    protected void validateModelClass(final TypeElement typeElement) {
        if (typeElement.getSimpleName().toString().equals(Document.class.getSimpleName())) {
            throw new InterruptProcessingException(
                    typeElement,
                    "Invalid model class name: Name 'Document' is an internal reserved name. " +
                            "Use any other name for your model class!");
        }
    }

    @Override
    protected MongoDataObjectModelClass createObjectModelClass(final ModuleElement currentModule,
                                                               final ModelFieldType modelFieldType,
                                                               final TypeMirror type,
                                                               final TypeElement typeElement,
                                                               final int nestedLevel,
                                                               final boolean requireDefConstructor) {
        return new MongoDataObjectModelClass(
                type,
                typeElement,
                getFieldMap(currentModule, modelFieldType, asTypeElement(type).orElseThrow(), nestedLevel, requireDefConstructor)
        );
    }

    @Override
    protected MongoDataModelField build(final AnnotatedModelElement annotated, final String modelName, final boolean isId) {
        return new MongoDataModelField(annotated, modelName, isId);
    }

    @Override
    protected boolean isColumnId(final AnnotatedModelElement annotated) {
        return annotated.getAnnotation(DocumentId.class) != null;
    }

    @Override
    protected Optional<String> getColumnIdFixedModelName() {
        return Optional.of("_id");
    }
}
