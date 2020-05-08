package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.delete;

import io.r2dbc.pool.ConnectionPool;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$PostgreSQLDeleteManyUsingSingleListRepository extends AbstractPostgreSQLRepository implements DeleteManyUsingSingleListRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLDeleteManyUsingSingleListRepository(final ConnectionPool pool) {
        super(DeleteManyUsingSingleListRepository.class);
        this.pool = pool;
    }

    @Override
    public Single<List<Account>> deleteAll01() {
        // Original SQL statement:  'DELETE FROM ${table} RETURNING *'
        final String generatedSQL = "DELETE FROM account RETURNING id, first_name, last_name";
        final Account entity = new Account();
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map((row, meta) -> accountEntityFromR2DBCSQLDBConverter.setIdFirst_nameLast_name(entity, row, meta))))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        ).collect(ArrayList::new, (l, e) -> l.add(e));
    }

    @Override
    public Single<List<EntityFieldMap>> deleteAll02() {
        // Original SQL statement:  'DELETE FROM ${table} RETURNING first_name, last_name'
        final String generatedSQL = "DELETE FROM account RETURNING first_name, last_name";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map(toEntityFieldMap())))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        ).collect(ArrayList::new, (l, e) -> l.add(e));
    }

    @Override
    public Single<List<EntityFieldList>> deleteAll03() {
        // Original SQL statement:  'DELETE FROM ${table} RETURNING first_name, last_name'
        final String generatedSQL = "DELETE FROM account RETURNING first_name, last_name";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map(toEntityFieldList())))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        ).collect(ArrayList::new, (l, e) -> l.add(e));
    }
}
