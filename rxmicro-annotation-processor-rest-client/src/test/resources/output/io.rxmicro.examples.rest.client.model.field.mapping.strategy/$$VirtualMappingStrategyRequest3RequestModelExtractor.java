package io.rxmicro.examples.rest.client.model.field.mapping.strategy;

import io.rxmicro.rest.client.detail.HeaderBuilder;
import io.rxmicro.rest.client.detail.QueryBuilder;
import io.rxmicro.rest.client.detail.RequestModelExtractor;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualMappingStrategyRequest3RequestModelExtractor extends RequestModelExtractor<$$VirtualMappingStrategyRequest3> {

    @Override
    public void extract(final $$VirtualMappingStrategyRequest3 model,
                        final HeaderBuilder headerBuilder,
                        final QueryBuilder queryBuilder) {
        headerBuilder.add("Supported-Api-Version-Code", model.supportedApiVersionCode);
        queryBuilder.add("max-supported-date-time", model.maxSupportedDateTime);
    }
}