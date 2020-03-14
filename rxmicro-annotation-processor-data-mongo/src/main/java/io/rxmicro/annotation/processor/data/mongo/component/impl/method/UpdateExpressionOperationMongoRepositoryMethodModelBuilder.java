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

package io.rxmicro.annotation.processor.data.mongo.component.impl.method;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mongodb.client.model.UpdateOptions;
import com.mongodb.client.result.UpdateResult;
import io.rxmicro.annotation.processor.common.model.ClassHeader;
import io.rxmicro.annotation.processor.common.model.method.MethodResult;
import io.rxmicro.annotation.processor.data.model.DataGenerationContext;
import io.rxmicro.annotation.processor.data.model.DataRepositoryMethodSignature;
import io.rxmicro.annotation.processor.data.mongo.component.BsonExpressionBuilder;
import io.rxmicro.annotation.processor.data.mongo.component.impl.AbstractMongoRepositoryMethodModelBuilder;
import io.rxmicro.annotation.processor.data.mongo.component.impl.MethodParameterReader;
import io.rxmicro.annotation.processor.data.mongo.model.MongoDataModelField;
import io.rxmicro.annotation.processor.data.mongo.model.MongoDataObjectModelClass;
import io.rxmicro.data.DataRepositoryGeneratorConfig;
import io.rxmicro.data.mongo.detail.MongoQueries;
import io.rxmicro.data.mongo.operation.Update;
import org.bson.Document;
import org.reactivestreams.Publisher;

import javax.lang.model.element.ExecutableElement;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
@Singleton
public final class UpdateExpressionOperationMongoRepositoryMethodModelBuilder extends AbstractMongoRepositoryMethodModelBuilder {

    @Inject
    private BsonExpressionBuilder bsonExpressionBuilder;

    @Override
    public boolean isSupported(final DataRepositoryMethodSignature dataRepositoryMethodSignature,
                               final DataGenerationContext<MongoDataModelField, MongoDataObjectModelClass> dataGenerationContext) {
        return super.isSupported(dataRepositoryMethodSignature, dataGenerationContext) &&
                !dataRepositoryMethodSignature.getMethod().getAnnotation(Update.class).update().trim().isEmpty();
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
        classHeaderBuilder.addImports(
                Publisher.class,
                UpdateResult.class,
                Document.class,
                UpdateOptions.class,
                MongoQueries.class
        );
        validateRequiredSingleReturnType(method, methodResult);
        validateReturnType(method, methodResult.getResultType(),
                Void.class, Long.class, Boolean.class, UpdateResult.class
        );

        final Map<String, Object> templateArguments = new HashMap<>();
        putCommonArguments(dataRepositoryGeneratorConfig, templateArguments);
        templateArguments.put("RETURN", methodResult);

        final Update annotation = method.getAnnotation(Update.class);
        templateArguments.put("UPDATE",
                bsonExpressionBuilder.build(method, classHeaderBuilder, annotation.update(), methodParameterReader));
        final String filter = annotation.filter();
        if (!filter.trim().isEmpty()) {
            templateArguments.put("FILTER", bsonExpressionBuilder.build(method, classHeaderBuilder, filter, methodParameterReader));
        }
        templateArguments.put("UPSERT", annotation.upsert());
        return methodBodyGenerator.generate(
                "data/mongo/method/$$MongoRepositoryUpdateExpressionMethodBodyTemplate.javaftl",
                templateArguments
        );
    }

}
