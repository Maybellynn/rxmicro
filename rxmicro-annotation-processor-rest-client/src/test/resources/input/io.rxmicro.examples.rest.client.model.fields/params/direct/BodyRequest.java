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

package io.rxmicro.examples.rest.client.model.fields.params.direct;

import io.rxmicro.examples.rest.client.model.fields.params.direct.nested.Nested;

import java.util.List;
import java.util.Set;

public final class BodyRequest extends Abstract {

    Nested nested;

    List<Nested> nestedList;

    Set<Nested> nestedSet;
}
