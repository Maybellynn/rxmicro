package io.rxmicro.examples.rest.client.model.fields.headers.gettersetter;

import io.rxmicro.examples.rest.client.model.fields.Status;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.rest.client.detail.ModelReader;
import io.rxmicro.rest.model.HttpModelType;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$ResponseModelReader extends ModelReader<Response> {

    @Override
    public Response readSingle(final ClientHttpResponse response) {
        final Response model = new Response();
        final HttpHeaders httpHeaders = response.headers();
        model.setBooleanParameter(toBoolean(httpHeaders.getValue("booleanParameter"), HttpModelType.HEADER, "booleanParameter"));
        model.setByteParameter(toByte(httpHeaders.getValue("byteParameter"), HttpModelType.HEADER, "byteParameter"));
        model.setShortParameter(toShort(httpHeaders.getValue("shortParameter"), HttpModelType.HEADER, "shortParameter"));
        model.setIntParameter(toInteger(httpHeaders.getValue("intParameter"), HttpModelType.HEADER, "intParameter"));
        model.setLongParameter(toLong(httpHeaders.getValue("longParameter"), HttpModelType.HEADER, "longParameter"));
        model.setBigIntParameter(toBigInteger(httpHeaders.getValue("bigIntParameter"), HttpModelType.HEADER, "bigIntParameter"));
        model.setFloatParameter(toFloat(httpHeaders.getValue("floatParameter"), HttpModelType.HEADER, "floatParameter"));
        model.setDoubleParameter(toDouble(httpHeaders.getValue("doubleParameter"), HttpModelType.HEADER, "doubleParameter"));
        model.setDecimalParameter(toBigDecimal(httpHeaders.getValue("decimalParameter"), HttpModelType.HEADER, "decimalParameter"));
        model.setCharParameter(toCharacter(httpHeaders.getValue("charParameter"), HttpModelType.HEADER, "charParameter"));
        model.setStringParameter(toString(httpHeaders.getValue("stringParameter"), HttpModelType.HEADER, "stringParameter"));
        model.setInstantParameter(toInstant(httpHeaders.getValue("instantParameter"), HttpModelType.HEADER, "instantParameter"));
        model.setStatus(toEnum(Status.class, httpHeaders.getValue("status"), HttpModelType.HEADER, "status"));
        model.setBooleanParameters(toBooleanArray(httpHeaders.getValues("booleanParameters"), HttpModelType.HEADER, "booleanParameters"));
        model.setByteParameters(toByteArray(httpHeaders.getValues("byteParameters"), HttpModelType.HEADER, "byteParameters"));
        model.setShortParameters(toShortArray(httpHeaders.getValues("shortParameters"), HttpModelType.HEADER, "shortParameters"));
        model.setIntParameters(toIntegerArray(httpHeaders.getValues("intParameters"), HttpModelType.HEADER, "intParameters"));
        model.setLongParameters(toLongArray(httpHeaders.getValues("longParameters"), HttpModelType.HEADER, "longParameters"));
        model.setBigIntParameters(toBigIntegerArray(httpHeaders.getValues("bigIntParameters"), HttpModelType.HEADER, "bigIntParameters"));
        model.setFloatParameters(toFloatArray(httpHeaders.getValues("floatParameters"), HttpModelType.HEADER, "floatParameters"));
        model.setDoubleParameters(toDoubleArray(httpHeaders.getValues("doubleParameters"), HttpModelType.HEADER, "doubleParameters"));
        model.setDecimalParameters(toBigDecimalArray(httpHeaders.getValues("decimalParameters"), HttpModelType.HEADER, "decimalParameters"));
        model.setCharParameters(toCharacterArray(httpHeaders.getValues("charParameters"), HttpModelType.HEADER, "charParameters"));
        model.setStringParameters(toStringArray(httpHeaders.getValues("stringParameters"), HttpModelType.HEADER, "stringParameters"));
        model.setInstantParameters(toInstantArray(httpHeaders.getValues("instantParameters"), HttpModelType.HEADER, "instantParameters"));
        model.setStatuses(toEnumArray(Status.class, httpHeaders.getValues("statuses"), HttpModelType.HEADER, "statuses"));
        return model;
    }
}
