package rxmicro.examples.cdi.post.construct;

import io.rxmicro.cdi.detail.ByTypeAndNameInstanceQualifier;
import io.rxmicro.cdi.detail.InternalBeanFactory;
import io.rxmicro.examples.cdi.post.construct.$$BusinessService1FacadeBeanSupplier;
import io.rxmicro.examples.cdi.post.construct.$$BusinessService2FacadeBeanSupplier;
import io.rxmicro.examples.cdi.post.construct.BusinessService;
import io.rxmicro.examples.cdi.post.construct.BusinessService1Facade;
import io.rxmicro.examples.cdi.post.construct.BusinessService2Facade;
import io.rxmicro.examples.cdi.post.construct.BusinessServiceImpl;
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
                BusinessService1Facade.class, new $$BusinessService1FacadeBeanSupplier(),
                new ByTypeInstanceQualifier<>(BusinessService1Facade.class)
        );
        register(
                BusinessService2Facade.class, new $$BusinessService2FacadeBeanSupplier(),
                new ByTypeInstanceQualifier<>(BusinessService2Facade.class)
        );
        register(
                BusinessServiceImpl.class, () -> new BusinessServiceImpl(),
                new ByTypeInstanceQualifier<>(BusinessServiceImpl.class),
                new ByTypeAndNameInstanceQualifier<>(BusinessService.class, "businessServiceImpl"),
                new ByTypeInstanceQualifier<>(BusinessService.class)
        );
    }
}