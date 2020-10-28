package io.rxmicro.examples.validation.server.required.model;

import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$StringModelWithRequiredAndNotEmptyValidatorsOnlyModelReader extends ModelReader<StringModelWithRequiredAndNotEmptyValidatorsOnly> {

    @Override
    public StringModelWithRequiredAndNotEmptyValidatorsOnly read(final PathVariableMapping pathVariableMapping,
                                                                 final HttpRequest request,
                                                                 final boolean readParametersFromBody) {
        final StringModelWithRequiredAndNotEmptyValidatorsOnly model = new StringModelWithRequiredAndNotEmptyValidatorsOnly();
        final QueryParams params = extractParams(request.getQueryString());
        model.string = toString(params.getValue("string"), HttpModelType.PARAMETER, "string");
        model.minLength = toString(params.getValue("minLength"), HttpModelType.PARAMETER, "minLength");
        model.length = toString(params.getValue("length"), HttpModelType.PARAMETER, "length");
        model.enumeration = toString(params.getValue("enumeration"), HttpModelType.PARAMETER, "enumeration");
        return model;
    }
}