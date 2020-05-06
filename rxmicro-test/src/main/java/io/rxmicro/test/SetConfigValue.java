/*
 * Copyright 2019 https://rxmicro.io
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

package io.rxmicro.test;

import io.rxmicro.config.Config;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
@Documented
@Retention(RUNTIME)
@Target(TYPE)
@Repeatable(SetConfigValue.List.class)
public @interface SetConfigValue {

    Class<? extends Config> configClass() default Config.class;

    String name();

    String value();

    /**
     * Defines several {@link SetConfigValue} annotations on the same element.
     *
     * @author nedis
     * @link https://rxmicro.io
     * @since 0.1
     */
    @Documented
    @Retention(RUNTIME)
    @Target(TYPE)
    @interface List {

        /**
         * Returns the several {@link SetConfigValue} annotations on the same element.
         *
         * @return the several {@link SetConfigValue} annotations on the same element.
         */
        SetConfigValue[] value();
    }
}
