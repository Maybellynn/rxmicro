package io.rxmicro.examples.processor.all.components.component;

import io.rxmicro.examples.processor.all.components.model.$$AccountModelReader;
import io.rxmicro.examples.processor.all.components.model.Account;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.rest.client.RestClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;

import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RestClient extends AbstractRestClient implements RestClient {

    private final $$AccountModelReader accountModelReader =
            new $$AccountModelReader();

    private final HttpClient client;

    private final RestClientConfig config;

    public $$RestClient(final HttpClient client,
                        final RestClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Account> get() {
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("GET", "/", EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> accountModelReader.readSingle(resp));
    }
}
