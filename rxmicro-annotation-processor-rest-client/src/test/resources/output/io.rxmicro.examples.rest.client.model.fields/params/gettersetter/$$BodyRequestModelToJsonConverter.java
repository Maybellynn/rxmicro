package io.rxmicro.examples.rest.client.model.fields.params.gettersetter;

import io.rxmicro.examples.rest.client.model.fields.params.gettersetter.nested.$$NestedModelToJsonConverter;
import io.rxmicro.exchange.json.detail.ModelToJsonConverter;
import io.rxmicro.json.JsonObjectBuilder;

import java.util.Map;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$BodyRequestModelToJsonConverter extends ModelToJsonConverter<BodyRequest> {

    private final $$NestedModelToJsonConverter nestedModelToJsonConverter =
            new $$NestedModelToJsonConverter();

    @Override
    public Map<String, Object> toJsonObject(final BodyRequest model) {
        return new JsonObjectBuilder()
                .put("booleanParameter", model.getBooleanParameter())
                .put("byteParameter", model.getByteParameter())
                .put("shortParameter", model.getShortParameter())
                .put("intParameter", model.getIntParameter())
                .put("longParameter", model.getLongParameter())
                .put("bigIntParameter", model.getBigIntParameter())
                .put("floatParameter", model.getFloatParameter())
                .put("doubleParameter", model.getDoubleParameter())
                .put("decimalParameter", model.getDecimalParameter())
                .put("charParameter", model.getCharParameter())
                .put("stringParameter", model.getStringParameter())
                .put("instantParameter", model.getInstantParameter())
                .put("status", model.getStatus())
                .put("booleanParameters", model.getBooleanParameters())
                .put("byteParameters", model.getByteParameters())
                .put("shortParameters", model.getShortParameters())
                .put("intParameters", model.getIntParameters())
                .put("longParameters", model.getLongParameters())
                .put("bigIntParameters", model.getBigIntParameters())
                .put("floatParameters", model.getFloatParameters())
                .put("doubleParameters", model.getDoubleParameters())
                .put("decimalParameters", model.getDecimalParameters())
                .put("charParameters", model.getCharParameters())
                .put("stringParameters", model.getStringParameters())
                .put("instantParameters", model.getInstantParameters())
                .put("statuses", model.getStatuses())
                .put("nested", convertIfNotNull(nestedModelToJsonConverter, model.getNested()))
                .put("nestedList", convertIfNotNull(nestedModelToJsonConverter, model.getNestedList()))
                .build();
    }
}
