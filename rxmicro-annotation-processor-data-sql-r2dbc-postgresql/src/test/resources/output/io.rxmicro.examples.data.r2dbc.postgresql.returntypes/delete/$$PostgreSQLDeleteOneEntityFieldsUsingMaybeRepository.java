package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.delete;

import io.r2dbc.pool.ConnectionPool;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import reactor.core.publisher.Mono;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$PostgreSQLDeleteOneEntityFieldsUsingMaybeRepository extends AbstractPostgreSQLRepository implements DeleteOneEntityFieldsUsingMaybeRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLDeleteOneEntityFieldsUsingMaybeRepository(final ConnectionPool pool) {
        super(DeleteOneEntityFieldsUsingMaybeRepository.class);
        this.pool = pool;
    }

    @Override
    public Maybe<Account> delete01(final Long id) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE id = ? RETURNING *'
        final String generatedSQL = "DELETE FROM account WHERE id = $1 RETURNING id, first_name, last_name";
        final Account entity = new Account();
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, id)
                                .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityFromR2DBCSQLDBConverter.setIdFirst_nameLast_name(entity, row, meta))))
                                .switchIfEmpty(close(c)
                                        .then(Mono.empty()))
                                .delayUntil(s -> close(c))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                        )
        ).firstElement();
    }

    @Override
    public Maybe<EntityFieldMap> delete02(final Long id) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE id = ? RETURNING first_name, last_name'
        final String generatedSQL = "DELETE FROM account WHERE id = $1 RETURNING first_name, last_name";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, id)
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
    public Maybe<EntityFieldList> delete03(final Long id) {
        // Original SQL statement:  'DELETE FROM ${table} WHERE id = ? RETURNING first_name, last_name'
        final String generatedSQL = "DELETE FROM account WHERE id = $1 RETURNING first_name, last_name";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, id)
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
