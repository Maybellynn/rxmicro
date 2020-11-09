package io.rxmicro.examples.rest.client.model.fields.params;

import io.rxmicro.examples.rest.client.model.fields.Status;
import io.rxmicro.examples.rest.client.model.fields.params.direct.nested.Nested;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualParamsRestClient extends AbstractRestClient implements VirtualParamsRestClient {

    private final $$VirtualVirtualParamsRequestModelToJsonConverter virtualVirtualParamsRequestModelToJsonConverter =
            new $$VirtualVirtualParamsRequestModelToJsonConverter();

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$VirtualParamsRestClient(final HttpClient client,
                                     final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletionStage<Void> put(final Boolean booleanParameter, final Byte byteParameter, final Short shortParameter, final Integer intParameter, final Long longParameter, final BigInteger bigIntParameter, final Float floatParameter, final Double doubleParameter, final BigDecimal decimalParameter, final Character charParameter, final String stringParameter, final Instant instantParameter, final Status status, final Nested nested, final List<Boolean> booleanParameters, final List<Byte> byteParameters, final List<Short> shortParameters, final List<Integer> intParameters, final List<Long> longParameters, final List<BigInteger> bigIntParameters, final List<Float> floatParameters, final List<Double> doubleParameters, final List<BigDecimal> decimalParameters, final List<Character> charParameters, final List<String> stringParameters, final List<Instant> instantParameters, final List<Status> statuses, final List<Nested> nestedList, final List<Status> repeatingStatuses, final Set<Boolean> booleanParameterSet, final Set<Byte> byteParameterSet, final Set<Short> shortParameterSet, final Set<Integer> intParameterSet, final Set<Long> longParameterSet, final Set<BigInteger> bigIntParameterSet, final Set<Float> floatParameterSet, final Set<Double> doubleParameterSet, final Set<BigDecimal> decimalParameterSet, final Set<Character> charParameterSet, final Set<String> stringParameterSet, final Set<Instant> instantParameterSet, final Set<Status> statusSet, final Set<Nested> nestedSet, final Set<Status> repeatingStatusSet) {
        final $$VirtualVirtualParamsRequest virtualRequest = new $$VirtualVirtualParamsRequest(booleanParameter, byteParameter, shortParameter, intParameter, longParameter, bigIntParameter, floatParameter, doubleParameter, decimalParameter, charParameter, stringParameter, instantParameter, status, nested, booleanParameters, byteParameters, shortParameters, intParameters, longParameters, bigIntParameters, floatParameters, doubleParameters, decimalParameters, charParameters, stringParameters, instantParameters, statuses, nestedList, repeatingStatuses, booleanParameterSet, byteParameterSet, shortParameterSet, intParameterSet, longParameterSet, bigIntParameterSet, floatParameterSet, doubleParameterSet, decimalParameterSet, charParameterSet, stringParameterSet, instantParameterSet, statusSet, nestedSet, repeatingStatusSet);
        final String path = "/params/virtual";
        final Object body = virtualVirtualParamsRequestModelToJsonConverter.toJson(virtualRequest);
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("PUT", path, EMPTY_HEADERS, body)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
