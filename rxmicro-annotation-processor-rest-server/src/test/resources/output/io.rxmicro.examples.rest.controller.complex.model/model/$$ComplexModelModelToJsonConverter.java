package io.rxmicro.examples.rest.controller.complex.model.model;

import io.rxmicro.examples.rest.controller.complex.model.model.nested.$$NestedModelModelToJsonConverter;
import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ComplexModelModelToJsonConverter extends ModelToJsonConverter<ComplexModel> {

    private final $$NestedModelModelToJsonConverter nestedModelModelToJsonConverter =
            new $$NestedModelModelToJsonConverter();

    @Override
    public Map<String, Object> toJsonObject(final ComplexModel model) {
        final JsonObjectBuilder builder = new JsonObjectBuilder();
        putValuesToBuilder(model, builder);
        return builder.build();
    }

    protected void putValuesToBuilder(final ComplexModel model,
                                      final JsonObjectBuilder builder) {
        builder.put("status", model.status);
        builder.put("statusList", model.statusList);
        builder.put("aBoolean", model.aBoolean);
        builder.put("booleanList", model.booleanList);
        builder.put("aByte", model.aByte);
        builder.put("byteList", model.byteList);
        builder.put("aShort", model.aShort);
        builder.put("shortList", model.shortList);
        builder.put("aInteger", model.aInteger);
        builder.put("integerList", model.integerList);
        builder.put("aLong", model.aLong);
        builder.put("longList", model.longList);
        builder.put("bigInteger", model.bigInteger);
        builder.put("bigIntegerList", model.bigIntegerList);
        builder.put("aFloat", model.aFloat);
        builder.put("floatList", model.floatList);
        builder.put("aDouble", model.aDouble);
        builder.put("doubleList", model.doubleList);
        builder.put("bigDecimal", model.bigDecimal);
        builder.put("bigDecimalList", model.bigDecimalList);
        builder.put("character", model.character);
        builder.put("characterList", model.characterList);
        builder.put("string", model.string);
        builder.put("stringList", model.stringList);
        builder.put("instant", model.instant);
        builder.put("instantList", model.instantList);
        builder.put("nested", convertFromObjectIfNotNull(nestedModelModelToJsonConverter, model.nested));
        builder.put("nestedList", convertFromListIfNotNull(nestedModelModelToJsonConverter, model.nestedList));
    }
}
