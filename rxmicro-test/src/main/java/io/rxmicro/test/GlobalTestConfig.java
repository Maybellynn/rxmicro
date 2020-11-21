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

package io.rxmicro.test;

import io.rxmicro.common.meta.BuilderMethod;
import io.rxmicro.test.local.model.BaseTestConfig;

import java.time.Duration;

/**
 * Allows configuring the global test environment.
 *
 * @author nedis
 * @since 0.7
 */
public final class GlobalTestConfig extends BaseTestConfig {

    /**
     * Default delta that used to compare two instance of {@link java.time.Instant} type.
     */
    public static final Duration DEFAULT_INSTANT_COMPARE_DELTA_VALUE = Duration.ofSeconds(5);

    private Duration defaultInstantCompareDelta = DEFAULT_INSTANT_COMPARE_DELTA_VALUE;

    /**
     * Returns the delta that used to compare two instance of {@link java.time.Instant} type.
     *
     * @return the delta that used to compare two instance of {@link java.time.Instant} type.
     */
    public Duration getDefaultInstantCompareDelta() {
        return defaultInstantCompareDelta;
    }

    /**
     * Sets the delta that used to compare two instance of {@link java.time.Instant} type.
     *
     * @param defaultInstantCompareDelta the delta that used to compare two instance of {@link java.time.Instant} type.
     * @return the reference to this  {@link GlobalTestConfig} instance
     */
    @BuilderMethod
    public GlobalTestConfig setDefaultInstantCompareDelta(final Duration defaultInstantCompareDelta) {
        this.defaultInstantCompareDelta = defaultInstantCompareDelta;
        return this;
    }
}
