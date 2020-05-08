package io.rxmicro.examples.data.mongo.model.fields.direct.model.nested;

import io.rxmicro.data.mongo.detail.EntityFromMongoDBConverter;
import io.rxmicro.examples.data.mongo.model.fields.Status;
import org.bson.Document;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$NestedEntityFromMongoDBConverter extends EntityFromMongoDBConverter<Document, Nested> {

    @Override
    public Nested fromDB(final Document document) {
        final Nested model = new Nested();
        model.status = toEnum(Status.class, document.get("status"), "status");
        model.instant = toInstant(document.get("instant"), "instant");
        model.code = toCode(document.get("code"), "code");
        model.binary = toBinary(document.get("binary"), "binary");
        return model;
    }
}
