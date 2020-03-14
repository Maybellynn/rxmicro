package io.rxmicro.examples.cdi.post.construct;

import io.rxmicro.cdi.detail.BeanSupplier;
import io.rxmicro.cdi.detail.ByTypeAndNameInstanceQualifier;
import io.rxmicro.runtime.detail.ByTypeInstanceQualifier;

import static io.rxmicro.cdi.detail.InternalBeanFactory.getRequiredBean;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$BusinessService2FacadeBeanSupplier extends BeanSupplier<BusinessService2Facade> {

    @Override
    public BusinessService2Facade get() {
        final BusinessService2Facade bean = new BusinessService2Facade();
        bean.businessService = getRequiredBean(
                bean,
                "businessService",
                new ByTypeAndNameInstanceQualifier<>(BusinessService.class, "businessService"),
                new ByTypeInstanceQualifier<>(BusinessService.class)
        );
        bean.anyName();
        return bean;
    }
}
