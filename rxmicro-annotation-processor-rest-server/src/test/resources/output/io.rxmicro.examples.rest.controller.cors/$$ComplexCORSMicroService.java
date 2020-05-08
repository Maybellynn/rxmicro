package io.rxmicro.examples.rest.controller.cors;

import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.model.UrlSegments;
import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerRegistrar;
import io.rxmicro.rest.server.detail.model.HttpRequest;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.detail.model.Registration;
import io.rxmicro.rest.server.detail.model.mapping.ExactUrlRequestMappingRule;
import io.rxmicro.rest.server.detail.model.mapping.UrlTemplateRequestMappingRule;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$ComplexCORSMicroService extends AbstractRestController {

    private ComplexCORSMicroService restController;

    private $$VirtualComplexCORSRequestModelReader virtualComplexCORSRequestModelReader;

    @Override
    protected void postConstruct() {
        restController = new ComplexCORSMicroService();
        virtualComplexCORSRequestModelReader = new $$VirtualComplexCORSRequestModelReader();
    }

    @Override
    public Class<?> getRestControllerClass() {
        return ComplexCORSMicroService.class;
    }

    @Override
    public void register(final RestControllerRegistrar registrar) {
        registrar.register(
                this,
                new Registration(
                        "/",
                        "handler1()",
                        this::handler1,
                        true,
                        new ExactUrlRequestMappingRule(
                                "GET",
                                "/handler1",
                                false
                        ),
                        new ExactUrlRequestMappingRule(
                                "HEAD",
                                "/handler1",
                                false
                        ),
                        new ExactUrlRequestMappingRule(
                                "POST",
                                "/handler1",
                                true
                        ),
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/handler1",
                                true
                        )
                ),
                new Registration(
                        "/",
                        "handler2()",
                        this::handler2,
                        true,
                        new ExactUrlRequestMappingRule(
                                "GET",
                                "/handler2",
                                false
                        ),
                        new ExactUrlRequestMappingRule(
                                "POST",
                                "/handler2",
                                true
                        )
                ),
                new Registration(
                        "/",
                        "handler3(java.lang.String)",
                        this::handler3,
                        true,
                        new UrlTemplateRequestMappingRule(
                                "GET",
                                new UrlSegments(
                                        "/?",
                                        List.of("path")
                                ),
                                false
                        ),

                        new UrlTemplateRequestMappingRule(
                                "HEAD",
                                new UrlSegments(
                                        "/?",
                                        List.of("path")
                                ),
                                false
                        ),

                        new UrlTemplateRequestMappingRule(
                                "POST",
                                new UrlSegments(
                                        "/?",
                                        List.of("path")
                                ),
                                true
                        )

                )
        );
    }

    private CompletionStage<HttpResponse> handler1(final PathVariableMapping pathVariableMapping,
                                                   final HttpRequest request) {
        final HttpHeaders headers = HttpHeaders.of();
        restController.handler1();
        return CompletableFuture.completedStage(buildResponse(200, headers));
    }

    private CompletionStage<HttpResponse> handler2(final PathVariableMapping pathVariableMapping,
                                                   final HttpRequest request) {
        final HttpHeaders headers = HttpHeaders.of();
        restController.handler2();
        return CompletableFuture.completedStage(buildResponse(200, headers));
    }

    private CompletionStage<HttpResponse> handler3(final PathVariableMapping pathVariableMapping,
                                                   final HttpRequest request) {
        final $$VirtualComplexCORSRequest req = virtualComplexCORSRequestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        restController.handler3(req.path);
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
