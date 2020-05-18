package rxmicro;

import io.rxmicro.cdi.detail.InternalBeanFactory;
import io.rxmicro.examples.cdi.all.rxmicro.components.jee.$$InternalTypesJEEStyleConstructorInjectionRestControllerBeanSupplier;
import io.rxmicro.examples.cdi.all.rxmicro.components.jee.$$InternalTypesJEEStyleFieldInjectionRestControllerBeanSupplier;
import io.rxmicro.examples.cdi.all.rxmicro.components.jee.$$InternalTypesJEEStyleMethodInjectionRestControllerBeanSupplier;
import io.rxmicro.examples.cdi.all.rxmicro.components.jee.$$InternalTypesJEEStylePrivateFieldInjectionRestControllerBeanSupplier;
import io.rxmicro.examples.cdi.all.rxmicro.components.jee.InternalTypesJEEStyleConstructorInjectionRestController;
import io.rxmicro.examples.cdi.all.rxmicro.components.jee.InternalTypesJEEStyleFieldInjectionRestController;
import io.rxmicro.examples.cdi.all.rxmicro.components.jee.InternalTypesJEEStyleMethodInjectionRestController;
import io.rxmicro.examples.cdi.all.rxmicro.components.jee.InternalTypesJEEStylePrivateFieldInjectionRestController;
import io.rxmicro.examples.cdi.all.rxmicro.components.spring.$$InternalTypesSpringStyleConstructorInjectionRestControllerBeanSupplier;
import io.rxmicro.examples.cdi.all.rxmicro.components.spring.$$InternalTypesSpringStyleFieldInjectionRestControllerBeanSupplier;
import io.rxmicro.examples.cdi.all.rxmicro.components.spring.$$InternalTypesSpringStyleMethodInjectionRestControllerBeanSupplier;
import io.rxmicro.examples.cdi.all.rxmicro.components.spring.$$InternalTypesSpringStylePrivateFieldInjectionRestControllerBeanSupplier;
import io.rxmicro.examples.cdi.all.rxmicro.components.spring.InternalTypesSpringStyleConstructorInjectionRestController;
import io.rxmicro.examples.cdi.all.rxmicro.components.spring.InternalTypesSpringStyleFieldInjectionRestController;
import io.rxmicro.examples.cdi.all.rxmicro.components.spring.InternalTypesSpringStyleMethodInjectionRestController;
import io.rxmicro.examples.cdi.all.rxmicro.components.spring.InternalTypesSpringStylePrivateFieldInjectionRestController;
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
                InternalTypesJEEStyleConstructorInjectionRestController.class, new $$InternalTypesJEEStyleConstructorInjectionRestControllerBeanSupplier(),
                new ByTypeInstanceQualifier<>(InternalTypesJEEStyleConstructorInjectionRestController.class)
        );
        register(
                InternalTypesJEEStyleFieldInjectionRestController.class, new $$InternalTypesJEEStyleFieldInjectionRestControllerBeanSupplier(),
                new ByTypeInstanceQualifier<>(InternalTypesJEEStyleFieldInjectionRestController.class)
        );
        register(
                InternalTypesJEEStyleMethodInjectionRestController.class, new $$InternalTypesJEEStyleMethodInjectionRestControllerBeanSupplier(),
                new ByTypeInstanceQualifier<>(InternalTypesJEEStyleMethodInjectionRestController.class)
        );
        register(
                InternalTypesJEEStylePrivateFieldInjectionRestController.class, new $$InternalTypesJEEStylePrivateFieldInjectionRestControllerBeanSupplier(),
                new ByTypeInstanceQualifier<>(InternalTypesJEEStylePrivateFieldInjectionRestController.class)
        );
        register(
                InternalTypesSpringStyleConstructorInjectionRestController.class, new $$InternalTypesSpringStyleConstructorInjectionRestControllerBeanSupplier(),
                new ByTypeInstanceQualifier<>(InternalTypesSpringStyleConstructorInjectionRestController.class)
        );
        register(
                InternalTypesSpringStyleFieldInjectionRestController.class, new $$InternalTypesSpringStyleFieldInjectionRestControllerBeanSupplier(),
                new ByTypeInstanceQualifier<>(InternalTypesSpringStyleFieldInjectionRestController.class)
        );
        register(
                InternalTypesSpringStyleMethodInjectionRestController.class, new $$InternalTypesSpringStyleMethodInjectionRestControllerBeanSupplier(),
                new ByTypeInstanceQualifier<>(InternalTypesSpringStyleMethodInjectionRestController.class)
        );
        register(
                InternalTypesSpringStylePrivateFieldInjectionRestController.class, new $$InternalTypesSpringStylePrivateFieldInjectionRestControllerBeanSupplier(),
                new ByTypeInstanceQualifier<>(InternalTypesSpringStylePrivateFieldInjectionRestController.class)
        );
    }
}
