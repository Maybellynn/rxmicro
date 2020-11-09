package io.rxmicro.examples.rest.client.model.fields.params.gettersetter;

import io.rxmicro.examples.rest.client.model.fields.Status;
import io.rxmicro.examples.rest.client.model.fields.params.gettersetter.nested.$$NestedModelFromJsonConverter;
import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.List;
import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ResponseModelFromJsonConverter extends ModelFromJsonConverter<Response> {

    private final $$NestedModelFromJsonConverter nestedModelFromJsonConverter =
            new $$NestedModelFromJsonConverter();

    @Override
    public Response fromJsonObject(final Map<String, Object> params) {
        final Response model = new Response();
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
        model.setBooleanParameters(toBooleanList(params.get("booleanParameters"), "booleanParameters"));
        model.setByteParameters(toByteList(params.get("byteParameters"), "byteParameters"));
        model.setShortParameters(toShortList(params.get("shortParameters"), "shortParameters"));
        model.setIntParameters(toIntegerList(params.get("intParameters"), "intParameters"));
        model.setLongParameters(toLongList(params.get("longParameters"), "longParameters"));
        model.setBigIntParameters(toBigIntegerList(params.get("bigIntParameters"), "bigIntParameters"));
        model.setFloatParameters(toFloatList(params.get("floatParameters"), "floatParameters"));
        model.setDoubleParameters(toDoubleList(params.get("doubleParameters"), "doubleParameters"));
        model.setDecimalParameters(toBigDecimalList(params.get("decimalParameters"), "decimalParameters"));
        model.setCharParameters(toCharacterList(params.get("charParameters"), "charParameters"));
        model.setStringParameters(toStringList(params.get("stringParameters"), "stringParameters"));
        model.setInstantParameters(toInstantList(params.get("instantParameters"), "instantParameters"));
        model.setStatuses(toEnumList(Status.class, params.get("statuses"), "statuses"));
        model.setBooleanParameterSet(toBooleanSet(params.get("booleanParameterSet"), "booleanParameterSet"));
        model.setByteParameterSet(toByteSet(params.get("byteParameterSet"), "byteParameterSet"));
        model.setShortParameterSet(toShortSet(params.get("shortParameterSet"), "shortParameterSet"));
        model.setIntParameterSet(toIntegerSet(params.get("intParameterSet"), "intParameterSet"));
        model.setLongParameterSet(toLongSet(params.get("longParameterSet"), "longParameterSet"));
        model.setBigIntParameterSet(toBigIntegerSet(params.get("bigIntParameterSet"), "bigIntParameterSet"));
        model.setFloatParameterSet(toFloatSet(params.get("floatParameterSet"), "floatParameterSet"));
        model.setDoubleParameterSet(toDoubleSet(params.get("doubleParameterSet"), "doubleParameterSet"));
        model.setDecimalParameterSet(toBigDecimalSet(params.get("decimalParameterSet"), "decimalParameterSet"));
        model.setCharParameterSet(toCharacterSet(params.get("charParameterSet"), "charParameterSet"));
        model.setStringParameterSet(toStringSet(params.get("stringParameterSet"), "stringParameterSet"));
        model.setInstantParameterSet(toInstantSet(params.get("instantParameterSet"), "instantParameterSet"));
        model.setStatusSet(toEnumSet(Status.class, params.get("statusSet"), "statusSet"));
        model.setNested(convertToObjectIfNotNull(nestedModelFromJsonConverter, (Map<String, Object>) params.get("nested")));
        model.setNestedList(convertToListIfNotNull(nestedModelFromJsonConverter, (List<Object>) params.get("nestedList"), "nestedList"));
        model.setNestedSet(convertToSetIfNotNull(nestedModelFromJsonConverter, (List<Object>) params.get("nestedSet"), "nestedSet"));
        return model;
    }
}
