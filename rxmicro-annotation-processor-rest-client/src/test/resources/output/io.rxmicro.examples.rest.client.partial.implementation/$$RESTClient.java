package io.rxmicro.examples.rest.client.partial.implementation;

import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;

import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$RESTClient extends AbstractRESTClient implements RESTClient {

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$RESTClient(final HttpClient client,
                        final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Void> generatedMethod() {
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("GET", "/", EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
