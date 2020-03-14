package io.rxmicro.examples.rest.controller.notfound;

import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$ResponseModelToJsonConverter extends ModelToJsonConverter<Response> {

    @Override
    public Map<String, Object> toJsonObject(final Response model) {
        return new JsonObjectBuilder()
                .put("message", model.message)
                .build();
    }
}
