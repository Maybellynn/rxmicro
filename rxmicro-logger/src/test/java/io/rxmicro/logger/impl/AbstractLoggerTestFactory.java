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

package io.rxmicro.logger.impl;

import io.rxmicro.logger.Logger;
import io.rxmicro.logger.RequestIdSupplier;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author nedis
 * @since 0.7.3
 */
final class AbstractLoggerTestFactory {

    static final Throwable THROWABLE = new Throwable("test");

    static final RequestIdSupplier REQUEST_ID_SUPPLIER = () -> "TestRequestId";

    static Stream<Consumer<Logger>> createMessageOnlyStream() {
        return Stream.of(
                logger -> logger.trace("1"),
                logger -> logger.trace("?", "1"),
                logger -> logger.trace("??", "1", "2"),
                logger -> logger.trace("???", "1", "2", "3"),
                logger -> logger.trace("????", "1", "2", "3", "4"),
                logger -> logger.trace("?????", "1", "2", "3", "4", "5"),
                logger -> logger.trace("??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.trace("?", () -> "1"),
                logger -> logger.trace("??", () -> "1", () -> "2"),
                logger -> logger.trace("???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.trace("????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.trace("?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.trace("??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.debug("1"),
                logger -> logger.debug("?", "1"),
                logger -> logger.debug("??", "1", "2"),
                logger -> logger.debug("???", "1", "2", "3"),
                logger -> logger.debug("????", "1", "2", "3", "4"),
                logger -> logger.debug("?????", "1", "2", "3", "4", "5"),
                logger -> logger.debug("??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.debug("?", () -> "1"),
                logger -> logger.debug("??", () -> "1", () -> "2"),
                logger -> logger.debug("???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.debug("????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.debug("?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.debug("??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.info("1"),
                logger -> logger.info("?", "1"),
                logger -> logger.info("??", "1", "2"),
                logger -> logger.info("???", "1", "2", "3"),
                logger -> logger.info("????", "1", "2", "3", "4"),
                logger -> logger.info("?????", "1", "2", "3", "4", "5"),
                logger -> logger.info("??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.info("?", () -> "1"),
                logger -> logger.info("??", () -> "1", () -> "2"),
                logger -> logger.info("???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.info("????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.info("?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.info("??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.warn("1"),
                logger -> logger.warn("?", "1"),
                logger -> logger.warn("??", "1", "2"),
                logger -> logger.warn("???", "1", "2", "3"),
                logger -> logger.warn("????", "1", "2", "3", "4"),
                logger -> logger.warn("?????", "1", "2", "3", "4", "5"),
                logger -> logger.warn("??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.warn("?", () -> "1"),
                logger -> logger.warn("??", () -> "1", () -> "2"),
                logger -> logger.warn("???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.warn("????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.warn("?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.warn("??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.error("1"),
                logger -> logger.error("?", "1"),
                logger -> logger.error("??", "1", "2"),
                logger -> logger.error("???", "1", "2", "3"),
                logger -> logger.error("????", "1", "2", "3", "4"),
                logger -> logger.error("?????", "1", "2", "3", "4", "5"),
                logger -> logger.error("??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.error("?", () -> "1"),
                logger -> logger.error("??", () -> "1", () -> "2"),
                logger -> logger.error("???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.error("????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.error("?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.error("??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6")
        );
    }

    static Stream<Consumer<Logger>> createThrowableWithMessageStream() {
        return Stream.of(
                logger -> logger.trace(THROWABLE, "1"),
                logger -> logger.trace(THROWABLE, "?", "1"),
                logger -> logger.trace(THROWABLE, "??", "1", "2"),
                logger -> logger.trace(THROWABLE, "???", "1", "2", "3"),
                logger -> logger.trace(THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.trace(THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.trace(THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.trace(THROWABLE, "?", () -> "1"),
                logger -> logger.trace(THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.trace(THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.trace(THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.trace(THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.trace(THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.debug(THROWABLE, "1"),
                logger -> logger.debug(THROWABLE, "?", "1"),
                logger -> logger.debug(THROWABLE, "??", "1", "2"),
                logger -> logger.debug(THROWABLE, "???", "1", "2", "3"),
                logger -> logger.debug(THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.debug(THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.debug(THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.debug(THROWABLE, "?", () -> "1"),
                logger -> logger.debug(THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.debug(THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.debug(THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.debug(THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.debug(THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.info(THROWABLE, "1"),
                logger -> logger.info(THROWABLE, "?", "1"),
                logger -> logger.info(THROWABLE, "??", "1", "2"),
                logger -> logger.info(THROWABLE, "???", "1", "2", "3"),
                logger -> logger.info(THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.info(THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.info(THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.info(THROWABLE, "?", () -> "1"),
                logger -> logger.info(THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.info(THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.info(THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.info(THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.info(THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.warn(THROWABLE, "1"),
                logger -> logger.warn(THROWABLE, "?", "1"),
                logger -> logger.warn(THROWABLE, "??", "1", "2"),
                logger -> logger.warn(THROWABLE, "???", "1", "2", "3"),
                logger -> logger.warn(THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.warn(THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.warn(THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.warn(THROWABLE, "?", () -> "1"),
                logger -> logger.warn(THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.warn(THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.warn(THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.warn(THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.warn(THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.error(THROWABLE, "1"),
                logger -> logger.error(THROWABLE, "?", "1"),
                logger -> logger.error(THROWABLE, "??", "1", "2"),
                logger -> logger.error(THROWABLE, "???", "1", "2", "3"),
                logger -> logger.error(THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.error(THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.error(THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.error(THROWABLE, "?", () -> "1"),
                logger -> logger.error(THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.error(THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.error(THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.error(THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.error(THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6")
        );
    }

    static Stream<Consumer<Logger>> createRequestIdSupplierWithMessageStream() {
        return Stream.of(
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "1"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "?", "1"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "??", "1", "2"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "???", "1", "2", "3"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "????", "1", "2", "3", "4"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "?", () -> "1"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "??", () -> "1", () -> "2"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.debug(REQUEST_ID_SUPPLIER, "1"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "?", "1"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "??", "1", "2"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "???", "1", "2", "3"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "????", "1", "2", "3", "4"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "?", () -> "1"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "??", () -> "1", () -> "2"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.info(REQUEST_ID_SUPPLIER, "1"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "?", "1"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "??", "1", "2"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "???", "1", "2", "3"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "????", "1", "2", "3", "4"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "?", () -> "1"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "??", () -> "1", () -> "2"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.warn(REQUEST_ID_SUPPLIER, "1"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "?", "1"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "??", "1", "2"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "???", "1", "2", "3"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "????", "1", "2", "3", "4"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "?", () -> "1"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "??", () -> "1", () -> "2"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.error(REQUEST_ID_SUPPLIER, "1"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "?", "1"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "??", "1", "2"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "???", "1", "2", "3"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "????", "1", "2", "3", "4"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "?", () -> "1"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "??", () -> "1", () -> "2"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6")
        );
    }

    static Stream<Consumer<Logger>> createRequestIdSupplierWithThrowableAndMessageStream() {
        return Stream.of(
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "1"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "?", "1"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "??", "1", "2"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "???", "1", "2", "3"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "?", () -> "1"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.trace(REQUEST_ID_SUPPLIER, THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "1"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "?", "1"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "??", "1", "2"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "???", "1", "2", "3"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "?", () -> "1"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.debug(REQUEST_ID_SUPPLIER, THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "1"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "?", "1"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "??", "1", "2"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "???", "1", "2", "3"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "?", () -> "1"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.info(REQUEST_ID_SUPPLIER, THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "1"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "?", "1"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "??", "1", "2"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "???", "1", "2", "3"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "?", () -> "1"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.warn(REQUEST_ID_SUPPLIER, THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6"),

                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "1"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "?", "1"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "??", "1", "2"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "???", "1", "2", "3"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "????", "1", "2", "3", "4"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "?????", "1", "2", "3", "4", "5"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "??????", "1", "2", "3", "4", "5", "6"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "?", () -> "1"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "??", () -> "1", () -> "2"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "???", () -> "1", () -> "2", () -> "3"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "????", () -> "1", () -> "2", () -> "3", () -> "4"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "?????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5"),
                logger -> logger.error(REQUEST_ID_SUPPLIER, THROWABLE, "??????", () -> "1", () -> "2", () -> "3", () -> "4", () -> "5", () -> "6")
        );
    }

    static Stream<Function<Logger, Boolean>> createIsLevelEnabledStream() {
        return Stream.of(
                Logger::isTraceEnabled,
                Logger::isDebugEnabled,
                Logger::isInfoEnabled,
                Logger::isWarnEnabled,
                Logger::isErrorEnabled
        );
    }
}