package io.rxmicro.examples.rest.client.headers;

import io.rxmicro.examples.rest.client.headers.model.Status;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.http.client.HttpClient;
import io.rxmicro.rest.client.RestClientConfig;
import io.rxmicro.rest.client.detail.AbstractRestClient;
import io.rxmicro.rest.client.detail.HeaderBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static io.rxmicro.rest.client.detail.ErrorResponseCheckerHelper.throwExceptionIfNotSuccess;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RepeatingHeadersRestClient extends AbstractRestClient implements RepeatingHeadersRestClient {

    private final $$VirtualRepeatingHeadersRequestRequestModelExtractor virtualRepeatingHeadersRequestRequestModelExtractor =
            new $$VirtualRepeatingHeadersRequestRequestModelExtractor();

    private final HttpClient client;

    private final RestClientConfig config;

    public $$RepeatingHeadersRestClient(final HttpClient client,
                                        final RestClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletableFuture<Void> put(final List<Status> singleHeader, final List<Status> repeatingHeader) {
        final $$VirtualRepeatingHeadersRequest virtualRequest = new $$VirtualRepeatingHeadersRequest(singleHeader, repeatingHeader);
        final String path = "/";
        final HeaderBuilder headerBuilder = new HeaderBuilder();
        virtualRepeatingHeadersRequestRequestModelExtractor.extract(virtualRequest, headerBuilder);
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("PUT", path, headerBuilder.build())
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
