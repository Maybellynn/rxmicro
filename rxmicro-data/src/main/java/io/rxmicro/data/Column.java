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

package io.rxmicro.data;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Sets mapping between the column name in the DB table (document) and the Java model class field name.
 * <p>
 * By default, the RxMicro framework uses the Java model class field name as the column name in the DB table (document).
 * <p>
 * If the name should differ for some reason, (for example, as a column name is the keyword Java is used),
 * it should be specified using this annotation!
 *
 * @author nedis
 * @since 0.1
 * @see ColumnMappingStrategy
 */
@Documented
@Retention(SOURCE)
@Target({FIELD, METHOD})
public @interface Column {

    /**
     * By default, the RxMicro framework uses the Java model class field name as the column name in the DB table (document).
     *
     * @return the column name
     */
    String value();
}
