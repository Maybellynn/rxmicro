package io.rxmicro.examples.rest.controller.complex.model.model;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$ComplexModelModelReader extends ModelReader<ComplexModel> {

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter =
            new JsonExchangeDataFormatConverter(false);

    private final $$ComplexModelModelFromJsonConverter complexModelModelFromJsonConverter =
            new $$ComplexModelModelFromJsonConverter();

    @Override
    public ComplexModel read(final PathVariableMapping pathVariableMapping,
                             final HttpRequest request,
                             final boolean readParametersFromBody) {
        final Object body = exchangeDataFormatConverter.fromBytes(request.getContent());
        final ComplexModel model = complexModelModelFromJsonConverter.fromJsonObject(body);
        return model;
    }
}
