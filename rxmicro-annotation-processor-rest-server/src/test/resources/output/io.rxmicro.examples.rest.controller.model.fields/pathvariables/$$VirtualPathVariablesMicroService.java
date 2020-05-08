package io.rxmicro.examples.rest.controller.model.fields.pathvariables;

import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.model.UrlSegments;
import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerRegistrar;
import io.rxmicro.rest.server.detail.model.HttpRequest;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.detail.model.Registration;
import io.rxmicro.rest.server.detail.model.mapping.UrlTemplateRequestMappingRule;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$VirtualPathVariablesMicroService extends AbstractRestController {

    private VirtualPathVariablesMicroService restController;

    private $$VirtualVirtualPathVariablesRequestModelReader virtualVirtualPathVariablesRequestModelReader;

    @Override
    protected void postConstruct() {
        restController = new VirtualPathVariablesMicroService();
        virtualVirtualPathVariablesRequestModelReader = new $$VirtualVirtualPathVariablesRequestModelReader();
    }

    @Override
    public Class<?> getRestControllerClass() {
        return VirtualPathVariablesMicroService.class;
    }

    @Override
    public void register(final RestControllerRegistrar registrar) {
        registrar.register(
                this,
                new Registration(
                        "/",
                        "put(java.lang.Boolean,java.lang.Byte,java.lang.Short,java.lang.Integer,java.lang.Long,java.math.BigInteger,java.lang.Float,java.lang.Double,java.math.BigDecimal,java.lang.Character,java.lang.String,java.time.Instant,io.rxmicro.examples.rest.controller.model.fields.Status)",
                        this::put,
                        false,
                        new UrlTemplateRequestMappingRule(
                                "PUT",
                                new UrlSegments(
                                        "/path-variables/virtual/?/?/?/?/?/?/?/?/?/?/?/?/?/?",
                                        List.of("a", "b", "c", "d", "e", "f", "g", "j", "h", "i", "j", "k", "l", "m")
                                ),
                                true
                        )

                )
        );
    }

    private CompletionStage<HttpResponse> put(final PathVariableMapping pathVariableMapping,
                                              final HttpRequest request) {
        final $$VirtualVirtualPathVariablesRequest req = virtualVirtualPathVariablesRequestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        restController.put(req.booleanParameter, req.byteParameter, req.shortParameter, req.intParameter, req.longParameter, req.bigIntParameter, req.floatParameter, req.doubleParameter, req.decimalParameter, req.charParameter, req.stringParameter, req.instantParameter, req.status);
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
