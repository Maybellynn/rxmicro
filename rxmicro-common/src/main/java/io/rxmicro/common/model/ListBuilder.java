/*
 * Copyright 2019 https://rxmicro.io
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

package io.rxmicro.common.model;

import java.util.ArrayList;
import java.util.List;

import static io.rxmicro.common.util.ExCollections.unmodifiableList;

/**
 * @author nedis
 * @link https://rxmicro.io
 * @since 0.1
 */
public class ListBuilder<E> {

    private final List<E> list = new ArrayList<>();

    private boolean built;

    public ListBuilder<E> add(final E value) {
        if (built) {
            throw new IllegalStateException("This builder can't be used. Create a new one!");
        }
        list.add(value);
        return this;
    }

    public List<E> build() {
        built = true;
        return unmodifiableList(list);
    }
}
