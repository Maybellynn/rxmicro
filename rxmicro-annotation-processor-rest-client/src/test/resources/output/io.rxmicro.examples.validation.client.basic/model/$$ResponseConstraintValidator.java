package io.rxmicro.examples.validation.client.basic.model;

import io.rxmicro.http.error.ValidationException;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.validation.ConstraintValidator;
import io.rxmicro.validation.validator.EmailConstraintValidator;
import io.rxmicro.validation.validator.RequiredConstraintValidator;

import static io.rxmicro.validation.detail.StatelessValidators.getStatelessValidator;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$ResponseConstraintValidator implements ConstraintValidator<Response> {

    private final RequiredConstraintValidator requiredConstraintValidator =
            getStatelessValidator(RequiredConstraintValidator.class);

    private final EmailConstraintValidator emailEmailEmailConstraintValidator =
            new EmailConstraintValidator(false);

    @Override
    public void validate(final Response model,
                         final HttpModelType httpModelType,
                         final String name) throws ValidationException {
        requiredConstraintValidator.validate(model.email, HttpModelType.PARAMETER, "email");
        emailEmailEmailConstraintValidator.validate(model.email, HttpModelType.PARAMETER, "email");
    }
}
