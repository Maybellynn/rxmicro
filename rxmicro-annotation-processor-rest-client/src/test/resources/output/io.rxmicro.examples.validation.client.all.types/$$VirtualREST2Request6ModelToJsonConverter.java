package io.rxmicro.examples.validation.client.all.types;

import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$VirtualREST2Request6ModelToJsonConverter extends ModelToJsonConverter<$$VirtualREST2Request6> {

    @Override
    public Map<String, Object> toJsonObject(final $$VirtualREST2Request6 model) {
        return new JsonObjectBuilder()
                .put("email", model.email)
                .build();
    }
}
