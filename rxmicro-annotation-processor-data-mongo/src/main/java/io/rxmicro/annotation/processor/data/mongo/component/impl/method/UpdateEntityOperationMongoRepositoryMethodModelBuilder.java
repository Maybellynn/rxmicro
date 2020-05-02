/*
 * Copyright 2019 https://rxmicro.io
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

package io.rxmicro.annotation.processor.data.mongo.component.impl.method;

import com.google.inject.Singleton;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import io.rxmicro.annotation.processor.common.model.ClassHeader;
import io.rxmicro.annotation.processor.common.model.error.InterruptProcessingException;
import io.rxmicro.annotation.processor.common.model.method.MethodResult;
import io.rxmicro.annotation.processor.data.model.DataGenerationContext;
import io.rxmicro.annotation.processor.data.model.DataRepositoryMethodSignature;
import io.rxmicro.annotation.processor.data.mongo.component.impl.AbstractMongoRepositoryMethodModelBuilder;
import io.rxmicro.annotation.processor.data.mongo.component.impl.MethodParameterReader;
import io.rxmicro.annotation.processor.data.mongo.model.MongoDataModelField;
import io.rxmicro.annotation.processor.data.mongo.model.MongoDataObjectModelClass;
import io.rxmicro.annotation.processor.data.mongo.model.MongoVariable;
import io.rxmicro.data.DataRepositoryGeneratorConfig;
import io.rxmicro.data.mongo.DocumentId;
import io.rxmicro.data.mongo.detail.EntityToMongoDBConverter;
import io.rxmicro.data.mongo.operation.Update;
import org.bson.Document;
import org.reactivestreams.Publisher;

import javax.lang.model.element.ExecutableElement;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.rxmicro.annotation.processor.common.util.Errors.createInternalErrorSupplier;
import static io.rxmicro.annotation.processor.common.util.GeneratedClassNames.getModelTransformerInstanceName;
import static io.rxmicro.annotation.processor.common.util.Names.getSimpleName;

/**
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
@Singleton
public final class UpdateEntityOperationMongoRepositoryMethodModelBuilder extends AbstractMongoRepositoryMethodModelBuilder {

    @Override
    public boolean isSupported(final DataRepositoryMethodSignature dataRepositoryMethodSignature,
                               final DataGenerationContext<MongoDataModelField, MongoDataObjectModelClass> dataGenerationContext) {
        return super.isSupported(dataRepositoryMethodSignature, dataGenerationContext) &&
                dataRepositoryMethodSignature.getMethod().getAnnotation(Update.class).update().trim().isEmpty() &&
                dataRepositoryMethodSignature.getMethod().getAnnotation(Update.class).filter().trim().isEmpty();
    }

    @Override
    public Class<? extends Annotation> operationType() {
        return Update.class;
    }

    @Override
    protected List<String> buildBody(final ClassHeader.Builder classHeaderBuilder,
                                     final ExecutableElement method,
                                     final MethodResult methodResult,
                                     final MethodParameterReader methodParameterReader,
                                     final DataRepositoryGeneratorConfig dataRepositoryGeneratorConfig,
                                     final DataGenerationContext<MongoDataModelField, MongoDataObjectModelClass> dataGenerationContext) {
        classHeaderBuilder
                .addImports(
                        Document.class,
                        Publisher.class,
                        UpdateResult.class,
                        UpdateOptions.class
                );
        validateRequiredSingleReturnType(method, methodResult);
        validateReturnType(method, methodResult.getResultType(),
                Void.class, Long.class, Boolean.class, UpdateResult.class
        );
        final Map<String, Object> templateArguments = new HashMap<>();
        putCommonArguments(dataRepositoryGeneratorConfig, templateArguments);
        templateArguments.put("RETURN", methodResult);
        final Update annotation = method.getAnnotation(Update.class);
        templateArguments.put("UPSERT", annotation.upsert());
        final MongoVariable entity = getEntity(method, methodParameterReader, dataGenerationContext);
        templateArguments.put("ENTITY", entity.getName());
        templateArguments.put("ENTITY_CONVERTER", getModelTransformerInstanceName(
                getSimpleName(entity.getType()),
                EntityToMongoDBConverter.class)
        );
        return methodBodyGenerator.generate(
                "data/mongo/method/$$MongoRepositoryUpdateEntityMethodBodyTemplate.javaftl",
                templateArguments
        );
    }

    private MongoVariable getEntity(final ExecutableElement method,
                                    final MethodParameterReader methodParameterReader,
                                    final DataGenerationContext<MongoDataModelField, MongoDataObjectModelClass> dataGenerationContext) {
        final MongoVariable mongoVar = methodParameterReader.nextVar().orElseThrow(() -> {
            throw new InterruptProcessingException(
                    method,
                    "Method must have only one parameter. " +
                            "It must be a document with document id field."
            );
        });
        if (!dataGenerationContext.isEntityParamType(mongoVar.getType())) {
            throw new InterruptProcessingException(
                    method,
                    "The first method parameter must be a document with document id field."
            );
        }
        final MongoDataObjectModelClass modelClass =
                dataGenerationContext.getEntityParamModel(mongoVar.getType())
                        .orElseThrow(createInternalErrorSupplier("MongoDataObjectModelClass not found by by: ?", mongoVar.getType()));
        if (modelClass.getParamEntries().stream().noneMatch(e -> e.getKey().getAnnotation(DocumentId.class) != null)) {
            throw new InterruptProcessingException(method,
                    "Can't update document of '?' type, " +
                            "because detected a field annotated by @? annotation. " +
                            "Remove document id field from the document class or " +
                            "remove filter annotation option!",
                    mongoVar.getType().toString(), DocumentId.class.getName());
        }
        return mongoVar;
    }
}
