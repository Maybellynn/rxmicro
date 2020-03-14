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

package io.rxmicro.rest.server.internal.component.impl.error;

import io.rxmicro.logger.Logger;
import io.rxmicro.logger.LoggerFactory;
import io.rxmicro.rest.model.HttpCallFailedException;
import io.rxmicro.rest.server.detail.component.HttpResponseBuilder;
import io.rxmicro.rest.server.detail.model.HttpResponse;
import io.rxmicro.rest.server.local.component.HttpErrorResponseBodyBuilder;

import static io.rxmicro.common.util.Requires.require;
import static io.rxmicro.http.HttpStatuses.getErrorMessage;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
public final class HttpCallFailedHttpResponseBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(HttpCallFailedHttpResponseBuilder.class);

    private final HttpResponseBuilder httpResponseBuilder;

    private final HttpErrorResponseBodyBuilder httpErrorResponseBodyBuilder;

    private final boolean hideInternalErrorMessage;

    public HttpCallFailedHttpResponseBuilder(final HttpResponseBuilder httpResponseBuilder,
                                             final HttpErrorResponseBodyBuilder httpErrorResponseBodyBuilder,
                                             final boolean hideInternalErrorMessage) {
        this.httpResponseBuilder = require(httpResponseBuilder);
        this.httpErrorResponseBodyBuilder = require(httpErrorResponseBodyBuilder);
        this.hideInternalErrorMessage = hideInternalErrorMessage;
    }

    public HttpResponse build(final HttpCallFailedException e) {
        if (e.isServerErrorCode()) {
            LOGGER.error("Http call failed: ?", e.getMessage());
        }
        if (httpErrorResponseBodyBuilder.isRxMicroError(e)) {
            final HttpResponse response = httpResponseBuilder.build(false);
            return httpErrorResponseBodyBuilder.build(response, e);
        } else {
            final HttpResponse response = httpResponseBuilder.build();
            if (hideInternalErrorMessage && e.isServerErrorCode()) {
                return httpErrorResponseBodyBuilder.build(response, e.getStatusCode(), getErrorMessage(e.getStatusCode()));
            } else {
                return httpErrorResponseBodyBuilder.build(response, e.getStatusCode(), e.getMessage());
            }
        }
    }
}
