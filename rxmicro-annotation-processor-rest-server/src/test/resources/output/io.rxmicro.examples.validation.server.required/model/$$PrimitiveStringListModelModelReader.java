package io.rxmicro.examples.validation.server.required.model;

import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$PrimitiveStringListModelModelReader extends ModelReader<PrimitiveStringListModel> {

    @Override
    public PrimitiveStringListModel read(final PathVariableMapping pathVariableMapping,
                                         final HttpRequest request,
                                         final boolean readParametersFromBody) {
        final PrimitiveStringListModel model = new PrimitiveStringListModel();
        final QueryParams params = extractParams(request.getQueryString());
        model.requiredListWithNotEmptyItems = toStringList(params.getValues("requiredListWithNotEmptyItems"), HttpModelType.PARAMETER, "requiredListWithNotEmptyItems");
        model.nullableListWithNotEmptyItems = toStringList(params.getValues("nullableListWithNotEmptyItems"), HttpModelType.PARAMETER, "nullableListWithNotEmptyItems");
        model.requiredListWithNullableItems = toStringList(params.getValues("requiredListWithNullableItems"), HttpModelType.PARAMETER, "requiredListWithNullableItems");
        model.requiredListWithEmptyItems = toStringList(params.getValues("requiredListWithEmptyItems"), HttpModelType.PARAMETER, "requiredListWithEmptyItems");
        model.requiredListWithNullableOrEmptyItems = toStringList(params.getValues("requiredListWithNullableOrEmptyItems"), HttpModelType.PARAMETER, "requiredListWithNullableOrEmptyItems");
        model.nullableListWithNullableItems = toStringList(params.getValues("nullableListWithNullableItems"), HttpModelType.PARAMETER, "nullableListWithNullableItems");
        model.nullableListWithEmptyItems = toStringList(params.getValues("nullableListWithEmptyItems"), HttpModelType.PARAMETER, "nullableListWithEmptyItems");
        model.nullableListWithNullableOrEmptyItems = toStringList(params.getValues("nullableListWithNullableOrEmptyItems"), HttpModelType.PARAMETER, "nullableListWithNullableOrEmptyItems");
        return model;
    }
}
