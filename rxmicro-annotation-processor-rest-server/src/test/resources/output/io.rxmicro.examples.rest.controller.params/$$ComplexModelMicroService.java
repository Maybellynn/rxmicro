package io.rxmicro.examples.rest.controller.params;

import io.rxmicro.examples.rest.controller.params.model.$$ComplexRequestModelReader;
import io.rxmicro.examples.rest.controller.params.model.$$ComplexResponseModelWriter;
import io.rxmicro.examples.rest.controller.params.model.ComplexRequest;
import io.rxmicro.examples.rest.controller.params.model.ComplexResponse;
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
public final class $$ComplexModelMicroService extends AbstractRestController {

    private ComplexModelMicroService restController;

    private $$ComplexRequestModelReader complexRequestModelReader;

    private $$ComplexResponseModelWriter complexResponseModelWriter;

    @Override
    protected void postConstruct() {
        restController = new ComplexModelMicroService();
        complexRequestModelReader = new $$ComplexRequestModelReader();
        complexResponseModelWriter = new $$ComplexResponseModelWriter(restServerConfig.isHumanReadableOutput());
    }

    @Override
    public Class<?> getRestControllerClass() {
        return ComplexModelMicroService.class;
    }

    @Override
    public void register(final RestControllerRegistrar registrar) {
        registrar.register(
                this,
                new Registration(
                        "/",
                        "handle(io.rxmicro.examples.rest.controller.params.model.ComplexRequest)",
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
        final ComplexRequest req = complexRequestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        return restController.handle(req)
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private HttpResponse buildResponse(final ComplexResponse model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        complexResponseModelWriter.write(model, response);
        return response;
    }
}
