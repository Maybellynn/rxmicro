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

package io.rxmicro.annotation.processor.documentation.asciidoctor.component.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.rxmicro.annotation.processor.common.component.ModelFieldBuilder;
import io.rxmicro.annotation.processor.common.model.EnvironmentContext;
import io.rxmicro.annotation.processor.common.model.ModelFieldBuilderOptions;
import io.rxmicro.annotation.processor.common.model.error.InterruptProcessingException;
import io.rxmicro.annotation.processor.documentation.asciidoctor.component.DocumentedModelFieldBuilder;
import io.rxmicro.annotation.processor.documentation.asciidoctor.model.DocumentedModelField;
import io.rxmicro.annotation.processor.documentation.asciidoctor.model.Response;
import io.rxmicro.annotation.processor.documentation.component.HttpResponseExampleBuilder;
import io.rxmicro.annotation.processor.documentation.model.ProjectMetaData;
import io.rxmicro.annotation.processor.rest.model.RestModelField;
import io.rxmicro.annotation.processor.rest.model.RestObjectModelClass;
import io.rxmicro.documentation.ResourceDefinition;
import io.rxmicro.rest.model.HttpModelType;

import java.util.List;
import java.util.Set;
import javax.lang.model.element.Element;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.TypeElement;

import static io.rxmicro.annotation.processor.common.model.ModelFieldType.REST_SERVER_RESPONSE;
import static io.rxmicro.annotation.processor.common.util.Elements.allMethodsFromType;
import static java.util.Map.entry;

/**
 * @author nedis
 * @since 0.7
 */
@Singleton
public final class ModelExceptionErrorResponseCustomBuilder {

    @Inject
    private ModelFieldBuilder<RestModelField, RestObjectModelClass> modelFieldBuilder;

    @Inject
    private HttpResponseExampleBuilder httpResponseExampleBuilder;

    @Inject
    private DocumentedModelFieldBuilder documentedModelFieldBuilder;

    void setCustomErrorResponse(final EnvironmentContext environmentContext,
                                final Element owner,
                                final ResourceDefinition resourceDefinition,
                                final ProjectMetaData projectMetaData,
                                final TypeElement exceptionTypeElement,
                                final int status,
                                final Response.Builder responseBuilder) {
        validateCustomExceptionType(exceptionTypeElement);
        final ModuleElement currentModule = environmentContext.getCurrentModule();
        final ModelFieldBuilderOptions options = new ModelFieldBuilderOptions()
                .setWithFieldsFromParentClasses(false);
        final RestObjectModelClass modelClass =
                modelFieldBuilder.build(REST_SERVER_RESPONSE, currentModule, Set.of(exceptionTypeElement), options)
                        .get(exceptionTypeElement);
        if (resourceDefinition.withExamples()) {
            responseBuilder.setExample(httpResponseExampleBuilder.build(resourceDefinition, status, modelClass));
        }
        if (resourceDefinition.withBodyParametersDescriptionTable()) {
            final List<DocumentedModelField> documentedModelFields = documentedModelFieldBuilder.buildSimple(
                    environmentContext,
                    true,
                    projectMetaData.getProjectDirectory(),
                    modelClass,
                    HttpModelType.PARAMETER,
                    true
            );
            responseBuilder.setParameters(List.of(entry("Body", documentedModelFields)));
        }
    }

    private void validateCustomExceptionType(final TypeElement exceptionTypeElement) {
        if (allMethodsFromType(exceptionTypeElement,
                e -> "getResponseData".equals(e.getSimpleName().toString()) && e.getParameters().isEmpty()).isEmpty()) {
            throw new InterruptProcessingException(
                    exceptionTypeElement,
                    "Exception type with custom fields must override 'getResponseData' method!"
            );
        }
    }
}
