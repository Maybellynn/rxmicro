package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.insert;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$PostgreSQLInsertOneEntityUsingRequiredCompletionStageRepository extends AbstractPostgreSQLRepository implements InsertOneEntityUsingRequiredCompletionStageRepository {

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLInsertOneEntityUsingRequiredCompletionStageRepository(final ConnectionPool pool) {
        super(InsertOneEntityUsingRequiredCompletionStageRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletionStage<Void> insert01(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values})'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2)";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, Void.class))))
                .toFuture()
                .thenApply(r -> null);
    }

    @Override
    public CompletionStage<Integer> insert02(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values})'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2)";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, Integer.class))))
                .toFuture();
    }

    @Override
    public CompletionStage<Boolean> insert03(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values})'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2)";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, Boolean.class))))
                .map(r -> r > 0)
                .toFuture();
    }

    @Override
    public CompletionStage<Account> insert04(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING id";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityToR2DBCSQLDBConverter.setId(account, row, meta))))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, Account.class))))
                .toFuture();
    }

    @Override
    public CompletionStage<EntityFieldMap> insert05(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING id";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, EntityFieldMap.class))))
                .toFuture();
    }

    @Override
    public CompletionStage<EntityFieldList> insert06(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING id";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldList())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, EntityFieldList.class))))
                .toFuture();
    }

    @Override
    public CompletionStage<Account> insert07(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING *'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING id, first_name, last_name";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityToR2DBCSQLDBConverter.setIdFirst_nameLast_name(account, row, meta))))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, Account.class))))
                .toFuture();
    }

    @Override
    public CompletionStage<EntityFieldMap> insert08(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING *'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING id, first_name, last_name";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, EntityFieldMap.class))))
                .toFuture();
    }

    @Override
    public CompletionStage<EntityFieldList> insert09(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING *'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING id, first_name, last_name";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldList())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, EntityFieldList.class))))
                .toFuture();
    }
}
