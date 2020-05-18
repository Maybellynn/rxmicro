package io.rxmicro.examples.data.mongo.model.fields.reflection.model;

import io.rxmicro.data.mongo.detail.EntityToMongoDBConverter;
import io.rxmicro.examples.data.mongo.model.fields.reflection.model.nested.$$NestedEntityToMongoDBConverter;
import io.rxmicro.examples.data.mongo.model.fields.reflection.model.nested.Nested;
import org.bson.Document;

import java.util.List;

import static io.rxmicro.common.util.Requires.require;
import static rxmicro.$$Reflections.getFieldValue;
import static rxmicro.$$Reflections.setFieldValue;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$EntityEntityToMongoDBConverter extends EntityToMongoDBConverter<Entity, Document> {

    private final $$NestedEntityToMongoDBConverter nestedEntityToMongoDBConverter =
            new $$NestedEntityToMongoDBConverter();

    @Override
    public Document toDB(final Entity model,
                         final boolean withId) {
        final Document document = new Document();
        final Object id = getFieldValue(model, "id");
        if (id != null && withId) {
            document.append("_id", id);
        }
        document.append("status", getFieldValue(model, "status"));
        document.append("statusList", getFieldValue(model, "statusList"));
        document.append("aBoolean", getFieldValue(model, "aBoolean"));
        document.append("booleanList", getFieldValue(model, "booleanList"));
        document.append("aByte", getFieldValue(model, "aByte"));
        document.append("byteList", getFieldValue(model, "byteList"));
        document.append("aShort", getFieldValue(model, "aShort"));
        document.append("shortList", getFieldValue(model, "shortList"));
        document.append("aInteger", getFieldValue(model, "aInteger"));
        document.append("integerList", getFieldValue(model, "integerList"));
        document.append("aLong", getFieldValue(model, "aLong"));
        document.append("longList", getFieldValue(model, "longList"));
        document.append("aFloat", getFieldValue(model, "aFloat"));
        document.append("floatList", getFieldValue(model, "floatList"));
        document.append("aDouble", getFieldValue(model, "aDouble"));
        document.append("doubleList", getFieldValue(model, "doubleList"));
        document.append("bigDecimal", getFieldValue(model, "bigDecimal"));
        document.append("bigDecimalList", getFieldValue(model, "bigDecimalList"));
        document.append("character", getFieldValue(model, "character"));
        document.append("characterList", getFieldValue(model, "characterList"));
        document.append("string", getFieldValue(model, "string"));
        document.append("stringList", getFieldValue(model, "stringList"));
        document.append("pattern", getFieldValue(model, "pattern"));
        document.append("patternList", getFieldValue(model, "patternList"));
        document.append("instant", getFieldValue(model, "instant"));
        document.append("instantList", getFieldValue(model, "instantList"));
        document.append("localDate", getFieldValue(model, "localDate"));
        document.append("localDateList", getFieldValue(model, "localDateList"));
        document.append("localDateTime", getFieldValue(model, "localDateTime"));
        document.append("localDateTimeList", getFieldValue(model, "localDateTimeList"));
        document.append("localTime", getFieldValue(model, "localTime"));
        document.append("localTimeList", getFieldValue(model, "localTimeList"));
        document.append("uuid", getFieldValue(model, "uuid"));
        document.append("uuidList", getFieldValue(model, "uuidList"));
        document.append("code", getFieldValue(model, "code"));
        document.append("codeList", getFieldValue(model, "codeList"));
        document.append("binary", getFieldValue(model, "binary"));
        document.append("binaryList", getFieldValue(model, "binaryList"));
        document.append("nested", convertIfNotNull(nestedEntityToMongoDBConverter, (Nested) getFieldValue(model, "nested")));
        document.append("nestedList", convertIfNotNull(nestedEntityToMongoDBConverter, (List<Nested>) getFieldValue(model, "nestedList")));
        return document;
    }

    @Override
    public Object getId(final Entity model) {
        return require(getFieldValue(model, "id"), "Entity does not contain document id: ?", model);
    }

    @Override
    public void setId(final Document document,
                      final Entity model) {
        final Object id = document.get("_id");
        if (id != null) {
            setFieldValue(model, "id", toObjectId(id, "id"));
        }
    }
}
