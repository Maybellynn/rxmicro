package io.rxmicro.examples.rest.controller.handlers;

import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$VirtualWithBodyRequest2ModelReader extends ModelReader<$$VirtualWithBodyRequest2> {

    @Override
    public $$VirtualWithBodyRequest2 read(final PathVariableMapping pathVariableMapping,
                                          final HttpRequest request,
                                          final boolean readParametersFromBody) {
        final $$VirtualWithBodyRequest2 model = new $$VirtualWithBodyRequest2();
        final QueryParams params = extractParams(request.getQueryString());
        model.requestParameter = toString(params.getValue("requestParameter"), HttpModelType.PARAMETER, "requestParameter");
        return model;
    }
}
