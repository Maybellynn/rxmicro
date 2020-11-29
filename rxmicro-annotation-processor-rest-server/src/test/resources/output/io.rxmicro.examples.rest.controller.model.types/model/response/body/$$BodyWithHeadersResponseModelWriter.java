package io.rxmicro.examples.rest.controller.model.types.model.response.body;

import io.rxmicro.examples.rest.controller.model.types.model.Status;
import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.http.HttpStandardHeaderNames;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.server.detail.component.ModelWriter;
import io.rxmicro.rest.server.detail.model.HttpResponse;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$BodyWithHeadersResponseModelWriter extends ModelWriter<BodyWithHeadersResponse> {
    private final $$BodyWithHeadersResponseModelToJsonConverter bodyWithHeadersResponseModelToJsonConverter;

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter;

    private final String outputMimeType;

    public $$BodyWithHeadersResponseModelWriter(final boolean humanReadableOutput) {
        exchangeDataFormatConverter = new JsonExchangeDataFormatConverter(humanReadableOutput);
        bodyWithHeadersResponseModelToJsonConverter = new $$BodyWithHeadersResponseModelToJsonConverter();
        outputMimeType = exchangeDataFormatConverter.getMimeType();
    }

    @Override
    public void write(final BodyWithHeadersResponse model,
                      final HttpResponse response) {
        writePrimitivesToResponse(model, response);
        response.setHeader(HttpStandardHeaderNames.CONTENT_TYPE, outputMimeType);
        final Map<String, Object> json = bodyWithHeadersResponseModelToJsonConverter.toJsonObject(model);
        response.setContent(exchangeDataFormatConverter.toBytes(json));
    }

    protected void writePrimitivesToResponse(final BodyWithHeadersResponse model,
                                             final HttpResponse response) {
        response.setHeader("booleanHeader", model.booleanHeader);
        response.setHeader("byteHeader", model.byteHeader);
        response.setHeader("shortHeader", model.shortHeader);
        response.setHeader("intHeader", model.intHeader);
        response.setHeader("longHeader", model.longHeader);
        response.setHeader("bigIntHeader", model.bigIntHeader);
        response.setHeader("floatHeader", model.floatHeader);
        response.setHeader("doubleHeader", model.doubleHeader);
        response.setHeader("decimalHeader", model.decimalHeader);
        response.setHeader("charHeader", model.charHeader);
        response.setHeader("stringHeader", model.stringHeader);
        response.setHeader("instantHeader", model.instantHeader);
        response.setHeader("enumHeader", model.enumHeader);
        response.setHeader("booleanHeaderList", model.booleanHeaderList);
        response.setHeader("byteHeaderList", model.byteHeaderList);
        response.setHeader("shortHeaderList", model.shortHeaderList);
        response.setHeader("intHeaderList", model.intHeaderList);
        response.setHeader("longHeaderList", model.longHeaderList);
        response.setHeader("bigIntHeaderList", model.bigIntHeaderList);
        response.setHeader("floatHeaderList", model.floatHeaderList);
        response.setHeader("doubleHeaderList", model.doubleHeaderList);
        response.setHeader("decimalHeaderList", model.decimalHeaderList);
        response.setHeader("charHeaderList", model.charHeaderList);
        response.setHeader("stringHeaderList", model.stringHeaderList);
        response.setHeader("instantHeaderList", model.instantHeaderList);
        response.setHeader("enumHeaderList", model.enumHeaderList);
        response.setHeader("booleanHeaderSet", model.booleanHeaderSet);
        response.setHeader("byteHeaderSet", model.byteHeaderSet);
        response.setHeader("shortHeaderSet", model.shortHeaderSet);
        response.setHeader("intHeaderSet", model.intHeaderSet);
        response.setHeader("longHeaderSet", model.longHeaderSet);
        response.setHeader("bigIntHeaderSet", model.bigIntHeaderSet);
        response.setHeader("floatHeaderSet", model.floatHeaderSet);
        response.setHeader("doubleHeaderSet", model.doubleHeaderSet);
        response.setHeader("decimalHeaderSet", model.decimalHeaderSet);
        response.setHeader("charHeaderSet", model.charHeaderSet);
        response.setHeader("stringHeaderSet", model.stringHeaderSet);
        response.setHeader("instantHeaderSet", model.instantHeaderSet);
        response.setHeader("enumHeaderSet", model.enumHeaderSet);
        for (final Status item : model.repeatingEnumHeaderList) {
            response.addHeader("repeatingEnumHeaderList", item);
        }
        for (final Status item : model.repeatingEnumHeaderSet) {
            response.addHeader("repeatingEnumHeaderSet", item);
        }
    }
}
