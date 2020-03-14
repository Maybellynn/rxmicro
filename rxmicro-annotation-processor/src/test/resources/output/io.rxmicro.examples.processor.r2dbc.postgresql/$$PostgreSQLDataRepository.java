package io.rxmicro.examples.processor.r2dbc.postgresql;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$PostgreSQLDataRepository extends AbstractPostgreSQLRepository implements DataRepository {

    private final ConnectionPool pool;

    public $$PostgreSQLDataRepository(final ConnectionPool pool) {
        super(DataRepository.class);
        this.pool = pool;
    }
}
