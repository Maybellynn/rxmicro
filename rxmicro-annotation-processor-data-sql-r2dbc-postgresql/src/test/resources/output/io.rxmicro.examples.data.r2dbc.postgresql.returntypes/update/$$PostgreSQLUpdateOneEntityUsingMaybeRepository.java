package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.update;

import io.r2dbc.pool.ConnectionPool;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import reactor.core.publisher.Mono;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$PostgreSQLUpdateOneEntityUsingMaybeRepository extends AbstractPostgreSQLRepository implements UpdateOneEntityUsingMaybeRepository {

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLUpdateOneEntityUsingMaybeRepository(final ConnectionPool pool) {
        super(UpdateOneEntityUsingMaybeRepository.class);
        this.pool = pool;
    }

    @Override
    public Maybe<Account> update01(final Account account) {
        // Original SQL statement:  'UPDATE ${table} SET ${updated-columns} WHERE ${by-id-filter} RETURNING *'
        final String generatedSQL = "UPDATE account SET first_name = $1, last_name = $2 WHERE id = $3 RETURNING id, first_name, last_name";
        final Object[] updateParams = accountEntityToR2DBCSQLDBConverter.getUpdateParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, updateParams)
                                .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityToR2DBCSQLDBConverter.setIdFirst_nameLast_name(account, row, meta))))
                                .switchIfEmpty(close(c)
                                        .then(Mono.empty()))
                                .delayUntil(s -> close(c))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                        )
        ).firstElement();
    }

    @Override
    public Maybe<EntityFieldMap> update02(final Account account) {
        // Original SQL statement:  'UPDATE ${table} SET ${updated-columns} WHERE ${by-id-filter} RETURNING *'
        final String generatedSQL = "UPDATE account SET first_name = $1, last_name = $2 WHERE id = $3 RETURNING id, first_name, last_name";
        final Object[] updateParams = accountEntityToR2DBCSQLDBConverter.getUpdateParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, updateParams)
                                .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
                                .switchIfEmpty(close(c)
                                        .then(Mono.empty()))
                                .delayUntil(s -> close(c))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                        )
        ).firstElement();
    }

    @Override
    public Maybe<EntityFieldList> update03(final Account account) {
        // Original SQL statement:  'UPDATE ${table} SET ${updated-columns} WHERE ${by-id-filter} RETURNING *'
        final String generatedSQL = "UPDATE account SET first_name = $1, last_name = $2 WHERE id = $3 RETURNING id, first_name, last_name";
        final Object[] updateParams = accountEntityToR2DBCSQLDBConverter.getUpdateParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, updateParams)
                                .flatMap(r -> Mono.from(r.map(toEntityFieldList())))
                                .switchIfEmpty(close(c)
                                        .then(Mono.empty()))
                                .delayUntil(s -> close(c))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                        )
        ).firstElement();
    }
}
