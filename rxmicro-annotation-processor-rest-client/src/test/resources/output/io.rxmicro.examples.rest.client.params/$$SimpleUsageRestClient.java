package io.rxmicro.examples.rest.client.params;

import io.rxmicro.examples.rest.client.params.model.$$RequestRequestModelExtractor;
import io.rxmicro.examples.rest.client.params.model.$$ResponseModelReader;
import io.rxmicro.examples.rest.client.params.model.Request;
import io.rxmicro.examples.rest.client.params.model.Response;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;
import io.rxmicro.rest.client.detail.QueryBuilder;

import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$SimpleUsageRestClient extends AbstractRestClient implements SimpleUsageRestClient {

    private final $$ResponseModelReader responseModelReader =
            new $$ResponseModelReader();

    private final $$RequestRequestModelExtractor requestRequestModelExtractor =
            new $$RequestRequestModelExtractor();

    private final $$VirtualSimpleUsageRequestRequestModelExtractor virtualSimpleUsageRequestRequestModelExtractor =
            new $$VirtualSimpleUsageRequestRequestModelExtractor();

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$SimpleUsageRestClient(final HttpClient client,
                                   final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Response> get1(final Request request) {
        final String path = "/get1";
        final QueryBuilder queryBuilder = new QueryBuilder();
        requestRequestModelExtractor.extract(request, queryBuilder);
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("GET", joinPath(path, queryBuilder.build()), EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> responseModelReader.readSingle(resp));
    }

    @Override
    public CompletableFuture<Response> get2(final String endpointVersion, final Boolean useProxy) {
        final $$VirtualSimpleUsageRequest virtualRequest = new $$VirtualSimpleUsageRequest(endpointVersion, useProxy);
        final String path = "/get2";
        final QueryBuilder queryBuilder = new QueryBuilder();
        virtualSimpleUsageRequestRequestModelExtractor.extract(virtualRequest, queryBuilder);
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("GET", joinPath(path, queryBuilder.build()), EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> responseModelReader.readSingle(resp));
    }
}
