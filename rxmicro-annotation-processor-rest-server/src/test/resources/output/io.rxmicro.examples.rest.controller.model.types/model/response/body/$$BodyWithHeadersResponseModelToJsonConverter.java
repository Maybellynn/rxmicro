package io.rxmicro.examples.rest.controller.model.types.model.response.body;

import io.rxmicro.examples.rest.controller.model.types.model.nested.$$NestedModelToJsonConverter;
import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$BodyWithHeadersResponseModelToJsonConverter extends ModelToJsonConverter<BodyWithHeadersResponse> {

    private final $$NestedModelToJsonConverter nestedModelToJsonConverter =
            new $$NestedModelToJsonConverter();

    @Override
    public Map<String, Object> toJsonObject(final BodyWithHeadersResponse model) {
        final JsonObjectBuilder builder = new JsonObjectBuilder();
        putValuesToBuilder(model, builder);
        return builder.build();
    }

    protected void putValuesToBuilder(final BodyWithHeadersResponse model,
                                      final JsonObjectBuilder builder) {
        builder.put("booleanParameter", model.booleanParameter);
        builder.put("byteParameter", model.byteParameter);
        builder.put("shortParameter", model.shortParameter);
        builder.put("intParameter", model.intParameter);
        builder.put("longParameter", model.longParameter);
        builder.put("bigIntParameter", model.bigIntParameter);
        builder.put("floatParameter", model.floatParameter);
        builder.put("doubleParameter", model.doubleParameter);
        builder.put("decimalParameter", model.decimalParameter);
        builder.put("charParameter", model.charParameter);
        builder.put("stringParameter", model.stringParameter);
        builder.put("instantParameter", model.instantParameter);
        builder.put("enumParameter", model.enumParameter);
        builder.put("booleanParameterList", model.booleanParameterList);
        builder.put("byteParameterList", model.byteParameterList);
        builder.put("shortParameterList", model.shortParameterList);
        builder.put("intParameterList", model.intParameterList);
        builder.put("longParameterList", model.longParameterList);
        builder.put("bigIntParameterList", model.bigIntParameterList);
        builder.put("floatParameterList", model.floatParameterList);
        builder.put("doubleParameterList", model.doubleParameterList);
        builder.put("decimalParameterList", model.decimalParameterList);
        builder.put("charParameterList", model.charParameterList);
        builder.put("stringParameterList", model.stringParameterList);
        builder.put("instantParameterList", model.instantParameterList);
        builder.put("enumParameterList", model.enumParameterList);
        builder.put("booleanParameterSet", model.booleanParameterSet);
        builder.put("byteParameterSet", model.byteParameterSet);
        builder.put("shortParameterSet", model.shortParameterSet);
        builder.put("intParameterSet", model.intParameterSet);
        builder.put("longParameterSet", model.longParameterSet);
        builder.put("bigIntParameterSet", model.bigIntParameterSet);
        builder.put("floatParameterSet", model.floatParameterSet);
        builder.put("doubleParameterSet", model.doubleParameterSet);
        builder.put("decimalParameterSet", model.decimalParameterSet);
        builder.put("charParameterSet", model.charParameterSet);
        builder.put("stringParameterSet", model.stringParameterSet);
        builder.put("instantParameterSet", model.instantParameterSet);
        builder.put("enumParameterSet", model.enumParameterSet);
        builder.put("booleanParameterMap", model.booleanParameterMap);
        builder.put("byteParameterMap", model.byteParameterMap);
        builder.put("shortParameterMap", model.shortParameterMap);
        builder.put("integerParameterMap", model.integerParameterMap);
        builder.put("longParameterMap", model.longParameterMap);
        builder.put("bigIntegerParameterMap", model.bigIntegerParameterMap);
        builder.put("floatParameterMap", model.floatParameterMap);
        builder.put("doubleParameterMap", model.doubleParameterMap);
        builder.put("bigDecimalParameterMap", model.bigDecimalParameterMap);
        builder.put("characterParameterMap", model.characterParameterMap);
        builder.put("stringParameterMap", model.stringParameterMap);
        builder.put("instantParameterMap", model.instantParameterMap);
        builder.put("enumParameterMap", model.enumParameterMap);
        builder.put("nested", convertFromObjectIfNotNull(nestedModelToJsonConverter, model.nested));
        builder.put("nestedList", convertFromListIfNotNull(nestedModelToJsonConverter, model.nestedList));
        builder.put("nestedSet", convertFromSetIfNotNull(nestedModelToJsonConverter, model.nestedSet));
        builder.put("nestedParameterMap", convertFromMapIfNotNull(nestedModelToJsonConverter, model.nestedParameterMap));
    }
}
