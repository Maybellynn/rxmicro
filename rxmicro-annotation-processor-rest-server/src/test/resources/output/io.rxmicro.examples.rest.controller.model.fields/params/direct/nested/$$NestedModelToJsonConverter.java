package io.rxmicro.examples.rest.controller.model.fields.params.direct.nested;

import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$NestedModelToJsonConverter extends ModelToJsonConverter<Nested> {

    @Override
    public Map<String, Object> toJsonObject(final Nested model) {
        return new JsonObjectBuilder()
                .put("value", model.value)
                .build();
    }
}
