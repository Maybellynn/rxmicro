package io.rxmicro.examples.rest.controller.extendable.model.response.any.internal_header_body.parent;

import io.rxmicro.examples.rest.controller.extendable.model.response.any.internal_header_body.grand.$$GrandParentModelToJsonConverter;
import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ParentModelToJsonConverter extends ModelToJsonConverter<Parent> {

    private final $$GrandParentModelToJsonConverter parentConverter =
            new $$GrandParentModelToJsonConverter();

    @Override
    public Map<String, Object> toJsonObject(final Parent model) {
        final JsonObjectBuilder builder = new JsonObjectBuilder();
        putValuesToBuilder(model, builder);
        return builder.build();
    }

    public void putValuesToBuilder(final Parent model,
                                   final JsonObjectBuilder builder) {
        parentConverter.putValuesToBuilder(model, builder);
    }
}