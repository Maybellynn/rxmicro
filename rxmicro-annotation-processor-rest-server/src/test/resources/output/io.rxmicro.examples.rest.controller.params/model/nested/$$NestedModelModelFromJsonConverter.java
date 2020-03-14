package io.rxmicro.examples.rest.controller.params.model.nested;

import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$NestedModelModelFromJsonConverter extends ModelFromJsonConverter<NestedModel> {

    @Override
    public NestedModel fromJsonObject(final Map<String, Object> params) {
        final NestedModel model = new NestedModel();
        model.stringParameter = toString(params.get("string_parameter"), "string_parameter");
        model.bigDecimalParameter = toBigDecimal(params.get("big_decimal_parameter"), "big_decimal_parameter");
        model.instantParameter = toInstant(params.get("instant_parameter"), "instant_parameter");
        return model;
    }
}
