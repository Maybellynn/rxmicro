package io.rxmicro.examples.data.r2dbc.postgresql.select.parameters;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.Pageable;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.select.parameters.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.select.parameters.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$PostgreSQLSelectLimitedDataRepository extends AbstractPostgreSQLRepository implements SelectLimitedDataRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLSelectLimitedDataRepository(final ConnectionPool pool) {
        super(SelectLimitedDataRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<List<Account>> findFirst2Accounts() {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id LIMIT 2'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id LIMIT 2";
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
    public CompletableFuture<List<Account>> findAccounts(final int limit) {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id LIMIT ?'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id LIMIT $1";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, limit)
                        .flatMap(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB))
                                .collectList())
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture();
    }

    @Override
    public CompletableFuture<List<Account>> findAccounts(final int limit, final int offset) {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id LIMIT ? OFFSET ?'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id LIMIT $1 OFFSET $2";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, limit, offset)
                        .flatMap(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB))
                                .collectList())
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture();
    }

    @Override
    public CompletableFuture<List<Account>> findAccounts(final Pageable pageable) {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY id LIMIT ? OFFSET ?'
        final String generatedSQL = "SELECT first_name, last_name FROM account ORDER BY id LIMIT $1 OFFSET $2";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, pageable.getLimit(), pageable.getOffset())
                        .flatMap(r -> Flux.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB))
                                .collectList())
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture();
    }
}
