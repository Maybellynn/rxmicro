package io.rxmicro.examples.rest.controller.model.fields.params;

import io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.$$BodyRequestModelReader;
import io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.$$QueryRequestModelReader;
import io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.$$ResponseModelWriter;
import io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.BodyRequest;
import io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.QueryRequest;
import io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.Response;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerRegistrar;
import io.rxmicro.rest.server.detail.model.HttpRequest;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.detail.model.Registration;
import io.rxmicro.rest.server.detail.model.mapping.ExactUrlRequestMappingRule;

import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$GetterSetterParamsMicroService extends AbstractRestController {

    private GetterSetterParamsMicroService restController;

    private $$BodyRequestModelReader bodyRequestModelReader;

    private $$QueryRequestModelReader queryRequestModelReader;

    private $$ResponseModelWriter responseModelWriter;

    private HttpResponse getNotFoundResponse;

    private HttpResponse putNotFoundResponse;

    @Override
    protected void postConstruct() {
        restController = new GetterSetterParamsMicroService();
        bodyRequestModelReader = new $$BodyRequestModelReader();
        queryRequestModelReader = new $$QueryRequestModelReader();
        responseModelWriter = new $$ResponseModelWriter(restServerConfig.isHumanReadableOutput());
        getNotFoundResponse = notFound("Not Found");
        putNotFoundResponse = notFound("Not Found");
    }

    @Override
    public Class<?> getRestControllerClass() {
        return GetterSetterParamsMicroService.class;
    }

    @Override
    public void register(final RestControllerRegistrar registrar) {
        registrar.register(
                this,
                new Registration(
                        "/",
                        "get(io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.QueryRequest)",
                        this::get,
                        false,
                        new ExactUrlRequestMappingRule(
                                "GET",
                                "/params/direct",
                                false
                        )
                ),
                new Registration(
                        "/",
                        "put(io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.BodyRequest)",
                        this::put,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/params/gettersetter",
                                true
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> get(final PathVariableMapping pathVariableMapping,
                                              final HttpRequest request) {
        final QueryRequest req = queryRequestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        return restController.get(req)
                .thenApply(optionalResponse -> optionalResponse
                        .map(response -> buildResponse(response, 200, headers))
                        .orElse(getNotFoundResponse));
    }

    private CompletionStage<HttpResponse> put(final PathVariableMapping pathVariableMapping,
                                              final HttpRequest request) {
        final BodyRequest req = bodyRequestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        return restController.put(req)
                .thenApply(optionalResponse -> optionalResponse
                        .map(response -> buildResponse(response, 200, headers))
                        .orElse(putNotFoundResponse));
    }

    private HttpResponse buildResponse(final Response model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        responseModelWriter.write(model, response);
        return response;
    }
}
