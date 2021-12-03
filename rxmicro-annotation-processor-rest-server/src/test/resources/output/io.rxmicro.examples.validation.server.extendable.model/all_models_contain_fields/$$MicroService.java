package io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields;

import io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.child.$$ChildConstraintValidator;
import io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.child.$$ChildServerModelReader;
import io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.child.$$ChildServerModelWriter;
import io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.child.Child;
import io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.parent.$$ParentConstraintValidator;
import io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.parent.$$ParentServerModelReader;
import io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.parent.$$ParentServerModelWriter;
import io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.parent.Parent;
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

    private $$ParentServerModelReader parentServerModelReader;

    private $$ChildServerModelReader childServerModelReader;

    private $$ParentServerModelWriter parentServerModelWriter;

    private $$ChildServerModelWriter childServerModelWriter;

    private $$ParentConstraintValidator parentConstraintValidator;

    private $$ChildConstraintValidator childConstraintValidator;

    @Override
    protected void postConstruct() {
        restController = new MicroService();
        parentServerModelReader = new $$ParentServerModelReader();
        childServerModelReader = new $$ChildServerModelReader();
        parentServerModelWriter = new $$ParentServerModelWriter(restServerConfig.isHumanReadableOutput());
        childServerModelWriter = new $$ChildServerModelWriter(restServerConfig.isHumanReadableOutput());
        parentConstraintValidator = new $$ParentConstraintValidator();
        childConstraintValidator = new $$ChildConstraintValidator();
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
                                io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.child.Child.class
                        ),
                        this::consumeChild,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/1",
                                true
                        )
                ),
                new Registration(
                        "/",
                        "consume",
                        List.of(
                                io.rxmicro.examples.validation.server.extendable.model.all_models_contain_fields.parent.Parent.class
                        ),
                        this::consumeParent,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/2",
                                true
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> consumeChild(final PathVariableMapping pathVariableMapping,
                                                       final HttpRequest request) {
        final Child req = childServerModelReader.read(pathVariableMapping, request, request.isContentPresent());
        childConstraintValidator.validate(req);
        final HttpHeaders headers = HttpHeaders.of();
        return restController.consume(req)
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private CompletionStage<HttpResponse> consumeParent(final PathVariableMapping pathVariableMapping,
                                                        final HttpRequest request) {
        final Parent req = parentServerModelReader.read(pathVariableMapping, request, request.isContentPresent());
        parentConstraintValidator.validate(req);
        final HttpHeaders headers = HttpHeaders.of();
        return restController.consume(req)
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private HttpResponse buildResponse(final Parent model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        validateResponse(restServerConfig.isEnableAdditionalValidations(), parentConstraintValidator, model);
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        parentServerModelWriter.write(model, response);
        return response;
    }

    private HttpResponse buildResponse(final Child model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        validateResponse(restServerConfig.isEnableAdditionalValidations(), childConstraintValidator, model);
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        childServerModelWriter.write(model, response);
        return response;
    }
}
