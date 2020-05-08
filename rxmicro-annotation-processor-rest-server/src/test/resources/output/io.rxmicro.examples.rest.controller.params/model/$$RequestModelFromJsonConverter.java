package io.rxmicro.examples.rest.controller.params.model;

import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$RequestModelFromJsonConverter extends ModelFromJsonConverter<Request> {

    @Override
    public Request fromJsonObject(final Map<String, Object> params) {
        final Request model = new Request();
        model.endpointVersion = toString(params.get("endpoint_version"), "endpoint_version");
        model.useProxy = toBoolean(params.get("use-Proxy"), "use-Proxy");
        return model;
    }
}
