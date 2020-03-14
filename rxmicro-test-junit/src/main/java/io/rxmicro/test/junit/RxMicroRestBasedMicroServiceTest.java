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

package io.rxmicro.test.junit;

import io.rxmicro.test.junit.internal.RxMicroRestBasedMicroServiceTestExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
@Target(TYPE)
@Retention(RUNTIME)
@ExtendWith(RxMicroRestBasedMicroServiceTestExtension.class)
@Inherited
public @interface RxMicroRestBasedMicroServiceTest {

    /**
     * @return REST controller classes of REST-based micro services, which must be tested
     */
    Class<?>[] value();
}
