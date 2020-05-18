package io.rxmicro.examples.rest.client.model.fields;

import io.rxmicro.rest.client.detail.HeaderBuilder;
import io.rxmicro.rest.client.detail.QueryBuilder;
import io.rxmicro.rest.client.detail.RequestModelExtractor;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualMappingStrategyRequestRequestModelExtractor extends RequestModelExtractor<$$VirtualMappingStrategyRequest> {

    @Override
    public void extract(final $$VirtualMappingStrategyRequest model,
                        final HeaderBuilder headerBuilder,
                        final QueryBuilder queryBuilder) {
        headerBuilder.add("Supported-Api-Version-Code", model.supportedApiVersionCode);
        queryBuilder.add("max_supported_date_time", model.maxSupportedDateTime);
    }
}
