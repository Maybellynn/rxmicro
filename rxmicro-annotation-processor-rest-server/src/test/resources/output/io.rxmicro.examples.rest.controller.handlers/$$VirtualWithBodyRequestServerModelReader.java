package io.rxmicro.examples.rest.controller.handlers;

import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ServerModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualWithBodyRequestServerModelReader extends ServerModelReader<$$VirtualWithBodyRequest> {

    @Override
    public $$VirtualWithBodyRequest read(final PathVariableMapping pathVariableMapping,
                                         final HttpRequest request,
                                         final boolean readParametersFromBody) {
        final $$VirtualWithBodyRequest model = new $$VirtualWithBodyRequest();
        final QueryParams params = extractParams(request.getQueryString());
        readPrimitivesToModel(pathVariableMapping, request, params, model, readParametersFromBody);
        return model;
    }

    public void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                      final HttpRequest request,
                                      final QueryParams params,
                                      final $$VirtualWithBodyRequest model,
                                      final boolean readParametersFromBody) {
        model.requestParameter = toString(params.getValue("requestParameter"), HttpModelType.PARAMETER, "requestParameter");
    }
}