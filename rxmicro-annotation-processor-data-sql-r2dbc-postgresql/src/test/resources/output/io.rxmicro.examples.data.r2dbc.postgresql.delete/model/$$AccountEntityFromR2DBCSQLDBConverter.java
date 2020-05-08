package io.rxmicro.examples.data.r2dbc.postgresql.delete.model;

import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;
import io.rxmicro.data.sql.r2dbc.detail.EntityFromR2DBCSQLDBConverter;

import java.math.BigDecimal;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$AccountEntityFromR2DBCSQLDBConverter extends EntityFromR2DBCSQLDBConverter<Row, RowMetadata, Account> {

    public Account setIdEmailFirst_nameLast_nameBalanceRole(final Account model,
                                                            final Row dbRow,
                                                            final RowMetadata metadata) {
        model.id = dbRow.get(0, Long.class);
        model.email = dbRow.get(1, String.class);
        model.firstName = dbRow.get(2, String.class);
        model.lastName = dbRow.get(3, String.class);
        model.balance = dbRow.get(4, BigDecimal.class);
        model.role = toEnum(Role.class, dbRow.get(5, String.class), "role");
        return model;
    }
}
