package rxmicro;

import io.rxmicro.cdi.detail.InternalBeanFactory;
import io.rxmicro.examples.processor.all.components.$$MicroServiceBeanSupplier;
import io.rxmicro.examples.processor.all.components.MicroService;
import io.rxmicro.runtime.detail.ByTypeInstanceQualifier;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$BeanFactoryImpl extends InternalBeanFactory {

    static {
        $$EnvironmentCustomizer.customize();
    }

    public $$BeanFactoryImpl() {
        register(
                MicroService.class, new $$MicroServiceBeanSupplier(),
                new ByTypeInstanceQualifier<>(MicroService.class)
        );
    }
}
