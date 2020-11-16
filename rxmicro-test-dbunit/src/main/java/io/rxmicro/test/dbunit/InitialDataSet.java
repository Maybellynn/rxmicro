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

package io.rxmicro.test.dbunit;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static io.rxmicro.test.dbunit.InitDatabaseStrategy.CLEAN_INSERT;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author nedis
 * @since 0.7
 */
@Documented
@Retention(RUNTIME)
@Target(METHOD)
public @interface InitialDataSet {

    String[] value() default {};

    InitDatabaseStrategy initDatabaseStrategy() default CLEAN_INSERT;

    /**
     * Returns a list of jdbc statements to execute before inserting initial dataset.
     *
     * @return a list of jdbc statements to execute before inserting initial dataset.
     */
    String[] executeStatementsBefore() default {};

    /**
     * Returns a list of jdbc statements to execute after comparing with expected dataset.
     *
     * @return a list of jdbc statements to execute after comparing with expected dataset.
     */
    String[] executeStatementsAfter() default {};

    /**
     * Returns a list of sql script files to execute before inserting initial dataset.
     *
     * <p>
     * Note that commands inside sql file must be separated by {@code ';'}.
     *
     * @return a list of sql script files to execute before inserting initial dataset.
     */
    String[] executeScriptsBefore() default {};

    /**
     * Returns a list of sql script files to execute after comparing with expected dataset.
     *
     * <p>
     * Note that commands inside sql file must be separated by {@code ';'}.
     *
     * @return a list of sql script files to execute after comparing with expected dataset.
     */
    String[] executeScriptsAfter() default {};
}
