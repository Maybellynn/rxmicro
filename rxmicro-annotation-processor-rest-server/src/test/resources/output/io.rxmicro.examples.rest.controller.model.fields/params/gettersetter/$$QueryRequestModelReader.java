package io.rxmicro.examples.rest.controller.model.fields.params.gettersetter;

import io.rxmicro.examples.rest.controller.model.fields.Status;
import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$QueryRequestModelReader extends ModelReader<QueryRequest> {

    @Override
    public QueryRequest read(final PathVariableMapping pathVariableMapping,
                             final HttpRequest request,
                             final boolean readParametersFromBody) {
        final QueryRequest model = new QueryRequest();
        final QueryParams params = extractParams(request.getQueryString());
        model.setBooleanParameter(toBoolean(params.getValue("booleanParameter"), HttpModelType.PARAMETER, "booleanParameter"));
        model.setByteParameter(toByte(params.getValue("byteParameter"), HttpModelType.PARAMETER, "byteParameter"));
        model.setShortParameter(toShort(params.getValue("shortParameter"), HttpModelType.PARAMETER, "shortParameter"));
        model.setIntParameter(toInteger(params.getValue("intParameter"), HttpModelType.PARAMETER, "intParameter"));
        model.setLongParameter(toLong(params.getValue("longParameter"), HttpModelType.PARAMETER, "longParameter"));
        model.setBigIntParameter(toBigInteger(params.getValue("bigIntParameter"), HttpModelType.PARAMETER, "bigIntParameter"));
        model.setFloatParameter(toFloat(params.getValue("floatParameter"), HttpModelType.PARAMETER, "floatParameter"));
        model.setDoubleParameter(toDouble(params.getValue("doubleParameter"), HttpModelType.PARAMETER, "doubleParameter"));
        model.setDecimalParameter(toBigDecimal(params.getValue("decimalParameter"), HttpModelType.PARAMETER, "decimalParameter"));
        model.setCharParameter(toCharacter(params.getValue("charParameter"), HttpModelType.PARAMETER, "charParameter"));
        model.setStringParameter(toString(params.getValue("stringParameter"), HttpModelType.PARAMETER, "stringParameter"));
        model.setInstantParameter(toInstant(params.getValue("instantParameter"), HttpModelType.PARAMETER, "instantParameter"));
        model.setStatus(toEnum(Status.class, params.getValue("status"), HttpModelType.PARAMETER, "status"));
        model.setBooleanParameters(toBooleanList(params.getValues("booleanParameters"), HttpModelType.PARAMETER, "booleanParameters"));
        model.setByteParameters(toByteList(params.getValues("byteParameters"), HttpModelType.PARAMETER, "byteParameters"));
        model.setShortParameters(toShortList(params.getValues("shortParameters"), HttpModelType.PARAMETER, "shortParameters"));
        model.setIntParameters(toIntegerList(params.getValues("intParameters"), HttpModelType.PARAMETER, "intParameters"));
        model.setLongParameters(toLongList(params.getValues("longParameters"), HttpModelType.PARAMETER, "longParameters"));
        model.setBigIntParameters(toBigIntegerList(params.getValues("bigIntParameters"), HttpModelType.PARAMETER, "bigIntParameters"));
        model.setFloatParameters(toFloatList(params.getValues("floatParameters"), HttpModelType.PARAMETER, "floatParameters"));
        model.setDoubleParameters(toDoubleList(params.getValues("doubleParameters"), HttpModelType.PARAMETER, "doubleParameters"));
        model.setDecimalParameters(toBigDecimalList(params.getValues("decimalParameters"), HttpModelType.PARAMETER, "decimalParameters"));
        model.setCharParameters(toCharacterList(params.getValues("charParameters"), HttpModelType.PARAMETER, "charParameters"));
        model.setStringParameters(toStringList(params.getValues("stringParameters"), HttpModelType.PARAMETER, "stringParameters"));
        model.setInstantParameters(toInstantList(params.getValues("instantParameters"), HttpModelType.PARAMETER, "instantParameters"));
        model.setStatuses(toEnumList(Status.class, params.getValues("statuses"), HttpModelType.PARAMETER, "statuses"));
        model.setBooleanParameterSet(toBooleanSet(params.getValues("booleanParameterSet"), HttpModelType.PARAMETER, "booleanParameterSet"));
        model.setByteParameterSet(toByteSet(params.getValues("byteParameterSet"), HttpModelType.PARAMETER, "byteParameterSet"));
        model.setShortParameterSet(toShortSet(params.getValues("shortParameterSet"), HttpModelType.PARAMETER, "shortParameterSet"));
        model.setIntParameterSet(toIntegerSet(params.getValues("intParameterSet"), HttpModelType.PARAMETER, "intParameterSet"));
        model.setLongParameterSet(toLongSet(params.getValues("longParameterSet"), HttpModelType.PARAMETER, "longParameterSet"));
        model.setBigIntParameterSet(toBigIntegerSet(params.getValues("bigIntParameterSet"), HttpModelType.PARAMETER, "bigIntParameterSet"));
        model.setFloatParameterSet(toFloatSet(params.getValues("floatParameterSet"), HttpModelType.PARAMETER, "floatParameterSet"));
        model.setDoubleParameterSet(toDoubleSet(params.getValues("doubleParameterSet"), HttpModelType.PARAMETER, "doubleParameterSet"));
        model.setDecimalParameterSet(toBigDecimalSet(params.getValues("decimalParameterSet"), HttpModelType.PARAMETER, "decimalParameterSet"));
        model.setCharParameterSet(toCharacterSet(params.getValues("charParameterSet"), HttpModelType.PARAMETER, "charParameterSet"));
        model.setStringParameterSet(toStringSet(params.getValues("stringParameterSet"), HttpModelType.PARAMETER, "stringParameterSet"));
        model.setInstantParameterSet(toInstantSet(params.getValues("instantParameterSet"), HttpModelType.PARAMETER, "instantParameterSet"));
        model.setStatusSet(toEnumSet(Status.class, params.getValues("statusSet"), HttpModelType.PARAMETER, "statusSet"));
        return model;
    }
}
