package io.rxmicro.examples.rest.client.model.fields.pathvariables.direct;

import io.rxmicro.rest.client.detail.PathBuilder;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$RequestPathBuilder extends PathBuilder<Request> {

    @Override
    public String build(final String urlTemplate,
                        final Request model) {
        // /path-variables/direct/${a}/${b}/${c}/${d}/${e}/${f}/${g}/${j}/${h}/${i}/${j}/${k}/${l}/${m}
        return format(urlTemplate, model.booleanParameter, model.byteParameter, model.shortParameter, model.intParameter, model.longParameter, model.bigIntParameter, model.floatParameter, model.charParameter, model.doubleParameter, model.decimalParameter, model.charParameter, model.stringParameter, model.instantParameter, model.status);
    }
}
