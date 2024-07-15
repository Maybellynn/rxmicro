package io.rxmicro.examples.rest.client.model.field.access.headers.reflection;

import io.rxmicro.examples.rest.client.model.field.access.Status;
import io.rxmicro.rest.client.detail.HeaderBuilder;
import io.rxmicro.rest.client.detail.RequestModelExtractor;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;
import java.util.Set;

import static rxmicro.examples.rest.client.model.field.access.$$Reflections.getFieldValue;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RequestRequestModelExtractor extends RequestModelExtractor<Request> {

    @Override
    public void extract(final Request model,
                        final HeaderBuilder headerBuilder) {
        headerBuilder.add("booleanHeader", (Boolean) getFieldValue(model, "booleanHeader"));
        headerBuilder.add("byteHeader", (Byte) getFieldValue(model, "byteHeader"));
        headerBuilder.add("shortHeader", (Short) getFieldValue(model, "shortHeader"));
        headerBuilder.add("intHeader", (Integer) getFieldValue(model, "intHeader"));
        headerBuilder.add("longHeader", (Long) getFieldValue(model, "longHeader"));
        headerBuilder.add("bigIntHeader", (BigInteger) getFieldValue(model, "bigIntHeader"));
        headerBuilder.add("floatHeader", (Float) getFieldValue(model, "floatHeader"));
        headerBuilder.add("doubleHeader", (Double) getFieldValue(model, "doubleHeader"));
        headerBuilder.add("decimalHeader", (BigDecimal) getFieldValue(model, "decimalHeader"));
        headerBuilder.add("charHeader", (Character) getFieldValue(model, "charHeader"));
        headerBuilder.add("stringHeader", (String) getFieldValue(model, "stringHeader"));
        headerBuilder.add("instantHeader", (Instant) getFieldValue(model, "instantHeader"));
        headerBuilder.add("enumHeader", (Status) getFieldValue(model, "enumHeader"));
        headerBuilder.add("booleanHeaderList", (List<Boolean>) getFieldValue(model, "booleanHeaderList"));
        headerBuilder.add("byteHeaderList", (List<Byte>) getFieldValue(model, "byteHeaderList"));
        headerBuilder.add("shortHeaderList", (List<Short>) getFieldValue(model, "shortHeaderList"));
        headerBuilder.add("intHeaderList", (List<Integer>) getFieldValue(model, "intHeaderList"));
        headerBuilder.add("longHeaderList", (List<Long>) getFieldValue(model, "longHeaderList"));
        headerBuilder.add("bigIntHeaderList", (List<BigInteger>) getFieldValue(model, "bigIntHeaderList"));
        headerBuilder.add("floatHeaderList", (List<Float>) getFieldValue(model, "floatHeaderList"));
        headerBuilder.add("doubleHeaderList", (List<Double>) getFieldValue(model, "doubleHeaderList"));
        headerBuilder.add("decimalHeaderList", (List<BigDecimal>) getFieldValue(model, "decimalHeaderList"));
        headerBuilder.add("charHeaderList", (List<Character>) getFieldValue(model, "charHeaderList"));
        headerBuilder.add("stringHeaderList", (List<String>) getFieldValue(model, "stringHeaderList"));
        headerBuilder.add("instantHeaderList", (List<Instant>) getFieldValue(model, "instantHeaderList"));
        headerBuilder.add("enumHeaderList", (List<Status>) getFieldValue(model, "enumHeaderList"));
        headerBuilder.add("booleanHeaderSet", (Set<Boolean>) getFieldValue(model, "booleanHeaderSet"));
        headerBuilder.add("byteHeaderSet", (Set<Byte>) getFieldValue(model, "byteHeaderSet"));
        headerBuilder.add("shortHeaderSet", (Set<Short>) getFieldValue(model, "shortHeaderSet"));
        headerBuilder.add("intHeaderSet", (Set<Integer>) getFieldValue(model, "intHeaderSet"));
        headerBuilder.add("longHeaderSet", (Set<Long>) getFieldValue(model, "longHeaderSet"));
        headerBuilder.add("bigIntHeaderSet", (Set<BigInteger>) getFieldValue(model, "bigIntHeaderSet"));
        headerBuilder.add("floatHeaderSet", (Set<Float>) getFieldValue(model, "floatHeaderSet"));
        headerBuilder.add("doubleHeaderSet", (Set<Double>) getFieldValue(model, "doubleHeaderSet"));
        headerBuilder.add("decimalHeaderSet", (Set<BigDecimal>) getFieldValue(model, "decimalHeaderSet"));
        headerBuilder.add("charHeaderSet", (Set<Character>) getFieldValue(model, "charHeaderSet"));
        headerBuilder.add("stringHeaderSet", (Set<String>) getFieldValue(model, "stringHeaderSet"));
        headerBuilder.add("instantHeaderSet", (Set<Instant>) getFieldValue(model, "instantHeaderSet"));
        headerBuilder.add("enumHeaderSet", (Set<Status>) getFieldValue(model, "enumHeaderSet"));
        headerBuilder.add("Request-Id", (String) getFieldValue(model, "requestIdHeader"));
        for (final Status item : (List<Status>) getFieldValue(model, "repeatingEnumHeaderList")) {
            headerBuilder.add("repeatingEnumHeaderList", item);
        }
        for (final Status item : (Set<Status>) getFieldValue(model, "repeatingEnumHeaderSet")) {
            headerBuilder.add("repeatingEnumHeaderSet", item);
        }
    }
}