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

package io.rxmicro.validation.constraint;

import io.rxmicro.common.meta.ReadMore;
import io.rxmicro.validation.base.ConstraintRule;
import io.rxmicro.validation.base.SelfDocumented;
import io.rxmicro.validation.validator.EmailConstraintValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * The annotated element must be a well-formed email address.
 *
 * Valid email format: ${username}@${domain}, so example of valid email with min length is: a@b
 *
 * @author nedis
 * @link https://rxmicro.io
 * @see EmailConstraintValidator
 * @since 0.1
 */
@Documented
@Retention(SOURCE)
@Target({FIELD, METHOD, PARAMETER})
@ConstraintRule(
        supportedTypes = {
                String.class
        },
        validatorClass = {
                EmailConstraintValidator.class
        }
)
@SelfDocumented
@ReadMore(
        caption = "What is email format?",
        link = "https://tools.ietf.org/html/rfc5322#section-3.4.1"
)
public @interface Email {

    /**
     * Allows to disable validation rule if validation inherited from super class.
     * By default, disable is off
     *
     * @return  {@code true} if the validation must be disabled,
     *          {@code false} otherwise
     */
    boolean off() default false;

    /**
     * @return  {@code true} if validation message must contains error details
     *          {@code false} otherwise
     */
    boolean errorWithDetails() default false;
}
