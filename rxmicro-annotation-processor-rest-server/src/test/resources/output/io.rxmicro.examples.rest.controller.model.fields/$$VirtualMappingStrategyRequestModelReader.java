package io.rxmicro.examples.rest.controller.model.fields;

import io.rxmicro.http.HttpHeaders;
import io.rxmicro.http.QueryParams;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualMappingStrategyRequestModelReader extends ModelReader<$$VirtualMappingStrategyRequest> {

    @Override
    public $$VirtualMappingStrategyRequest read(final PathVariableMapping pathVariableMapping,
                                                final HttpRequest request,
                                                final boolean readParametersFromBody) {
        final $$VirtualMappingStrategyRequest model = new $$VirtualMappingStrategyRequest();
        final HttpHeaders httpHeaders = request.getHeaders();
        model.supportedApiVersionCode = toBigDecimal(httpHeaders.getValue("Supported-Api-Version-Code"), HttpModelType.HEADER, "Supported-Api-Version-Code");
        final QueryParams params = extractParams(request.getQueryString());
        model.maxSupportedDateTime = toInstant(params.getValue("max_supported_date_time"), HttpModelType.PARAMETER, "max_supported_date_time");
        return model;
    }
}
