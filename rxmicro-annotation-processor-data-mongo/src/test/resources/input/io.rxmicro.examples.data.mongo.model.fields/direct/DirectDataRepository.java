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

package io.rxmicro.examples.data.mongo.model.fields.direct;

import io.rxmicro.data.mongo.MongoRepository;
import io.rxmicro.data.mongo.operation.Delete;
import io.rxmicro.data.mongo.operation.Find;
import io.rxmicro.data.mongo.operation.Insert;
import io.rxmicro.data.mongo.operation.Update;
import io.rxmicro.examples.data.mongo.model.fields.direct.model.Entity;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@MongoRepository(collection = "collection")
public interface DirectDataRepository {

    @Find
    Flux<Entity> find();

    @Insert
    Mono<Void> insert(Entity entity);

    @Update
    Mono<Void> update(Entity entity);

    @Delete
    Mono<Void> delete(ObjectId id);
}
