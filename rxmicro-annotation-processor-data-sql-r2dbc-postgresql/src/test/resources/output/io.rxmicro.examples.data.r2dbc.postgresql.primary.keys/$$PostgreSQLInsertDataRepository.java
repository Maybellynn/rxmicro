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
 */
public final class $$PostgreSQLInsertDataRepository extends AbstractPostgreSQLRepository implements InsertDataRepository {

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final $$CompositePrimaryKeyEntityToR2DBCSQLDBConverter compositePrimaryKeyEntityToR2DBCSQLDBConverter =
            new $$CompositePrimaryKeyEntityToR2DBCSQLDBConverter();

    private final $$OrderEntityToR2DBCSQLDBConverter orderEntityToR2DBCSQLDBConverter =
            new $$OrderEntityToR2DBCSQLDBConverter();

    private final $$ProductEntityToR2DBCSQLDBConverter productEntityToR2DBCSQLDBConverter =
            new $$ProductEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLInsertDataRepository(final ConnectionPool pool) {
        super(InsertDataRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<Account> insert(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO account(id, email, first_name, last_name, balance, role) VALUES(nextval('account_seq'), $1, $2, $3, $4, $5) RETURNING id";
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
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Account.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Order> insert(final Order order) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO order(id_account, id_product, count) VALUES($1, $2, $3) RETURNING id";
        final Object[] insertParams = orderEntityToR2DBCSQLDBConverter.getInsertParams(order);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> orderEntityToR2DBCSQLDBConverter.setId(order, row, meta))))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Order.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Void> insert(final Product product) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values})'
        final String generatedSQL = "INSERT INTO product(id, name, price, count) VALUES($1, $2, $3, $4)";
        final Object[] insertParams = productEntityToR2DBCSQLDBConverter.getInsertParams(product);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
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
    public CompletableFuture<Void> insert(final CompositePrimaryKey entity) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values})'
        final String generatedSQL = "INSERT INTO composite_primary_key(id_category, id_type, id_role) VALUES($1, $2, $3)";
        final Object[] insertParams = compositePrimaryKeyEntityToR2DBCSQLDBConverter.getInsertParams(entity);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
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
