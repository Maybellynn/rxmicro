package io.rxmicro.examples.rest.controller.notfound;

import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$VirtualNotFoundRequestModelReader extends ModelReader<$$VirtualNotFoundRequest> {

    @Override
    public $$VirtualNotFoundRequest read(final PathVariableMapping pathVariableMapping,
                                         final HttpRequest request,
                                         final boolean readParametersFromBody) {
        final $$VirtualNotFoundRequest model = new $$VirtualNotFoundRequest();
        final QueryParams params = extractParams(request.getQueryString());
        model.found = toBoolean(params.getValue("found"), HttpModelType.PARAMETER, "found");
        return model;
    }
}
