package io.rxmicro.examples.rest.client.handlers;

import io.rxmicro.rest.client.detail.QueryBuilder;
import io.rxmicro.rest.client.detail.RequestModelExtractor;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualWithBodyRequest4RequestModelExtractor extends RequestModelExtractor<$$VirtualWithBodyRequest4> {

    @Override
    public void extract(final $$VirtualWithBodyRequest4 model,
                        final QueryBuilder queryBuilder) {
        queryBuilder.add("requestParameter", model.requestParameter);
    }
}
