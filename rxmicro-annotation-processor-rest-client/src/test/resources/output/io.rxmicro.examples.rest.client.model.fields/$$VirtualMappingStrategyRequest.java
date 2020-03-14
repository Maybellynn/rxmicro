package io.rxmicro.examples.rest.client.model.fields;

import java.math.BigDecimal;
import java.time.Instant;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$VirtualMappingStrategyRequest {

    // Headers
    final BigDecimal supportedApiVersionCode;

    // Parameters
    final Instant maxSupportedDateTime;

    $$VirtualMappingStrategyRequest(final BigDecimal supportedApiVersionCode, final Instant maxSupportedDateTime) {
        this.supportedApiVersionCode = supportedApiVersionCode;
        this.maxSupportedDateTime = maxSupportedDateTime;
    }
}
