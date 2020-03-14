package rxmicro;

import io.rxmicro.cdi.detail.ByTypeAndNameInstanceQualifier;
import io.rxmicro.cdi.detail.InternalBeanFactory;
import io.rxmicro.examples.cdi.method.injection.$$BusinessServiceFacadeBeanSupplier;
import io.rxmicro.examples.cdi.method.injection.$$BusinessServiceImplBeanSupplier;
import io.rxmicro.examples.cdi.method.injection.BusinessService;
import io.rxmicro.examples.cdi.method.injection.BusinessServiceFacade;
import io.rxmicro.examples.cdi.method.injection.BusinessServiceImpl;
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
                BusinessServiceFacade.class, new $$BusinessServiceFacadeBeanSupplier(),
                new ByTypeInstanceQualifier<>(BusinessServiceFacade.class)
        );
        register(
                BusinessServiceImpl.class, new $$BusinessServiceImplBeanSupplier(),
                new ByTypeInstanceQualifier<>(BusinessServiceImpl.class),
                new ByTypeAndNameInstanceQualifier<>(BusinessService.class, "businessServiceImpl"),
                new ByTypeInstanceQualifier<>(BusinessService.class)
        );
    }
}
