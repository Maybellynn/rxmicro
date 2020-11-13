package io.rxmicro.examples.unnamed.module.rest.controller.generator;

import io.rxmicro.examples.unnamed.module.rest.controller.generator.model.$$RequestModelReader;
import io.rxmicro.examples.unnamed.module.rest.controller.generator.model.$$ResponseConstraintValidator;
import io.rxmicro.examples.unnamed.module.rest.controller.generator.model.$$ResponseModelWriter;
import io.rxmicro.examples.unnamed.module.rest.controller.generator.model.Request;
import io.rxmicro.examples.unnamed.module.rest.controller.generator.model.Response;
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

import static io.rxmicro.validation.detail.ResponseValidators.validateResponse;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$MicroService extends AbstractRestController {

    private MicroService restController;

    private $$RequestModelReader requestModelReader;

    private $$ResponseModelWriter responseModelWriter;

    private $$ResponseConstraintValidator responseConstraintValidator;

    @Override
    protected void postConstruct() {
        restController = new MicroService();
        requestModelReader = new $$RequestModelReader();
        responseModelWriter = new $$ResponseModelWriter(restServerConfig.isHumanReadableOutput());
        responseConstraintValidator = new $$ResponseConstraintValidator();
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
                                io.rxmicro.examples.unnamed.module.rest.controller.generator.model.Request.class
                        ),
                        this::consume,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/",
                                false
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> consume(final PathVariableMapping pathVariableMapping,
                                                  final HttpRequest request) {
        final Request req = requestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        return restController.consume(req)
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private HttpResponse buildResponse(final Response model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        validateResponse(restServerConfig.isEnableAdditionalValidations(), responseConstraintValidator, model);
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        responseModelWriter.write(model, response);
        return response;
    }
}
