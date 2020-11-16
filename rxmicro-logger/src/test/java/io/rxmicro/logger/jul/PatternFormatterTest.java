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

package io.rxmicro.logger.jul;

import io.rxmicro.logger.internal.jul.config.adapter.RxMicroLogRecord;
import io.rxmicro.logger.internal.jul.config.adapter.pattern.consumers.RelativeTimeBiConsumer;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Field;
import java.time.Instant;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.logging.LogRecord;

import static java.lang.System.lineSeparator;
import static java.util.logging.Level.INFO;
import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author nedis
 * @since 0.7
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
final class PatternFormatterTest {

    @ParameterizedTest
    @CsvSource(delimiter = ';', value = {
            "Hello world;                                                    Hello world",
            "%message%n;                                                     message",
            "%logger: %message%;                                             LoggerName: message%",
            "%logger: %message%n;                                            LoggerName: message",
            "%logger: %message%%%n;                                          LoggerName: message%",
            "%d{yyyy-MM-dd HH:mm:ss.SSS, UTC} [%p] %c: %m%n;                 2020-01-02 03:04:05.123 [INFO] LoggerName: message",
            "%d{, UTC} {%t{}} [%p{}] %c{}: %m{}%n{};                         2020-01-02 03:04:05.123 {thread-1} [INFO] LoggerName: message",
            "%date{, UTC} [%level] %logger: %message%n;                      2020-01-02 03:04:05.123 [INFO] LoggerName: message",
            "%d{HH:mm:ss.SSS, UTC} {%t} [%p] %C.%M: %m%n;                    03:04:05.123 {thread-1} [INFO] package.Class.method: message",
            "%date{yyyy-MM-dd, UTC} {%thread} [%le] %class.%method: %mes%n;  2020-01-02 {thread-1} [INFO] package.Class.method: message",
            "%d{HH:mm:ss.SSS, UTC} %C.%M(%F:%L): %m%n;                       03:04:05.123 package.Class.method(Class.java:15): message"
    })
    @Order(1)
    void Should_format_correctly(final String pattern,
                                 final String expectedMessage) {
        final RxMicroLogRecord record = new RxMicroLogRecord("LoggerName", INFO, "message");
        record.setInstant(Instant.parse("2020-01-02T03:04:05.123Z"));
        record.setThreadName("thread-1");
        record.setStackFrame("package.Class", "method", "Class.java", 15);

        final String validExpected = pattern.endsWith("%n") || pattern.endsWith("%n{}") ?
                expectedMessage + lineSeparator() :
                expectedMessage;

        final PatternFormatter patternFormatter = assertDoesNotThrow(() -> new PatternFormatter(pattern));
        assertEquals(
                validExpected,
                patternFormatter.format(record)
        );
    }

    @Test
    @Order(2)
    void Should_format_with_relative_time_and_throwable() throws NoSuchFieldException, IllegalAccessException {
        final Exception exception = new Exception("Test exception");
        exception.setStackTrace(new StackTraceElement[]{
                new StackTraceElement("package.Class", "method", "Class.java", 15),
                new StackTraceElement("Launcher", "main", "Launcher.java", 10)
        });

        final RxMicroLogRecord record = new RxMicroLogRecord("LoggerName", INFO, "message");
        record.setInstant(Instant.parse("2020-01-02T03:04:05.123Z"));
        record.setThreadName("thread-1");
        record.setStackFrame("package.Class", "method", "Class.java", 15);
        record.setThrown(exception);

        final PatternFormatter patternFormatter = assertDoesNotThrow(() -> new PatternFormatter("%r [%p] %c: %m%n"));
        setRelativeTimeStart(patternFormatter);

        assertEquals(
                List.of(
                        "1577934245123 [INFO] LoggerName: message",
                        "",
                        "java.lang.Exception: Test exception",
                        "\tat package.Class.method(Class.java:15)",
                        "\tat Launcher.main(Launcher.java:10)",
                        ""
                ).stream().collect(joining(lineSeparator())),
                patternFormatter.format(record)
        );
    }

    @SuppressWarnings("unchecked")
    private void setRelativeTimeStart(final PatternFormatter patternFormatter) throws NoSuchFieldException, IllegalAccessException {
        final Field biConsumersField = PatternFormatter.class.getDeclaredField("biConsumers");
        if (!biConsumersField.canAccess(patternFormatter)) {
            biConsumersField.setAccessible(true);
        }
        final BiConsumer<StringBuilder, LogRecord> biConsumer =
                ((List<BiConsumer<StringBuilder, LogRecord>>) biConsumersField.get(patternFormatter)).stream()
                        .filter(c -> c instanceof RelativeTimeBiConsumer)
                        .findFirst()
                        .orElseThrow();
        final Field startField = RelativeTimeBiConsumer.class.getDeclaredField("start");
        if (!startField.canAccess(biConsumer)) {
            startField.setAccessible(true);
        }
        startField.set(biConsumer, 0L);
    }
}