/*
 * Copyright (c) 2020. http://rxmicro.io
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
 * @author nedis
 * @link http://rxmicro.io
 * @see io.rxmicro.validation.constraint.MinDouble
 * @see io.rxmicro.validation.constraint.MinNumber
 * @since 0.1
 */
public class MinDoubleConstraintValidator extends AbstractMinConstraintValidator<Double>
        implements ConstraintValidator<Double> {

    public MinDoubleConstraintValidator(final Double minValue) {
        super(minValue, false);
    }

    public MinDoubleConstraintValidator(final String minValue,
                                        final boolean inclusive) {
        super(Double.parseDouble(minValue), inclusive);
    }
}
