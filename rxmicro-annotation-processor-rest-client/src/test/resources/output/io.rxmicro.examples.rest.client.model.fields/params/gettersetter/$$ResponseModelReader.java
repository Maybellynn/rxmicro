package io.rxmicro.examples.rest.client.model.fields.params.gettersetter;

import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.rest.client.detail.ModelReader;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$ResponseModelReader extends ModelReader<Response> {

    private final $$ResponseModelFromJsonConverter responseModelFromJsonConverter =
            new $$ResponseModelFromJsonConverter();

    @Override
    public Response readSingle(final ClientHttpResponse response) {
        return responseModelFromJsonConverter.fromJsonObject(response.body());
    }
}
