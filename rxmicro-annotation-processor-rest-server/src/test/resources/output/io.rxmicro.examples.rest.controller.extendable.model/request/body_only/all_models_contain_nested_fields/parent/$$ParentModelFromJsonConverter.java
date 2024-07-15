package io.rxmicro.examples.rest.controller.extendable.model.request.body_only.all_models_contain_nested_fields.parent;

import io.rxmicro.examples.rest.controller.extendable.model.request.body_only.all_models_contain_nested_fields.grand.$$GrandParentModelFromJsonConverter;
import io.rxmicro.examples.rest.controller.extendable.model.request.body_only.all_models_contain_nested_fields.parent.nested.$$NestedModelFromJsonConverter;
import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ParentModelFromJsonConverter extends ModelFromJsonConverter<Parent> {

    private final $$GrandParentModelFromJsonConverter parentConverter =
            new $$GrandParentModelFromJsonConverter();

    private final $$NestedModelFromJsonConverter nestedModelFromJsonConverter =
            new $$NestedModelFromJsonConverter();

    @Override
    public Parent fromJsonObject(final Map<String, Object> params) {
        final Parent model = new Parent();
        readParamsToModel(params, model);
        return model;
    }

    public void readParamsToModel(final Map<String, Object> params,
                                  final Parent model) {
        parentConverter.readParamsToModel(params, model);
        model.parentParameter = toString(params.get("parentParameter"), "parentParameter");
        model.parentNestedParameter = convertToObjectIfNotNull(nestedModelFromJsonConverter, params.get("parentNestedParameter"), "parentNestedParameter");
    }
}