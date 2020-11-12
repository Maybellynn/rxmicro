package io.rxmicro.examples.validation.server.all.standard;

import io.rxmicro.examples.validation.server.all.standard.model.$$ModelConstraintValidator;
import io.rxmicro.examples.validation.server.all.standard.model.$$ModelModelReader;
import io.rxmicro.examples.validation.server.all.standard.model.$$ModelModelWriter;
import io.rxmicro.examples.validation.server.all.standard.model.Model;
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

    private $$ModelModelReader modelModelReader;

    private $$VirtualRequestModelReader virtualRequestModelReader;

    private $$ModelModelWriter modelModelWriter;

    private $$ModelConstraintValidator modelConstraintValidator;

    private $$VirtualRequestConstraintValidator virtualRequestConstraintValidator;

    @Override
    protected void postConstruct() {
        restController = new MicroService();
        modelModelReader = new $$ModelModelReader();
        virtualRequestModelReader = new $$VirtualRequestModelReader();
        modelModelWriter = new $$ModelModelWriter(restServerConfig.isHumanReadableOutput());
        modelConstraintValidator = new $$ModelConstraintValidator();
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
                        "put1",
                        List.of(
                                io.rxmicro.examples.validation.server.all.standard.model.Model.class
                        ),
                        this::put1,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/put1",
                                true
                        )
                ),
                new Registration(
                        "/",
                        "put2",
                        List.of(
                                java.lang.String.class, java.lang.Boolean.class, java.lang.Byte.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Long.class, java.math.BigInteger.class, java.lang.Float.class, java.lang.Double.class, java.math.BigDecimal.class, java.lang.Character.class, java.lang.String.class, java.time.Instant.class, io.rxmicro.examples.validation.server.all.standard.model.Color.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.List.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Set.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.util.Map.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class, java.math.BigDecimal.class
                        ),
                        this::put2,
                        false,
                        new ExactUrlRequestMappingRule(
                                "PUT",
                                "/put2",
                                true
                        )
                )
        );
    }

    private CompletionStage<HttpResponse> put1(final PathVariableMapping pathVariableMapping,
                                               final HttpRequest request) {
        final Model req = modelModelReader.read(pathVariableMapping, request, request.isContentPresent());
        modelConstraintValidator.validate(req);
        final HttpHeaders headers = HttpHeaders.of();
        return restController.put1(req)
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private CompletionStage<HttpResponse> put2(final PathVariableMapping pathVariableMapping,
                                               final HttpRequest request) {
        final $$VirtualRequest req = virtualRequestModelReader.read(pathVariableMapping, request, request.isContentPresent());
        virtualRequestConstraintValidator.validate(req);
        final HttpHeaders headers = HttpHeaders.of();
        return restController.put2(req.optionalParameter, req.booleanParameter, req.byteParameter, req.shortParameter, req.intParameter, req.longParameter, req.bigIntParameter, req.floatParameter, req.doubleParameter, req.decimalParameter, req.charParameter, req.stringParameter, req.instantParameter, req.colorParameter, req.optionalList, req.booleanValues, req.byteValues, req.shortValues, req.intValues, req.longValues, req.charValues, req.floatValues, req.doubleValues, req.decimals, req.bigIntegers, req.strings, req.instants, req.colors, req.optionalSet, req.booleanSet, req.byteSet, req.shortSet, req.intSet, req.longSet, req.charSet, req.floatSet, req.doubleSet, req.decimalSet, req.bigIntegerSet, req.stringSet, req.instantSet, req.colorSet, req.optionalMap, req.booleanMap, req.byteMap, req.shortMap, req.intMap, req.longMap, req.charMap, req.floatMap, req.doubleMap, req.decimalMap, req.bigIntegerMap, req.stringMap, req.instantMap, req.colorMap, req.countryCodeAlpha2, req.countryCodeAlpha3, req.countryCodeNumeric, req.base64URLEncodedBase, req.base64URLEncodedUrl, req.ip, req.ip4, req.ip6, req.lat111km, req.lng111km, req.lat11km, req.lng11km, req.lat1km, req.lng1km, req.lat111m, req.lng111m, req.lat11m, req.lng11m, req.lat1m, req.lng1m, req.lat11cm, req.lng11cm, req.lat1cm, req.lng1cm)
                .thenApply(response -> buildResponse(response, 200, headers));
    }

    private HttpResponse buildResponse(final Model model,
                                       final int statusCode,
                                       final HttpHeaders headers) {
        validateResponse(modelConstraintValidator, model);
        final HttpResponse response = httpResponseBuilder.build();
        response.setStatus(statusCode);
        response.setOrAddHeaders(headers);
        modelModelWriter.write(model, response);
        return response;
    }
}
