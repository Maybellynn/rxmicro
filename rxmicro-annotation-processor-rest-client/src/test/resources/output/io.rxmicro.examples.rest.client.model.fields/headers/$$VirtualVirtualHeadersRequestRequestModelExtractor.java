package io.rxmicro.examples.rest.client.model.fields.headers;

import io.rxmicro.examples.rest.client.model.fields.Status;
import io.rxmicro.rest.client.detail.HeaderBuilder;
import io.rxmicro.rest.client.detail.RequestModelExtractor;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualVirtualHeadersRequestRequestModelExtractor extends RequestModelExtractor<$$VirtualVirtualHeadersRequest> {

    @Override
    public void extract(final $$VirtualVirtualHeadersRequest model,
                        final HeaderBuilder headerBuilder) {
        headerBuilder.add("Boolean-Parameter", model.booleanParameter);
        headerBuilder.add("Byte-Parameter", model.byteParameter);
        headerBuilder.add("Short-Parameter", model.shortParameter);
        headerBuilder.add("Int-Parameter", model.intParameter);
        headerBuilder.add("Long-Parameter", model.longParameter);
        headerBuilder.add("Big-Int-Parameter", model.bigIntParameter);
        headerBuilder.add("Float-Parameter", model.floatParameter);
        headerBuilder.add("Double-Parameter", model.doubleParameter);
        headerBuilder.add("Decimal-Parameter", model.decimalParameter);
        headerBuilder.add("Char-Parameter", model.charParameter);
        headerBuilder.add("String-Parameter", model.stringParameter);
        headerBuilder.add("Instant-Parameter", model.instantParameter);
        headerBuilder.add("Status", model.status);
        headerBuilder.add("Boolean-Parameters", model.booleanParameters);
        headerBuilder.add("Byte-Parameters", model.byteParameters);
        headerBuilder.add("Short-Parameters", model.shortParameters);
        headerBuilder.add("Int-Parameters", model.intParameters);
        headerBuilder.add("Long-Parameters", model.longParameters);
        headerBuilder.add("Big-Int-Parameters", model.bigIntParameters);
        headerBuilder.add("Float-Parameters", model.floatParameters);
        headerBuilder.add("Double-Parameters", model.doubleParameters);
        headerBuilder.add("Decimal-Parameters", model.decimalParameters);
        headerBuilder.add("Char-Parameters", model.charParameters);
        headerBuilder.add("String-Parameters", model.stringParameters);
        headerBuilder.add("Instant-Parameters", model.instantParameters);
        headerBuilder.add("Statuses", model.statuses);
        for (final Status item : model.repeatingStatues) {
            headerBuilder.add("Repeating-Statues", item);
        }
    }
}
