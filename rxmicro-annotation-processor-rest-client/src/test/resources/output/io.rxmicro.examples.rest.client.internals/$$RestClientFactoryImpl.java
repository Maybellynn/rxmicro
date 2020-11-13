package rxmicro;

import io.rxmicro.examples.rest.client.internals.$$RESTClient;
import io.rxmicro.examples.rest.client.internals.RESTClient;
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
        register(RESTClient.class, () -> createRestClient(
                "rest-client",
                RestClientConfig.class,
                RESTClient.class,
                $$RESTClient::new)
        );
    }
}
