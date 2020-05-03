package io.rxmicro.examples.data.r2dbc.postgresql.primary.keys;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.primary.keys.model.$$AccountEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.primary.keys.model.$$CompositePrimaryKeyEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.primary.keys.model.$$OrderEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.primary.keys.model.$$ProductEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.primary.keys.model.Account;
import io.rxmicro.examples.data.r2dbc.postgresql.primary.keys.model.CompositePrimaryKey;
import io.rxmicro.examples.data.r2dbc.postgresql.primary.keys.model.Order;
import io.rxmicro.examples.data.r2dbc.postgresql.primary.keys.model.Product;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$PostgreSQLDeleteDataRepository extends AbstractPostgreSQLRepository implements DeleteDataRepository {

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final $$CompositePrimaryKeyEntityToR2DBCSQLDBConverter compositePrimaryKeyEntityToR2DBCSQLDBConverter =
            new $$CompositePrimaryKeyEntityToR2DBCSQLDBConverter();

    private final $$OrderEntityToR2DBCSQLDBConverter orderEntityToR2DBCSQLDBConverter =
            new $$OrderEntityToR2DBCSQLDBConverter();

    private final $$ProductEntityToR2DBCSQLDBConverter productEntityToR2DBCSQLDBConverter =
            new $$ProductEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLDeleteDataRepository(final ConnectionPool pool) {
        super(DeleteDataRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<Void> delete(final Account account) {
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
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Void.class))))
                .toFuture()
                .thenApply(r -> null);
    }

    @Override
    public CompletableFuture<Void> delete(final Order order) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter}'
        final String generatedSQL = "DELETE FROM order WHERE id = $1";
        final Object primaryKey = orderEntityToR2DBCSQLDBConverter.getPrimaryKey(order);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))

                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))

                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Void.class))))
                .toFuture()
                .thenApply(r -> null);
    }

    @Override
    public CompletableFuture<Void> delete(final Product product) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter}'
        final String generatedSQL = "DELETE FROM product WHERE id = $1";
        final Object primaryKey = productEntityToR2DBCSQLDBConverter.getPrimaryKey(product);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))

                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))

                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Void.class))))
                .toFuture()
                .thenApply(r -> null);
    }

    @Override
    public CompletableFuture<Void> delete(final CompositePrimaryKey entity) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter}'
        final String generatedSQL = "DELETE FROM composite_primary_key WHERE id_category = $1 AND id_type = $2 AND id_role = $3";
        final Object[] primaryKeys = compositePrimaryKeyEntityToR2DBCSQLDBConverter.getPrimaryKeys(entity);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKeys)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))

                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))

                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Void.class))))
                .toFuture()
                .thenApply(r -> null);
    }
}
