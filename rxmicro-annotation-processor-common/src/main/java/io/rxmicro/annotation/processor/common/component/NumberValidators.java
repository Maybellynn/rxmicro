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

package io.rxmicro.annotation.processor.common.component;

import io.rxmicro.annotation.processor.common.model.ModelField;

import java.lang.annotation.Annotation;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
public interface NumberValidators {

    void validateFloat(ModelField modelField,
                       double value,
                       Class<? extends Annotation> annotationClass);

    void validateByte(ModelField modelField,
                      long value,
                      Class<? extends Annotation> annotationClass);

    void validateShort(ModelField modelField,
                       long value,
                       Class<? extends Annotation> annotationClass);

    void validateInteger(ModelField modelField,
                         long value,
                         Class<? extends Annotation> annotationClass);

    boolean validateBigInteger(ModelField modelField,
                               String value,
                               Class<? extends Annotation> annotationClass);

    boolean validateBigDecimal(ModelField modelField,
                               String value,
                               Class<? extends Annotation> annotationClass);

    boolean validateByte(ModelField modelField,
                         String value,
                         Class<? extends Annotation> annotationClass);

    boolean validateShort(ModelField modelField,
                          String value,
                          Class<? extends Annotation> annotationClass);

    boolean validateInteger(ModelField modelField,
                            String value,
                            Class<? extends Annotation> annotationClass);

    boolean validateLong(ModelField modelField,
                         String value,
                         Class<? extends Annotation> annotationClass);

    boolean validateFloat(ModelField modelField,
                          String value,
                          Class<? extends Annotation> annotationClass);

    boolean validateDouble(ModelField modelField,
                           String value,
                           Class<? extends Annotation> annotationClass);
}
