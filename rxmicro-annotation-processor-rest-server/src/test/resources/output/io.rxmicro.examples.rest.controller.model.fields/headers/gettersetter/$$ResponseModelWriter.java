package io.rxmicro.examples.rest.controller.model.fields.headers.gettersetter;

import io.rxmicro.examples.rest.controller.model.fields.Status;
import io.rxmicro.rest.server.detail.component.ModelWriter;
import io.rxmicro.rest.server.detail.model.HttpResponse;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ResponseModelWriter extends ModelWriter<Response> {

    public $$ResponseModelWriter(final boolean humanReadableOutput) {
        //do nothing
    }

    @Override
    public void write(final Response model,
                      final HttpResponse response) {
        response.setHeader("booleanParameter", model.getBooleanParameter());
        response.setHeader("byteParameter", model.getByteParameter());
        response.setHeader("shortParameter", model.getShortParameter());
        response.setHeader("intParameter", model.getIntParameter());
        response.setHeader("longParameter", model.getLongParameter());
        response.setHeader("bigIntParameter", model.getBigIntParameter());
        response.setHeader("floatParameter", model.getFloatParameter());
        response.setHeader("doubleParameter", model.getDoubleParameter());
        response.setHeader("decimalParameter", model.getDecimalParameter());
        response.setHeader("charParameter", model.getCharParameter());
        response.setHeader("stringParameter", model.getStringParameter());
        response.setHeader("instantParameter", model.getInstantParameter());
        response.setHeader("status", model.getStatus());
        response.setHeader("booleanParameters", model.getBooleanParameters());
        response.setHeader("byteParameters", model.getByteParameters());
        response.setHeader("shortParameters", model.getShortParameters());
        response.setHeader("intParameters", model.getIntParameters());
        response.setHeader("longParameters", model.getLongParameters());
        response.setHeader("bigIntParameters", model.getBigIntParameters());
        response.setHeader("floatParameters", model.getFloatParameters());
        response.setHeader("doubleParameters", model.getDoubleParameters());
        response.setHeader("decimalParameters", model.getDecimalParameters());
        response.setHeader("charParameters", model.getCharParameters());
        response.setHeader("stringParameters", model.getStringParameters());
        response.setHeader("instantParameters", model.getInstantParameters());
        response.setHeader("statuses", model.getStatuses());
        response.setHeader("booleanParameterSet", model.getBooleanParameterSet());
        response.setHeader("byteParameterSet", model.getByteParameterSet());
        response.setHeader("shortParameterSet", model.getShortParameterSet());
        response.setHeader("intParameterSet", model.getIntParameterSet());
        response.setHeader("longParameterSet", model.getLongParameterSet());
        response.setHeader("bigIntParameterSet", model.getBigIntParameterSet());
        response.setHeader("floatParameterSet", model.getFloatParameterSet());
        response.setHeader("doubleParameterSet", model.getDoubleParameterSet());
        response.setHeader("decimalParameterSet", model.getDecimalParameterSet());
        response.setHeader("charParameterSet", model.getCharParameterSet());
        response.setHeader("stringParameterSet", model.getStringParameterSet());
        response.setHeader("instantParameterSet", model.getInstantParameterSet());
        response.setHeader("statusSet", model.getStatusSet());
        for (final Status item : model.getRepeatingStatuses()) {
            response.addHeader("repeatingStatuses", item);
        }
        for (final Status item : model.getRepeatingStatusSet()) {
            response.addHeader("repeatingStatusSet", item);
        }
    }
}
