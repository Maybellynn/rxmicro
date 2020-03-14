package io.rxmicro.examples.rest.client.model.fields.headers;

import io.rxmicro.examples.rest.client.model.fields.Status;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;
import io.rxmicro.rest.client.detail.HeaderBuilder;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static io.rxmicro.rest.client.detail.ErrorResponseChecker.throwExceptionIfNotSuccess;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$VirtualHeadersRestClient extends AbstractRestClient implements VirtualHeadersRestClient {

    private final $$VirtualVirtualHeadersRequestRequestModelExtractor virtualVirtualHeadersRequestRequestModelExtractor =
            new $$VirtualVirtualHeadersRequestRequestModelExtractor();

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$VirtualHeadersRestClient(final HttpClient client,
                                      final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletionStage<Void> put(final Boolean booleanParameter, final Byte byteParameter, final Short shortParameter, final Integer intParameter, final Long longParameter, final BigInteger bigIntParameter, final Float floatParameter, final Double doubleParameter, final BigDecimal decimalParameter, final Character charParameter, final String stringParameter, final Instant instantParameter, final Status status, final List<Boolean> booleanParameters, final List<Byte> byteParameters, final List<Short> shortParameters, final List<Integer> intParameters, final List<Long> longParameters, final List<BigInteger> bigIntParameters, final List<Float> floatParameters, final List<Double> doubleParameters, final List<BigDecimal> decimalParameters, final List<Character> charParameters, final List<String> stringParameters, final List<Instant> instantParameters, final List<Status> statuses, final List<Status> repeatingStatues) {
        final $$VirtualVirtualHeadersRequest virtualRequest = new $$VirtualVirtualHeadersRequest(booleanParameter, byteParameter, shortParameter, intParameter, longParameter, bigIntParameter, floatParameter, doubleParameter, decimalParameter, charParameter, stringParameter, instantParameter, status, booleanParameters, byteParameters, shortParameters, intParameters, longParameters, bigIntParameters, floatParameters, doubleParameters, decimalParameters, charParameters, stringParameters, instantParameters, statuses, repeatingStatues);
        final String path = "/headers/virtual";
        final HeaderBuilder headerBuilder = new HeaderBuilder();
        virtualVirtualHeadersRequestRequestModelExtractor.extract(virtualRequest, headerBuilder);
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("PUT", path, headerBuilder.build())
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
