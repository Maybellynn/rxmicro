package rxmicro;

import io.rxmicro.common.RxMicroException;

import java.lang.reflect.Field;

import static io.rxmicro.runtime.detail.Reflections.getField;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$Reflections {

    public static Object getFieldValue(final Object model,
                                       final String fieldName) {
        final Field field = getField(model, fieldName, f -> {
            if (!f.canAccess(model)) {
                f.setAccessible(true);
            }
        });
        try {
            return field.get(model);
        } catch (IllegalAccessException e) {
            throw new RxMicroException(e);
        }
    }

    public static void setFieldValue(final Object model,
                                     final String fieldName,
                                     final Object value) {
        final Field field = getField(model, fieldName, f -> {
            if (!f.canAccess(model)) {
                f.setAccessible(true);
            }
        });
        try {
            field.set(model, value);
        } catch (IllegalAccessException e) {
            throw new RxMicroException(e);
        }
    }

    private $$Reflections() {
    }
}
