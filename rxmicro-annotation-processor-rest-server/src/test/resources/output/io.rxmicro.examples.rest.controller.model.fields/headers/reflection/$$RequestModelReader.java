package io.rxmicro.examples.rest.controller.model.fields.headers.reflection;

import io.rxmicro.examples.rest.controller.model.fields.Status;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

import static rxmicro.$$Reflections.setFieldValue;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$RequestModelReader extends ModelReader<Request> {

    @Override
    public Request read(final PathVariableMapping pathVariableMapping,
                        final HttpRequest request,
                        final boolean readParametersFromBody) {
        final Request model = new Request();
        final HttpHeaders httpHeaders = request.getHeaders();
        setFieldValue(model, "booleanParameter", toBoolean(httpHeaders.getValue("booleanParameter"), HttpModelType.header, "booleanParameter"));
        setFieldValue(model, "byteParameter", toByte(httpHeaders.getValue("byteParameter"), HttpModelType.header, "byteParameter"));
        setFieldValue(model, "shortParameter", toShort(httpHeaders.getValue("shortParameter"), HttpModelType.header, "shortParameter"));
        setFieldValue(model, "intParameter", toInteger(httpHeaders.getValue("intParameter"), HttpModelType.header, "intParameter"));
        setFieldValue(model, "longParameter", toLong(httpHeaders.getValue("longParameter"), HttpModelType.header, "longParameter"));
        setFieldValue(model, "bigIntParameter", toBigInteger(httpHeaders.getValue("bigIntParameter"), HttpModelType.header, "bigIntParameter"));
        setFieldValue(model, "floatParameter", toFloat(httpHeaders.getValue("floatParameter"), HttpModelType.header, "floatParameter"));
        setFieldValue(model, "doubleParameter", toDouble(httpHeaders.getValue("doubleParameter"), HttpModelType.header, "doubleParameter"));
        setFieldValue(model, "decimalParameter", toBigDecimal(httpHeaders.getValue("decimalParameter"), HttpModelType.header, "decimalParameter"));
        setFieldValue(model, "charParameter", toCharacter(httpHeaders.getValue("charParameter"), HttpModelType.header, "charParameter"));
        setFieldValue(model, "stringParameter", toString(httpHeaders.getValue("stringParameter"), HttpModelType.header, "stringParameter"));
        setFieldValue(model, "instantParameter", toInstant(httpHeaders.getValue("instantParameter"), HttpModelType.header, "instantParameter"));
        setFieldValue(model, "status", toEnum(Status.class, httpHeaders.getValue("status"), HttpModelType.header, "status"));
        setFieldValue(model, "booleanParameters", toBooleanArray(httpHeaders.getValues("booleanParameters"), HttpModelType.header, "booleanParameters"));
        setFieldValue(model, "byteParameters", toByteArray(httpHeaders.getValues("byteParameters"), HttpModelType.header, "byteParameters"));
        setFieldValue(model, "shortParameters", toShortArray(httpHeaders.getValues("shortParameters"), HttpModelType.header, "shortParameters"));
        setFieldValue(model, "intParameters", toIntegerArray(httpHeaders.getValues("intParameters"), HttpModelType.header, "intParameters"));
        setFieldValue(model, "longParameters", toLongArray(httpHeaders.getValues("longParameters"), HttpModelType.header, "longParameters"));
        setFieldValue(model, "bigIntParameters", toBigIntegerArray(httpHeaders.getValues("bigIntParameters"), HttpModelType.header, "bigIntParameters"));
        setFieldValue(model, "floatParameters", toFloatArray(httpHeaders.getValues("floatParameters"), HttpModelType.header, "floatParameters"));
        setFieldValue(model, "doubleParameters", toDoubleArray(httpHeaders.getValues("doubleParameters"), HttpModelType.header, "doubleParameters"));
        setFieldValue(model, "decimalParameters", toBigDecimalArray(httpHeaders.getValues("decimalParameters"), HttpModelType.header, "decimalParameters"));
        setFieldValue(model, "charParameters", toCharacterArray(httpHeaders.getValues("charParameters"), HttpModelType.header, "charParameters"));
        setFieldValue(model, "stringParameters", toStringArray(httpHeaders.getValues("stringParameters"), HttpModelType.header, "stringParameters"));
        setFieldValue(model, "instantParameters", toInstantArray(httpHeaders.getValues("instantParameters"), HttpModelType.header, "instantParameters"));
        setFieldValue(model, "statuses", toEnumArray(Status.class, httpHeaders.getValues("statuses"), HttpModelType.header, "statuses"));
        return model;
    }
}
