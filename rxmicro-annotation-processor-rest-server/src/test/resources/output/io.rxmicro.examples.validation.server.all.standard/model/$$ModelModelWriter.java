package io.rxmicro.examples.validation.server.all.standard.model;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.http.HttpStandardHeaderNames;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.server.detail.component.ModelWriter;
import io.rxmicro.rest.server.detail.model.HttpResponse;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$ModelModelWriter extends ModelWriter<Model> {

    private final $$ModelModelToJsonConverter modelModelToJsonConverter;

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter;

    private final String outputMimeType;

    public $$ModelModelWriter(final boolean humanReadableOutput) {
        exchangeDataFormatConverter = new JsonExchangeDataFormatConverter(humanReadableOutput);
        modelModelToJsonConverter = new $$ModelModelToJsonConverter();
        outputMimeType = exchangeDataFormatConverter.getMimeType();
    }

    @Override
    public void write(final Model model,
                      final HttpResponse response) {
        final Map<String, Object> json = modelModelToJsonConverter.toJsonObject(model);
        response.setHeader(HttpStandardHeaderNames.CONTENT_TYPE, outputMimeType);
        response.setContent(exchangeDataFormatConverter.toBytes(json));
    }
}
