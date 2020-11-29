package io.rxmicro.examples.rest.client.model.field.access.pathvariables.gettersetter;

import io.rxmicro.rest.client.detail.PathBuilder;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RequestPathBuilder extends PathBuilder<Request> {

    @Override
    public String build(final String urlTemplate,
                        final Request model) {
        // /path-variables/gettersetter/${a}/${b}/${c}/${d}/${e}/${f}/${g}/${j}/${h}/${i}/${j}/${k}/${l}/${m}
        return format(urlTemplate, model.getBooleanPathVariable(), model.getBytePathVariable(), model.getShortPathVariable(), model.getIntPathVariable(), model.getLongPathVariable(), model.getBigIntegerPathVariable(), model.getFloatPathVariable(), model.getCharPathVariable(), model.getDoublePathVariable(), model.getDecimalPathVariable(), model.getCharPathVariable(), model.getStringPathVariable(), model.getInstantPathVariable(), model.getEnumPathVariable());
    }
}
