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

package io.rxmicro.data.detail.adapter;

import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * @author nedis
 * @link http://rxmicro.io
 * @since 0.1
 */
public class PublisherToOptionalMonoFutureAdapter<T> extends CompletableFuture<Optional<T>> {

    private Subscription subscription;

    private T value;

    public PublisherToOptionalMonoFutureAdapter(final Publisher<T> publisher) {
        publisher.subscribe(new Subscriber<>() {
            @Override
            public void onSubscribe(final Subscription s) {
                subscription = s;
                s.request(1);
            }

            @Override
            public void onNext(final T t) {
                subscription.cancel();
                value = t;
                onComplete();
            }

            @Override
            public void onError(final Throwable t) {
                completeExceptionally(t);
            }

            @Override
            public void onComplete() {
                complete(Optional.ofNullable(value));
            }
        });
    }
}
