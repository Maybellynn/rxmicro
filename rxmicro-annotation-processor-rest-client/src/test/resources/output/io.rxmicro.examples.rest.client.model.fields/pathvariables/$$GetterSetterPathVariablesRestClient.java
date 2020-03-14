package io.rxmicro.examples.rest.client.model.fields.pathvariables;

import io.rxmicro.examples.rest.client.model.fields.pathvariables.gettersetter.$$RequestPathBuilder;
import io.rxmicro.examples.rest.client.model.fields.pathvariables.gettersetter.Request;
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
public final class $$GetterSetterPathVariablesRestClient extends AbstractRestClient implements GetterSetterPathVariablesRestClient {

    private final $$RequestPathBuilder requestPathBuilder =
            new $$RequestPathBuilder();

    private final HttpClient client;

    private final HttpClientConfig config;

    public $$GetterSetterPathVariablesRestClient(final HttpClient client,
                                                 final HttpClientConfig config) {
        this.client = client;
        this.config = config;
    }

    @Override
    public CompletionStage<Void> put(final Request request) {
        final String path = requestPathBuilder.build("/path-variables/gettersetter/?/?/?/?/?/?/?/?/?/?/?/?/?/?", request);
        final CompletableFuture<ClientHttpResponse> response = client
                .sendAsync("PUT", path, EMPTY_HEADERS)
                .handle(throwExceptionIfNotSuccess());
        return response
                .thenApply(resp -> null);
    }
}
