package io.rxmicro.examples.rest.controller.model.fields.params.gettersetter;

import io.rxmicro.examples.rest.controller.model.fields.Status;
import io.rxmicro.examples.rest.controller.model.fields.params.gettersetter.nested.$$NestedModelFromJsonConverter;
import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.List;
import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$BodyRequestModelFromJsonConverter extends ModelFromJsonConverter<BodyRequest> {

    private final $$NestedModelFromJsonConverter nestedModelFromJsonConverter =
            new $$NestedModelFromJsonConverter();

    @Override
    public BodyRequest fromJsonObject(final Map<String, Object> params) {
        final BodyRequest model = new BodyRequest();
        model.setBooleanParameter(toBoolean(params.get("booleanParameter"), "booleanParameter"));
        model.setByteParameter(toByte(params.get("byteParameter"), "byteParameter"));
        model.setShortParameter(toShort(params.get("shortParameter"), "shortParameter"));
        model.setIntParameter(toInteger(params.get("intParameter"), "intParameter"));
        model.setLongParameter(toLong(params.get("longParameter"), "longParameter"));
        model.setBigIntParameter(toBigInteger(params.get("bigIntParameter"), "bigIntParameter"));
        model.setFloatParameter(toFloat(params.get("floatParameter"), "floatParameter"));
        model.setDoubleParameter(toDouble(params.get("doubleParameter"), "doubleParameter"));
        model.setDecimalParameter(toBigDecimal(params.get("decimalParameter"), "decimalParameter"));
        model.setCharParameter(toCharacter(params.get("charParameter"), "charParameter"));
        model.setStringParameter(toString(params.get("stringParameter"), "stringParameter"));
        model.setInstantParameter(toInstant(params.get("instantParameter"), "instantParameter"));
        model.setStatus(toEnum(Status.class, params.get("status"), "status"));
        model.setBooleanParameters(toBooleanArray(params.get("booleanParameters"), "booleanParameters"));
        model.setByteParameters(toByteArray(params.get("byteParameters"), "byteParameters"));
        model.setShortParameters(toShortArray(params.get("shortParameters"), "shortParameters"));
        model.setIntParameters(toIntegerArray(params.get("intParameters"), "intParameters"));
        model.setLongParameters(toLongArray(params.get("longParameters"), "longParameters"));
        model.setBigIntParameters(toBigIntegerArray(params.get("bigIntParameters"), "bigIntParameters"));
        model.setFloatParameters(toFloatArray(params.get("floatParameters"), "floatParameters"));
        model.setDoubleParameters(toDoubleArray(params.get("doubleParameters"), "doubleParameters"));
        model.setDecimalParameters(toBigDecimalArray(params.get("decimalParameters"), "decimalParameters"));
        model.setCharParameters(toCharacterArray(params.get("charParameters"), "charParameters"));
        model.setStringParameters(toStringArray(params.get("stringParameters"), "stringParameters"));
        model.setInstantParameters(toInstantArray(params.get("instantParameters"), "instantParameters"));
        model.setStatuses(toEnumArray(Status.class, params.get("statuses"), "statuses"));
        model.setNested(convertIfNotNull(nestedModelFromJsonConverter, (Map<String, Object>) params.get("nested")));
        model.setNestedList(convertIfNotNull(nestedModelFromJsonConverter, (List<Object>) params.get("nestedList"), "nestedList"));
        return model;
    }
}
