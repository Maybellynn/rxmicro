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

package io.rxmicro.annotation.processor.common.component.impl;

import io.rxmicro.annotation.processor.common.model.LoggableClassName;
import io.rxmicro.annotation.processor.common.model.error.InterruptProcessingException;
import io.rxmicro.annotation.processor.config.LogLevel;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;
import javax.lang.model.element.Element;
import javax.tools.Diagnostic;

import static io.rxmicro.annotation.processor.common.model.error.InterruptProcessingException.READ_MORE_TEMPLATE;
import static io.rxmicro.annotation.processor.common.util.InternalLoggers.DEFAULT_OFFSET;
import static io.rxmicro.annotation.processor.common.util.InternalLoggers.logMessage;
import static io.rxmicro.annotation.processor.common.util.InternalLoggers.logThrowableStackTrace;
import static io.rxmicro.annotation.processor.common.util.ProcessingEnvironmentHelper.errorDetected;
import static io.rxmicro.annotation.processor.common.util.ProcessingEnvironmentHelper.getCompilerOptions;
import static io.rxmicro.annotation.processor.common.util.ProcessingEnvironmentHelper.getMessager;
import static io.rxmicro.annotation.processor.config.LogLevel.DEBUG;
import static io.rxmicro.annotation.processor.config.LogLevel.INFO;
import static io.rxmicro.annotation.processor.config.LogLevel.TRACE;
import static io.rxmicro.annotation.processor.config.SupportedOptions.RX_MICRO_LOG_LEVEL;
import static io.rxmicro.annotation.processor.config.SupportedOptions.RX_MICRO_LOG_LEVEL_DEFAULT_VALUE;
import static io.rxmicro.common.util.Formats.format;

/**
 * @author nedis
 * @since 0.1
 */
public abstract class AbstractProcessorComponent {

    private LogLevel level;

    private LogLevel getLevel() {
        if (level == null) {
            final String stringLogLevel = getStringOption(RX_MICRO_LOG_LEVEL, RX_MICRO_LOG_LEVEL_DEFAULT_VALUE.name());
            try {
                level = LogLevel.valueOf(stringLogLevel);
            } catch (final IllegalArgumentException ignore) {
                getMessager().printMessage(
                        Diagnostic.Kind.MANDATORY_WARNING,
                        format("Unsupported logger level for the RxMicro Annotation Processor: '?'. " +
                                        "Only following supported: ?. Using default level: '?'",
                                stringLogLevel, Arrays.toString(LogLevel.values()), RX_MICRO_LOG_LEVEL_DEFAULT_VALUE
                        )
                );
                level = RX_MICRO_LOG_LEVEL_DEFAULT_VALUE;
            }
        }
        return level;
    }

    protected final void trace(final Supplier<String> supplier) {
        if (getLevel().isEnabled(TRACE)) {
            logMessage(TRACE, supplier.get());
        }
    }

    protected final void trace(final String message,
                               final Object... args) {
        if (getLevel().isEnabled(TRACE)) {
            logMessage(TRACE, format(message, args));
        }
    }

    protected final void trace(final String message,
                               final Supplier<?>... args) {
        if (getLevel().isEnabled(TRACE)) {
            logMessage(TRACE, format(message, Arrays.stream(args).map(Supplier::get).toArray()));
        }
    }

    protected final void debug(final Supplier<String> supplier) {
        if (getLevel().isEnabled(DEBUG)) {
            logMessage(DEBUG, supplier.get());
        }
    }

    protected final void debug(final String message,
                               final Object... args) {
        if (getLevel().isEnabled(DEBUG)) {
            logMessage(DEBUG, format(message, args));
        }
    }

    protected final void debug(final String message,
                               final Supplier<?>... args) {
        if (getLevel().isEnabled(DEBUG)) {
            logMessage(DEBUG, format(message, Arrays.stream(args).map(Supplier::get).toArray()));
        }
    }

    protected final void info(final Supplier<String> supplier) {
        if (getLevel().isEnabled(INFO)) {
            logMessage(INFO, supplier.get());
        }
    }

    protected final void info(final String message,
                              final Object... args) {
        if (getLevel().isEnabled(INFO)) {
            logMessage(INFO, format(message, args));
        }
    }

    protected final void info(final String message,
                              final Supplier<?>... args) {
        if (getLevel().isEnabled(INFO)) {
            logMessage(INFO, format(message, Arrays.stream(args).map(Supplier::get).toArray()));
        }
    }

    protected final void warn(final String readMoreLink,
                              final Element element,
                              final String message,
                              final Object... args) {
        final String mes = format(message, args) + format(READ_MORE_TEMPLATE, readMoreLink);
        getMessager().printMessage(Diagnostic.Kind.MANDATORY_WARNING, mes, element);
    }

    protected final void warn(final Element element,
                              final String message,
                              final Object... args) {
        final String mes = (args.length == 0) ? message : format(message, args);
        getMessager().printMessage(Diagnostic.Kind.MANDATORY_WARNING, mes, element);
    }

    protected final void error(final String message,
                               final Object... args) {
        getMessager().printMessage(Diagnostic.Kind.ERROR, format(message, args));
    }

    protected final void error(final InterruptProcessingException exception) {
        error(exception.getElement(), exception.getMessage());
    }

    protected final void error(final String readMoreLink,
                               final Element element,
                               final String message,
                               final Object... args) {
        final String mes = format(message, args) + format(READ_MORE_TEMPLATE, readMoreLink);
        getMessager().printMessage(Diagnostic.Kind.ERROR, mes, element);
        errorDetected();
    }

    protected final void error(final Element element,
                               final String message,
                               final Object... args) {
        final String mes = (args.length == 0) ? message : format(message, args);
        getMessager().printMessage(Diagnostic.Kind.ERROR, mes, element);
        errorDetected();
    }

    protected final void cantGenerateClass(final String generatedClassName,
                                           final Throwable throwable) {
        logThrowableStackTrace(throwable);
        getMessager().printMessage(Diagnostic.Kind.ERROR,
                format("Can't generate class ?: ?", generatedClassName, throwable.getMessage()));
        errorDetected();
    }

    protected final void cantGenerateDocument(final String documentName,
                                              final Throwable throwable) {
        logThrowableStackTrace(throwable);
        getMessager().printMessage(Diagnostic.Kind.ERROR,
                format("Can't generate document ?: ?", documentName, throwable.getMessage()));
        errorDetected();
    }

    protected final void cantGenerateMethodBody(final String templateName,
                                                final Throwable throwable) {
        logThrowableStackTrace(throwable);
        getMessager().printMessage(Diagnostic.Kind.ERROR,
                format("Can't generate method body using '?' template: ?",
                        templateName, throwable.getMessage()));
        errorDetected();
    }

    protected final int getIntOption(final String propertyName,
                                     final int defaultValue) {
        final String value = getStringOption(propertyName, null);
        if (value != null) {
            try {
                return Integer.parseInt(value);
            } catch (final NumberFormatException ignore) {
                // do nothing: return defaultValue
            }
        }
        return defaultValue;
    }

    protected final boolean getBooleanOption(final String propertyName,
                                             final boolean defaultValue) {
        final String value = getStringOption(propertyName, null);
        return Optional.ofNullable(value).map(Boolean::parseBoolean).orElse(defaultValue);
    }

    protected final String getStringOption(final String propertyName,
                                           final String defaultValue) {

        String value = getCompilerOptions().get(propertyName);
        if (value != null) {
            return value;
        }
        value = System.getProperty(propertyName);
        if (value != null) {
            return value;
        }
        value = System.getenv().get(propertyName);
        if (value != null) {
            return value;
        }
        return defaultValue;
    }

    protected final String showParentChildRelation(final int repeatOffset,
                                                   final boolean showParent,
                                                   final LoggableClassName parentClass,
                                                   final LoggableClassName childClass) {
        final char rowHead = '^';
        final String rowTail = "|-";
        final int offsetValue = repeatOffset * 3 + 1;
        return (showParent ? DEFAULT_OFFSET.repeat(offsetValue) + parentClass.getLoggableFullClassName() + '\n' : "") +
                DEFAULT_OFFSET.repeat(offsetValue) + DEFAULT_OFFSET + rowHead + '\n' +
                DEFAULT_OFFSET.repeat(offsetValue) + DEFAULT_OFFSET + rowTail + DEFAULT_OFFSET + childClass.getLoggableFullClassName();
    }
}
