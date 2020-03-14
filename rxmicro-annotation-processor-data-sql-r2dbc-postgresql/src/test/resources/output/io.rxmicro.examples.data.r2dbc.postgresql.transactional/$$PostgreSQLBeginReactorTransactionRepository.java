package io.rxmicro.examples.data.r2dbc.postgresql.transactional;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.IsolationLevel;
import io.rxmicro.data.sql.model.reactor.Transaction;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import reactor.core.publisher.Mono;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$PostgreSQLBeginReactorTransactionRepository extends AbstractPostgreSQLRepository implements BeginReactorTransactionRepository {

    private final ConnectionPool pool;

    public $$PostgreSQLBeginReactorTransactionRepository(final ConnectionPool pool) {
        super(BeginReactorTransactionRepository.class);
        this.pool = pool;
    }

    @Override
    public Mono<Transaction> beginTransaction() {
        return pool.create()
                .flatMap(c -> beginReactorTransaction(c));
    }

    @Override
    public Mono<Transaction> beginTransaction(final IsolationLevel isolationLevel) {
        return pool.create()
                .flatMap(c -> beginReactorTransaction(c)
                        .flatMap(t -> t.setIsolationLevel(isolationLevel)
                                .thenReturn(t)
                        )
                );
    }
}
