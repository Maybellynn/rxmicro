package io.rxmicro.examples.rest.controller.extendable.model.request.body_only.child_model_without_fields.child;

import io.rxmicro.examples.rest.controller.extendable.model.request.body_only.child_model_without_fields.parent.$$ParentModelFromJsonConverter;
import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ChildModelFromJsonConverter extends ModelFromJsonConverter<Child> {

    private final $$ParentModelFromJsonConverter parentConverter =
            new $$ParentModelFromJsonConverter();

    @Override
    public Child fromJsonObject(final Map<String, Object> params) {
        final Child model = new Child();
        parentConverter.readParamsToModel(params, model);
        return model;
    }
}