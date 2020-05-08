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

package io.rxmicro.rest.server;

import io.rxmicro.rest.model.GenerateOption;
import io.rxmicro.rest.model.ServerExchangeFormatModule;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Allows configuring the process of code generation by the {@code RxMicro Annotation Processor} for REST controllers.
 * <p>
 * To configure the process of code generation by the RxMicro Annotation Processor
 * developer must annotated a module descriptor {@code module-info.java} by this annotation.
 *
 * @author nedis
 * @since 0.1
 */
@Documented
@Retention(SOURCE)
@Target({MODULE, ANNOTATION_TYPE})
public @interface RestServerGeneratorConfig {

    /**
     * Allows to specify the format for message exchange with a server.
     *
     * @return the message exchange format.
     */
    ServerExchangeFormatModule exchangeFormat() default ServerExchangeFormatModule.AUTO_DETECT;

    /**
     * Allows enabling/disabling the option of generating HTTP request validators for all HTTP request handlers in the project.
     *
     * @return {@link GenerateOption#AUTO_DETECT} if validators must be generated only if the developer adds the
     *              {@code rxmicro.validation} module to the {@code module-info.java} descriptor.
     *         {@link GenerateOption#DISABLED} if validators must not be generated by the RxMicro Annotation Processor.
     */
    GenerateOption generateRequestValidators() default GenerateOption.AUTO_DETECT;

    /**
     * Allows enabling/disabling the option of generating HTTP response validators for all HTTP request handlers in the project.
     *
     * @return {@link GenerateOption#AUTO_DETECT} if validators must be generated only if the developer adds the
     *              {@code rxmicro.validation} module to the {@code module-info.java} descriptor.
     *         {@link GenerateOption#DISABLED} if validators must not be generated by the RxMicro Annotation Processor.
     */
    GenerateOption generateResponseValidators() default GenerateOption.DISABLED;
}
