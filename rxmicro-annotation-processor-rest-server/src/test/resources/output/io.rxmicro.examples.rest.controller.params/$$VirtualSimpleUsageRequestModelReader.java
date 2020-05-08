package io.rxmicro.examples.rest.controller.params;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$VirtualSimpleUsageRequestModelReader extends ModelReader<$$VirtualSimpleUsageRequest> {

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter =
            new JsonExchangeDataFormatConverter(false);

    private final $$VirtualSimpleUsageRequestModelFromJsonConverter virtualSimpleUsageRequestModelFromJsonConverter =
            new $$VirtualSimpleUsageRequestModelFromJsonConverter();

    @Override
    public $$VirtualSimpleUsageRequest read(final PathVariableMapping pathVariableMapping,
                                            final HttpRequest request,
                                            final boolean readParametersFromBody) {
        if (readParametersFromBody) {
            final Object body = exchangeDataFormatConverter.fromBytes(request.getContent());
            final $$VirtualSimpleUsageRequest model = virtualSimpleUsageRequestModelFromJsonConverter.fromJsonObject(body);
            return model;
        } else {
            final $$VirtualSimpleUsageRequest model = new $$VirtualSimpleUsageRequest();
            final QueryParams params = extractParams(request.getQueryString());
            model.endpointVersion = toString(params.getValue("endpoint_version"), HttpModelType.PARAMETER, "endpoint_version");
            model.useProxy = toBoolean(params.getValue("use-Proxy"), HttpModelType.PARAMETER, "use-Proxy");
            return model;
        }
    }
}
