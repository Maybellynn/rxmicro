package io.rxmicro.examples.rest.controller.model.fields.internals.gettersetter;

import io.rxmicro.http.HttpHeaders;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RequestModelReader extends ModelReader<Request> {

    @Override
    public Request read(final PathVariableMapping pathVariableMapping,
                        final HttpRequest request,
                        final boolean readParametersFromBody) {
        final Request model = new Request();
        model.setVersion(request.getVersion());
        model.setHeaders(request.getHeaders());
        model.setRequest(request);
        model.setRemoteAddress1(request.getRemoteAddress());
        model.setRemoteAddress2(String.valueOf(request.getRemoteAddress()));
        model.setUrlPath(request.getUri());
        model.setMethod(request.getMethod());
        model.setBody(request.getContent());
        final HttpHeaders httpHeaders = request.getHeaders();
        model.setId(toString(httpHeaders.getValue("Request-Id"), HttpModelType.HEADER, "Request-Id"));
        return model;
    }
}
