package io.rxmicro.examples.data.r2dbc.postgresql.transactional.model;

import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;
import io.rxmicro.data.sql.r2dbc.detail.EntityToR2DBCSQLDBConverter;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$OrderEntityToR2DBCSQLDBConverter extends EntityToR2DBCSQLDBConverter<Order, Row> {

    public Object[] getInsertParams(final Order entity) {
        return new Object[]{
                entity.idAccount,
                entity.idProduct,
                entity.count
        };
    }

    public Object[] getUpdateParams(final Order entity) {
        return new Object[]{
                entity.idAccount,
                entity.idProduct,
                entity.count,
                entity.created,
                // primary key(s):
                entity.id
        };
    }

    public Object getPrimaryKey(final Order entity) {
        return entity.id;
    }

    public Order setId(final Order model,
                       final Row dbRow,
                       final RowMetadata metadata) {
        model.id = dbRow.get(0, Long.class);
        return model;
    }
}
