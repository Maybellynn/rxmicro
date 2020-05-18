package io.rxmicro.examples.rest.controller.internals;

import io.rxmicro.examples.rest.controller.internals.model.$$RequestModelReader;
import io.rxmicro.examples.rest.controller.internals.model.$$ResponseModelWriter;
import io.rxmicro.examples.rest.controller.internals.model.Request;
import io.rxmicro.examples.rest.controller.internals.model.Response;
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
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$MicroService extends AbstractRestController {

    private MicroService restController;

    private $$RequestModelReader requestModelReader;

    private $$ResponseModelWriter responseModelWriter;

    @Override
    protected void postConstruct() {
        restController = new MicroService();
        requestModelReader = new $$RequestModelReader();
        responseModelWriter = new $$ResponseModelWriter(restServerConfig.isHumanReadableOutput());
    }

    @Override
    public Class<?> getRestControllerClass() {
        return MicroService.class;
    }

    @Override
    public void register(final RestControllerRegistrar registrar) {
        registrar.register(
                this,
                new Registration(
                        "/",
                        "handle(io.rxmicro.examples.rest.controller.internals.model.Request)",
                        this::handle,
                        false,
                        new ExactUrlRequestMappingRule(
                                "POST",
                                "/",
                                true
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> handle(final PathVariableMapping pathVariableMapping,
                                                 final HttpRequest request) {
        final Request req = requestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        return restController.handle(req)
                .thenApply(response -> buildResponse(response, 200, headers));
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
