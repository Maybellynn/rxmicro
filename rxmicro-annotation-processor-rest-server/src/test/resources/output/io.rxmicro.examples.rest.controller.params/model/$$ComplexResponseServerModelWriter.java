package io.rxmicro.examples.rest.controller.params.model;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.http.HttpStandardHeaderNames;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.server.detail.component.ServerModelWriter;
import io.rxmicro.rest.server.detail.model.HttpResponse;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ComplexResponseServerModelWriter extends ServerModelWriter<ComplexResponse> {

    private final $$ComplexResponseModelToJsonConverter complexResponseModelToJsonConverter;

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter;

    private final String outputMimeType;

    public $$ComplexResponseServerModelWriter(final boolean humanReadableOutput) {
        exchangeDataFormatConverter = new JsonExchangeDataFormatConverter(humanReadableOutput);
        complexResponseModelToJsonConverter = new $$ComplexResponseModelToJsonConverter();
        outputMimeType = exchangeDataFormatConverter.getMimeType();
    }

    @Override
    public void write(final ComplexResponse model,
                      final HttpResponse response) {
        response.setHeader(HttpStandardHeaderNames.CONTENT_TYPE, outputMimeType);
        final Map<String, Object> json = complexResponseModelToJsonConverter.toJsonObject(model);
        response.setContent(exchangeDataFormatConverter.toBytes(json));
    }
}