package io.rxmicro.examples.rest.client.params;

import io.rxmicro.examples.rest.client.params.model.Status;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;
import io.rxmicro.rest.client.detail.QueryBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RepeatingQueryParamsRestClient extends AbstractRestClient implements RepeatingQueryParamsRestClient {

    private final $$VirtualRepeatingQueryParamsRequestRequestModelExtractor virtualRepeatingQueryParamsRequestRequestModelExtractor =
            new $$VirtualRepeatingQueryParamsRequestRequestModelExtractor();

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$RepeatingQueryParamsRestClient(final HttpClient client,
                                            final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Void> put(final List<Status> singleHeader, final List<Status> repeatingHeader) {
        final $$VirtualRepeatingQueryParamsRequest virtualRequest = new $$VirtualRepeatingQueryParamsRequest(singleHeader, repeatingHeader);
        final String path = "/";
        final QueryBuilder queryBuilder = new QueryBuilder();
        virtualRepeatingQueryParamsRequestRequestModelExtractor.extract(virtualRequest, queryBuilder);
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("PUT", joinPath(path, queryBuilder.build()), EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
