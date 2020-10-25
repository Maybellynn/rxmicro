package io.rxmicro.examples.data.r2dbc.postgresql.variables.model;

import io.r2dbc.spi.Row;
import io.rxmicro.data.sql.r2dbc.detail.EntityToR2DBCSQLDBConverter;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$EntityEntityToR2DBCSQLDBConverter extends EntityToR2DBCSQLDBConverter<Entity, Row> {

    public Object[] getInsertParams(final Entity entity) {
        return new Object[]{
                entity.value
        };
    }

    public Object[] getUpdateParams(final Entity entity) {
        return new Object[]{
                entity.value,
                // primary key(s):
                entity.id
        };
    }

    public Object getPrimaryKey(final Entity entity) {
        return entity.id;
    }
}
