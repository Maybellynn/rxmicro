package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.delete;

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
public final class $$PostgreSQLDeleteOneEntityUsingRequiredCompletionStageRepository extends AbstractPostgreSQLRepository implements DeleteOneEntityUsingRequiredCompletionStageRepository {

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLDeleteOneEntityUsingRequiredCompletionStageRepository(final ConnectionPool pool) {
        super(DeleteOneEntityUsingRequiredCompletionStageRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletionStage<Void> delete01(final Account account) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter}'
        final String generatedSQL = "DELETE FROM account WHERE id = $1";
        final Object primaryKey = accountEntityToR2DBCSQLDBConverter.getPrimaryKey(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
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
    public CompletionStage<Integer> delete02(final Account account) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter}'
        final String generatedSQL = "DELETE FROM account WHERE id = $1";
        final Object primaryKey = accountEntityToR2DBCSQLDBConverter.getPrimaryKey(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletionStage.class, Integer.class))))
                .toFuture();
    }

    @Override
    public CompletionStage<Boolean> delete03(final Account account) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter}'
        final String generatedSQL = "DELETE FROM account WHERE id = $1";
        final Object primaryKey = accountEntityToR2DBCSQLDBConverter.getPrimaryKey(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
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
    public CompletionStage<Account> delete04(final Account account) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter} RETURNING *'
        final String generatedSQL = "DELETE FROM account WHERE id = $1 RETURNING id, first_name, last_name";
        final Object primaryKey = accountEntityToR2DBCSQLDBConverter.getPrimaryKey(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
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
    public CompletionStage<EntityFieldMap> delete05(final Account account) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter} RETURNING *'
        final String generatedSQL = "DELETE FROM account WHERE id = $1 RETURNING id, first_name, last_name";
        final Object primaryKey = accountEntityToR2DBCSQLDBConverter.getPrimaryKey(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
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
    public CompletionStage<EntityFieldList> delete06(final Account account) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter} RETURNING *'
        final String generatedSQL = "DELETE FROM account WHERE id = $1 RETURNING id, first_name, last_name";
        final Object primaryKey = accountEntityToR2DBCSQLDBConverter.getPrimaryKey(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
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
