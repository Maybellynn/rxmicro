package io.rxmicro.examples.processor.all.components.model;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.component.ExchangeDataFormatConverter;
import io.rxmicro.rest.server.detail.component.ModelWriter;
import io.rxmicro.rest.server.detail.model.HttpResponse;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$AccountModelWriter extends ModelWriter<Account> {

    private final $$AccountModelToJsonConverter accountModelToJsonConverter;

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter;

    private final String outputMimeType;

    public $$AccountModelWriter(final boolean humanReadableOutput) {
        exchangeDataFormatConverter = new JsonExchangeDataFormatConverter(humanReadableOutput);
        accountModelToJsonConverter = new $$AccountModelToJsonConverter();
        outputMimeType = exchangeDataFormatConverter.getMimeType();
    }

    @Override
    public void write(final Account model,
                      final HttpResponse response) {
        final Map<String, Object> json = accountModelToJsonConverter.toJsonObject(model);
        response.setHeader(HttpHeaders.CONTENT_TYPE, outputMimeType);
        response.setContent(exchangeDataFormatConverter.toBytes(json));
    }
}
