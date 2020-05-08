package rxmicro;

import io.rxmicro.examples.processor.restclient.v1.$$RestClientV1;
import io.rxmicro.examples.processor.restclient.v1.RestClientV1;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.RestClientFactory;

import static io.rxmicro.rest.client.detail.RestClientImplFactory.createRestClient;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$RestClientFactoryImpl extends RestClientFactory {

    static {
        $$EnvironmentCustomizer.customize();
    }

    public $$RestClientFactoryImpl() {
        register(RestClientV1.class, () -> createRestClient(
                "http-client",
                HttpClientConfig.class,
                RestClientV1.class,
                $$RestClientV1::new)
        );
    }
}
