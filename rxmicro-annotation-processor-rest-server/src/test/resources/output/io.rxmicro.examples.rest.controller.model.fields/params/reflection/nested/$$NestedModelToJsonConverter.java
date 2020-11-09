package io.rxmicro.examples.rest.controller.model.fields.params.reflection.nested;

import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

import static rxmicro.$$Reflections.getFieldValue;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$NestedModelToJsonConverter extends ModelToJsonConverter<Nested> {

    @Override
    public Map<String, Object> toJsonObject(final Nested model) {
        return new JsonObjectBuilder()
                .put("value", (String) getFieldValue(model, "value"))
                .build();
    }
}
