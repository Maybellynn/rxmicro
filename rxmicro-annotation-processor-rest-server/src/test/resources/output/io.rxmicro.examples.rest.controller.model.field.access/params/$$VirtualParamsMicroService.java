package io.rxmicro.examples.rest.controller.model.field.access.params;

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
public final class $$VirtualParamsMicroService extends AbstractRestController {

    private VirtualParamsMicroService restController;

    private $$VirtualVirtualParamsRequest2ModelReader virtualVirtualParamsRequest2ModelReader;

    private $$VirtualVirtualParamsRequestModelReader virtualVirtualParamsRequestModelReader;

    @Override
    protected void postConstruct() {
        restController = new VirtualParamsMicroService();
        virtualVirtualParamsRequest2ModelReader = new $$VirtualVirtualParamsRequest2ModelReader();
        virtualVirtualParamsRequestModelReader = new $$VirtualVirtualParamsRequestModelReader();
    }

    @Override
    public Class<?> getRestControllerClass() {
        return VirtualParamsMicroService.class;
    }

    @Override
    public void register(final RestControllerRegistrar registrar) {
        registrar.register(
                this,
                new Registration(
                        "/",
                        "get",
                        List.of(
                                java.lang.Boolean.class, java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class, java.math.BigInteger.class, java.lang.Float.class, java.lang.Double.class, java.math.BigDecimal.class, java.lang.Character.class, java.lang.String.class, java.time.Instant.class, io.rxmicro.examples.rest.controller.model.field.access.Status.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class
                        ),
                        this::get,
                        false,
                        new ExactUrlRequestMappingRule(
                                "GET",
                                "/params/virtual",
                                false
                        )
                ),
                new Registration(
                        "/",
                        "put",
                        List.of(
                                java.lang.Boolean.class, java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class, java.math.BigInteger.class, java.lang.Float.class, java.lang.Double.class, java.math.BigDecimal.class, java.lang.Character.class, java.lang.String.class, java.time.Instant.class, io.rxmicro.examples.rest.controller.model.field.access.Status.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, io.rxmicro.examples.rest.controller.model.field.access.params.direct.nested.Nested.class, java.util.List.class, java.util.Set.class, java.util.Map.class
                        ),
                        this::put,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/params/virtual",
                                true
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> get(final PathVariableMapping pathVariableMapping,
                                              final HttpRequest request) {
        final $$VirtualVirtualParamsRequest req = virtualVirtualParamsRequestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        restController.get(req.booleanParameter, req.byteParameter, req.shortParameter, req.intParameter, req.longParameter, req.bigIntParameter, req.floatParameter, req.doubleParameter, req.decimalParameter, req.charParameter, req.stringParameter, req.instantParameter, req.enumParameter, req.booleanParameterList, req.byteParameterList, req.shortParameterList, req.intParameterList, req.longParameterList, req.bigIntParameterList, req.floatParameterList, req.doubleParameterList, req.decimalParameterList, req.charParameterList, req.stringParameterList, req.instantParameterList, req.enumParameterList, req.booleanParameterSet, req.byteParameterSet, req.shortParameterSet, req.intParameterSet, req.longParameterSet, req.bigIntParameterSet, req.floatParameterSet, req.doubleParameterSet, req.decimalParameterSet, req.charParameterSet, req.stringParameterSet, req.instantParameterSet, req.enumParameterSet);
        return CompletableFuture.completedStage(buildResponse(200, headers));
    }

    private CompletionStage<HttpResponse> put(final PathVariableMapping pathVariableMapping,
                                              final HttpRequest request) {
        final $$VirtualVirtualParamsRequest2 req = virtualVirtualParamsRequest2ModelReader.read(pathVariableMapping, request, request.isContentPresent());
        final HttpHeaders headers = HttpHeaders.of();
        restController.put(req.booleanParameter, req.byteParameter, req.shortParameter, req.intParameter, req.longParameter, req.bigIntParameter, req.floatParameter, req.doubleParameter, req.decimalParameter, req.charParameter, req.stringParameter, req.instantParameter, req.enumParameter, req.booleanParameterList, req.byteParameterList, req.shortParameterList, req.intParameterList, req.longParameterList, req.bigIntParameterList, req.floatParameterList, req.doubleParameterList, req.decimalParameterList, req.charParameterList, req.stringParameterList, req.instantParameterList, req.enumParameterList, req.booleanParameterSet, req.byteParameterSet, req.shortParameterSet, req.intParameterSet, req.longParameterSet, req.bigIntParameterSet, req.floatParameterSet, req.doubleParameterSet, req.decimalParameterSet, req.charParameterSet, req.stringParameterSet, req.instantParameterSet, req.enumParameterSet, req.booleanParameterMap, req.byteParameterMap, req.shortParameterMap, req.integerParameterMap, req.longParameterMap, req.bigIntegerParameterMap, req.floatParameterMap, req.doubleParameterMap, req.bigDecimalParameterMap, req.characterParameterMap, req.stringParameterMap, req.instantParameterMap, req.enumParameterMap, req.nested, req.nestedList, req.nestedSet, req.nestedParameterMap);
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
