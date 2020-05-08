package io.rxmicro.examples.data.r2dbc.postgresql.variables;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.variables.model.$$EntityEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.variables.model.$$EntityEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.variables.model.Entity;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$PostgreSQLUpdateDataRepository extends AbstractPostgreSQLRepository implements UpdateDataRepository {

    private final $$EntityEntityFromR2DBCSQLDBConverter entityEntityFromR2DBCSQLDBConverter =
            new $$EntityEntityFromR2DBCSQLDBConverter();

    private final $$EntityEntityToR2DBCSQLDBConverter entityEntityToR2DBCSQLDBConverter =
            new $$EntityEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLUpdateDataRepository(final ConnectionPool pool) {
        super(UpdateDataRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<Void> updateEntityTable1(final Entity entity) {
        // Original SQL statement:  'UPDATE ${table} SET ${updated-columns}'
        final String generatedSQL = "UPDATE entity_table SET value = $1";
        final Object[] updateParams = entityEntityToR2DBCSQLDBConverter.getUpdateParams(entity);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, updateParams)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Void.class))))
                .toFuture()
                .thenApply(r -> null);
    }

    @Override
    public CompletableFuture<Entity> updateEntityTable2(final Entity entity) {
        // Original SQL statement:  'UPDATE ${table} SET ${updated-columns} RETURNING *'
        final String generatedSQL = "UPDATE entity_table SET value = $1 RETURNING id, value";
        final Object[] updateParams = entityEntityToR2DBCSQLDBConverter.getUpdateParams(entity);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, updateParams)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> entityEntityToR2DBCSQLDBConverter.setIdValue(entity, row, meta))))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Entity.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Entity> updateEntityTable3(final String value) {
        // Original SQL statement:  'UPDATE ${table} SET value = ? RETURNING *'
        final String generatedSQL = "UPDATE entity_table SET value = $1 RETURNING id, value";
        final Entity entity = new Entity();
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, value)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> entityEntityFromR2DBCSQLDBConverter.setIdValue(entity, row, meta))))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Entity.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<EntityFieldMap> updateEntityTable4(final String value) {
        // Original SQL statement:  'UPDATE ${table} SET value = ? RETURNING *'
        final String generatedSQL = "UPDATE entity_table SET value = $1 RETURNING id, value";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, value)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, EntityFieldMap.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<EntityFieldMap> updateGlobalTable1(final String value) {
        // Original SQL statement:  'UPDATE ${table} SET value = ? RETURNING value'
        final String generatedSQL = "UPDATE global_table SET value = $1 RETURNING value";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, value)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, EntityFieldMap.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Void> updateGlobalTable2(final String value) {
        // Original SQL statement:  'UPDATE ${table} SET value = ?'
        final String generatedSQL = "UPDATE global_table SET value = $1";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, value)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Void.class))))
                .toFuture()
                .thenApply(r -> null);
    }

    @Override
    public CompletableFuture<EntityFieldMap> updateLocalTable1(final String value) {
        // Original SQL statement:  'UPDATE ${table} SET value = ? RETURNING value'
        final String generatedSQL = "UPDATE local_table SET value = $1 RETURNING value";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, value)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, EntityFieldMap.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Void> updateLocalTable2(final String value) {
        // Original SQL statement:  'UPDATE ${table} SET value = ?'
        final String generatedSQL = "UPDATE local_table SET value = $1";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, value)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Void.class))))
                .toFuture()
                .thenApply(r -> null);
    }
}
