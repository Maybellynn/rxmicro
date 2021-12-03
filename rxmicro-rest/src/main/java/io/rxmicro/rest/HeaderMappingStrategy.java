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

package io.rxmicro.rest;

import io.rxmicro.model.MappingStrategy;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.CLASS;

/**
 * Declares a strategy of header name formation based on Java model field name analysis.
 *
 * <p>
 * By default, the {@link MappingStrategy#CAPITALIZE_WITH_HYPHEN} strategy is used.
 * Thus, by using this strategy, the {@code 'Header-Name'} name header corresponds to the {@code 'headerName'} field name.
 *
 * <p>
 * <strong>The RxMicro framework uses the following algorithm to define the HTTP header name for the specified model field:</strong>
 * <ol>
 *     <li>
 *          If the field is annotated by the {@link Header} annotation with an explicit indication of the HTTP header name,
 *          the specified name is used.
 *     </li>
 *     <li>
 *          If no HTTP header name is specified in the {@link Header} annotation, the RxMicro framework checks for the
 *          {@link HeaderMappingStrategy} annotation above the model class.
 *     </li>
 *     <li>
 *          If the model class is annotated by the {@link HeaderMappingStrategy} annotation, then the specified naming strategy is used.
 *          (The field name is used as the basic name, and then, following the rules of the specified strategy,
 *          the HTTP header name is generated.)
 *     </li>
 *     <li>
 *          If the {@link HeaderMappingStrategy} annotation is missing, the model class field name is used as the HTTP header name.
 *     </li>
 * </ol>
 *
 * @author nedis
 * @see AddHeader
 * @see SetHeader
 * @see Header
 * @see RepeatHeader
 * @see MappingStrategy
 * @since 0.1
 */
@Documented
@Retention(CLASS)
@Target({TYPE, METHOD})
public @interface HeaderMappingStrategy {

    /**
     * By default, the {@link MappingStrategy#CAPITALIZE_WITH_HYPHEN} strategy is used.
     *
     * <p>
     * Thus, by using this strategy, the {@code 'Header-Name'} name header corresponds to the {@code 'headerName'} field name.
     *
     * @return the mapping strategy
     */
    MappingStrategy value() default MappingStrategy.CAPITALIZE_WITH_HYPHEN;
}
