package io.rxmicro.examples.data.r2dbc.postgresql.transactional.model;

import io.r2dbc.spi.Row;
import io.r2dbc.spi.RowMetadata;
import io.rxmicro.data.sql.r2dbc.detail.EntityFromR2DBCSQLDBConverter;

import java.math.BigDecimal;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ProductEntityFromR2DBCSQLDBConverter extends EntityFromR2DBCSQLDBConverter<Row, RowMetadata, Product> {

    public Product fromDB(final Row dbRow,
                          final RowMetadata metadata) {
        final Product model = new Product();
        model.id = dbRow.get(0, Integer.class);
        model.name = dbRow.get(1, String.class);
        model.price = dbRow.get(2, BigDecimal.class);
        model.count = dbRow.get(3, Integer.class);
        return model;
    }
}
