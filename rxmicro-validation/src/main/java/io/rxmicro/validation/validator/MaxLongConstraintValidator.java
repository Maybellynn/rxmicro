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
import io.rxmicro.validation.base.AbstractMaxConstraintValidator;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @see io.rxmicro.validation.constraint.MaxInt
 * @see io.rxmicro.validation.constraint.MaxNumber
 * @since 0.1
 */
public class MaxLongConstraintValidator extends AbstractMaxConstraintValidator<Long>
        implements ConstraintValidator<Long> {

    public MaxLongConstraintValidator(final Long maxValue,
                                      final boolean inclusive) {
        super(maxValue, inclusive);
    }

    public MaxLongConstraintValidator(final String maxValue,
                                      final boolean inclusive) {
        super(Long.parseLong(maxValue), inclusive);
    }
}
