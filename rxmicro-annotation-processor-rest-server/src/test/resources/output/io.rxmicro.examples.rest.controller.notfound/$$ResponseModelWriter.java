package io.rxmicro.examples.rest.controller.notfound;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.http.HttpStandardHeaderNames;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.server.detail.component.ModelWriter;
import io.rxmicro.rest.server.detail.model.HttpResponse;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ResponseModelWriter extends ModelWriter<Response> {

    private final $$ResponseModelToJsonConverter responseModelToJsonConverter;

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter;

    private final String outputMimeType;

    public $$ResponseModelWriter(final boolean humanReadableOutput) {
        exchangeDataFormatConverter = new JsonExchangeDataFormatConverter(humanReadableOutput);
        responseModelToJsonConverter = new $$ResponseModelToJsonConverter();
        outputMimeType = exchangeDataFormatConverter.getMimeType();
    }

    @Override
    public void write(final Response model,
                      final HttpResponse response) {
        final Map<String, Object> json = responseModelToJsonConverter.toJsonObject(model);
        response.setHeader(HttpStandardHeaderNames.CONTENT_TYPE, outputMimeType);
        response.setContent(exchangeDataFormatConverter.toBytes(json));
    }
}
