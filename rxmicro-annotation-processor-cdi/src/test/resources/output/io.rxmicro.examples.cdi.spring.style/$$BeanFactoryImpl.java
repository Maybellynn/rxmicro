package rxmicro;

import io.rxmicro.cdi.detail.ByTypeAndNameInstanceQualifier;
import io.rxmicro.cdi.detail.InternalBeanFactory;
import io.rxmicro.examples.cdi.spring.style.$$BusinessServiceFacadeBeanSupplier;
import io.rxmicro.examples.cdi.spring.style.BusinessService;
import io.rxmicro.examples.cdi.spring.style.BusinessServiceFacade;
import io.rxmicro.examples.cdi.spring.style.impl.$$DevelopmentBusinessServiceBeanSupplier;
import io.rxmicro.examples.cdi.spring.style.impl.$$ProductionBusinessServiceBeanSupplier;
import io.rxmicro.examples.cdi.spring.style.impl.DevelopmentBusinessService;
import io.rxmicro.examples.cdi.spring.style.impl.ProductionBusinessService;
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
                DevelopmentBusinessService.class, new $$DevelopmentBusinessServiceBeanSupplier(),
                new ByTypeInstanceQualifier<>(DevelopmentBusinessService.class),
                new ByTypeAndNameInstanceQualifier<>(BusinessService.class, "Development"),
                new ByTypeInstanceQualifier<>(BusinessService.class)
        );
        register(
                ProductionBusinessService.class, new $$ProductionBusinessServiceBeanSupplier(),
                new ByTypeInstanceQualifier<>(ProductionBusinessService.class),
                new ByTypeAndNameInstanceQualifier<>(BusinessService.class, "Production"),
                new ByTypeInstanceQualifier<>(BusinessService.class)
        );
    }
}
