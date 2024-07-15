package io.rxmicro.examples.rest.controller.map.model.type.model;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ServerModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ModelServerModelReader extends ServerModelReader<Model> {

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter =
            new JsonExchangeDataFormatConverter(false);

    private final $$ModelModelFromJsonConverter modelModelFromJsonConverter =
            new $$ModelModelFromJsonConverter();

    @Override
    public Model read(final PathVariableMapping pathVariableMapping,
                      final HttpRequest request,
                      final boolean readParametersFromBody) {
        final Object body = exchangeDataFormatConverter.fromBytes(request.getContent());
        final Model model = modelModelFromJsonConverter.fromJsonObject(body);
        return model;
    }
}