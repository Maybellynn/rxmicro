package io.rxmicro.examples.rest.controller.model.field.access.pathvariables;

import io.rxmicro.examples.rest.controller.model.field.access.pathvariables.reflection.$$RequestConstraintValidator;
import io.rxmicro.examples.rest.controller.model.field.access.pathvariables.reflection.$$RequestServerModelReader;
import io.rxmicro.examples.rest.controller.model.field.access.pathvariables.reflection.Request;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.model.UrlSegments;
import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerRegistrar;
import io.rxmicro.rest.server.detail.model.HttpRequest;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.detail.model.Registration;
import io.rxmicro.rest.server.detail.model.mapping.WithUrlPathVariablesRequestMappingRule;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ReflectionPathVariablesMicroService extends AbstractRestController {

    private ReflectionPathVariablesMicroService restController;

    private $$RequestServerModelReader requestServerModelReader;

    private $$RequestConstraintValidator requestConstraintValidator;

    @Override
    protected void postConstruct() {
        restController = new ReflectionPathVariablesMicroService();
        requestServerModelReader = new $$RequestServerModelReader();
        requestConstraintValidator = new $$RequestConstraintValidator();
    }

    @Override
    public Class<?> getRestControllerClass() {
        return ReflectionPathVariablesMicroService.class;
    }

    @Override
    public void register(final RestControllerRegistrar registrar) {
        registrar.register(
                this,
                new Registration(
                        "/",
                        "put",
                        List.of(
                                io.rxmicro.examples.rest.controller.model.field.access.pathvariables.reflection.Request.class
                        ),
                        this::put,
                        false,
                        new WithUrlPathVariablesRequestMappingRule(
                                "PUT",
                                new UrlSegments(
                                        "/path-variables/reflection/?/?/?/?/?/?/?/?/?/?/?/?/?/?",
                                        List.of("a", "b", "c", "d", "e", "f", "g", "j", "h", "i", "j", "k", "l", "m")
                                ),
                                true
                        )

                )
        );
    }

    private CompletionStage<HttpResponse> put(final PathVariableMapping pathVariableMapping,
                                              final HttpRequest request) {
        final Request req = requestServerModelReader.read(pathVariableMapping, request, request.isContentPresent());
        requestConstraintValidator.validate(req);
        final HttpHeaders headers = HttpHeaders.of();
        restController.put(req);
        return CompletableFuture.completedStage(buildResponse(200, headers));
    }

    private HttpResponse buildResponse(final int statusCode,
                                       final HttpHeaders headers) {
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        return response;
    }
}