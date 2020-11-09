package io.rxmicro.examples.rest.controller.model.fields.headers.direct;

import io.rxmicro.examples.rest.controller.model.fields.Status;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RequestModelReader extends ModelReader<Request> {

    @Override
    public Request read(final PathVariableMapping pathVariableMapping,
                        final HttpRequest request,
                        final boolean readParametersFromBody) {
        final Request model = new Request();
        final HttpHeaders httpHeaders = request.getHeaders();
        model.booleanParameter = toBoolean(httpHeaders.getValue("booleanParameter"), HttpModelType.HEADER, "booleanParameter");
        model.byteParameter = toByte(httpHeaders.getValue("byteParameter"), HttpModelType.HEADER, "byteParameter");
        model.shortParameter = toShort(httpHeaders.getValue("shortParameter"), HttpModelType.HEADER, "shortParameter");
        model.intParameter = toInteger(httpHeaders.getValue("intParameter"), HttpModelType.HEADER, "intParameter");
        model.longParameter = toLong(httpHeaders.getValue("longParameter"), HttpModelType.HEADER, "longParameter");
        model.bigIntParameter = toBigInteger(httpHeaders.getValue("bigIntParameter"), HttpModelType.HEADER, "bigIntParameter");
        model.floatParameter = toFloat(httpHeaders.getValue("floatParameter"), HttpModelType.HEADER, "floatParameter");
        model.doubleParameter = toDouble(httpHeaders.getValue("doubleParameter"), HttpModelType.HEADER, "doubleParameter");
        model.decimalParameter = toBigDecimal(httpHeaders.getValue("decimalParameter"), HttpModelType.HEADER, "decimalParameter");
        model.charParameter = toCharacter(httpHeaders.getValue("charParameter"), HttpModelType.HEADER, "charParameter");
        model.stringParameter = toString(httpHeaders.getValue("stringParameter"), HttpModelType.HEADER, "stringParameter");
        model.instantParameter = toInstant(httpHeaders.getValue("instantParameter"), HttpModelType.HEADER, "instantParameter");
        model.status = toEnum(Status.class, httpHeaders.getValue("status"), HttpModelType.HEADER, "status");
        model.booleanParameters = toBooleanList(httpHeaders.getValues("booleanParameters"), HttpModelType.HEADER, "booleanParameters");
        model.byteParameters = toByteList(httpHeaders.getValues("byteParameters"), HttpModelType.HEADER, "byteParameters");
        model.shortParameters = toShortList(httpHeaders.getValues("shortParameters"), HttpModelType.HEADER, "shortParameters");
        model.intParameters = toIntegerList(httpHeaders.getValues("intParameters"), HttpModelType.HEADER, "intParameters");
        model.longParameters = toLongList(httpHeaders.getValues("longParameters"), HttpModelType.HEADER, "longParameters");
        model.bigIntParameters = toBigIntegerList(httpHeaders.getValues("bigIntParameters"), HttpModelType.HEADER, "bigIntParameters");
        model.floatParameters = toFloatList(httpHeaders.getValues("floatParameters"), HttpModelType.HEADER, "floatParameters");
        model.doubleParameters = toDoubleList(httpHeaders.getValues("doubleParameters"), HttpModelType.HEADER, "doubleParameters");
        model.decimalParameters = toBigDecimalList(httpHeaders.getValues("decimalParameters"), HttpModelType.HEADER, "decimalParameters");
        model.charParameters = toCharacterList(httpHeaders.getValues("charParameters"), HttpModelType.HEADER, "charParameters");
        model.stringParameters = toStringList(httpHeaders.getValues("stringParameters"), HttpModelType.HEADER, "stringParameters");
        model.instantParameters = toInstantList(httpHeaders.getValues("instantParameters"), HttpModelType.HEADER, "instantParameters");
        model.statuses = toEnumList(Status.class, httpHeaders.getValues("statuses"), HttpModelType.HEADER, "statuses");
        model.booleanParameterSet = toBooleanSet(httpHeaders.getValues("booleanParameterSet"), HttpModelType.HEADER, "booleanParameterSet");
        model.byteParameterSet = toByteSet(httpHeaders.getValues("byteParameterSet"), HttpModelType.HEADER, "byteParameterSet");
        model.shortParameterSet = toShortSet(httpHeaders.getValues("shortParameterSet"), HttpModelType.HEADER, "shortParameterSet");
        model.intParameterSet = toIntegerSet(httpHeaders.getValues("intParameterSet"), HttpModelType.HEADER, "intParameterSet");
        model.longParameterSet = toLongSet(httpHeaders.getValues("longParameterSet"), HttpModelType.HEADER, "longParameterSet");
        model.bigIntParameterSet = toBigIntegerSet(httpHeaders.getValues("bigIntParameterSet"), HttpModelType.HEADER, "bigIntParameterSet");
        model.floatParameterSet = toFloatSet(httpHeaders.getValues("floatParameterSet"), HttpModelType.HEADER, "floatParameterSet");
        model.doubleParameterSet = toDoubleSet(httpHeaders.getValues("doubleParameterSet"), HttpModelType.HEADER, "doubleParameterSet");
        model.decimalParameterSet = toBigDecimalSet(httpHeaders.getValues("decimalParameterSet"), HttpModelType.HEADER, "decimalParameterSet");
        model.charParameterSet = toCharacterSet(httpHeaders.getValues("charParameterSet"), HttpModelType.HEADER, "charParameterSet");
        model.stringParameterSet = toStringSet(httpHeaders.getValues("stringParameterSet"), HttpModelType.HEADER, "stringParameterSet");
        model.instantParameterSet = toInstantSet(httpHeaders.getValues("instantParameterSet"), HttpModelType.HEADER, "instantParameterSet");
        model.statusSet = toEnumSet(Status.class, httpHeaders.getValues("statusSet"), HttpModelType.HEADER, "statusSet");
        return model;
    }
}
