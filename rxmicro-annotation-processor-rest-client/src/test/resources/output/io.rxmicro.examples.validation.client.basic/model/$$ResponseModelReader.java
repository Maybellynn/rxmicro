package io.rxmicro.examples.validation.client.basic.model;

import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.rest.client.detail.ModelReader;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$ResponseModelReader extends ModelReader<Response> {

    private final $$ResponseModelFromJsonConverter responseModelFromJsonConverter =
            new $$ResponseModelFromJsonConverter();

    @Override
    public Response readSingle(final ClientHttpResponse response) {
        return responseModelFromJsonConverter.fromJsonObject(response.getBody());
    }
}
