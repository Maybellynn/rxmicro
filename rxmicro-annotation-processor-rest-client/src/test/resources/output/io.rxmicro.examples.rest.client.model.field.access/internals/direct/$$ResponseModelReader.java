package io.rxmicro.examples.rest.client.model.field.access.internals.direct;

import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.rest.client.detail.ModelReader;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ResponseModelReader extends ModelReader<Response> {

    @Override
    public Response readSingle(final ClientHttpResponse response) {
        final Response model = new Response();
        readPrimitivesToModel(response, model);
        return model;
    }

    protected void readPrimitivesToModel(final ClientHttpResponse response,
                                         final Response model) {
        model.internalResponseStatusCode = response.getStatusCode();
        model.internalHttpVersion = response.getVersion();
        model.internalHttpHeaders = response.getHeaders();
        model.internalResponseBody = response.getBodyAsBytes();
    }
}