package io.rxmicro.examples.processor.all.components;

import io.rxmicro.examples.processor.all.components.model.$$AccountModelWriter;
import io.rxmicro.examples.processor.all.components.model.Account;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerRegistrar;
import io.rxmicro.rest.server.detail.model.HttpRequest;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.detail.model.Registration;
import io.rxmicro.rest.server.detail.model.mapping.ExactUrlRequestMappingRule;

import java.util.concurrent.CompletionStage;

import static io.rxmicro.cdi.BeanFactory.getBean;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$MicroService extends AbstractRestController {

    private MicroService restController;

    private $$AccountModelWriter accountModelWriter;

    @Override
    protected void postConstruct() {
        restController = getBean(MicroService.class);
        accountModelWriter = new $$AccountModelWriter(restServerConfig.isHumanReadableOutput());
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
                        "fromRestClient()",
                        this::fromRestClient,
                        false,
                        new ExactUrlRequestMappingRule(
                                "GET",
                                "/rest-client",
                                false
                        )
                ),
                new Registration(
                        "/",
                        "fromPostgreSQL()",
                        this::fromPostgreSQL,
                        false,
                        new ExactUrlRequestMappingRule(
                                "GET",
                                "/postgresql",
                                false
                        )
                ),
                new Registration(
                        "/",
                        "fromMongo()",
                        this::fromMongo,
                        false,
                        new ExactUrlRequestMappingRule(
                                "GET",
                                "/mongo",
                                false
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> fromRestClient(final PathVariableMapping pathVariableMapping,
                                                         final HttpRequest request) {
        final HttpHeaders headers = HttpHeaders.of();
        return restController.fromRestClient()
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private CompletionStage<HttpResponse> fromPostgreSQL(final PathVariableMapping pathVariableMapping,
                                                         final HttpRequest request) {
        final HttpHeaders headers = HttpHeaders.of();
        return restController.fromPostgreSQL()
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private CompletionStage<HttpResponse> fromMongo(final PathVariableMapping pathVariableMapping,
                                                    final HttpRequest request) {
        final HttpHeaders headers = HttpHeaders.of();
        return restController.fromMongo()
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private HttpResponse buildResponse(final Account model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        accountModelWriter.write(model, response);
        return response;
    }
}
