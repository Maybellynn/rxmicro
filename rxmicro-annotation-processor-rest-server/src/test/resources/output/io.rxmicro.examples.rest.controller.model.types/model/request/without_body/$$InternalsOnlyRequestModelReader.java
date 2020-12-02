package io.rxmicro.examples.rest.controller.model.types.model.request.without_body;

import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$InternalsOnlyRequestModelReader extends ModelReader<InternalsOnlyRequest> {

    @Override
    public InternalsOnlyRequest read(final PathVariableMapping pathVariableMapping,
                                     final HttpRequest request,
                                     final boolean readParametersFromBody) {
        final InternalsOnlyRequest model = new InternalsOnlyRequest();
        readPrimitivesToModel(pathVariableMapping, request, model);
        return model;
    }

    public void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                      final HttpRequest request,
                                      final InternalsOnlyRequest model) {
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