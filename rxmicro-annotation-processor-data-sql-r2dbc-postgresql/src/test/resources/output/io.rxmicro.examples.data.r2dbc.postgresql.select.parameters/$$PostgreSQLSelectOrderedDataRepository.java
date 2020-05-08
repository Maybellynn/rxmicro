package io.rxmicro.examples.data.r2dbc.postgresql.select.parameters;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.SortOrder;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.select.parameters.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.select.parameters.model.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static io.rxmicro.common.util.Formats.format;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$PostgreSQLSelectOrderedDataRepository extends AbstractPostgreSQLRepository implements SelectOrderedDataRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLSelectOrderedDataRepository(final ConnectionPool pool) {
        super(SelectOrderedDataRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<List<Account>> findAllOrderedById() {
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
    public CompletableFuture<List<Account>> findAllOrderedById(final SortOrder sortOrder) {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY(id ?)'
        final String generatedSQL = format("SELECT first_name, last_name FROM account ORDER BY(id ?)", sortOrder.sql());
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
    public CompletableFuture<List<Account>> findAllOrderedBy(final String columnName, final SortOrder sortOrder) {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY ? ?'
        final String generatedSQL = format("SELECT first_name, last_name FROM account ORDER BY ? ?", columnName, sortOrder.sql());
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
    public CompletableFuture<List<Account>> findAllOrderedByIdAndEmail(final SortOrder sortOrder) {
        // Original SQL statement:  'SELECT * FROM ${table} ORDER BY(id ?, email ?) LIMIT 10'
        final String generatedSQL = format("SELECT first_name, last_name FROM account ORDER BY(id ?, email ?) LIMIT 10", sortOrder.sql(), sortOrder.sql());
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
}
