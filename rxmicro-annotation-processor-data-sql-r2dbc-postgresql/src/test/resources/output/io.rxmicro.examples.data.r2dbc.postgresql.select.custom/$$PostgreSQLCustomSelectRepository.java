package io.rxmicro.examples.data.r2dbc.postgresql.select.custom;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.select.custom.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.select.custom.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$PostgreSQLCustomSelectRepository extends AbstractPostgreSQLRepository implements CustomSelectRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLCustomSelectRepository(final ConnectionPool pool) {
        super(CustomSelectRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<List<EntityFieldMap>> findAll(final String sql) {
        final String generatedSQL = replaceUniversalPlaceholder(sql);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Flux.from(r.map(toEntityFieldMap()))
                                .collectList())
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture();
    }

    @Override
    public CompletableFuture<Optional<Account>> findAccount(final String sql, final String firstName) {
        final String generatedSQL = sql;
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName)
                        .flatMap(r -> Mono.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB)))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture()
                .thenApply(a -> Optional.ofNullable(a));
    }

    @Override
    public CompletableFuture<Optional<Account>> findFirstAndLastName(final String sql, final String firstName) {
        final String generatedSQL = replaceUniversalPlaceholder(sql);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName)
                        .flatMap(r -> Mono.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDBFirst_nameLast_name)))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture()
                .thenApply(a -> Optional.ofNullable(a));
    }

    @Override
    public CompletableFuture<Optional<Account>> findLastAndFirstName(final String sql, final String firstName) {
        final String generatedSQL = replaceUniversalPlaceholder(sql);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName)
                        .flatMap(r -> Mono.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDBLast_nameFirst_name)))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture()
                .thenApply(a -> Optional.ofNullable(a));
    }
}
