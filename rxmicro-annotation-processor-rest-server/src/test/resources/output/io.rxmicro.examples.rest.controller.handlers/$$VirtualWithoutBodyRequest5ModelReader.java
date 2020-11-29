package io.rxmicro.examples.rest.controller.handlers;

import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualWithoutBodyRequest5ModelReader extends ModelReader<$$VirtualWithoutBodyRequest5> {

    @Override
    public $$VirtualWithoutBodyRequest5 read(final PathVariableMapping pathVariableMapping,
                                             final HttpRequest request,
                                             final boolean readParametersFromBody) {
        final $$VirtualWithoutBodyRequest5 model = new $$VirtualWithoutBodyRequest5();
        final QueryParams params = extractParams(request.getQueryString());
        readPrimitivesToModel(pathVariableMapping, request, params, model);
        return model;
    }

    protected void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                         final HttpRequest request,
                                         final QueryParams params,
                                         final $$VirtualWithoutBodyRequest5 model) {
        model.requestParameter = toString(params.getValue("requestParameter"), HttpModelType.PARAMETER, "requestParameter");
    }
}
