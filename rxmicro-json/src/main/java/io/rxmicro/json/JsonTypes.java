/*
 * Copyright (c) 2020 https://rxmicro.io
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

package io.rxmicro.json;

import java.util.List;
import java.util.Map;

/**
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
@SuppressWarnings("unchecked")
public final class JsonTypes {

    public static final String STRING = "string";

    public static final String NUMBER = "number";

    public static final String BOOLEAN = "boolean";

    public static final String OBJECT = "object";

    public static final String ARRAY = "array";

    public static boolean isJsonObject(final Object object) {
        return object instanceof Map;
    }

    public static Map<String, Object> asJsonObject(final Object object) {
        try {
            return (Map<String, Object>) object;
        } catch (final ClassCastException e) {
            throw new JsonException("Not a json object: " + object);
        }
    }

    public static boolean isJsonArray(final Object object) {
        return object instanceof List;
    }

    public static List<Object> asJsonArray(final Object object) {
        try {
            return (List<Object>) object;
        } catch (final ClassCastException e) {
            throw new JsonException("Not a json array: " + object);
        }
    }

    public static boolean isJsonString(final Object object) {
        return object instanceof String;
    }

    public static String asJsonString(final Object object) {
        try {
            return (String) object;
        } catch (final ClassCastException e) {
            throw new JsonException("Not a json string: " + object);
        }
    }

    public static boolean isJsonNumber(final Object object) {
        return object instanceof JsonNumber;
    }

    public static JsonNumber asJsonNumber(final Object object) {
        try {
            return (JsonNumber) object;
        } catch (final ClassCastException e) {
            throw new JsonException("Not a json number: " + object);
        }
    }

    public static boolean isJsonBoolean(final Object object) {
        return object instanceof Boolean;
    }

    public static Boolean asJsonBoolean(final Object object) {
        try {
            return (Boolean) object;
        } catch (final ClassCastException e) {
            throw new JsonException("Not a json boolean: " + object);
        }
    }

    private JsonTypes() {
    }
}
