/*
 * Copyright (c) 2020. https://rxmicro.io
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

package io.rxmicro.validation.validator;

import io.rxmicro.validation.ConstraintValidator;
import io.rxmicro.validation.base.AbstractMinConstraintValidator;

/**
 * Validator for the {@link io.rxmicro.validation.constraint.MinInt} and the {@link io.rxmicro.validation.constraint.MinNumber} constraints.
 *
 * @author nedis
 * @see io.rxmicro.validation.constraint.MinInt
 * @see io.rxmicro.validation.constraint.MinNumber
 * @since 0.1
 */
public class MinIntConstraintValidator extends AbstractMinConstraintValidator<Integer>
        implements ConstraintValidator<Integer> {

    /**
     * Creates the default instance of {@link MinIntConstraintValidator} with the specified parameters.
     *
     * @param minValue the supported min value.
     * @param inclusive whether the specified minimum is inclusive or exclusive.
     */
    public MinIntConstraintValidator(final long minValue,
                                     final boolean inclusive) {
        super((int) minValue, inclusive);
    }

    /**
     * Creates the default instance of {@link MinIntConstraintValidator} with the specified parameters.
     *
     * @param minValue the supported min value.
     * @param inclusive whether the specified minimum is inclusive or exclusive.
     */
    public MinIntConstraintValidator(final String minValue,
                                     final boolean inclusive) {
        super(Integer.parseInt(minValue), inclusive);
    }
}
