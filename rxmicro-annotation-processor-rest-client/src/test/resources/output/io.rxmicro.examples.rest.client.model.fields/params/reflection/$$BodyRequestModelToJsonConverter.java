package io.rxmicro.examples.rest.client.model.fields.params.reflection;

import io.rxmicro.examples.rest.client.model.fields.Status;
import io.rxmicro.examples.rest.client.model.fields.params.reflection.nested.$$NestedModelToJsonConverter;
import io.rxmicro.examples.rest.client.model.fields.params.reflection.nested.Nested;
import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static rxmicro.$$Reflections.getFieldValue;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$BodyRequestModelToJsonConverter extends ModelToJsonConverter<BodyRequest> {

    private final $$NestedModelToJsonConverter nestedModelToJsonConverter =
            new $$NestedModelToJsonConverter();

    @Override
    public Map<String, Object> toJsonObject(final BodyRequest model) {
        return new JsonObjectBuilder()
                .put("booleanParameter", (Boolean) getFieldValue(model, "booleanParameter"))
                .put("byteParameter", (Byte) getFieldValue(model, "byteParameter"))
                .put("shortParameter", (Short) getFieldValue(model, "shortParameter"))
                .put("intParameter", (Integer) getFieldValue(model, "intParameter"))
                .put("longParameter", (Long) getFieldValue(model, "longParameter"))
                .put("bigIntParameter", (BigInteger) getFieldValue(model, "bigIntParameter"))
                .put("floatParameter", (Float) getFieldValue(model, "floatParameter"))
                .put("doubleParameter", (Double) getFieldValue(model, "doubleParameter"))
                .put("decimalParameter", (BigDecimal) getFieldValue(model, "decimalParameter"))
                .put("charParameter", (Character) getFieldValue(model, "charParameter"))
                .put("stringParameter", (String) getFieldValue(model, "stringParameter"))
                .put("instantParameter", (Instant) getFieldValue(model, "instantParameter"))
                .put("status", (Status) getFieldValue(model, "status"))
                .put("booleanParameters", (List<Boolean>) getFieldValue(model, "booleanParameters"))
                .put("byteParameters", (List<Byte>) getFieldValue(model, "byteParameters"))
                .put("shortParameters", (List<Short>) getFieldValue(model, "shortParameters"))
                .put("intParameters", (List<Integer>) getFieldValue(model, "intParameters"))
                .put("longParameters", (List<Long>) getFieldValue(model, "longParameters"))
                .put("bigIntParameters", (List<BigInteger>) getFieldValue(model, "bigIntParameters"))
                .put("floatParameters", (List<Float>) getFieldValue(model, "floatParameters"))
                .put("doubleParameters", (List<Double>) getFieldValue(model, "doubleParameters"))
                .put("decimalParameters", (List<BigDecimal>) getFieldValue(model, "decimalParameters"))
                .put("charParameters", (List<Character>) getFieldValue(model, "charParameters"))
                .put("stringParameters", (List<String>) getFieldValue(model, "stringParameters"))
                .put("instantParameters", (List<Instant>) getFieldValue(model, "instantParameters"))
                .put("statuses", (List<Status>) getFieldValue(model, "statuses"))
                .put("booleanParameterSet", (Set<Boolean>) getFieldValue(model, "booleanParameterSet"))
                .put("byteParameterSet", (Set<Byte>) getFieldValue(model, "byteParameterSet"))
                .put("shortParameterSet", (Set<Short>) getFieldValue(model, "shortParameterSet"))
                .put("intParameterSet", (Set<Integer>) getFieldValue(model, "intParameterSet"))
                .put("longParameterSet", (Set<Long>) getFieldValue(model, "longParameterSet"))
                .put("bigIntParameterSet", (Set<BigInteger>) getFieldValue(model, "bigIntParameterSet"))
                .put("floatParameterSet", (Set<Float>) getFieldValue(model, "floatParameterSet"))
                .put("doubleParameterSet", (Set<Double>) getFieldValue(model, "doubleParameterSet"))
                .put("decimalParameterSet", (Set<BigDecimal>) getFieldValue(model, "decimalParameterSet"))
                .put("charParameterSet", (Set<Character>) getFieldValue(model, "charParameterSet"))
                .put("stringParameterSet", (Set<String>) getFieldValue(model, "stringParameterSet"))
                .put("instantParameterSet", (Set<Instant>) getFieldValue(model, "instantParameterSet"))
                .put("statusSet", (Set<Status>) getFieldValue(model, "statusSet"))
                .put("nested", convertFromObjectIfNotNull(nestedModelToJsonConverter, (Nested) getFieldValue(model, "nested")))
                .put("nestedList", convertFromListIfNotNull(nestedModelToJsonConverter, (List<Nested>) getFieldValue(model, "nestedList")))
                .put("nestedSet", convertFromSetIfNotNull(nestedModelToJsonConverter, (Set<Nested>) getFieldValue(model, "nestedSet")))
                .put("booleanData", (Map<String, Boolean>) getFieldValue(model, "booleanData"))
                .put("byteData", (Map<String, Byte>) getFieldValue(model, "byteData"))
                .put("shortData", (Map<String, Short>) getFieldValue(model, "shortData"))
                .put("integerData", (Map<String, Integer>) getFieldValue(model, "integerData"))
                .put("longData", (Map<String, Long>) getFieldValue(model, "longData"))
                .put("bigIntegerData", (Map<String, BigInteger>) getFieldValue(model, "bigIntegerData"))
                .put("floatData", (Map<String, Float>) getFieldValue(model, "floatData"))
                .put("doubleData", (Map<String, Double>) getFieldValue(model, "doubleData"))
                .put("bigDecimalData", (Map<String, BigDecimal>) getFieldValue(model, "bigDecimalData"))
                .put("characterData", (Map<String, Character>) getFieldValue(model, "characterData"))
                .put("stringData", (Map<String, String>) getFieldValue(model, "stringData"))
                .put("enumData", (Map<String, Status>) getFieldValue(model, "enumData"))
                .put("instantData", (Map<String, Instant>) getFieldValue(model, "instantData"))
                .put("nestedMap", convertFromMapIfNotNull(nestedModelToJsonConverter, (Map<String, Nested>) getFieldValue(model, "nestedMap")))
                .build();
    }
}
