package io.rxmicro.examples.rest.client.model.fields.headers.reflection;

import io.rxmicro.examples.rest.client.model.fields.Status;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.rest.client.detail.ModelReader;
import io.rxmicro.rest.model.HttpModelType;

import static rxmicro.$$Reflections.setFieldValue;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ResponseModelReader extends ModelReader<Response> {

    @Override
    public Response readSingle(final ClientHttpResponse response) {
        final Response model = new Response();
        final HttpHeaders httpHeaders = response.getHeaders();
        setFieldValue(model, "booleanParameter", toBoolean(httpHeaders.getValue("booleanParameter"), HttpModelType.HEADER, "booleanParameter"));
        setFieldValue(model, "byteParameter", toByte(httpHeaders.getValue("byteParameter"), HttpModelType.HEADER, "byteParameter"));
        setFieldValue(model, "shortParameter", toShort(httpHeaders.getValue("shortParameter"), HttpModelType.HEADER, "shortParameter"));
        setFieldValue(model, "intParameter", toInteger(httpHeaders.getValue("intParameter"), HttpModelType.HEADER, "intParameter"));
        setFieldValue(model, "longParameter", toLong(httpHeaders.getValue("longParameter"), HttpModelType.HEADER, "longParameter"));
        setFieldValue(model, "bigIntParameter", toBigInteger(httpHeaders.getValue("bigIntParameter"), HttpModelType.HEADER, "bigIntParameter"));
        setFieldValue(model, "floatParameter", toFloat(httpHeaders.getValue("floatParameter"), HttpModelType.HEADER, "floatParameter"));
        setFieldValue(model, "doubleParameter", toDouble(httpHeaders.getValue("doubleParameter"), HttpModelType.HEADER, "doubleParameter"));
        setFieldValue(model, "decimalParameter", toBigDecimal(httpHeaders.getValue("decimalParameter"), HttpModelType.HEADER, "decimalParameter"));
        setFieldValue(model, "charParameter", toCharacter(httpHeaders.getValue("charParameter"), HttpModelType.HEADER, "charParameter"));
        setFieldValue(model, "stringParameter", toString(httpHeaders.getValue("stringParameter"), HttpModelType.HEADER, "stringParameter"));
        setFieldValue(model, "instantParameter", toInstant(httpHeaders.getValue("instantParameter"), HttpModelType.HEADER, "instantParameter"));
        setFieldValue(model, "status", toEnum(Status.class, httpHeaders.getValue("status"), HttpModelType.HEADER, "status"));
        setFieldValue(model, "booleanParameters", toBooleanList(httpHeaders.getValues("booleanParameters"), HttpModelType.HEADER, "booleanParameters"));
        setFieldValue(model, "byteParameters", toByteList(httpHeaders.getValues("byteParameters"), HttpModelType.HEADER, "byteParameters"));
        setFieldValue(model, "shortParameters", toShortList(httpHeaders.getValues("shortParameters"), HttpModelType.HEADER, "shortParameters"));
        setFieldValue(model, "intParameters", toIntegerList(httpHeaders.getValues("intParameters"), HttpModelType.HEADER, "intParameters"));
        setFieldValue(model, "longParameters", toLongList(httpHeaders.getValues("longParameters"), HttpModelType.HEADER, "longParameters"));
        setFieldValue(model, "bigIntParameters", toBigIntegerList(httpHeaders.getValues("bigIntParameters"), HttpModelType.HEADER, "bigIntParameters"));
        setFieldValue(model, "floatParameters", toFloatList(httpHeaders.getValues("floatParameters"), HttpModelType.HEADER, "floatParameters"));
        setFieldValue(model, "doubleParameters", toDoubleList(httpHeaders.getValues("doubleParameters"), HttpModelType.HEADER, "doubleParameters"));
        setFieldValue(model, "decimalParameters", toBigDecimalList(httpHeaders.getValues("decimalParameters"), HttpModelType.HEADER, "decimalParameters"));
        setFieldValue(model, "charParameters", toCharacterList(httpHeaders.getValues("charParameters"), HttpModelType.HEADER, "charParameters"));
        setFieldValue(model, "stringParameters", toStringList(httpHeaders.getValues("stringParameters"), HttpModelType.HEADER, "stringParameters"));
        setFieldValue(model, "instantParameters", toInstantList(httpHeaders.getValues("instantParameters"), HttpModelType.HEADER, "instantParameters"));
        setFieldValue(model, "statuses", toEnumList(Status.class, httpHeaders.getValues("statuses"), HttpModelType.HEADER, "statuses"));
        setFieldValue(model, "booleanParameterSet", toBooleanSet(httpHeaders.getValues("booleanParameterSet"), HttpModelType.HEADER, "booleanParameterSet"));
        setFieldValue(model, "byteParameterSet", toByteSet(httpHeaders.getValues("byteParameterSet"), HttpModelType.HEADER, "byteParameterSet"));
        setFieldValue(model, "shortParameterSet", toShortSet(httpHeaders.getValues("shortParameterSet"), HttpModelType.HEADER, "shortParameterSet"));
        setFieldValue(model, "intParameterSet", toIntegerSet(httpHeaders.getValues("intParameterSet"), HttpModelType.HEADER, "intParameterSet"));
        setFieldValue(model, "longParameterSet", toLongSet(httpHeaders.getValues("longParameterSet"), HttpModelType.HEADER, "longParameterSet"));
        setFieldValue(model, "bigIntParameterSet", toBigIntegerSet(httpHeaders.getValues("bigIntParameterSet"), HttpModelType.HEADER, "bigIntParameterSet"));
        setFieldValue(model, "floatParameterSet", toFloatSet(httpHeaders.getValues("floatParameterSet"), HttpModelType.HEADER, "floatParameterSet"));
        setFieldValue(model, "doubleParameterSet", toDoubleSet(httpHeaders.getValues("doubleParameterSet"), HttpModelType.HEADER, "doubleParameterSet"));
        setFieldValue(model, "decimalParameterSet", toBigDecimalSet(httpHeaders.getValues("decimalParameterSet"), HttpModelType.HEADER, "decimalParameterSet"));
        setFieldValue(model, "charParameterSet", toCharacterSet(httpHeaders.getValues("charParameterSet"), HttpModelType.HEADER, "charParameterSet"));
        setFieldValue(model, "stringParameterSet", toStringSet(httpHeaders.getValues("stringParameterSet"), HttpModelType.HEADER, "stringParameterSet"));
        setFieldValue(model, "instantParameterSet", toInstantSet(httpHeaders.getValues("instantParameterSet"), HttpModelType.HEADER, "instantParameterSet"));
        setFieldValue(model, "statusSet", toEnumSet(Status.class, httpHeaders.getValues("statusSet"), HttpModelType.HEADER, "statusSet"));
        return model;
    }
}
