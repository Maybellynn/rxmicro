package io.rxmicro.examples.validation.client.all.types;

import io.rxmicro.http.error.ValidationException;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.validation.ConstraintValidator;
import io.rxmicro.validation.validator.EmailConstraintValidator;
import io.rxmicro.validation.validator.RequiredConstraintValidator;

import static io.rxmicro.validation.detail.StatelessValidators.getStatelessValidator;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$VirtualREST1Request2ConstraintValidator implements ConstraintValidator<$$VirtualREST1Request2> {

    private final RequiredConstraintValidator requiredConstraintValidator =
            getStatelessValidator(RequiredConstraintValidator.class);

    private final EmailConstraintValidator emailEmailEmailConstraintValidator =
            new EmailConstraintValidator(false);

    @Override
    public void validate(final $$VirtualREST1Request2 model,
                         final HttpModelType httpModelType,
                         final String name) throws ValidationException {
        requiredConstraintValidator.validate(model.email, HttpModelType.PARAMETER, "email");
        emailEmailEmailConstraintValidator.validate(model.email, HttpModelType.PARAMETER, "email");
    }
}
