package io.rxmicro.examples.rest.controller.model.types.model.request.query_string;

import io.rxmicro.examples.rest.controller.model.types.model.Status;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$QueryStringWithHeadersRequestModelReader extends ModelReader<QueryStringWithHeadersRequest> {

    @Override
    public QueryStringWithHeadersRequest read(final PathVariableMapping pathVariableMapping,
                                              final HttpRequest request,
                                              final boolean readParametersFromBody) {
        final QueryStringWithHeadersRequest model = new QueryStringWithHeadersRequest();
        final QueryParams params = extractParams(request.getQueryString());
        readPrimitivesToModel(pathVariableMapping, request, params, model);
        return model;
    }

    protected void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                         final HttpRequest request,
                                         final QueryParams params,
                                         final QueryStringWithHeadersRequest model) {
        readPrimitivesToModel(pathVariableMapping, request, model);
        model.booleanParameter = toBoolean(params.getValue("booleanParameter"), HttpModelType.PARAMETER, "booleanParameter");
        model.byteParameter = toByte(params.getValue("byteParameter"), HttpModelType.PARAMETER, "byteParameter");
        model.shortParameter = toShort(params.getValue("shortParameter"), HttpModelType.PARAMETER, "shortParameter");
        model.intParameter = toInteger(params.getValue("intParameter"), HttpModelType.PARAMETER, "intParameter");
        model.longParameter = toLong(params.getValue("longParameter"), HttpModelType.PARAMETER, "longParameter");
        model.bigIntParameter = toBigInteger(params.getValue("bigIntParameter"), HttpModelType.PARAMETER, "bigIntParameter");
        model.floatParameter = toFloat(params.getValue("floatParameter"), HttpModelType.PARAMETER, "floatParameter");
        model.doubleParameter = toDouble(params.getValue("doubleParameter"), HttpModelType.PARAMETER, "doubleParameter");
        model.decimalParameter = toBigDecimal(params.getValue("decimalParameter"), HttpModelType.PARAMETER, "decimalParameter");
        model.charParameter = toCharacter(params.getValue("charParameter"), HttpModelType.PARAMETER, "charParameter");
        model.stringParameter = toString(params.getValue("stringParameter"), HttpModelType.PARAMETER, "stringParameter");
        model.instantParameter = toInstant(params.getValue("instantParameter"), HttpModelType.PARAMETER, "instantParameter");
        model.enumParameter = toEnum(Status.class, params.getValue("enumParameter"), HttpModelType.PARAMETER, "enumParameter");
        model.booleanParameterList = toBooleanList(params.getValues("booleanParameterList"), HttpModelType.PARAMETER, "booleanParameterList");
        model.byteParameterList = toByteList(params.getValues("byteParameterList"), HttpModelType.PARAMETER, "byteParameterList");
        model.shortParameterList = toShortList(params.getValues("shortParameterList"), HttpModelType.PARAMETER, "shortParameterList");
        model.intParameterList = toIntegerList(params.getValues("intParameterList"), HttpModelType.PARAMETER, "intParameterList");
        model.longParameterList = toLongList(params.getValues("longParameterList"), HttpModelType.PARAMETER, "longParameterList");
        model.bigIntParameterList = toBigIntegerList(params.getValues("bigIntParameterList"), HttpModelType.PARAMETER, "bigIntParameterList");
        model.floatParameterList = toFloatList(params.getValues("floatParameterList"), HttpModelType.PARAMETER, "floatParameterList");
        model.doubleParameterList = toDoubleList(params.getValues("doubleParameterList"), HttpModelType.PARAMETER, "doubleParameterList");
        model.decimalParameterList = toBigDecimalList(params.getValues("decimalParameterList"), HttpModelType.PARAMETER, "decimalParameterList");
        model.charParameterList = toCharacterList(params.getValues("charParameterList"), HttpModelType.PARAMETER, "charParameterList");
        model.stringParameterList = toStringList(params.getValues("stringParameterList"), HttpModelType.PARAMETER, "stringParameterList");
        model.instantParameterList = toInstantList(params.getValues("instantParameterList"), HttpModelType.PARAMETER, "instantParameterList");
        model.enumParameterList = toEnumList(Status.class, params.getValues("enumParameterList"), HttpModelType.PARAMETER, "enumParameterList");
        model.booleanParameterSet = toBooleanSet(params.getValues("booleanParameterSet"), HttpModelType.PARAMETER, "booleanParameterSet");
        model.byteParameterSet = toByteSet(params.getValues("byteParameterSet"), HttpModelType.PARAMETER, "byteParameterSet");
        model.shortParameterSet = toShortSet(params.getValues("shortParameterSet"), HttpModelType.PARAMETER, "shortParameterSet");
        model.intParameterSet = toIntegerSet(params.getValues("intParameterSet"), HttpModelType.PARAMETER, "intParameterSet");
        model.longParameterSet = toLongSet(params.getValues("longParameterSet"), HttpModelType.PARAMETER, "longParameterSet");
        model.bigIntParameterSet = toBigIntegerSet(params.getValues("bigIntParameterSet"), HttpModelType.PARAMETER, "bigIntParameterSet");
        model.floatParameterSet = toFloatSet(params.getValues("floatParameterSet"), HttpModelType.PARAMETER, "floatParameterSet");
        model.doubleParameterSet = toDoubleSet(params.getValues("doubleParameterSet"), HttpModelType.PARAMETER, "doubleParameterSet");
        model.decimalParameterSet = toBigDecimalSet(params.getValues("decimalParameterSet"), HttpModelType.PARAMETER, "decimalParameterSet");
        model.charParameterSet = toCharacterSet(params.getValues("charParameterSet"), HttpModelType.PARAMETER, "charParameterSet");
        model.stringParameterSet = toStringSet(params.getValues("stringParameterSet"), HttpModelType.PARAMETER, "stringParameterSet");
        model.instantParameterSet = toInstantSet(params.getValues("instantParameterSet"), HttpModelType.PARAMETER, "instantParameterSet");
        model.enumParameterSet = toEnumSet(Status.class, params.getValues("enumParameterSet"), HttpModelType.PARAMETER, "enumParameterSet");
    }

    protected void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                         final HttpRequest request,
                                         final QueryStringWithHeadersRequest model) {
        final HttpHeaders httpHeaders = request.getHeaders();
        model.booleanHeader = toBoolean(httpHeaders.getValue("booleanHeader"), HttpModelType.HEADER, "booleanHeader");
        model.byteHeader = toByte(httpHeaders.getValue("byteHeader"), HttpModelType.HEADER, "byteHeader");
        model.shortHeader = toShort(httpHeaders.getValue("shortHeader"), HttpModelType.HEADER, "shortHeader");
        model.intHeader = toInteger(httpHeaders.getValue("intHeader"), HttpModelType.HEADER, "intHeader");
        model.longHeader = toLong(httpHeaders.getValue("longHeader"), HttpModelType.HEADER, "longHeader");
        model.bigIntHeader = toBigInteger(httpHeaders.getValue("bigIntHeader"), HttpModelType.HEADER, "bigIntHeader");
        model.floatHeader = toFloat(httpHeaders.getValue("floatHeader"), HttpModelType.HEADER, "floatHeader");
        model.doubleHeader = toDouble(httpHeaders.getValue("doubleHeader"), HttpModelType.HEADER, "doubleHeader");
        model.decimalHeader = toBigDecimal(httpHeaders.getValue("decimalHeader"), HttpModelType.HEADER, "decimalHeader");
        model.charHeader = toCharacter(httpHeaders.getValue("charHeader"), HttpModelType.HEADER, "charHeader");
        model.stringHeader = toString(httpHeaders.getValue("stringHeader"), HttpModelType.HEADER, "stringHeader");
        model.instantHeader = toInstant(httpHeaders.getValue("instantHeader"), HttpModelType.HEADER, "instantHeader");
        model.enumHeader = toEnum(Status.class, httpHeaders.getValue("enumHeader"), HttpModelType.HEADER, "enumHeader");
        model.booleanHeaderList = toBooleanList(httpHeaders.getValues("booleanHeaderList"), HttpModelType.HEADER, "booleanHeaderList");
        model.byteHeaderList = toByteList(httpHeaders.getValues("byteHeaderList"), HttpModelType.HEADER, "byteHeaderList");
        model.shortHeaderList = toShortList(httpHeaders.getValues("shortHeaderList"), HttpModelType.HEADER, "shortHeaderList");
        model.intHeaderList = toIntegerList(httpHeaders.getValues("intHeaderList"), HttpModelType.HEADER, "intHeaderList");
        model.longHeaderList = toLongList(httpHeaders.getValues("longHeaderList"), HttpModelType.HEADER, "longHeaderList");
        model.bigIntHeaderList = toBigIntegerList(httpHeaders.getValues("bigIntHeaderList"), HttpModelType.HEADER, "bigIntHeaderList");
        model.floatHeaderList = toFloatList(httpHeaders.getValues("floatHeaderList"), HttpModelType.HEADER, "floatHeaderList");
        model.doubleHeaderList = toDoubleList(httpHeaders.getValues("doubleHeaderList"), HttpModelType.HEADER, "doubleHeaderList");
        model.decimalHeaderList = toBigDecimalList(httpHeaders.getValues("decimalHeaderList"), HttpModelType.HEADER, "decimalHeaderList");
        model.charHeaderList = toCharacterList(httpHeaders.getValues("charHeaderList"), HttpModelType.HEADER, "charHeaderList");
        model.stringHeaderList = toStringList(httpHeaders.getValues("stringHeaderList"), HttpModelType.HEADER, "stringHeaderList");
        model.instantHeaderList = toInstantList(httpHeaders.getValues("instantHeaderList"), HttpModelType.HEADER, "instantHeaderList");
        model.enumHeaderList = toEnumList(Status.class, httpHeaders.getValues("enumHeaderList"), HttpModelType.HEADER, "enumHeaderList");
        model.booleanHeaderSet = toBooleanSet(httpHeaders.getValues("booleanHeaderSet"), HttpModelType.HEADER, "booleanHeaderSet");
        model.byteHeaderSet = toByteSet(httpHeaders.getValues("byteHeaderSet"), HttpModelType.HEADER, "byteHeaderSet");
        model.shortHeaderSet = toShortSet(httpHeaders.getValues("shortHeaderSet"), HttpModelType.HEADER, "shortHeaderSet");
        model.intHeaderSet = toIntegerSet(httpHeaders.getValues("intHeaderSet"), HttpModelType.HEADER, "intHeaderSet");
        model.longHeaderSet = toLongSet(httpHeaders.getValues("longHeaderSet"), HttpModelType.HEADER, "longHeaderSet");
        model.bigIntHeaderSet = toBigIntegerSet(httpHeaders.getValues("bigIntHeaderSet"), HttpModelType.HEADER, "bigIntHeaderSet");
        model.floatHeaderSet = toFloatSet(httpHeaders.getValues("floatHeaderSet"), HttpModelType.HEADER, "floatHeaderSet");
        model.doubleHeaderSet = toDoubleSet(httpHeaders.getValues("doubleHeaderSet"), HttpModelType.HEADER, "doubleHeaderSet");
        model.decimalHeaderSet = toBigDecimalSet(httpHeaders.getValues("decimalHeaderSet"), HttpModelType.HEADER, "decimalHeaderSet");
        model.charHeaderSet = toCharacterSet(httpHeaders.getValues("charHeaderSet"), HttpModelType.HEADER, "charHeaderSet");
        model.stringHeaderSet = toStringSet(httpHeaders.getValues("stringHeaderSet"), HttpModelType.HEADER, "stringHeaderSet");
        model.instantHeaderSet = toInstantSet(httpHeaders.getValues("instantHeaderSet"), HttpModelType.HEADER, "instantHeaderSet");
        model.enumHeaderSet = toEnumSet(Status.class, httpHeaders.getValues("enumHeaderSet"), HttpModelType.HEADER, "enumHeaderSet");
        model.requestIdHeader = toString(httpHeaders.getValue("Request-Id"), HttpModelType.HEADER, "Request-Id");
    }
}
