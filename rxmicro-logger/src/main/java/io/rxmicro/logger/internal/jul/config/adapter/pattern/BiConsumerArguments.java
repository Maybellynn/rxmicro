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

package io.rxmicro.logger.internal.jul.config.adapter.pattern;

import java.util.List;

/**
 * @author nedis
 * @since 0.7
 */
public final class BiConsumerArguments {

    private final ConversionSpecifier conversionSpecifier;

    private final List<String> options;

    public BiConsumerArguments(final ConversionSpecifier conversionSpecifier,
                               final List<String> options) {
        this.conversionSpecifier = conversionSpecifier;
        this.options = options;
    }

    public BiConsumerArguments(final ConversionSpecifier conversionSpecifier) {
        this(conversionSpecifier, List.of());
    }

    public ConversionSpecifier getConversionSpecifier() {
        return conversionSpecifier;
    }

    public List<String> getOptions() {
        return options;
    }
}