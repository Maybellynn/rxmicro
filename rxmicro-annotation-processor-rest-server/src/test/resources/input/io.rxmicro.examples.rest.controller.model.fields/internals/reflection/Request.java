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

package io.rxmicro.examples.rest.controller.model.fields.internals.reflection;

import io.rxmicro.rest.RemoteAddress;
import io.rxmicro.rest.RequestBody;
import io.rxmicro.rest.RequestId;
import io.rxmicro.rest.RequestMethod;
import io.rxmicro.rest.RequestUrlPath;
import io.rxmicro.rest.server.detail.model.HttpRequest;

import java.net.SocketAddress;

public final class Request extends Abstract {

    private HttpRequest request;

    private SocketAddress remoteAddress1;

    @RemoteAddress
    private String remoteAddress2;

    @RequestUrlPath
    private String urlPath;

    @RequestMethod
    private String method;

    @RequestBody
    private byte[] body;

    @RequestId
    private String id;

}
