package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.insert;

import io.r2dbc.pool.ConnectionPool;
import io.reactivex.rxjava3.core.Completable;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import reactor.core.publisher.Mono;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$PostgreSQLInsertOneEntityUsingCompletableRepository extends AbstractPostgreSQLRepository implements InsertOneEntityUsingCompletableRepository {

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLInsertOneEntityUsingCompletableRepository(final ConnectionPool pool) {
        super(InsertOneEntityUsingCompletableRepository.class);
        this.pool = pool;
    }

    @Override
    public Completable insert01(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values})'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2)";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return Completable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                                .flatMap(r -> Mono.from(r.getRowsUpdated()))

                                .delayUntil(s -> close(c))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))

                        )
        );
    }
}
