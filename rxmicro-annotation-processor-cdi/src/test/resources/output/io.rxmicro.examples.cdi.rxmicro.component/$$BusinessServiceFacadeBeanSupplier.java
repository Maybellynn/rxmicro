package io.rxmicro.examples.cdi.rxmicro.component;

import io.rxmicro.cdi.detail.BeanSupplier;
import io.rxmicro.http.client.HttpClientConfig;

import static io.rxmicro.config.Configs.getConfig;
import static io.rxmicro.rest.client.RestClientFactory.getRestClient;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$BusinessServiceFacadeBeanSupplier extends BeanSupplier<BusinessServiceFacade> {

    @Override
    public BusinessServiceFacade get() {
        final BusinessServiceFacade bean = new BusinessServiceFacade();
        bean.restClient = getRestClient(RESTClient.class);
        bean.config = getConfig("http-client", HttpClientConfig.class);
        bean.postConstruct();
        return bean;
    }
}
