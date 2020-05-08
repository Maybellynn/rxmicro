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

package io.rxmicro.data.sql.operation;

import io.rxmicro.data.sql.VariableValues;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Denotes a repository method that must execute a {@code DELETE} SQL operation
 *
 * @author nedis
 * @since 0.1
 * @see io.rxmicro.data.sql.SupportedVariables
 * @see Insert
 * @see Select
 * @see Update
 */
@Documented
@Retention(SOURCE)
@Target(METHOD)
public @interface Delete {

    /**
     * The default {@code DELETE} statement if value is empty
     *
     * @see io.rxmicro.data.sql.SupportedVariables
     */
    String DEFAULT_DELETE = "DELETE FROM ${table} WHERE ${by-id-filter}";

    /**
     * Customize {@code DELETE} query.
     * <p>
     * By default, Rx Micro generate the default sql.
     * <p>
     * See {@link #DEFAULT_DELETE} for details
     *
     * @return custom {@code DELETE} SQL
     */
    String value() default "";

    /**
     * entityClass is used to resolve
     * <code>${table}</code>, <code>${updated-columns}</code> or <code>${by-id-filter}</code> variable values.
     * <p>
     * To determine the value of the predefined variable used in the query specified for the repository method, the RxMicro framework
     * uses the following algorithm:
     * <ol>
     *     <li>
     *         If the repository method returns or accepts the entity model as a parameter, the entity model class is used to define
     *         the variable value.
     *     </li>
     *     <li>
     *         Otherwise, the RxMicro framework analyzes the optional entityClass parameter defined in the
     *         {@link Select}, {@link Insert}, {@link Update} and {@link Delete} annotations.
     *     </li>
     *     <li>
     *         If the optional entityClass parameter is set, the class specified in this parameter is used to define the variable value.
     *     </li>
     *     <li>
     *         If the optional entityClass parameter is missing, the RxMicro framework tries to extract the variable value from the
     *         {@link VariableValues} annotation, which annotates this repository method.
     *     </li>
     *     <li>
     *         If the repository method is not annotated with the {@link VariableValues} annotation or the {@link VariableValues} annotation
     *         does not contain the value of a predefined variable, then the RxMicro framework tries to extract the value of this variable
     *         from the {@link VariableValues} annotation, which annotates the repository interface.
     *     </li>
     *     <li>
     *         If the variable value is undefined in all specified places, then the RxMicro framework notifies the developer
     *         about the error.
     *     </li>
     * </ol>
     *
     * @return the entity class
     */
    Class<?> entityClass() default Void.class;
}
