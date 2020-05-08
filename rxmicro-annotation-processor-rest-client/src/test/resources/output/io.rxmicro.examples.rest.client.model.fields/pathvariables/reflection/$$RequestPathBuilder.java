package io.rxmicro.examples.rest.client.model.fields.pathvariables.reflection;

import io.rxmicro.rest.client.detail.PathBuilder;

import static rxmicro.$$Reflections.getFieldValue;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$RequestPathBuilder extends PathBuilder<Request> {

    @Override
    public String build(final String urlTemplate,
                        final Request model) {
        // /path-variables/reflection/${a}/${b}/${c}/${d}/${e}/${f}/${g}/${j}/${h}/${i}/${j}/${k}/${l}/${m}
        return format(urlTemplate, getFieldValue(model, "booleanParameter"), getFieldValue(model, "byteParameter"), getFieldValue(model, "shortParameter"), getFieldValue(model, "intParameter"), getFieldValue(model, "longParameter"), getFieldValue(model, "bigIntParameter"), getFieldValue(model, "floatParameter"), getFieldValue(model, "charParameter"), getFieldValue(model, "doubleParameter"), getFieldValue(model, "decimalParameter"), getFieldValue(model, "charParameter"), getFieldValue(model, "stringParameter"), getFieldValue(model, "instantParameter"), getFieldValue(model, "status"));
    }
}
