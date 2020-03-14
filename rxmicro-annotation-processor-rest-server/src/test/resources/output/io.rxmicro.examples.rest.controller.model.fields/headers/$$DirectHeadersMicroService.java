package io.rxmicro.examples.rest.controller.model.fields.headers;

import io.rxmicro.examples.rest.controller.model.fields.headers.direct.$$RequestModelReader;
import io.rxmicro.examples.rest.controller.model.fields.headers.direct.$$ResponseModelWriter;
import io.rxmicro.examples.rest.controller.model.fields.headers.direct.Request;
import io.rxmicro.examples.rest.controller.model.fields.headers.direct.Response;
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
 *
 * @link http://rxmicro.io
 */
public final class $$DirectHeadersMicroService extends AbstractRestController {

    private DirectHeadersMicroService restController;

    private $$RequestModelReader requestModelReader;

    private $$ResponseModelWriter responseModelWriter;

    private HttpResponse putNotFoundResponse;

    @Override
    protected void postConstruct() {
        restController = new DirectHeadersMicroService();
        requestModelReader = new $$RequestModelReader();
        responseModelWriter = new $$ResponseModelWriter(restServerConfig.isHumanReadableOutput());
        putNotFoundResponse = notFound("Not Found");
    }

    @Override
    public Class<?> getRestControllerClass() {
        return DirectHeadersMicroService.class;
    }

    @Override
    public void register(final RestControllerRegistrar registrar) {
        registrar.register(
                this,
                new Registration(
                        "/",
                        "put(io.rxmicro.examples.rest.controller.model.fields.headers.direct.Request)",
                        this::put,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/headers/direct",
                                true
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> put(final PathVariableMapping pathVariableMapping,
                                              final HttpRequest request) {
        final Request req = requestModelReader.read(pathVariableMapping, request, request.contentExists());
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
