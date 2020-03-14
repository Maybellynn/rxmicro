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

package io.rxmicro.examples.documentation.asciidoctor.full.model;

import io.rxmicro.documentation.Description;
import io.rxmicro.http.error.HttpErrorException;

@Description("This error response indicates that the API " +
        "is not able to generate any of the client's preferred media types, " +
        "as indicated by the Accept request header.")
public final class NotAcceptableException extends HttpErrorException {

    public static final int STATUS_CODE = 406;

    public NotAcceptableException(final String message) {
        super(STATUS_CODE, message);
    }
}
