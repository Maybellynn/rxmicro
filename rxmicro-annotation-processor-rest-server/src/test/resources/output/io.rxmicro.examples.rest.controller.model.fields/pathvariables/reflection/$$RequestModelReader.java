package io.rxmicro.examples.rest.controller.model.fields.pathvariables.reflection;

import io.rxmicro.examples.rest.controller.model.fields.Status;
import io.rxmicro.rest.model.HttpModelType;
import io.rxmicro.rest.model.PathVariableMapping;
import io.rxmicro.rest.server.detail.component.ModelReader;
import io.rxmicro.rest.server.detail.model.HttpRequest;

import static rxmicro.$$Reflections.setFieldValue;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$RequestModelReader extends ModelReader<Request> {

    @Override
    public Request read(final PathVariableMapping pathVariableMapping,
                        final HttpRequest request,
                        final boolean readParametersFromBody) {
        final Request model = new Request();
        setFieldValue(model, "booleanParameter", toBoolean(pathVariableMapping.getValue("a"), HttpModelType.path, "a"));
        setFieldValue(model, "byteParameter", toByte(pathVariableMapping.getValue("b"), HttpModelType.path, "b"));
        setFieldValue(model, "shortParameter", toShort(pathVariableMapping.getValue("c"), HttpModelType.path, "c"));
        setFieldValue(model, "intParameter", toInteger(pathVariableMapping.getValue("d"), HttpModelType.path, "d"));
        setFieldValue(model, "longParameter", toLong(pathVariableMapping.getValue("e"), HttpModelType.path, "e"));
        setFieldValue(model, "bigIntParameter", toBigInteger(pathVariableMapping.getValue("f"), HttpModelType.path, "f"));
        setFieldValue(model, "floatParameter", toFloat(pathVariableMapping.getValue("g"), HttpModelType.path, "g"));
        setFieldValue(model, "doubleParameter", toDouble(pathVariableMapping.getValue("h"), HttpModelType.path, "h"));
        setFieldValue(model, "decimalParameter", toBigDecimal(pathVariableMapping.getValue("i"), HttpModelType.path, "i"));
        setFieldValue(model, "charParameter", toCharacter(pathVariableMapping.getValue("j"), HttpModelType.path, "j"));
        setFieldValue(model, "stringParameter", toString(pathVariableMapping.getValue("k"), HttpModelType.path, "k"));
        setFieldValue(model, "instantParameter", toInstant(pathVariableMapping.getValue("l"), HttpModelType.path, "l"));
        setFieldValue(model, "status", toEnum(Status.class, pathVariableMapping.getValue("m"), HttpModelType.path, "m"));
        return model;
    }
}
