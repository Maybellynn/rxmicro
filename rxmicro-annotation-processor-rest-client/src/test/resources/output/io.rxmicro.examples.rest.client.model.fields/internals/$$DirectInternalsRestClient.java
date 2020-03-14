package io.rxmicro.examples.rest.client.model.fields.internals;

import io.rxmicro.examples.rest.client.model.fields.internals.direct.$$ResponseModelReader;
import io.rxmicro.examples.rest.client.model.fields.internals.direct.Response;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static io.rxmicro.rest.client.detail.ErrorResponseChecker.throwExceptionIfNotSuccess;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$DirectInternalsRestClient extends AbstractRestClient implements DirectInternalsRestClient {

    private final $$ResponseModelReader responseModelReader =
            new $$ResponseModelReader();

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$DirectInternalsRestClient(final HttpClient client,
                                       final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletionStage<Response> put() {
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("PUT", "/internals/direct", EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> responseModelReader.readSingle(resp));
    }
}
