package rxmicro.examples.rest.client.model.field.mapping.strategy;

import io.rxmicro.examples.rest.client.model.field.mapping.strategy.$$MappingStrategyRestClient;
import io.rxmicro.examples.rest.client.model.field.mapping.strategy.MappingStrategyRestClient;
import io.rxmicro.rest.client.RestClientConfig;
import io.rxmicro.rest.client.RestClientFactory;

import static io.rxmicro.rest.client.detail.RestClientImplFactory.createRestClient;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RestClientFactoryImpl extends RestClientFactory {

    static {
        $$EnvironmentCustomizer.customize();
    }

    public $$RestClientFactoryImpl() {
        register(MappingStrategyRestClient.class, () -> createRestClient(
                "rest-client",
                RestClientConfig.class,
                MappingStrategyRestClient.class,
                $$MappingStrategyRestClient::new)
        );
    }
}