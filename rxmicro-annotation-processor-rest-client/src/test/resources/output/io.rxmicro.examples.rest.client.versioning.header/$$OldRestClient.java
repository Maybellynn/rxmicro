package io.rxmicro.examples.rest.client.versioning.header;

import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;
import io.rxmicro.rest.client.detail.HeaderBuilder;

import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseChecker.throwExceptionIfNotSuccess;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$OldRestClient extends AbstractRestClient implements OldRestClient {

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$OldRestClient(final HttpClient client,
                           final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Void> update() {
        final HeaderBuilder headerBuilder = new HeaderBuilder();
        headerBuilder.add("Api-Version", "v1");
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("PATCH", "/patch", headerBuilder.build())
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
