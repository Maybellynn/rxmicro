package rxmicro;

import io.rxmicro.cdi.detail.ByTypeAndNameInstanceQualifier;
import io.rxmicro.cdi.detail.InternalBeanFactory;
import io.rxmicro.examples.cdi.ambiguty.resolving.impl.classname.named.field.$$BusinessServiceFacadeBeanSupplier;
import io.rxmicro.examples.cdi.ambiguty.resolving.impl.classname.named.field.BusinessService;
import io.rxmicro.examples.cdi.ambiguty.resolving.impl.classname.named.field.BusinessServiceFacade;
import io.rxmicro.examples.cdi.ambiguty.resolving.impl.classname.named.field.impl.DevelopmentBusinessService;
import io.rxmicro.examples.cdi.ambiguty.resolving.impl.classname.named.field.impl.ProductionBusinessService;
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
                BusinessServiceFacade.class, new $$BusinessServiceFacadeBeanSupplier(),
                new ByTypeInstanceQualifier<>(BusinessServiceFacade.class)
        );
        register(
                DevelopmentBusinessService.class, () -> new DevelopmentBusinessService(),
                new ByTypeInstanceQualifier<>(DevelopmentBusinessService.class),
                new ByTypeAndNameInstanceQualifier<>(BusinessService.class, "developmentBusinessService"),
                new ByTypeInstanceQualifier<>(BusinessService.class)
        );
        register(
                ProductionBusinessService.class, () -> new ProductionBusinessService(),
                new ByTypeInstanceQualifier<>(ProductionBusinessService.class),
                new ByTypeAndNameInstanceQualifier<>(BusinessService.class, "productionBusinessService"),
                new ByTypeInstanceQualifier<>(BusinessService.class)
        );
    }
}
