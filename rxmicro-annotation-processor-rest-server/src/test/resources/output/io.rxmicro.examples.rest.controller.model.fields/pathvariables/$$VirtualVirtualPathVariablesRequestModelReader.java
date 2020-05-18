package io.rxmicro.examples.rest.controller.model.fields.pathvariables;

import io.rxmicro.examples.rest.controller.model.fields.Status;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualVirtualPathVariablesRequestModelReader extends ModelReader<$$VirtualVirtualPathVariablesRequest> {

    @Override
    public $$VirtualVirtualPathVariablesRequest read(final PathVariableMapping pathVariableMapping,
                                                     final HttpRequest request,
                                                     final boolean readParametersFromBody) {
        final $$VirtualVirtualPathVariablesRequest model = new $$VirtualVirtualPathVariablesRequest();
        model.booleanParameter = toBoolean(pathVariableMapping.getValue("a"), HttpModelType.PATH, "a");
        model.byteParameter = toByte(pathVariableMapping.getValue("b"), HttpModelType.PATH, "b");
        model.shortParameter = toShort(pathVariableMapping.getValue("c"), HttpModelType.PATH, "c");
        model.intParameter = toInteger(pathVariableMapping.getValue("d"), HttpModelType.PATH, "d");
        model.longParameter = toLong(pathVariableMapping.getValue("e"), HttpModelType.PATH, "e");
        model.bigIntParameter = toBigInteger(pathVariableMapping.getValue("f"), HttpModelType.PATH, "f");
        model.floatParameter = toFloat(pathVariableMapping.getValue("g"), HttpModelType.PATH, "g");
        model.doubleParameter = toDouble(pathVariableMapping.getValue("h"), HttpModelType.PATH, "h");
        model.decimalParameter = toBigDecimal(pathVariableMapping.getValue("i"), HttpModelType.PATH, "i");
        model.charParameter = toCharacter(pathVariableMapping.getValue("j"), HttpModelType.PATH, "j");
        model.stringParameter = toString(pathVariableMapping.getValue("k"), HttpModelType.PATH, "k");
        model.instantParameter = toInstant(pathVariableMapping.getValue("l"), HttpModelType.PATH, "l");
        model.status = toEnum(Status.class, pathVariableMapping.getValue("m"), HttpModelType.PATH, "m");
        return model;
    }
}
