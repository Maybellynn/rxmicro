package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.insert;

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
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$PostgreSQLInsertOneEntityUsingMaybeRepository extends AbstractPostgreSQLRepository implements InsertOneEntityUsingMaybeRepository {

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLInsertOneEntityUsingMaybeRepository(final ConnectionPool pool) {
        super(InsertOneEntityUsingMaybeRepository.class);
        this.pool = pool;
    }

    @Override
    public Maybe<Account> insert01(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) ON CONFLICT DO NOTHING RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) ON CONFLICT DO NOTHING RETURNING id";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                                .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityToR2DBCSQLDBConverter.setId(account, row, meta))))
                                .switchIfEmpty(close(c)
                                        .then(Mono.empty()))
                                .delayUntil(s -> close(c))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                        )
        ).firstElement();
    }

    @Override
    public Maybe<EntityFieldMap> insert02(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) ON CONFLICT DO NOTHING RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) ON CONFLICT DO NOTHING RETURNING id";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
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
    public Maybe<EntityFieldList> insert03(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) ON CONFLICT DO NOTHING RETURNING ${id-columns}'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) ON CONFLICT DO NOTHING RETURNING id";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                                .flatMap(r -> Mono.from(r.map(toEntityFieldList())))
                                .switchIfEmpty(close(c)
                                        .then(Mono.empty()))
                                .delayUntil(s -> close(c))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                        )
        ).firstElement();
    }

    @Override
    public Maybe<Account> insert04(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) ON CONFLICT DO NOTHING RETURNING *'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) ON CONFLICT DO NOTHING RETURNING id, first_name, last_name";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
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
    public Maybe<EntityFieldMap> insert05(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) ON CONFLICT DO NOTHING RETURNING *'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) ON CONFLICT DO NOTHING RETURNING id, first_name, last_name";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
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
    public Maybe<EntityFieldList> insert06(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values}) ON CONFLICT DO NOTHING RETURNING *'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) ON CONFLICT DO NOTHING RETURNING id, first_name, last_name";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return Flowable.fromPublisher(
                pool.create()
                        .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
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
