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

package io.rxmicro.config;

import io.rxmicro.config.internal.model.ConfigProperties;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.io.TempDir;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import static io.rxmicro.config.detail.DefaultConfigValuePopulator.putDefaultConfigValue;
import static io.rxmicro.config.internal.model.PropertyNames.CURRENT_DIR_PROPERTY;
import static io.rxmicro.config.internal.model.PropertyNames.USER_HOME_PROPERTY;
import static io.rxmicro.tool.common.Reflections.setFieldValue;
import static java.nio.file.Files.createDirectories;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.3
 */
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public final class Configs_IntegrationTest {

    private static final String REAL_USER_HOME = System.getProperty(USER_HOME_PROPERTY);

    @TempDir
    static Path tempDir;

    @BeforeAll
    static void beforeAll() throws IOException {
        putDefaultConfigValue("test.defaultConfigValues", "defaultConfigValues");

        System.setProperty(USER_HOME_PROPERTY, mkDir("home/"));
        mkDir("home/.rxmicro/");
        System.setProperty(CURRENT_DIR_PROPERTY, mkDir("current/"));
        System.setProperty("test.javaSystemProperties", "javaSystemProperties");

        final String root = tempDir.toAbsolutePath().toString();
        Files.write(
                Paths.get(root+"/home/rxmicro.properties"),
                List.of("test.rxmicroFileAtTheHomeDir=rxmicroFileAtTheHomeDir")
        );
        Files.write(
                Paths.get(root+"/home/test.properties"),
                List.of("separateFileAtTheHomeDir=separateFileAtTheHomeDir")
        );

        Files.write(
                Paths.get(root+"/home/.rxmicro/rxmicro.properties"),
                List.of("test.rxmicroFileAtTheRxmicroConfigDir=rxmicroFileAtTheRxmicroConfigDir")
        );
        Files.write(
                Paths.get(root+"/home/.rxmicro/test.properties"),
                List.of("separateFileAtTheRxmicroConfigDir=separateFileAtTheRxmicroConfigDir")
        );

        Files.write(
                Paths.get(root+"/current/rxmicro.properties"),
                List.of("test.rxmicroFileAtTheCurrentDir=rxmicroFileAtTheCurrentDir")
        );
        Files.write(
                Paths.get(root+"/current/test.properties"),
                List.of("separateFileAtTheCurrentDir=separateFileAtTheCurrentDir")
        );

        setFieldValue(ConfigProperties.class, "SYSTEM_ENV", Map.of("test.environmentVariables", "environmentVariables"));
    }

    private static String mkDir(final String relativePath) throws IOException {
        return createDirectories(Paths.get(tempDir.toAbsolutePath().toString() + "/" + relativePath)).toAbsolutePath().toString();
    }

    @BeforeEach
    void beforeEach() {
        new Configs.Builder()
                .withAllConfigSources()
                .withCommandLineArguments(new String[]{"test.commandLineArguments=commandLineArguments"})
                .build();
    }

    @Test
    void Should_resolve_config_from_all_supported_sources() {
        final TestConfig config = Configs.getConfig(TestConfig.class);
        assertEquals("defaultConfigValues", config.getDefaultConfigValues());
        assertEquals("rxmicroClassPathResource", config.getRxmicroClassPathResource());
        assertEquals("separateClassPathResource", config.getSeparateClassPathResource());
        assertEquals("environmentVariables", config.getEnvironmentVariables());
        assertEquals("rxmicroFileAtTheHomeDir", config.getRxmicroFileAtTheHomeDir());
        assertEquals("rxmicroFileAtTheRxmicroConfigDir", config.getRxmicroFileAtTheRxmicroConfigDir());
        assertEquals("rxmicroFileAtTheCurrentDir", config.getRxmicroFileAtTheCurrentDir());
        assertEquals("separateFileAtTheHomeDir", config.getSeparateFileAtTheHomeDir());
        assertEquals("separateFileAtTheRxmicroConfigDir", config.getSeparateFileAtTheRxmicroConfigDir());
        assertEquals("separateFileAtTheCurrentDir", config.getSeparateFileAtTheCurrentDir());
        assertEquals("javaSystemProperties", config.getJavaSystemProperties());
        assertEquals("commandLineArguments", config.getCommandLineArguments());
    }

    @AfterAll
    static void afterAll() {
        System.setProperty(USER_HOME_PROPERTY, REAL_USER_HOME);
        System.clearProperty(CURRENT_DIR_PROPERTY);
    }

    /**
     * @author nedis
     * @link http://rxmicro.io
     * @since 0.3
     */
    @SuppressWarnings("unused")
    public static final class TestConfig extends Config {

        private String defaultConfigValues;

        private String rxmicroClassPathResource;

        private String separateClassPathResource;

        private String environmentVariables;

        private String rxmicroFileAtTheHomeDir;

        private String rxmicroFileAtTheRxmicroConfigDir;

        private String rxmicroFileAtTheCurrentDir;

        private String separateFileAtTheHomeDir;

        private String separateFileAtTheRxmicroConfigDir;

        private String separateFileAtTheCurrentDir;

        private String javaSystemProperties;

        private String commandLineArguments;

        public String getDefaultConfigValues() {
            return defaultConfigValues;
        }

        public TestConfig setDefaultConfigValues(final String defaultConfigValues) {
            this.defaultConfigValues = defaultConfigValues;
            return this;
        }

        public String getRxmicroClassPathResource() {
            return rxmicroClassPathResource;
        }

        public TestConfig setRxmicroClassPathResource(final String rxmicroClassPathResource) {
            this.rxmicroClassPathResource = rxmicroClassPathResource;
            return this;
        }

        public String getSeparateClassPathResource() {
            return separateClassPathResource;
        }

        public TestConfig setSeparateClassPathResource(final String separateClassPathResource) {
            this.separateClassPathResource = separateClassPathResource;
            return this;
        }

        public String getEnvironmentVariables() {
            return environmentVariables;
        }

        public TestConfig setEnvironmentVariables(final String environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public String getRxmicroFileAtTheHomeDir() {
            return rxmicroFileAtTheHomeDir;
        }

        public TestConfig setRxmicroFileAtTheHomeDir(final String rxmicroFileAtTheHomeDir) {
            this.rxmicroFileAtTheHomeDir = rxmicroFileAtTheHomeDir;
            return this;
        }

        public String getRxmicroFileAtTheRxmicroConfigDir() {
            return rxmicroFileAtTheRxmicroConfigDir;
        }

        public TestConfig setRxmicroFileAtTheRxmicroConfigDir(final String rxmicroFileAtTheRxmicroConfigDir) {
            this.rxmicroFileAtTheRxmicroConfigDir = rxmicroFileAtTheRxmicroConfigDir;
            return this;
        }

        public String getRxmicroFileAtTheCurrentDir() {
            return rxmicroFileAtTheCurrentDir;
        }

        public TestConfig setRxmicroFileAtTheCurrentDir(final String rxmicroFileAtTheCurrentDir) {
            this.rxmicroFileAtTheCurrentDir = rxmicroFileAtTheCurrentDir;
            return this;
        }

        public String getSeparateFileAtTheHomeDir() {
            return separateFileAtTheHomeDir;
        }

        public TestConfig setSeparateFileAtTheHomeDir(final String separateFileAtTheHomeDir) {
            this.separateFileAtTheHomeDir = separateFileAtTheHomeDir;
            return this;
        }

        public String getSeparateFileAtTheRxmicroConfigDir() {
            return separateFileAtTheRxmicroConfigDir;
        }

        public TestConfig setSeparateFileAtTheRxmicroConfigDir(final String separateFileAtTheRxmicroConfigDir) {
            this.separateFileAtTheRxmicroConfigDir = separateFileAtTheRxmicroConfigDir;
            return this;
        }

        public String getSeparateFileAtTheCurrentDir() {
            return separateFileAtTheCurrentDir;
        }

        public TestConfig setSeparateFileAtTheCurrentDir(final String separateFileAtTheCurrentDir) {
            this.separateFileAtTheCurrentDir = separateFileAtTheCurrentDir;
            return this;
        }

        public String getJavaSystemProperties() {
            return javaSystemProperties;
        }

        public TestConfig setJavaSystemProperties(final String javaSystemProperties) {
            this.javaSystemProperties = javaSystemProperties;
            return this;
        }

        public String getCommandLineArguments() {
            return commandLineArguments;
        }

        public TestConfig setCommandLineArguments(final String commandLineArguments) {
            this.commandLineArguments = commandLineArguments;
            return this;
        }
    }
}