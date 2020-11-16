package io.rxmicro.examples.rest.controller.map.model.type;

import io.rxmicro.examples.rest.controller.map.model.type.model.$$ModelModelReader;
import io.rxmicro.examples.rest.controller.map.model.type.model.$$ModelModelWriter;
import io.rxmicro.examples.rest.controller.map.model.type.model.Model;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerRegistrar;
import io.rxmicro.rest.server.detail.model.HttpRequest;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.detail.model.Registration;
import io.rxmicro.rest.server.detail.model.mapping.ExactUrlRequestMappingRule;

import java.util.List;
import java.util.concurrent.CompletionStage;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$MicroService extends AbstractRestController {

    private MicroService restController;

    private $$ModelModelReader modelModelReader;

    private $$ModelModelWriter modelModelWriter;

    @Override
    protected void postConstruct() {
        restController = new MicroService();
        modelModelReader = new $$ModelModelReader();
        modelModelWriter = new $$ModelModelWriter(restServerConfig.isHumanReadableOutput());
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
                        "process",
                        List.of(
                                io.rxmicro.examples.rest.controller.map.model.type.model.Model.class
                        ),
                        this::process,
                        false,
                        new ExactUrlRequestMappingRule(
                                "POST",
                                "/",
                                true
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> process(final PathVariableMapping pathVariableMapping,
                                                  final HttpRequest request) {
        final Model req = modelModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        return restController.process(req)
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private HttpResponse buildResponse(final Model model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        modelModelWriter.write(model, response);
        return response;
    }
}