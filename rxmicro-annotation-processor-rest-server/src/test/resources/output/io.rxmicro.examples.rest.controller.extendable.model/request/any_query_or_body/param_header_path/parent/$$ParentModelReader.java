package io.rxmicro.examples.rest.controller.extendable.model.request.any_query_or_body.param_header_path.parent;

import io.rxmicro.examples.rest.controller.extendable.model.request.any_query_or_body.param_header_path.grand.$$GrandParentModelReader;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ParentModelReader extends ModelReader<Parent> {

    private final $$GrandParentModelReader parentReader =
            new $$GrandParentModelReader();

    @Override
    public Parent read(final PathVariableMapping pathVariableMapping,
                       final HttpRequest request,
                       final boolean readParametersFromBody) {
        final Parent model = new Parent();
        readPrimitivesToModel(pathVariableMapping, request, QueryParams.of(), model, readParametersFromBody);
        return model;
    }

    public void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                      final HttpRequest request,
                                      final QueryParams params,
                                      final Parent model,
                                      final boolean readParametersFromBody) {
        parentReader.readPrimitivesToModel(pathVariableMapping, request, params, model, readParametersFromBody);
        final HttpHeaders httpHeaders = request.getHeaders();
        model.parentHeader = toString(httpHeaders.getValue("parentHeader"), HttpModelType.HEADER, "parentHeader");
    }
}