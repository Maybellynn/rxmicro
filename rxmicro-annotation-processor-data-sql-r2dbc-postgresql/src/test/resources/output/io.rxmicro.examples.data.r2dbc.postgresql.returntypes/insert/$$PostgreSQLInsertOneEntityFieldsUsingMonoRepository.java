package io.rxmicro.examples.data.r2dbc.postgresql.returntypes.insert;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.EntityFieldList;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.returntypes.model.Account;
import reactor.core.publisher.Mono;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$PostgreSQLInsertOneEntityFieldsUsingMonoRepository extends AbstractPostgreSQLRepository implements InsertOneEntityFieldsUsingMonoRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLInsertOneEntityFieldsUsingMonoRepository(final ConnectionPool pool) {
        super(InsertOneEntityFieldsUsingMonoRepository.class);
        this.pool = pool;
    }

    @Override
    public Mono<Void> insert01(final String firstName, final String lastName) {
        // Original SQL statement:  'INSERT INTO ${table}(first_name, last_name) VALUES(?, ?)'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2)";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .then();
    }

    @Override
    public Mono<Integer> insert02(final String firstName, final String lastName) {
        // Original SQL statement:  'INSERT INTO ${table}(first_name, last_name) VALUES(?, ?)'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2)";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                );
    }

    @Override
    public Mono<Boolean> insert03(final String firstName, final String lastName) {
        // Original SQL statement:  'INSERT INTO ${table}(first_name, last_name) VALUES(?, ?)'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2)";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))
                        
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                        
                )
                .map(r -> r > 0);
    }

    @Override
    public Mono<Account> insert04(final String firstName, final String lastName) {
        // Original SQL statement:  'INSERT INTO ${table}(first_name, last_name) VALUES(?, ?) RETURNING *'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING id, first_name, last_name";
        final Account entity = new Account();
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName)
                        .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityFromR2DBCSQLDBConverter.setIdFirst_nameLast_name(entity, row, meta))))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                );
    }

    @Override
    public Mono<EntityFieldMap> insert05(final String firstName, final String lastName) {
        // Original SQL statement:  'INSERT INTO ${table}(first_name, last_name) VALUES(?, ?) RETURNING first_name, last_name'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING first_name, last_name";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldMap())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                );
    }

    @Override
    public Mono<EntityFieldList> insert06(final String firstName, final String lastName) {
        // Original SQL statement:  'INSERT INTO ${table}(first_name, last_name) VALUES(?, ?) RETURNING first_name, last_name'
        final String generatedSQL = "INSERT INTO account(first_name, last_name) VALUES($1, $2) RETURNING first_name, last_name";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, firstName, lastName)
                        .flatMap(r -> Mono.from(r.map(toEntityFieldList())))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                );
    }
}
