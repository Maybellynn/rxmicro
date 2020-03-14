package io.rxmicro.examples.rest.controller.routing;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.rest.component.ExchangeDataFormatConverter;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$VirtualRoutingUsingHttpBodyRequest2ModelReader extends ModelReader<$$VirtualRoutingUsingHttpBodyRequest2> {

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter =
            new JsonExchangeDataFormatConverter(false);

    private final $$VirtualRoutingUsingHttpBodyRequest2ModelFromJsonConverter virtualRoutingUsingHttpBodyRequest2ModelFromJsonConverter =
            new $$VirtualRoutingUsingHttpBodyRequest2ModelFromJsonConverter();

    @Override
    public $$VirtualRoutingUsingHttpBodyRequest2 read(final PathVariableMapping pathVariableMapping,
                                                      final HttpRequest request,
                                                      final boolean readParametersFromBody) {
        final Object body = exchangeDataFormatConverter.fromBytes(request.getContent());
        final $$VirtualRoutingUsingHttpBodyRequest2 model = virtualRoutingUsingHttpBodyRequest2ModelFromJsonConverter.fromJsonObject(body);
        return model;
    }
}
