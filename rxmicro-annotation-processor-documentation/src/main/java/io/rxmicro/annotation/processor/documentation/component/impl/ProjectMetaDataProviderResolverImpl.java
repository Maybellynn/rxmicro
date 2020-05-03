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

package io.rxmicro.annotation.processor.documentation.component.impl;

import com.google.inject.Singleton;
import io.rxmicro.annotation.processor.documentation.component.ProjectMetaDataProviderResolver;
import io.rxmicro.annotation.processor.documentation.component.impl.model.MavenPOMProjectMetaDataProvider;
import io.rxmicro.annotation.processor.documentation.model.ProjectMetaDataProvider;
import io.rxmicro.common.RxMicroException;
import org.apache.maven.model.Model;
import org.apache.maven.model.Parent;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;

import javax.tools.FileObject;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.lang.invoke.MethodHandles;
import java.net.URI;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static io.rxmicro.annotation.processor.common.util.InternalLoggers.logThrowableStackTrace;
import static io.rxmicro.annotation.processor.common.util.ProcessingEnvironmentHelper.getFiler;
import static io.rxmicro.annotation.processor.common.util.Stubs.stub;
import static io.rxmicro.annotation.processor.documentation.TestSystemProperties.RX_MICRO_POM_XML_ABSOLUTE_PATH;
import static java.nio.charset.StandardCharsets.UTF_8;
import static javax.tools.StandardLocation.SOURCE_OUTPUT;

/**
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
@Singleton
public final class ProjectMetaDataProviderResolverImpl implements ProjectMetaDataProviderResolver {

    @Override
    public ProjectMetaDataProvider resolve() {
        return Optional.ofNullable(System.getProperty(RX_MICRO_POM_XML_ABSOLUTE_PATH))
                .map(File::new)
                .filter(File::exists)
                .or(this::getPomXmlAbsolutePath)
                .flatMap(this::readMetaDataFromPomXML)
                .orElseGet(() -> stub(ProjectMetaDataProvider.class, MethodHandles.lookup()));
    }

    // TODO It is necessary to find other approach to detect current working directory
    private Optional<File> getPomXmlAbsolutePath() {
        try {
            final FileObject tempResource = getFiler()
                    .createResource(SOURCE_OUTPUT, "", "test.properties");
            try {
                final URI uri = tempResource.toUri();
                File directory;
                try {
                    directory = new File(uri).getParentFile();
                } catch (final IllegalArgumentException e) {
                    // uri is not a file
                    return Optional.empty();
                }
                while (directory != null) {
                    final File pomXml = new File(directory, "pom.xml");
                    if (pomXml.exists()) {
                        return Optional.of(pomXml);
                    }
                    directory = directory.getParentFile();
                }
            } finally {
                tempResource.delete();
            }
        } catch (final IOException e) {
            logThrowableStackTrace(new RxMicroException(e, "Can't detect `pom.xml` location!"));
        }
        return Optional.empty();
    }

    private Optional<ProjectMetaDataProvider> readMetaDataFromPomXML(final File pomXmlPath) {
        try {
            final MavenXpp3Reader reader = new MavenXpp3Reader();
            final List<Model> models = new ArrayList<>();
            File pomXml = pomXmlPath;
            while (true) {
                Model model;
                try (Reader fileReader = Files.newBufferedReader(pomXml.toPath(), UTF_8)) {
                    model = reader.read(fileReader);
                }
                model.setPomFile(pomXmlPath);
                models.add(model);
                final Parent parent = model.getParent();
                if (parent == null) {
                    break;
                }
                pomXml = new File(pomXml.getParentFile(), parent.getRelativePath()).getAbsoluteFile();
                if (!pomXml.exists()) {
                    break;
                }
            }
            return Optional.of(new MavenPOMProjectMetaDataProvider(pomXmlPath.getParentFile().getAbsolutePath(), models));
        } catch (final IOException | XmlPullParserException e) {
            // This case must be interpret as warning
            logThrowableStackTrace(new RxMicroException(e, "Can't read data from `pom.xml`!"));
            return Optional.empty();
        }
    }
}
