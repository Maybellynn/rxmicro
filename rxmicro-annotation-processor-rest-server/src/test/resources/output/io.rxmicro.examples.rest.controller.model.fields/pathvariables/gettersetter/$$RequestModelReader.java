package io.rxmicro.examples.rest.controller.model.fields.pathvariables.gettersetter;

import io.rxmicro.examples.rest.controller.model.fields.Status;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RequestModelReader extends ModelReader<Request> {

    @Override
    public Request read(final PathVariableMapping pathVariableMapping,
                        final HttpRequest request,
                        final boolean readParametersFromBody) {
        final Request model = new Request();
        model.setBooleanParameter(toBoolean(pathVariableMapping.getValue("a"), HttpModelType.PATH, "a"));
        model.setByteParameter(toByte(pathVariableMapping.getValue("b"), HttpModelType.PATH, "b"));
        model.setShortParameter(toShort(pathVariableMapping.getValue("c"), HttpModelType.PATH, "c"));
        model.setIntParameter(toInteger(pathVariableMapping.getValue("d"), HttpModelType.PATH, "d"));
        model.setLongParameter(toLong(pathVariableMapping.getValue("e"), HttpModelType.PATH, "e"));
        model.setBigIntParameter(toBigInteger(pathVariableMapping.getValue("f"), HttpModelType.PATH, "f"));
        model.setFloatParameter(toFloat(pathVariableMapping.getValue("g"), HttpModelType.PATH, "g"));
        model.setDoubleParameter(toDouble(pathVariableMapping.getValue("h"), HttpModelType.PATH, "h"));
        model.setDecimalParameter(toBigDecimal(pathVariableMapping.getValue("i"), HttpModelType.PATH, "i"));
        model.setCharParameter(toCharacter(pathVariableMapping.getValue("j"), HttpModelType.PATH, "j"));
        model.setStringParameter(toString(pathVariableMapping.getValue("k"), HttpModelType.PATH, "k"));
        model.setInstantParameter(toInstant(pathVariableMapping.getValue("l"), HttpModelType.PATH, "l"));
        model.setStatus(toEnum(Status.class, pathVariableMapping.getValue("m"), HttpModelType.PATH, "m"));
        return model;
    }
}
