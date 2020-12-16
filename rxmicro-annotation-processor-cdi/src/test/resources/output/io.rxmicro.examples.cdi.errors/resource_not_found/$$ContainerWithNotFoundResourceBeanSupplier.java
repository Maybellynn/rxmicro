package io.rxmicro.examples.cdi.errors.resource_not_found;

import io.rxmicro.cdi.detail.BeanSupplier;
import io.rxmicro.cdi.resource.ClasspathPropertiesResourceConverter;

import static io.rxmicro.cdi.detail.ResourceLoaderFactory.loadResource;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$ContainerWithNotFoundResourceBeanSupplier extends BeanSupplier<ContainerWithNotFoundResource> {

    @Override
    public ContainerWithNotFoundResource get() {
        final ContainerWithNotFoundResource bean = new ContainerWithNotFoundResource();
        bean.resources = loadResource("classpath:resources.properties", ClasspathPropertiesResourceConverter.class);
        return bean;
    }
}