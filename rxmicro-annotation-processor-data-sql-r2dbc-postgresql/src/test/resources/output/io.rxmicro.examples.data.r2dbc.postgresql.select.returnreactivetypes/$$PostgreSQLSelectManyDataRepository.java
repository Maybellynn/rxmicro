package io.rxmicro.examples.data.r2dbc.postgresql.select.returnreactivetypes;

import io.r2dbc.pool.ConnectionPool;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.select.returnreactivetypes.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.select.returnreactivetypes.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$PostgreSQLSelectManyDataRepository extends AbstractPostgreSQLRepository implements SelectManyDataRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLSelectManyDataRepository(final ConnectionPool pool) {
        super(SelectManyDataRepository.class);
        this.pool = pool;
    }

    @Override
    public Mono<List<Account>> findAll1() {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB))
                                .collectList())
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                );
    }

    @Override
    public Flux<Account> findAll2() {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return pool.create()
                .flatMapMany(c -> executeStatement(c, generatedSQL)
                        .flatMapMany(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB)))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        .concatWith(close(c)
                                .then(Mono.empty()))
                );
    }

    @Override
    public CompletableFuture<List<Account>> findAll3() {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB))
                                .collectList())
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture();
    }

    @Override
    public CompletionStage<List<Account>> findAll4() {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB))
                                .collectList())
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture();
    }

    @Override
    public Single<List<Account>> findAll5() {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB)))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        ).collect(ArrayList::new, (l, e) -> l.add(e));
    }

    @Override
    public Flowable<Account> findAll6() {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id";
        return Flowable.fromPublisher(
                pool.create()
                        .flatMapMany(c -> executeStatement(c, generatedSQL)
                                .flatMapMany(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB)))
                                .onErrorResume(e -> close(c)
                                        .then(Mono.error(e)))
                                .concatWith(close(c)
                                        .then(Mono.empty()))
                        )
        );
    }
}
