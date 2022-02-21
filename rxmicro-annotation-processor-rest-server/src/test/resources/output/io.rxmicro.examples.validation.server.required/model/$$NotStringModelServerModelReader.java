package io.rxmicro.examples.validation.server.required.model;

import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ServerModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$NotStringModelServerModelReader extends ServerModelReader<NotStringModel> {

    @Override
    public NotStringModel read(final PathVariableMapping pathVariableMapping,
                               final HttpRequest request,
                               final boolean readParametersFromBody) {
        final NotStringModel model = new NotStringModel();
        final QueryParams params = extractParams(request.getQueryString());
        readPrimitivesToModel(pathVariableMapping, request, params, model, readParametersFromBody);
        return model;
    }

    public void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                      final HttpRequest request,
                                      final QueryParams params,
                                      final NotStringModel model,
                                      final boolean readParametersFromBody) {
        model.requiredPrimitive = toInteger(params.getValue("requiredPrimitive"), HttpModelType.PARAMETER, "requiredPrimitive");
        model.nullablePrimitive = toInteger(params.getValue("nullablePrimitive"), HttpModelType.PARAMETER, "nullablePrimitive");
        model.requiredListWithRequiredItems = toIntegerList(params.getValues("requiredListWithRequiredItems"), HttpModelType.PARAMETER, "requiredListWithRequiredItems");
        model.requiredListWithNullableItems = toIntegerList(params.getValues("requiredListWithNullableItems"), HttpModelType.PARAMETER, "requiredListWithNullableItems");
        model.nullableListWithRequiredItems = toIntegerList(params.getValues("nullableListWithRequiredItems"), HttpModelType.PARAMETER, "nullableListWithRequiredItems");
        model.nullableListWithNullableItems = toIntegerList(params.getValues("nullableListWithNullableItems"), HttpModelType.PARAMETER, "nullableListWithNullableItems");
    }
}