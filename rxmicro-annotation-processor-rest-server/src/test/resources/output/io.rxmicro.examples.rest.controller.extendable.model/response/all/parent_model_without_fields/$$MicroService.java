package io.rxmicro.examples.rest.controller.extendable.model.response.all.parent_model_without_fields;

import io.rxmicro.examples.rest.controller.extendable.model.response.all.parent_model_without_fields.child.$$ChildServerModelWriter;
import io.rxmicro.examples.rest.controller.extendable.model.response.all.parent_model_without_fields.child.Child;
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

    private $$ChildServerModelWriter childServerModelWriter;

    @Override
    protected void postConstruct() {
        restController = new MicroService();
        childServerModelWriter = new $$ChildServerModelWriter(restServerConfig.isHumanReadableOutput());
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
                        "produce1",
                        List.of(),
                        this::produce1,
                        false,
                        new ExactUrlRequestMappingRule(
                                "GET",
                                "/1",
                                false
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> produce1(final PathVariableMapping pathVariableMapping,
                                                   final HttpRequest request) {
        final HttpHeaders headers = HttpHeaders.of();
        return restController.produce1()
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private HttpResponse buildResponse(final Child model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        childServerModelWriter.write(model, response);
        return response;
    }
}
