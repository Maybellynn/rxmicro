package io.rxmicro.examples.data.r2dbc.postgresql.insert.model;

import io.r2dbc.spi.Row;
import io.rxmicro.data.sql.r2dbc.detail.EntityToR2DBCSQLDBConverter;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$AccountEntityToR2DBCSQLDBConverter extends EntityToR2DBCSQLDBConverter<Account, Row> {

    public Object[] getInsertParams(final Account entity) {
        return new Object[]{
                entity.email,
                entity.firstName,
                entity.lastName,
                entity.role.name()
        };
    }
}
