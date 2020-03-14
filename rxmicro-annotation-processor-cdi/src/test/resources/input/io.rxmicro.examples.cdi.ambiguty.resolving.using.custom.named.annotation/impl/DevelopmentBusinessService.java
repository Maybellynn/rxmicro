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

package io.rxmicro.examples.cdi.ambiguty.resolving.using.custom.named.annotation.impl;

import io.rxmicro.examples.cdi.ambiguty.resolving.using.custom.named.annotation.BusinessService;
import io.rxmicro.examples.cdi.ambiguty.resolving.using.custom.named.annotation.EnvironmentType;

// tag::content[]
@EnvironmentType(EnvironmentType.Type.DEVELOPMENT)
public final class DevelopmentBusinessService implements BusinessService {

    @Override
    public String getValue() {
        return "DEVELOPMENT";
    }
}
// end::content[]
