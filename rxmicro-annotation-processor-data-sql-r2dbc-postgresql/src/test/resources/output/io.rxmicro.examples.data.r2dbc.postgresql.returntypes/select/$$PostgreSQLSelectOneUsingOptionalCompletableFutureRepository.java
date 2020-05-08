package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.select;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Role;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import static io.rxmicro.data.sql.detail.Converters.toEnum;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$PostgreSQLSelectOneUsingOptionalCompletableFutureRepository extends AbstractPostgreSQLRepository implements SelectOneUsingOptionalCompletableFutureRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLSelectOneUsingOptionalCompletableFutureRepository(final ConnectionPool pool) {
        super(SelectOneUsingOptionalCompletableFutureRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<Optional<Account>> find01() {
        // Original SQL statement:  'SELECT first_name, last_name FROM ${table} WHERE email = 'richard.hendricks@piedpiper.com''
        final String generatedSQL = "SELECT first_name, last_name FROM account WHERE email = 'richard.hendricks@piedpiper.com'";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
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
    public CompletableFuture<Optional<EntityFieldMap>> find02() {
        // Original SQL statement:  'SELECT first_name, last_name FROM ${table} WHERE email = 'richard.hendricks@piedpiper.com''
        final String generatedSQL = "SELECT first_name, last_name FROM account WHERE email = 'richard.hendricks@piedpiper.com'";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
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
    public CompletableFuture<Optional<EntityFieldList>> find03() {
        // Original SQL statement:  'SELECT first_name, last_name FROM ${table} WHERE email = 'richard.hendricks@piedpiper.com''
        final String generatedSQL = "SELECT first_name, last_name FROM account WHERE email = 'richard.hendricks@piedpiper.com'";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldList())))
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
    public CompletableFuture<Optional<String>> find04() {
        // Original SQL statement:  'SELECT email FROM ${table} WHERE email = 'richard.hendricks@piedpiper.com''
        final String generatedSQL = "SELECT email FROM account WHERE email = 'richard.hendricks@piedpiper.com'";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> row.get(0, String.class))))
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
    public CompletableFuture<Optional<Role>> find05() {
        // Original SQL statement:  'SELECT role::text FROM ${table} WHERE email = 'richard.hendricks@piedpiper.com''
        final String generatedSQL = "SELECT role::text FROM account WHERE email = 'richard.hendricks@piedpiper.com'";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> toEnum(Role.class, row.get(0, String.class)))))
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
    public CompletableFuture<Optional<BigDecimal>> find06() {
        // Original SQL statement:  'SELECT balance FROM ${table} WHERE email = 'richard.hendricks@piedpiper.com''
        final String generatedSQL = "SELECT balance FROM account WHERE email = 'richard.hendricks@piedpiper.com'";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> row.get(0, BigDecimal.class))))
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
