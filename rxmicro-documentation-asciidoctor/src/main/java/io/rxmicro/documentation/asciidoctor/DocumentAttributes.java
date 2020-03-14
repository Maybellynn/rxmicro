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

package io.rxmicro.documentation.asciidoctor;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.MODULE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @link https://asciidoctor.org/docs/user-manual/#attributes
 * @since 0.1
 */
@Documented
@Retention(SOURCE)
@Target(MODULE)
public @interface DocumentAttributes {

    /**
     * @return document attributes, using key-value format.
     */
    String[] value() default {
            // https://asciidoctor.org/docs/user-manual/#admonition-icons
            "icons", "font",
            // https://asciidoctor.org/docs/user-manual/#anchors
            "sectanchors", "",
            // https://asciidoctor.org/docs/user-manual/#links
            "sectlinks", "",
            // https://asciidoctor.org/docs/user-manual/#table-of-contents-summary
            "toc", "left",
            "toclevels", "3",
            // https://asciidoctor.org/docs/user-manual/#numbering
            "sectnums", "",
            // https://asciidoctor.org/docs/user-manual/#numbering-depth
            "sectnumlevels", "5"
    };
}
