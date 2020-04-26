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

package io.rxmicro.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
public final class ClasspathResources {

    public static List<String> readLines(final String classPathResource) {
        try {
            final InputStream in = ClasspathResources.class.getClassLoader().getResourceAsStream(classPathResource);
            if (in == null) {
                return List.of();
            } else {
                return readLines(in);
            }
        } catch (final IOException e) {
            throw new ResourceException(e, "Can't read from classpath resource: ?", classPathResource);
        }
    }

    private static List<String> readLines(final InputStream in) throws IOException {
        try (final BufferedReader br = new BufferedReader(new InputStreamReader(in, UTF_8))) {
            final List<String> lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        }
    }

    private ClasspathResources() {
    }
}
