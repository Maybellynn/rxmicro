package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.select;

import io.r2dbc.pool.ConnectionPool;
import io.reactivex.rxjava3.core.Flowable;
import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Role;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;

import static io.rxmicro.data.sql.detail.Converters.toEnum;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$PostgreSQLSelectManyUsingFlowableRepository extends AbstractPostgreSQLRepository implements SelectManyUsingFlowableRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLSelectManyUsingFlowableRepository(final ConnectionPool pool) {
        super(SelectManyUsingFlowableRepository.class);
        this.pool = pool;
    }

    @Override
    public Flowable<Account> findAll01() {
        // Original SQL statement:  'SELECT first_name, last_name FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDBFirst_nameLast_name)))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        );
    }

    @Override
    public Flowable<EntityFieldMap> findAll02() {
        // Original SQL statement:  'SELECT first_name, last_name FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map(toEntityFieldMap())))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        );
    }

    @Override
    public Flowable<EntityFieldList> findAll03() {
        // Original SQL statement:  'SELECT first_name, last_name FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map(toEntityFieldList())))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        );
    }

    @Override
    public Flowable<String> findAll04() {
        // Original SQL statement:  'SELECT email FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT email FROM account ORDER BY id";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map((row, meta) -> row.get(0, String.class))))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        );
    }

    @Override
    public Flowable<Role> findAll05() {
        // Original SQL statement:  'SELECT DISTINCT role::text FROM ${table} ORDER BY role'
        final String generatedSQL = "SELECT DISTINCT role::text FROM account ORDER BY role";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map((row, meta) -> toEnum(Role.class, row.get(0, String.class)))))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        );
    }

    @Override
    public Flowable<BigDecimal> findAll06() {
        // Original SQL statement:  'SELECT DISTINCT balance FROM ${table}'
        final String generatedSQL = "SELECT DISTINCT balance FROM account";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map((row, meta) -> row.get(0, BigDecimal.class))))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        );
    }
}
