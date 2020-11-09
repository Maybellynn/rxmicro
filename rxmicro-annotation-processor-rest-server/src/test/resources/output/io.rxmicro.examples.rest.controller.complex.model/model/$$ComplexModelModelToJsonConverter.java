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
        return new JsonObjectBuilder()
                .put("status", model.status)
                .put("statusList", model.statusList)
                .put("aBoolean", model.aBoolean)
                .put("booleanList", model.booleanList)
                .put("aByte", model.aByte)
                .put("byteList", model.byteList)
                .put("aShort", model.aShort)
                .put("shortList", model.shortList)
                .put("aInteger", model.aInteger)
                .put("integerList", model.integerList)
                .put("aLong", model.aLong)
                .put("longList", model.longList)
                .put("bigInteger", model.bigInteger)
                .put("bigIntegerList", model.bigIntegerList)
                .put("aFloat", model.aFloat)
                .put("floatList", model.floatList)
                .put("aDouble", model.aDouble)
                .put("doubleList", model.doubleList)
                .put("bigDecimal", model.bigDecimal)
                .put("bigDecimalList", model.bigDecimalList)
                .put("character", model.character)
                .put("characterList", model.characterList)
                .put("string", model.string)
                .put("stringList", model.stringList)
                .put("instant", model.instant)
                .put("instantList", model.instantList)
                .put("nested", convertFromObjectIfNotNull(nestedModelModelToJsonConverter, model.nested))
                .put("nestedList", convertFromListIfNotNull(nestedModelModelToJsonConverter, model.nestedList))
                .build();
    }
}
