package io.rxmicro.examples.rest.controller.extendable.model.request.all_body.all_models_contain_nested_fields.child;

import io.rxmicro.examples.rest.controller.extendable.model.request.all_body.all_models_contain_nested_fields.parent.$$ParentServerModelReader;
import io.rxmicro.exchange.json.detail.JsonExchangeDataFormatConverter;
import io.rxmicro.http.HttpHeaders;
import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.detail.ExchangeDataFormatConverter;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ServerModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ChildServerModelReader extends ServerModelReader<Child> {

    private final $$ParentServerModelReader parentReader =
            new $$ParentServerModelReader();

    private final ExchangeDataFormatConverter<Object> exchangeDataFormatConverter =
            new JsonExchangeDataFormatConverter(false);

    private final $$ChildModelFromJsonConverter childModelFromJsonConverter =
            new $$ChildModelFromJsonConverter();

    @Override
    public Child read(final PathVariableMapping pathVariableMapping,
                      final HttpRequest request,
                      final boolean readParametersFromBody) {
        final Object body = exchangeDataFormatConverter.fromBytes(request.getContent());
        final Child model = childModelFromJsonConverter.fromJsonObject(body);
        readPrimitivesToModel(pathVariableMapping, request, QueryParams.of(), model, readParametersFromBody);
        return model;
    }

    public void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                      final HttpRequest request,
                                      final QueryParams params,
                                      final Child model,
                                      final boolean readParametersFromBody) {
        parentReader.readPrimitivesToModel(pathVariableMapping, request, params, model, readParametersFromBody);
        model.method = request.getMethod();
        model.childVar = toString(pathVariableMapping.getValue("childVar"), HttpModelType.PATH, "childVar");
        final HttpHeaders httpHeaders = request.getHeaders();
        model.childHeader = toString(httpHeaders.getValue("childHeader"), HttpModelType.HEADER, "childHeader");
    }
}