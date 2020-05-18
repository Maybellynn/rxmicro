package io.rxmicro.examples.rest.controller.complex.model.model;

import io.rxmicro.examples.rest.controller.complex.model.model.nested.$$NestedModelModelFromJsonConverter;
import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.List;
import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ComplexModelModelFromJsonConverter extends ModelFromJsonConverter<ComplexModel> {

    private final $$NestedModelModelFromJsonConverter nestedModelModelFromJsonConverter =
            new $$NestedModelModelFromJsonConverter();

    @Override
    public ComplexModel fromJsonObject(final Map<String, Object> params) {
        final ComplexModel model = new ComplexModel();
        model.status = toEnum(Status.class, params.get("status"), "status");
        model.statusList = toEnumArray(Status.class, params.get("statusList"), "statusList");
        model.aBoolean = toBoolean(params.get("aBoolean"), "aBoolean");
        model.booleanList = toBooleanArray(params.get("booleanList"), "booleanList");
        model.aByte = toByte(params.get("aByte"), "aByte");
        model.byteList = toByteArray(params.get("byteList"), "byteList");
        model.aShort = toShort(params.get("aShort"), "aShort");
        model.shortList = toShortArray(params.get("shortList"), "shortList");
        model.aInteger = toInteger(params.get("aInteger"), "aInteger");
        model.integerList = toIntegerArray(params.get("integerList"), "integerList");
        model.aLong = toLong(params.get("aLong"), "aLong");
        model.longList = toLongArray(params.get("longList"), "longList");
        model.bigInteger = toBigInteger(params.get("bigInteger"), "bigInteger");
        model.bigIntegerList = toBigIntegerArray(params.get("bigIntegerList"), "bigIntegerList");
        model.aFloat = toFloat(params.get("aFloat"), "aFloat");
        model.floatList = toFloatArray(params.get("floatList"), "floatList");
        model.aDouble = toDouble(params.get("aDouble"), "aDouble");
        model.doubleList = toDoubleArray(params.get("doubleList"), "doubleList");
        model.bigDecimal = toBigDecimal(params.get("bigDecimal"), "bigDecimal");
        model.bigDecimalList = toBigDecimalArray(params.get("bigDecimalList"), "bigDecimalList");
        model.character = toCharacter(params.get("character"), "character");
        model.characterList = toCharacterArray(params.get("characterList"), "characterList");
        model.string = toString(params.get("string"), "string");
        model.stringList = toStringArray(params.get("stringList"), "stringList");
        model.instant = toInstant(params.get("instant"), "instant");
        model.instantList = toInstantArray(params.get("instantList"), "instantList");
        model.nested = convertIfNotNull(nestedModelModelFromJsonConverter, (Map<String, Object>) params.get("nested"));
        model.nestedList = convertIfNotNull(nestedModelModelFromJsonConverter, (List<Object>) params.get("nestedList"), "nestedList");
        return model;
    }
}
