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

package io.rxmicro.data.sql.r2dbc;

/**
 * This is special interface, which is used to define a root package for the current module.
 *
 * <p>
 * This feature is a workaround and used by {@code RxMicro Annotation Processor} for projects which don't use
 * <a href="https://www.oracle.com/corporate/features/understanding-java-9-modules.html">JPMS</a>.
 *
 * @author nedis
 * @since 0.2
 */
@SuppressWarnings("unused")
public interface RootPackage {
}
