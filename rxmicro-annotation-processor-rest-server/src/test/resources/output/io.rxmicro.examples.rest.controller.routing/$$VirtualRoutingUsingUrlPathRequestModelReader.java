package io.rxmicro.examples.rest.controller.routing;

import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$VirtualRoutingUsingUrlPathRequestModelReader extends ModelReader<$$VirtualRoutingUsingUrlPathRequest> {

    @Override
    public $$VirtualRoutingUsingUrlPathRequest read(final PathVariableMapping pathVariableMapping,
                                                    final HttpRequest request,
                                                    final boolean readParametersFromBody) {
        final $$VirtualRoutingUsingUrlPathRequest model = new $$VirtualRoutingUsingUrlPathRequest();
        model.type = toString(pathVariableMapping.getValue("type"), HttpModelType.path, "type");
        return model;
    }
}
