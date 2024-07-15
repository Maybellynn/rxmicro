package io.rxmicro.examples.validation.server.nested.model.model;

import io.rxmicro.examples.validation.server.nested.model.model.nested.$$NestedConstraintValidator;
import io.rxmicro.model.ModelType;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.validation.ConstraintValidator;
import io.rxmicro.validation.validator.RequiredConstraintValidator;

import static io.rxmicro.validation.detail.StatelessValidators.getStatelessValidator;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ObjectRequestConstraintValidator implements ConstraintValidator<ObjectRequest> {

    private final $$NestedConstraintValidator nestedConstraintValidator =
            new $$NestedConstraintValidator();

    private final RequiredConstraintValidator requiredConstraintValidator =
            getStatelessValidator(RequiredConstraintValidator.class);

    @Override
    public void validateNonNull(final ObjectRequest model,
                                final ModelType httpModelType,
                                final String name) {
        requiredConstraintValidator.validate(model.nested, HttpModelType.PARAMETER, "nested");
        nestedConstraintValidator.validate(model.nested, HttpModelType.PARAMETER, "nested");
    }
}