package io.rxmicro.examples.rest.controller.internals.model;

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
        readPrimitivesToModel(pathVariableMapping, request, model);
        return model;
    }

    protected void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                         final HttpRequest request,
                                         final Request model) {
        model.remoteAddress1 = String.valueOf(request.getRemoteAddress());
        model.urlPath = request.getUri();
        model.method = request.getMethod();
        model.httpVersion = request.getVersion();
        model.headers = request.getHeaders();
        model.bodyBytes = request.getContent();
    }
}
