package io.rxmicro.examples.data.r2dbc.postgresql.transactional;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.reactor.Transaction;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.transactional.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.transactional.model.$$OrderEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.transactional.model.$$ProductEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.transactional.model.Account;
import io.rxmicro.examples.data.r2dbc.postgresql.transactional.model.Order;
import io.rxmicro.examples.data.r2dbc.postgresql.transactional.model.Product;
import reactor.core.publisher.Mono;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$PostgreSQLTransactionUsageRepository extends AbstractPostgreSQLRepository implements TransactionUsageRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final $$OrderEntityToR2DBCSQLDBConverter orderEntityToR2DBCSQLDBConverter =
            new $$OrderEntityToR2DBCSQLDBConverter();

    private final $$ProductEntityFromR2DBCSQLDBConverter productEntityFromR2DBCSQLDBConverter =
            new $$ProductEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLTransactionUsageRepository(final ConnectionPool pool) {
        super(TransactionUsageRepository.class);
        this.pool = pool;
    }

    @Override
    public Mono<Transaction> beginTransaction() {
        return pool.create()
                .flatMap(c -> beginReactorTransaction(c));
    }

    @Override
    public Mono<Account> findAccount(final Transaction transaction, final long id) {
        // Original SQL statement:  'SELECT * FROM ${table} WHERE id = ? FOR UPDATE'
        final String generatedSQL = "SELECT id, email, first_name, last_name, balance, role FROM account WHERE id = $1 FOR UPDATE";
        return extractConnectionFrom(transaction)
                .flatMap(c -> executeStatement(c, generatedSQL, id)
                        .flatMap(r -> Mono.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB)))
                );
    }

    @Override
    public Mono<Product> findProduct(final Transaction transaction, final long id) {
        // Original SQL statement:  'SELECT * FROM ${table} WHERE id = ? FOR UPDATE'
        final String generatedSQL = "SELECT id, name, price, count FROM product WHERE id = $1 FOR UPDATE";
        return extractConnectionFrom(transaction)
                .flatMap(c -> executeStatement(c, generatedSQL, id)
                        .flatMap(r -> Mono.from(r.map(productEntityFromR2DBCSQLDBConverter::fromDB)))
                );
    }

    @Override
    public Mono<Order> create(final Transaction transaction, final Order order) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO order(id_account, id_product, count) VALUES($1, $2, $3) RETURNING id";
        final Object[] insertParams = orderEntityToR2DBCSQLDBConverter.getInsertParams(order);
        return extractConnectionFrom(transaction)
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> orderEntityToR2DBCSQLDBConverter.setId(order, row, meta))))
                );
    }

    @Override
    public Mono<Boolean> update(final Transaction transaction, final Order order) {
        // Original SQL statement:  'UPDATE ${table} SET ${updated-columns} WHERE ${by-id-filter}'
        final String generatedSQL = "UPDATE order SET id_account = $1, id_product = $2, count = $3, created = $4 WHERE id = $5";
        final Object[] updateParams = orderEntityToR2DBCSQLDBConverter.getUpdateParams(order);
        return extractConnectionFrom(transaction)
                .flatMap(c -> executeStatement(c, generatedSQL, updateParams)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                )
                .map(r -> r > 0);
    }

    @Override
    public Mono<Boolean> delete(final Transaction transaction, final Order order) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE ${by-id-filter}'
        final String generatedSQL = "DELETE FROM order WHERE id = $1";
        final Object primaryKey = orderEntityToR2DBCSQLDBConverter.getPrimaryKey(order);
        return extractConnectionFrom(transaction)
                .flatMap(c -> executeStatement(c, generatedSQL, primaryKey)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                )
                .map(r -> r > 0);
    }
}
