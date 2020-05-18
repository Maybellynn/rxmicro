package io.rxmicro.examples.data.r2dbc.postgresql.delete;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.delete.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.delete.model.$$AccountEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.delete.model.Account;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.concurrent.CompletableFuture;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$PostgreSQLDataRepository extends AbstractPostgreSQLRepository implements DataRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLDataRepository(final ConnectionPool pool) {
        super(DataRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<Boolean> delete1(final Account account) {
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
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Boolean.class))))
                .map(r -> r > 0)
                .toFuture();
    }

    @Override
    public CompletableFuture<Integer> delete2(final BigDecimal minRequiredBalance) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE balance < ?'
        final String generatedSQL = "DELETE FROM account WHERE balance < $1";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, minRequiredBalance)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Integer.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Account> delete3(final Long id) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter} RETURNING *'
        final String generatedSQL = "DELETE FROM account WHERE id = $1 RETURNING id, email, first_name, last_name, balance, role";
        final Account entity = new Account();
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, id)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityFromR2DBCSQLDBConverter.setIdEmailFirst_nameLast_nameBalanceRole(entity, row, meta))))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Account.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Integer> delete4(final Long id) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter}'
        final String generatedSQL = "DELETE FROM account WHERE id = $1";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, id)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Integer.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<EntityFieldMap> delete5(final Long id) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter} RETURNING *'
        final String generatedSQL = "DELETE FROM account WHERE id = $1 RETURNING id, email, first_name, last_name, balance, role";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, id)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, EntityFieldMap.class))))
                .toFuture();
    }
}
