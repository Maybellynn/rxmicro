package rxmicro;

import io.rxmicro.cdi.detail.InternalBeanFactory;
import io.rxmicro.examples.cdi.resource.basic.$$ComponentBeanSupplier;
import io.rxmicro.examples.cdi.resource.basic.Component;
import io.rxmicro.runtime.detail.ByTypeInstanceQualifier;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$BeanFactoryImpl extends InternalBeanFactory {

    static {
        $$EnvironmentCustomizer.customize();
    }

    public $$BeanFactoryImpl() {
        register(
                Component.class, new $$ComponentBeanSupplier(),
                new ByTypeInstanceQualifier<>(Component.class)
        );
    }
}