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

package io.rxmicro.logger.internal.jul.config.adapter;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

/**
 * @author nedis
 * @since 0.1
 */
public class SystemOutConsoleHandler extends StreamHandler {

    public SystemOutConsoleHandler() {
        super(System.out, new DefaultLoggerFormatter());
    }

    @Override
    public synchronized void publish(final LogRecord record) {
        super.publish(record);
        flush();
    }
}