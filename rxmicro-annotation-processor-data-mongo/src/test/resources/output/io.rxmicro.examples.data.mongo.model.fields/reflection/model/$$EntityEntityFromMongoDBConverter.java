package io.rxmicro.examples.data.mongo.model.fields.reflection.model;

import io.rxmicro.data.mongo.detail.EntityFromMongoDBConverter;
import io.rxmicro.examples.data.mongo.model.fields.Status;
import io.rxmicro.examples.data.mongo.model.fields.reflection.model.nested.$$NestedEntityFromMongoDBConverter;
import org.bson.Document;

import static rxmicro.$$Reflections.setFieldValue;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$EntityEntityFromMongoDBConverter extends EntityFromMongoDBConverter<Document, Entity> {

    private final $$NestedEntityFromMongoDBConverter nestedEntityFromMongoDBConverter =
            new $$NestedEntityFromMongoDBConverter();

    @Override
    public Entity fromDB(final Document document) {
        final Entity model = new Entity();
        setFieldValue(model, "id", toObjectId(document.get("_id"), "id"));
        setFieldValue(model, "status", toEnum(Status.class, document.get("status"), "status"));
        setFieldValue(model, "statusList", toEnumArray(Status.class, document.get("statusList"), "statusList"));
        setFieldValue(model, "aBoolean", toBoolean(document.get("aBoolean"), "aBoolean"));
        setFieldValue(model, "booleanList", toBooleanArray(document.get("booleanList"), "booleanList"));
        setFieldValue(model, "aByte", toByte(document.get("aByte"), "aByte"));
        setFieldValue(model, "byteList", toByteArray(document.get("byteList"), "byteList"));
        setFieldValue(model, "aShort", toShort(document.get("aShort"), "aShort"));
        setFieldValue(model, "shortList", toShortArray(document.get("shortList"), "shortList"));
        setFieldValue(model, "aInteger", toInteger(document.get("aInteger"), "aInteger"));
        setFieldValue(model, "integerList", toIntegerArray(document.get("integerList"), "integerList"));
        setFieldValue(model, "aLong", toLong(document.get("aLong"), "aLong"));
        setFieldValue(model, "longList", toLongArray(document.get("longList"), "longList"));
        setFieldValue(model, "aFloat", toFloat(document.get("aFloat"), "aFloat"));
        setFieldValue(model, "floatList", toFloatArray(document.get("floatList"), "floatList"));
        setFieldValue(model, "aDouble", toDouble(document.get("aDouble"), "aDouble"));
        setFieldValue(model, "doubleList", toDoubleArray(document.get("doubleList"), "doubleList"));
        setFieldValue(model, "bigDecimal", toBigDecimal(document.get("bigDecimal"), "bigDecimal"));
        setFieldValue(model, "bigDecimalList", toBigDecimalArray(document.get("bigDecimalList"), "bigDecimalList"));
        setFieldValue(model, "character", toCharacter(document.get("character"), "character"));
        setFieldValue(model, "characterList", toCharacterArray(document.get("characterList"), "characterList"));
        setFieldValue(model, "string", toString(document.get("string"), "string"));
        setFieldValue(model, "stringList", toStringArray(document.get("stringList"), "stringList"));
        setFieldValue(model, "pattern", toPattern(document.get("pattern"), "pattern"));
        setFieldValue(model, "patternList", toPatternArray(document.get("patternList"), "patternList"));
        setFieldValue(model, "instant", toInstant(document.get("instant"), "instant"));
        setFieldValue(model, "instantList", toInstantArray(document.get("instantList"), "instantList"));
        setFieldValue(model, "localDate", toLocalDate(document.get("localDate"), "localDate"));
        setFieldValue(model, "localDateList", toLocalDateArray(document.get("localDateList"), "localDateList"));
        setFieldValue(model, "localDateTime", toLocalDateTime(document.get("localDateTime"), "localDateTime"));
        setFieldValue(model, "localDateTimeList", toLocalDateTimeArray(document.get("localDateTimeList"), "localDateTimeList"));
        setFieldValue(model, "localTime", toLocalTime(document.get("localTime"), "localTime"));
        setFieldValue(model, "localTimeList", toLocalTimeArray(document.get("localTimeList"), "localTimeList"));
        setFieldValue(model, "uuid", toUUID(document.get("uuid"), "uuid"));
        setFieldValue(model, "uuidList", toUUIDArray(document.get("uuidList"), "uuidList"));
        setFieldValue(model, "code", toCode(document.get("code"), "code"));
        setFieldValue(model, "codeList", toCodeArray(document.get("codeList"), "codeList"));
        setFieldValue(model, "binary", toBinary(document.get("binary"), "binary"));
        setFieldValue(model, "binaryList", toBinaryArray(document.get("binaryList"), "binaryList"));
        setFieldValue(model, "nested", convertIfNotNull(nestedEntityFromMongoDBConverter, toType(Document.class, document.get("nested"), "nested")));
        setFieldValue(model, "nestedList", convertIfNotNull(nestedEntityFromMongoDBConverter, toArray(Document.class, document.get("nestedList"), "nestedList")));
        return model;
    }
}
