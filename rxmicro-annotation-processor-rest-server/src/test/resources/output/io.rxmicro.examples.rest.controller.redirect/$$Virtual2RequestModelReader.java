package io.rxmicro.examples.rest.controller.redirect;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$Virtual2RequestModelReader extends ModelReader<$$Virtual2Request> {

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter =
            new JsonExchangeDataFormatConverter(false);

    private final $$Virtual2RequestModelFromJsonConverter virtual2RequestModelFromJsonConverter =
            new $$Virtual2RequestModelFromJsonConverter();

    @Override
    public $$Virtual2Request read(final PathVariableMapping pathVariableMapping,
                                  final HttpRequest request,
                                  final boolean readParametersFromBody) {
        final Object body = exchangeDataFormatConverter.fromBytes(request.getContent());
        final $$Virtual2Request model = virtual2RequestModelFromJsonConverter.fromJsonObject(body);
        return model;
    }
}
