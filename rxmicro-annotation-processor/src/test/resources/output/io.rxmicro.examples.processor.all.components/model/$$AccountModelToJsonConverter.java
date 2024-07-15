package io.rxmicro.examples.processor.all.components.model;

import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$AccountModelToJsonConverter extends ModelToJsonConverter<Account> {

    @Override
    public Map<String, Object> toJsonObject(final Account model) {
        final JsonObjectBuilder builder = new JsonObjectBuilder();
        putValuesToBuilder(model, builder);
        return builder.build();
    }

    public void putValuesToBuilder(final Account model,
                                   final JsonObjectBuilder builder) {
        builder.put("value", model.value);
    }
}