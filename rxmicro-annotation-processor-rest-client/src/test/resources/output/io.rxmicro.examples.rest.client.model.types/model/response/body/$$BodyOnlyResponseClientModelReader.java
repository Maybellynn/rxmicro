package io.rxmicro.examples.rest.client.model.types.model.response.body;

import io.rxmicro.rest.client.detail.ClientModelReader;
import io.rxmicro.rest.client.detail.HttpResponse;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$BodyOnlyResponseClientModelReader extends ClientModelReader<BodyOnlyResponse> {

    private final $$BodyOnlyResponseModelFromJsonConverter bodyOnlyResponseModelFromJsonConverter =
            new $$BodyOnlyResponseModelFromJsonConverter();

    @Override
    public BodyOnlyResponse readSingle(final HttpResponse response) {
        return bodyOnlyResponseModelFromJsonConverter.fromJsonObject(response.getBody());
    }
}