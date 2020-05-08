package io.rxmicro.examples.rest.controller.params.model.nested;

import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$NestedModelModelToJsonConverter extends ModelToJsonConverter<NestedModel> {

    @Override
    public Map<String, Object> toJsonObject(final NestedModel model) {
        return new JsonObjectBuilder()
                .put("string_parameter", model.stringParameter)
                .put("big_decimal_parameter", model.bigDecimalParameter)
                .put("instant_parameter", model.instantParameter)
                .build();
    }
}
