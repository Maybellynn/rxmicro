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

package io.rxmicro.data.mongo;

import io.rxmicro.data.mongo.detail.AbstractMongoRepository;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * If the Mongo data repository generated by the {@code RxMicro Annotation Processor} contains errors, incorrect or non-optimized logic,
 * the developer can use the Partial Implementation feature.
 *
 * <p>
 * This feature allows to developer to implement methods for the Mongo data repository,
 * instead of generating them by the RxMicro framework.
 *
 * <p>
 * To activate this feature, it is necessary to use this annotation, and specify an abstract class that contains
 * a partial implementation of methods for Mongo data repository.
 *
 * <p>
 * <strong>An abstract class that contains a partial implementation must meet the following requirements:</strong>
 * <ul>
 *     <li>The class must be an abstract one.</li>
 *     <li>The class must extend the {@link AbstractMongoRepository} one.</li>
 *     <li>The class must implement the Mongo data repository interface.</li>
 *     <li>The class must contain an implementation of all methods that are not generated automatically.</li>
 * </ul>
 *
 * @author nedis
 * @see AbstractMongoRepository
 * @since 0.1
 */
@Documented
@Retention(SOURCE)
@Target(TYPE)
public @interface PartialImplementation {

    /**
     * Returns the abstract repository class, which contains a partial or a full implementation of the data repository.
     *
     * @return the abstract repository class, which contains a partial or a full implementation of the data repository
     */
    Class<? extends AbstractMongoRepository> value();
}
