package io.rxmicro.examples.data.r2dbc.postgresql.insert;

import io.r2dbc.pool.ConnectionPool;
import io.rxmicro.data.sql.model.EntityFieldMap;
import io.rxmicro.data.sql.r2dbc.postgresql.detail.AbstractPostgreSQLRepository;
import io.rxmicro.examples.data.r2dbc.postgresql.insert.model.$$AccountEntityFromR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.insert.model.$$AccountEntityToR2DBCSQLDBConverter;
import io.rxmicro.examples.data.r2dbc.postgresql.insert.model.Account;
import io.rxmicro.examples.data.r2dbc.postgresql.insert.model.Role;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$PostgreSQLDataRepository extends AbstractPostgreSQLRepository implements DataRepository {

    private final $$AccountEntityFromR2DBCSQLDBConverter accountEntityFromR2DBCSQLDBConverter =
            new $$AccountEntityFromR2DBCSQLDBConverter();

    private final $$AccountEntityToR2DBCSQLDBConverter accountEntityToR2DBCSQLDBConverter =
            new $$AccountEntityToR2DBCSQLDBConverter();

    private final ConnectionPool pool;

    public $$PostgreSQLDataRepository(final ConnectionPool pool) {
        super(DataRepository.class);
        this.pool = pool;
    }

    @Override
    public CompletableFuture<Boolean> insert1(final Account account) {
        // Original SQL statement:  'INSERT INTO ${table}(${inserted-columns}) VALUES(${values})'
        final String generatedSQL = "INSERT INTO account(id, email, first_name, last_name, role) VALUES(nextval('account_seq'), $1, $2, $3, $4)";
        final Object[] insertParams = accountEntityToR2DBCSQLDBConverter.getInsertParams(account);
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, insertParams)
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))

                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))

                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Boolean.class))))
                .map(r -> r > 0)
                .toFuture();
    }

    @Override
    public CompletableFuture<Integer> insert2(final String email, final String firstName, final String lastName, final BigDecimal balance, final Role role) {
        // Original SQL statement:  'INSERT INTO ${table} VALUES(nextval('account_seq'), ?, ?, ?, ?, ?)'
        final String generatedSQL = "INSERT INTO account VALUES(nextval('account_seq'), $1, $2, $3, $4, $5)";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, email, firstName, lastName, balance, role.name())
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))

                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))

                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Integer.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Account> insert3(final String email, final String firstName, final String lastName, final BigDecimal balance, final Role role) {
        // Original SQL statement:  'INSERT INTO ${table} VALUES(nextval('account_seq'), ?, ?, ?, ?, ?) RETURNING *'
        final String generatedSQL = "INSERT INTO account VALUES(nextval('account_seq'), $1, $2, $3, $4, $5) RETURNING id, email, first_name, last_name, balance, role";
        final Account entity = new Account();
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, email, firstName, lastName, balance, role.name())
                        .flatMap(r -> Mono.from(r.map((row, meta) -> accountEntityFromR2DBCSQLDBConverter.setIdEmailFirst_nameLast_nameBalanceRole(entity, row, meta))))
                        .switchIfEmpty(close(c)
                                .then(Mono.empty()))
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Account.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<Integer> insert4(final String email, final String firstName, final String lastName, final BigDecimal balance, final Role role) {
        // Original SQL statement:  'INSERT INTO ${table} VALUES(nextval('account_seq'), ?, ?, ?, ?, ?)'
        final String generatedSQL = "INSERT INTO account VALUES(nextval('account_seq'), $1, $2, $3, $4, $5)";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, email, firstName, lastName, balance, role.name())
                        .flatMap(r -> Mono.from(r.getRowsUpdated()))

                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))

                )
                .switchIfEmpty(Mono.defer(() -> Mono.error(useOptionalExceptionSupplier(CompletableFuture.class, Integer.class))))
                .toFuture();
    }

    @Override
    public CompletableFuture<EntityFieldMap> insert5(final String email, final String firstName, final String lastName, final BigDecimal balance, final Role role) {
        // Original SQL statement:  'INSERT INTO ${table} VALUES(nextval('account_seq'), ?, ?, ?, ?, ?) RETURNING *'
        final String generatedSQL = "INSERT INTO account VALUES(nextval('account_seq'), $1, $2, $3, $4, $5) RETURNING id, email, first_name, last_name, balance, role";
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL, email, firstName, lastName, balance, role.name())
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
    public CompletableFuture<List<Account>> insertMany() {
        // Original SQL statement:  'INSERT INTO ${table} SELECT * FROM dump RETURNING *'
        final String generatedSQL = "INSERT INTO account SELECT * FROM dump RETURNING id, email, first_name, last_name, balance, role";
        final Account entity = new Account();
        return pool.create()
                .flatMap(c -> executeStatement(c, generatedSQL)
                        .flatMap(r -> Flux.from(r.map((row, meta) -> accountEntityFromR2DBCSQLDBConverter.setIdEmailFirst_nameLast_nameBalanceRole(entity, row, meta))).collectList())
                        .delayUntil(s -> close(c))
                        .onErrorResume(e -> close(c)
                                .then(Mono.error(e)))
                )
                .toFuture();
    }
}
