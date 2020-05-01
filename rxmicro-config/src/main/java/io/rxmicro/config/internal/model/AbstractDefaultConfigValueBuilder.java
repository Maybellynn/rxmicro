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

package io.rxmicro.config.internal.model;

import io.rxmicro.common.ImpossibleException;

/**
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
public abstract class AbstractDefaultConfigValueBuilder {

    private static DefaultConfigValueStorage.Builder builder =
            new DefaultConfigValueStorage.Builder();

    private static DefaultConfigValueStorage defaultConfigValueStorage;

    protected AbstractDefaultConfigValueBuilder() {
    }

    public static DefaultConfigValueStorage.Builder getCurrentBuilder() {
        if (defaultConfigValueStorage != null) {
            throw new ImpossibleException("Detected logic issue in the RxMicro framework! " +
                    "Could not return DefaultConfigValueStorage.Builder after creation of DefaultConfigValueStorage instance.");
        }
        return builder;
    }

    public static DefaultConfigValueStorage getCurrentDefaultConfigValueStorage() {
        if (defaultConfigValueStorage == null) {
            defaultConfigValueStorage = builder.build();
            builder = null;
        }
        return defaultConfigValueStorage;
    }
}