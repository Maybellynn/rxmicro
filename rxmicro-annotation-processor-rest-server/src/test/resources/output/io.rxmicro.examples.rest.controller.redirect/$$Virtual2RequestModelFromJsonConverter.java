package io.rxmicro.examples.rest.controller.redirect;

import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$Virtual2RequestModelFromJsonConverter extends ModelFromJsonConverter<$$Virtual2Request> {

    @Override
    public $$Virtual2Request fromJsonObject(final Map<String, Object> params) {
        final $$Virtual2Request model = new $$Virtual2Request();
        model.parameter = toString(params.get("parameter"), "parameter");
        return model;
    }
}
