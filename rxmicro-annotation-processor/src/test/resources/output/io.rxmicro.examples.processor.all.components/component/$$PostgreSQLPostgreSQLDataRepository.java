package io.rxmicro.examples.processor.all.components.component;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.processor.all.components.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.processor.all.components.model.Account;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$PostgreSQLPostgreSQLDataRepository extends AbstractPostgreSQLRepository implements PostgreSQLDataRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLPostgreSQLDataRepository(final ConnectionPool pool) {
        super(PostgreSQLDataRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<Account> get() {
        // Original SQL statement:  'SELECT * FROM ${table} WHERE id = 1'
        final String generatedSQL = "SELECT value FROM account WHERE id = 1";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Mono.from(r.map(accountEntityFromR2DBCSQLDBConverter::fromDB)))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Account.class)))
                .toFuture();
    }
}
