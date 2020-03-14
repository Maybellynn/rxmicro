package io.rxmicro.examples.validation.server.custom;

import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerRegistrar;
import io.rxmicro.rest.server.detail.model.HttpRequest;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.detail.model.Registration;
import io.rxmicro.rest.server.detail.model.mapping.ExactUrlRequestMappingRule;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$MicroService extends AbstractRestController {

    private MicroService restController;

    private $$VirtualRequestModelReader virtualRequestModelReader;

    private $$VirtualRequestConstraintValidator virtualRequestConstraintValidator;

    @Override
    protected void postConstruct() {
        restController = new MicroService();
        virtualRequestModelReader = new $$VirtualRequestModelReader();
        virtualRequestConstraintValidator = new $$VirtualRequestConstraintValidator();
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
                        "consume(java.math.BigDecimal)",
                        this::consume,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PATCH",
                                "/",
                                false
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> consume(final PathVariableMapping pathVariableMapping,
                                                  final HttpRequest request) {
        final $$VirtualRequest req = virtualRequestModelReader.read(pathVariableMapping, request, request.contentExists());
        virtualRequestConstraintValidator.validate(req);
        final HttpHeaders headers = HttpHeaders.of();
        restController.consume(req.value);
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
