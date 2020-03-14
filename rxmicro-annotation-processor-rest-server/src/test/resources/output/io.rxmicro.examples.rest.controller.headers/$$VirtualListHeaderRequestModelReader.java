package io.rxmicro.examples.rest.controller.headers;

import io.rxmicro.examples.rest.controller.headers.model.Status;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$VirtualListHeaderRequestModelReader extends ModelReader<$$VirtualListHeaderRequest> {

    @Override
    public $$VirtualListHeaderRequest read(final PathVariableMapping pathVariableMapping,
                                           final HttpRequest request,
                                           final boolean readParametersFromBody) {
        final $$VirtualListHeaderRequest model = new $$VirtualListHeaderRequest();
        final HttpHeaders httpHeaders = request.getHeaders();
        model.supportedStatuses = toEnumArray(Status.class, httpHeaders.getValues("Supported-Statuses"), HttpModelType.header, "Supported-Statuses");
        return model;
    }
}
