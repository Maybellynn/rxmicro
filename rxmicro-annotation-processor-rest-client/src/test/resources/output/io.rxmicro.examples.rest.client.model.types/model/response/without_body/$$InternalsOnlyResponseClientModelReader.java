package io.rxmicro.examples.rest.client.model.types.model.response.without_body;

import io.rxmicro.rest.client.detail.ClientModelReader;
import io.rxmicro.rest.client.detail.HttpResponse;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$InternalsOnlyResponseClientModelReader extends ClientModelReader<InternalsOnlyResponse> {

    @Override
    public InternalsOnlyResponse readSingle(final HttpResponse response) {
        final InternalsOnlyResponse model = new InternalsOnlyResponse();
        readPrimitivesToModel(response, model);
        return model;
    }

    protected void readPrimitivesToModel(final HttpResponse response,
                                         final InternalsOnlyResponse model) {
        model.internalResponseStatusCode = response.getStatusCode();
        model.internalHttpVersion = response.getVersion();
        model.internalHttpHeaders = response.getHeaders();
        model.internalResponseBody = response.getBodyAsBytes();
    }
}