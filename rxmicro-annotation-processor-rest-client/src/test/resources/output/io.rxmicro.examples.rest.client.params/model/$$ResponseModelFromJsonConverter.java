package io.rxmicro.examples.rest.client.params.model;

import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$ResponseModelFromJsonConverter extends ModelFromJsonConverter<Response> {

    @Override
    public Response fromJsonObject(final Map<String, Object> params) {
        final Response model = new Response();
        model.endpointVersion = toString(params.get("endpoint_version"), "endpoint_version");
        model.useProxy = toBoolean(params.get("use-Proxy"), "use-Proxy");
        return model;
    }
}
