package io.rxmicro.examples.rest.client.params;

import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;
import io.rxmicro.rest.client.detail.QueryBuilder;

import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$StaticQueryParametersRestClient extends AbstractRestClient implements StaticQueryParametersRestClient {

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$StaticQueryParametersRestClient(final HttpClient client,
                                             final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Void> get1() {
        final QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.add("mode", "demo");
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("GET", joinPath("/get1", queryBuilder.build()), EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }

    @Override
    public CompletableFuture<Void> get2() {
        final QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.add("mode", "demo");
        queryBuilder.add("debug", "true");
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("GET", joinPath("/get2", queryBuilder.build()), EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
