package io.rxmicro.examples.processor.all.components.model;

import io.rxmicro.http.client.ClientHttpResponse;
import io.rxmicro.rest.client.detail.ModelReader;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$AccountModelReader extends ModelReader<Account> {

    private final $$AccountModelFromJsonConverter accountModelFromJsonConverter =
            new $$AccountModelFromJsonConverter();

    @Override
    public Account readSingle(final ClientHttpResponse response) {
        return accountModelFromJsonConverter.fromJsonObject(response.body());
    }
}
