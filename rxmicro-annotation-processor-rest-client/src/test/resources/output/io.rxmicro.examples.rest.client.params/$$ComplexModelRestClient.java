package io.rxmicro.examples.rest.client.params;

import io.rxmicro.examples.rest.client.params.model.$$ComplexRequestModelToJsonConverter;
import io.rxmicro.examples.rest.client.params.model.$$ComplexResponseModelReader;
import io.rxmicro.examples.rest.client.params.model.ComplexRequest;
import io.rxmicro.examples.rest.client.params.model.ComplexResponse;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;

import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$ComplexModelRestClient extends AbstractRestClient implements ComplexModelRestClient {

    private final $$ComplexRequestModelToJsonConverter complexRequestModelToJsonConverter =
            new $$ComplexRequestModelToJsonConverter();

    private final $$ComplexResponseModelReader complexResponseModelReader =
            new $$ComplexResponseModelReader();

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$ComplexModelRestClient(final HttpClient client,
                                    final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<ComplexResponse> post(final ComplexRequest request) {
        final String path = "/";
        final Object body = complexRequestModelToJsonConverter.toJson(request);
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("POST", path, EMPTY_HEADERS, body)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> complexResponseModelReader.readSingle(resp));
    }
}
