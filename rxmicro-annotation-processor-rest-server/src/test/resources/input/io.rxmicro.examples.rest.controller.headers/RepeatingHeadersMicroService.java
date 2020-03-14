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

package io.rxmicro.examples.rest.controller.headers;

import io.rxmicro.examples.rest.controller.headers.model.RepeatingHeadersResponse;
import io.rxmicro.rest.method.GET;

import java.util.concurrent.CompletableFuture;

import static java.util.concurrent.CompletableFuture.completedFuture;

// tag::content[]
final class RepeatingHeadersMicroService {

    @GET("/")
    CompletableFuture<RepeatingHeadersResponse> get() {
        return completedFuture(new RepeatingHeadersResponse());
    }
}
// end::content[]
