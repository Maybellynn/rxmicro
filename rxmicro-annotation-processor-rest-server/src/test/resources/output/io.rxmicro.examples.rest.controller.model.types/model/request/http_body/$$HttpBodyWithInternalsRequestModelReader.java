package io.rxmicro.examples.rest.controller.model.types.model.request.http_body;

import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$HttpBodyWithInternalsRequestModelReader extends ModelReader<HttpBodyWithInternalsRequest> {

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter =
            new JsonExchangeDataFormatConverter(false);

    private final $$HttpBodyWithInternalsRequestModelFromJsonConverter httpBodyWithInternalsRequestModelFromJsonConverter =
            new $$HttpBodyWithInternalsRequestModelFromJsonConverter();

    @Override
    public HttpBodyWithInternalsRequest read(final PathVariableMapping pathVariableMapping,
                                             final HttpRequest request,
                                             final boolean readParametersFromBody) {
        final Object body = exchangeDataFormatConverter.fromBytes(request.getContent());
        final HttpBodyWithInternalsRequest model = httpBodyWithInternalsRequestModelFromJsonConverter.fromJsonObject(body);
        readPrimitivesToModel(pathVariableMapping, request, model);
        return model;
    }

    protected void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                         final HttpRequest request,
                                         final HttpBodyWithInternalsRequest model) {
        model.internalRemoteAddress1 = String.valueOf(request.getRemoteAddress());
        model.internalRemoteAddress2 = request.getRemoteAddress();
        model.internalUrlPath = request.getUri();
        model.internalRequestMethod = request.getMethod();
        model.internalHttpVersion = request.getVersion();
        model.internalRequestHeaders = request.getHeaders();
        model.internalRequestBody = request.getContent();
        model.internalRequest = request;
    }
}
