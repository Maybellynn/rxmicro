package io.rxmicro.examples.validation.client.basic.model;

import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$ResponseModelFromJsonConverter extends ModelFromJsonConverter<Response> {

    @Override
    public Response fromJsonObject(final Map<String, Object> params) {
        final Response model = new Response();
        model.email = toString(params.get("email"), "email");
        return model;
    }
}
