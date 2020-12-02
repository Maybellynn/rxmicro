package io.rxmicro.examples.rest.controller.extendable.model.request.path_vars_only.child_model_without_fields.grand;

import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$GrandParentModelReader extends ModelReader<GrandParent> {

    public void readPrimitivesToModel(final PathVariableMapping pathVariableMapping,
                                      final HttpRequest request,
                                      final GrandParent model) {
        model.grandVar = toString(pathVariableMapping.getValue("grandVar"), HttpModelType.PATH, "grandVar");
    }
}