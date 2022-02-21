package io.rxmicro.examples.rest.controller.extendable.model.response.headers_only.child_model_without_fields.parent;

import io.rxmicro.examples.rest.controller.extendable.model.response.headers_only.child_model_without_fields.grand.$$GrandParentServerModelWriter;
import io.rxmicro.rest.server.detail.component.ServerModelWriter;
import io.rxmicro.rest.server.detail.model.HttpResponse;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ParentServerModelWriter extends ServerModelWriter<Parent> {

    private final $$GrandParentServerModelWriter parentWriter;

    public $$ParentServerModelWriter(final boolean humanReadableOutput) {
        parentWriter = new $$GrandParentServerModelWriter(humanReadableOutput);
    }

    public void writePrimitivesToResponse(final Parent model,
                                          final HttpResponse response) {
        parentWriter.writePrimitivesToResponse(model, response);
        response.setHeader("parentHeader", model.parentHeader);
    }
}