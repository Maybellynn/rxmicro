package io.rxmicro.examples.rest.controller.map.model.type.model;

import io.rxmicro.examples.rest.controller.map.model.type.model.nested.$$NestedConstraintValidator;
import io.rxmicro.model.ModelType;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.validation.ConstraintValidator;
import io.rxmicro.validation.validator.RequiredConstraintValidator;
import io.rxmicro.validation.validator.RequiredMapConstraintValidator;

import static io.rxmicro.validation.detail.StatelessValidators.getStatelessValidator;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ModelConstraintValidator implements ConstraintValidator<Model> {

    private final $$NestedConstraintValidator nestedConstraintValidator =
            new $$NestedConstraintValidator();

    private final RequiredMapConstraintValidator requiredMapConstraintValidator =
            getStatelessValidator(RequiredMapConstraintValidator.class);

    private final RequiredConstraintValidator requiredConstraintValidator =
            getStatelessValidator(RequiredConstraintValidator.class);

    @Override
    public void validateNonNull(final Model model,
                                final ModelType httpModelType,
                                final String name) {
        requiredMapConstraintValidator.validate(model.nested, HttpModelType.PARAMETER, "nested");
        requiredConstraintValidator.validateMapValues(model.nested, HttpModelType.PARAMETER, "nested");
        nestedConstraintValidator.validateMapValues(model.nested, HttpModelType.PARAMETER, "nested");
    }
}