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

package io.rxmicro.test;

import io.rxmicro.test.internal.TestedProcessProxy;

import java.io.File;
import java.io.IOException;

import static io.rxmicro.common.util.Requires.require;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.3
 */
public final class TestedProcessBuilder {

    private String[] commandWithArgs;

    private File workingDir;

    private boolean withProcessOutputCatcher = true;

    public TestedProcessBuilder setCommandWithArgs(final String... commandWithArgs) {
        this.commandWithArgs = require(commandWithArgs);
        return this;
    }

    public TestedProcessBuilder setWorkingDir(final File workingDir) {
        this.workingDir = require(workingDir);
        return this;
    }

    public TestedProcessBuilder setWithProcessOutputCatcher(final boolean withProcessOutputCatcher) {
        this.withProcessOutputCatcher = withProcessOutputCatcher;
        return this;
    }

    public Process build() throws IOException {
        if (withProcessOutputCatcher) {
            return new TestedProcessProxy(new ProcessBuilder(commandWithArgs)
                    .directory(workingDir)
                    .redirectErrorStream(true)
                    .start());
        } else {
            return new ProcessBuilder(commandWithArgs)
                    .directory(workingDir)
                    .start();
        }
    }
}