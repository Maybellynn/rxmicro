package io.rxmicro.examples.rest.controller.model.fields.params.direct;

import io.rxmicro.examples.rest.controller.model.fields.params.direct.nested.$$NestedModelToJsonConverter;
import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ResponseModelToJsonConverter extends ModelToJsonConverter<Response> {

    private final $$NestedModelToJsonConverter nestedModelToJsonConverter =
            new $$NestedModelToJsonConverter();

    @Override
    public Map<String, Object> toJsonObject(final Response model) {
        return new JsonObjectBuilder()
                .put("booleanParameter", model.booleanParameter)
                .put("byteParameter", model.byteParameter)
                .put("shortParameter", model.shortParameter)
                .put("intParameter", model.intParameter)
                .put("longParameter", model.longParameter)
                .put("bigIntParameter", model.bigIntParameter)
                .put("floatParameter", model.floatParameter)
                .put("doubleParameter", model.doubleParameter)
                .put("decimalParameter", model.decimalParameter)
                .put("charParameter", model.charParameter)
                .put("stringParameter", model.stringParameter)
                .put("instantParameter", model.instantParameter)
                .put("status", model.status)
                .put("booleanParameters", model.booleanParameters)
                .put("byteParameters", model.byteParameters)
                .put("shortParameters", model.shortParameters)
                .put("intParameters", model.intParameters)
                .put("longParameters", model.longParameters)
                .put("bigIntParameters", model.bigIntParameters)
                .put("floatParameters", model.floatParameters)
                .put("doubleParameters", model.doubleParameters)
                .put("decimalParameters", model.decimalParameters)
                .put("charParameters", model.charParameters)
                .put("stringParameters", model.stringParameters)
                .put("instantParameters", model.instantParameters)
                .put("statuses", model.statuses)
                .put("booleanParameterSet", model.booleanParameterSet)
                .put("byteParameterSet", model.byteParameterSet)
                .put("shortParameterSet", model.shortParameterSet)
                .put("intParameterSet", model.intParameterSet)
                .put("longParameterSet", model.longParameterSet)
                .put("bigIntParameterSet", model.bigIntParameterSet)
                .put("floatParameterSet", model.floatParameterSet)
                .put("doubleParameterSet", model.doubleParameterSet)
                .put("decimalParameterSet", model.decimalParameterSet)
                .put("charParameterSet", model.charParameterSet)
                .put("stringParameterSet", model.stringParameterSet)
                .put("instantParameterSet", model.instantParameterSet)
                .put("statusSet", model.statusSet)
                .put("nested", convertFromObjectIfNotNull(nestedModelToJsonConverter, model.nested))
                .put("nestedList", convertFromListIfNotNull(nestedModelToJsonConverter, model.nestedList))
                .put("nestedSet", convertFromSetIfNotNull(nestedModelToJsonConverter, model.nestedSet))
                .put("booleanData", model.booleanData)
                .put("byteData", model.byteData)
                .put("shortData", model.shortData)
                .put("integerData", model.integerData)
                .put("longData", model.longData)
                .put("bigIntegerData", model.bigIntegerData)
                .put("floatData", model.floatData)
                .put("doubleData", model.doubleData)
                .put("bigDecimalData", model.bigDecimalData)
                .put("characterData", model.characterData)
                .put("stringData", model.stringData)
                .put("enumData", model.enumData)
                .put("instantData", model.instantData)
                .put("nestedMap", convertFromMapIfNotNull(nestedModelToJsonConverter, model.nestedMap))
                .build();
    }
}
