package io.rxmicro.examples.data.r2dbc.postgresql.model.fields.direct.model;

import io.r2dbc.spi.Row;
import io.rxmicro.data.sql.r2dbc.detail.EntityToR2DBCSQLDBConverter;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$EntityEntityToR2DBCSQLDBConverter extends EntityToR2DBCSQLDBConverter<Entity, Row> {

    public Object[] getInsertParams(final Entity entity) {
        return new Object[]{
                entity.status.name(),
                entity.aBoolean,
                entity.aByte,
                entity.aShort,
                entity.aInteger,
                entity.aLong,
                entity.bigInteger,
                entity.aFloat,
                entity.aDouble,
                entity.bigDecimal,
                entity.character,
                entity.string,
                entity.instant,
                entity.localTime,
                entity.localDate,
                entity.localDateTime,
                entity.offsetDateTime,
                entity.zonedDateTime,
                entity.inetAddress,
                entity.uuid
        };
    }

    public Object[] getUpdateParams(final Entity entity) {
        return new Object[]{
                entity.status.name(),
                entity.aBoolean,
                entity.aByte,
                entity.aShort,
                entity.aInteger,
                entity.aLong,
                entity.bigInteger,
                entity.aFloat,
                entity.aDouble,
                entity.bigDecimal,
                entity.character,
                entity.string,
                entity.instant,
                entity.localTime,
                entity.localDate,
                entity.localDateTime,
                entity.offsetDateTime,
                entity.zonedDateTime,
                entity.inetAddress,
                entity.uuid,
                // primary key(s):
                entity.id
        };
    }

    public Object getPrimaryKey(final Entity entity) {
        return entity.id;
    }
}
