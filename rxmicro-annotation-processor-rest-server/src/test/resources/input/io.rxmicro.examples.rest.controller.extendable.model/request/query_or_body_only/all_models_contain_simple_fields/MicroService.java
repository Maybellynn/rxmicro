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

package io.rxmicro.examples.rest.controller.extendable.model.request.query_or_body_only.all_models_contain_simple_fields;

import io.rxmicro.examples.rest.controller.extendable.model.request.query_or_body_only.all_models_contain_simple_fields.child.Child;
import io.rxmicro.examples.rest.controller.extendable.model.request.query_or_body_only.all_models_contain_simple_fields.parent.Parent;
import io.rxmicro.rest.method.GET;
import io.rxmicro.rest.method.PUT;

public class MicroService {

    @GET("/1")
    @PUT("/1")
    void consume(final Child request) {
        System.out.println(request);
    }

    @GET("/2")
    @PUT("/2")
    void consume(final Parent request) {
        System.out.println(request);
    }
}