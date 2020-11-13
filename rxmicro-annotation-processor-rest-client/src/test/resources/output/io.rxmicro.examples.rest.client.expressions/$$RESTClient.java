package io.rxmicro.examples.rest.client.expressions;

import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.rest.client.detail.AbstractRestClient;
import io.rxmicro.rest.client.detail.HeaderBuilder;

import java.util.concurrent.CompletableFuture;

import static io.rxmicro.common.util.Formats.format;
import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RESTClient extends AbstractRestClient implements RESTClient {

    private final HttpClient client;

    private final CustomRestClientConfig config;

    public $$RESTClient(final HttpClient client,
                        final CustomRestClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Void> put() {
        final HeaderBuilder headerBuilder = new HeaderBuilder();
        headerBuilder.add("Use-Proxy", config.isUseProxy());
        headerBuilder.add("Debug", format("Use-Proxy=?, Mode=?", config.isUseProxy(), config.getMode()));
        headerBuilder.add("Endpoint", format("Schema=?, Host=?, Port=?", config.getSchema(), config.getHost(), config.getPort()));
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("PUT", "/", headerBuilder.build())
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
