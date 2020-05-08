package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.update;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import reactor.core.publisher.Mono;

import java.util.Optional;
import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$PostgreSQLUpdateOneEntityFieldsUsingOptionalCompletionStageRepository extends AbstractPostgreSQLRepository implements UpdateOneEntityFieldsUsingOptionalCompletionStageRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLUpdateOneEntityFieldsUsingOptionalCompletionStageRepository(final ConnectionPool pool) {
        super(UpdateOneEntityFieldsUsingOptionalCompletionStageRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletionStage<Optional<Account>> update01(final String firstName, final String lastName, final Long id) {
        // Original SQL statement:  'UPDATE ${table} SET first_name = ?, last_name = ? WHERE id = ? RETURNING *'
        final String generatedSQL = "UPDATE account SET first_name = $1, last_name = $2 WHERE id = $3 RETURNING id, first_name, last_name";
        final Account entity = new Account();
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName, id)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityFromR2DBCSQLDBConverter.setIdFirst_nameLast_name(entity, row, meta))))
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
    public CompletionStage<Optional<EntityFieldMap>> update02(final String firstName, final String lastName, final Long id) {
        // Original SQL statement:  'UPDATE ${table} SET first_name = ?, last_name = ? WHERE id = ? RETURNING first_name, last_name'
        final String generatedSQL = "UPDATE account SET first_name = $1, last_name = $2 WHERE id = $3 RETURNING first_name, last_name";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName, id)
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
    public CompletionStage<Optional<EntityFieldList>> update03(final String firstName, final String lastName, final Long id) {
        // Original SQL statement:  'UPDATE ${table} SET first_name = ?, last_name = ? WHERE id = ? RETURNING first_name, last_name'
        final String generatedSQL = "UPDATE account SET first_name = $1, last_name = $2 WHERE id = $3 RETURNING first_name, last_name";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName, id)
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
}
