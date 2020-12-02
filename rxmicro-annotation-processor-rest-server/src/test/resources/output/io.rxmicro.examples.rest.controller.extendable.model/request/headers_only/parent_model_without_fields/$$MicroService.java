package io.rxmicro.examples.rest.controller.extendable.model.request.headers_only.parent_model_without_fields;

import io.rxmicro.examples.rest.controller.extendable.model.request.headers_only.parent_model_without_fields.child.$$ChildModelReader;
import io.rxmicro.examples.rest.controller.extendable.model.request.headers_only.parent_model_without_fields.child.Child;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerRegistrar;
import io.rxmicro.rest.server.detail.model.HttpRequest;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.detail.model.Registration;
import io.rxmicro.rest.server.detail.model.mapping.ExactUrlRequestMappingRule;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$MicroService extends AbstractRestController {

    private MicroService restController;

    private $$ChildModelReader childModelReader;

    @Override
    protected void postConstruct() {
        restController = new MicroService();
        childModelReader = new $$ChildModelReader();
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
                        "consume",
                        List.of(
                                io.rxmicro.examples.rest.controller.extendable.model.request.headers_only.parent_model_without_fields.child.Child.class
                        ),
                        this::consume,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/1",
                                false
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> consume(final PathVariableMapping pathVariableMapping,
                                                  final HttpRequest request) {
        final Child req = childModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        restController.consume(req);
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
