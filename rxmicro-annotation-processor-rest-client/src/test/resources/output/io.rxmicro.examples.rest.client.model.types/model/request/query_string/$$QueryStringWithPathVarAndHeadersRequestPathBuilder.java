package io.rxmicro.examples.rest.client.model.types.model.request.query_string;

import io.rxmicro.rest.client.detail.PathBuilder;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$QueryStringWithPathVarAndHeadersRequestPathBuilder extends PathBuilder<QueryStringWithPathVarAndHeadersRequest> {

    @Override
    public String build(final String urlTemplate,
                        final QueryStringWithPathVarAndHeadersRequest model) {
        // /consume46/${a}/${b}/${c}/${d}/${e}/${f}/${g}/${j}/${h}/${i}/${j}/${k}/${l}/${m}
        return format(urlTemplate, model.booleanPathVariable, model.bytePathVariable, model.shortPathVariable, model.intPathVariable, model.longPathVariable, model.bigIntegerPathVariable, model.floatPathVariable, model.charPathVariable, model.doublePathVariable, model.decimalPathVariable, model.charPathVariable, model.stringPathVariable, model.instantPathVariable, model.enumPathVariable);
    }
}
