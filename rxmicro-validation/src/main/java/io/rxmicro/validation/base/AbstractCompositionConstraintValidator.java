/*
 * Copyright (c) 2020 http://rxmicro.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rxmicro.validation.base;

import io.rxmicro.http.error.ValidationException;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.validation.ConstraintValidator;

import java.util.List;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
public abstract class AbstractCompositionConstraintValidator<T> implements ConstraintValidator<T> {

    private final List<ConstraintValidator<T>> validators;

    protected AbstractCompositionConstraintValidator(final List<ConstraintValidator<T>> validators) {
        this.validators = List.copyOf(validators);
    }

    @Override
    public final void validate(final T actual,
                               final HttpModelType httpModelType,
                               final String modelName) throws ValidationException {
        for (final ConstraintValidator<T> validator : validators) {
            validator.validate(actual, httpModelType, modelName);
        }
    }
}
