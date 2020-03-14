/*
 * Copyright 2019 http://rxmicro.io
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

package io.rxmicro.http;

import io.rxmicro.http.internal.HttpHeadersImpl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static java.util.Map.entry;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
public interface HttpHeaders {

    String ACCEPT = "Accept";

    String ACCEPT_CHARSET = "Accept-Charset";

    String ACCEPT_ENCODING = "Accept-Encoding";

    String ACCEPT_LANGUAGE = "Accept-Language";

    String ACCEPT_RANGES = "Accept-Ranges";

    String ACCEPT_PATCH = "Accept-Patch";

    String ACCESS_CONTROL_ALLOW_CREDENTIALS = "Access-Control-Allow-Credentials";

    String ACCESS_CONTROL_ALLOW_HEADERS = "Access-Control-Allow-Headers";

    String ACCESS_CONTROL_ALLOW_METHODS = "Access-Control-Allow-Methods";

    String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";

    String ACCESS_CONTROL_EXPOSE_HEADERS = "Access-Control-Expose-Headers";

    String ACCESS_CONTROL_MAX_AGE = "Access-Control-Max-Age";

    String ACCESS_CONTROL_REQUEST_HEADERS = "Access-Control-Request-Headers";

    String ACCESS_CONTROL_REQUEST_METHOD = "Access-Control-Request-Method";

    String AGE = "Age";

    String ALLOW = "Allow";

    String AUTHORIZATION = "Authorization";

    String CACHE_CONTROL = "Cache-Control";

    String CONNECTION = "Connection";

    String CONTENT_BASE = "Content-Base";

    String CONTENT_ENCODING = "Content-Encoding";

    String CONTENT_LANGUAGE = "Content-Language";

    String CONTENT_LENGTH = "Content-Length";

    String CONTENT_LOCATION = "Content-Location";

    String CONTENT_TRANSFER_ENCODING = "Content-Transfer-Encoding";

    String CONTENT_MD5 = "Content-MD5";

    String CONTENT_RANGE = "Content-Range";

    String CONTENT_TYPE = "Content-Type";

    String COOKIE = "Cookie";

    String DATE = "Date";

    String ETAG = "ETag";

    String EXPECT = "Expect";

    String EXPIRES = "Expires";

    String FROM = "From";

    String HOST = "Host";

    String IF_MATCH = "If-Match";

    String IF_MODIFIED_SINCE = "If-Modified-Since";

    String IF_NONE_MATCH = "If-None-Match";

    String IF_RANGE = "If-Range";

    String IF_UNMODIFIED_SINCE = "If-Unmodified-Since";

    String LAST_MODIFIED = "Last-Modified";

    String LOCATION = "Location";

    String MAX_FORWARDS = "Max-Forwards";

    String ORIGIN = "Origin";

    String PRAGMA = "Pragma";

    String PROXY_AUTHENTICATE = "Proxy-Authenticate";

    String PROXY_AUTHORIZATION = "Proxy-Authorization";

    String RANGE = "Range";

    String REFERER = "Referer";

    String RETRY_AFTER = "Retry-After";

    String SEC_WEBSOCKET_KEY1 = "Sec-WebSocket-Key1";

    String SEC_WEBSOCKET_KEY2 = "Sec-WebSocket-Key2";

    String SEC_WEBSOCKET_LOCATION = "Sec-WebSocket-Location";

    String SEC_WEBSOCKET_ORIGIN = "Sec-WebSocket-Origin";

    String SEC_WEBSOCKET_PROTOCOL = "Sec-WebSocket-Protocol";

    String SEC_WEBSOCKET_VERSION = "Sec-WebSocket-Version";

    String SEC_WEBSOCKET_KEY = "Sec-WebSocket-Key";

    String SEC_WEBSOCKET_ACCEPT = "Sec-WebSocket-Accept";

    String SERVER = "Server";

    String SET_COOKIE = "Set-Cookie";

    String SET_COOKIE2 = "Set-Cookie2";

    String TE = "TE";

    String TRAILER = "Trailer";

    String TRANSFER_ENCODING = "Transfer-Encoding";

    String UPGRADE = "Upgrade";

    String USER_AGENT = "User-Agent";

    String VARY = "Vary";

    String VIA = "Via";

    String WARNING = "Warning";

    String WEBSOCKET_LOCATION = "WebSocket-Location";

    String WEBSOCKET_ORIGIN = "WebSocket-Origin";

    String WEBSOCKET_PROTOCOL = "WebSocket-Protocol";

    String WWW_AUTHENTICATE = "WWW-Authenticate";

    // -------------------- Custom --------------------

    /**
     * Pseudo HTTP header.
     * If HTTP request contains "Request-Id", then all methods return header value,
     * otherwise all methods return request id, which was generated by RxMicro automatically
     */
    String REQUEST_ID = "Request-Id";

    /**
     * Default HTTP header name, which is used to detect API version
     * using io.rxmicro.rest.Version.Strategy.HEADER strategy
     */
    String API_VERSION = "Api-Version";

    HttpHeaders EMPTY_HEADERS = new HttpHeadersImpl(List.of());

    static HttpHeaders of() {
        return EMPTY_HEADERS;
    }

    static HttpHeaders of(final String name, final Object value) {
        return of(
                entry(name, value)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2) {
        return of(
                entry(name1, value1), entry(name2, value2)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2,
                          final String name3, final Object value3) {
        return of(
                entry(name1, value1), entry(name2, value2), entry(name3, value3)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2,
                          final String name3, final Object value3, final String name4, final Object value4) {
        return of(
                entry(name1, value1), entry(name2, value2), entry(name3, value3), entry(name4, value4)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2,
                          final String name3, final Object value3, final String name4, final Object value4,
                          final String name5, final Object value5) {
        return of(
                entry(name1, value1), entry(name2, value2), entry(name3, value3), entry(name4, value4), entry(name5, value5)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2,
                          final String name3, final Object value3, final String name4, final Object value4,
                          final String name5, final Object value5, final String name6, final Object value6) {
        return of(
                entry(name1, value1), entry(name2, value2), entry(name3, value3),
                entry(name4, value4), entry(name5, value5), entry(name6, value6)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2,
                          final String name3, final Object value3, final String name4, final Object value4,
                          final String name5, final Object value5, final String name6, final Object value6,
                          final String name7, final Object value7) {
        return of(
                entry(name1, value1), entry(name2, value2), entry(name3, value3), entry(name4, value4),
                entry(name5, value5), entry(name6, value6), entry(name7, value7)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2,
                          final String name3, final Object value3, final String name4, final Object value4,
                          final String name5, final Object value5, final String name6, final Object value6,
                          final String name7, final Object value7, final String name8, final Object value8) {
        return of(
                entry(name1, value1), entry(name2, value2), entry(name3, value3), entry(name4, value4),
                entry(name5, value5), entry(name6, value6), entry(name7, value7), entry(name8, value8)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2,
                          final String name3, final Object value3, final String name4, final Object value4,
                          final String name5, final Object value5, final String name6, final Object value6,
                          final String name7, final Object value7, final String name8, final Object value8,
                          final String name9, final Object value9) {
        return of(
                entry(name1, value1), entry(name2, value2), entry(name3, value3), entry(name4, value4), entry(name5, value5),
                entry(name6, value6), entry(name7, value7), entry(name8, value8), entry(name9, value9)
        );
    }

    static HttpHeaders of(final String name1, final Object value1, final String name2, final Object value2,
                          final String name3, final Object value3, final String name4, final Object value4,
                          final String name5, final Object value5, final String name6, final Object value6,
                          final String name7, final Object value7, final String name8, final Object value8,
                          final String name9, final Object value9, final String name10, final Object value10) {
        return of(
                entry(name1, value1), entry(name2, value2), entry(name3, value3), entry(name4, value4), entry(name5, value5),
                entry(name6, value6), entry(name7, value7), entry(name8, value8), entry(name9, value9), entry(name10, value10)
        );
    }

    @SafeVarargs
    static HttpHeaders of(final Map.Entry<String, Object>... entries) {
        return new HttpHeadersImpl(Arrays.asList(entries));
    }

    static HttpHeaders of(final Collection<Map.Entry<String, Object>> entries) {
        return new HttpHeadersImpl(entries);
    }

    String getValue(String name);

    List<String> getValues(String name);

    boolean contains(String name);

    List<Map.Entry<String, String>> getEntries();

    int size();

    boolean isNotEmpty();
}
