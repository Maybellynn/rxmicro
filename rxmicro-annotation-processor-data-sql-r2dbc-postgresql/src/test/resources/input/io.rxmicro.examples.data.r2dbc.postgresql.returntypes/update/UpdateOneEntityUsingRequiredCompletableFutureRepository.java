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

package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.update;

import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.operation.Update;
import io.rxmicro.data.sql.r2dbc.postgresql.PostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;

import java.util.concurrent.CompletableFuture;

@PostgreSQLRepository
public interface UpdateOneEntityUsingRequiredCompletableFutureRepository {

    @Update
    CompletableFuture<Void> update01(Account account);

    @Update
    CompletableFuture<Integer> update02(Account account);

    @Update
    CompletableFuture<Boolean> update03(Account account);

    @Update("UPDATE ${table} SET ${updated-columns} WHERE ${by-id-filter} RETURNING *")
    CompletableFuture<Account> update04(Account account);

    @Update("UPDATE ${table} SET ${updated-columns} WHERE ${by-id-filter} RETURNING *")
    CompletableFuture<EntityFieldMap> update05(Account account);

    @Update("UPDATE ${table} SET ${updated-columns} WHERE ${by-id-filter} RETURNING *")
    CompletableFuture<EntityFieldList> update06(Account account);
}
