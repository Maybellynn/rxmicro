package io.rxmicro.examples.rest.client.internals;

import io.rxmicro.examples.rest.client.internals.model.$$ResponseModelReader;
import io.rxmicro.examples.rest.client.internals.model.Response;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.rest.client.RestClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;

import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RESTClient extends AbstractRestClient implements RESTClient {

    private final $$ResponseModelReader responseModelReader =
            new $$ResponseModelReader();

    private final HttpClient client;

    private final RestClientConfig config;

    public $$RESTClient(final HttpClient client,
                        final RestClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Response> get() {
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("GET", "/", EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> responseModelReader.readSingle(resp));
    }
}
