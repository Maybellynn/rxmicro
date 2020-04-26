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

package org.slf4j;

import java.io.Serializable;
import java.util.Iterator;

/**
 * Unfortunately some db drivers removed support of JUL,
 * so the RxMicro framework requires a org.slf4j proxy to enable logging without slf4j-api
 *
 * Read more: https://github.com/mongodb/mongo-java-driver/commit/6a163f715fe08ed8d39acac3d11c896ae547df73
 *
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.3
 */
public interface Marker extends Serializable {

    String ANY_MARKER = "*";

    String ANY_NON_NULL_MARKER = "+";

    String getName();

    void add(Marker reference);

    boolean remove(Marker reference);

    boolean hasChildren();

    boolean hasReferences();

    Iterator<Marker> iterator();

    boolean contains(Marker other);

    boolean contains(String name);

    int hashCode();

    boolean equals(Object o);
}