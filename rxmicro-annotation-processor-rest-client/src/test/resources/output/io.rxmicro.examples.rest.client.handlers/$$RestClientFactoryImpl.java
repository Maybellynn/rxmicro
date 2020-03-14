package rxmicro;

import io.rxmicro.examples.rest.client.handlers.$$RestClientWithBody;
import io.rxmicro.examples.rest.client.handlers.$$RestClientWithoutBody;
import io.rxmicro.examples.rest.client.handlers.RestClientWithBody;
import io.rxmicro.examples.rest.client.handlers.RestClientWithoutBody;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.client.RestClientFactory;

import static io.rxmicro.rest.client.detail.RestClientImplFactory.createRestClient;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$RestClientFactoryImpl extends RestClientFactory {

    static {
        $$EnvironmentCustomizer.customize();
    }

    public $$RestClientFactoryImpl() {
        register(RestClientWithBody.class, () -> createRestClient(
                "http-client",
                HttpClientConfig.class,
                RestClientWithBody.class,
                $$RestClientWithBody::new)
        );
        register(RestClientWithoutBody.class, () -> createRestClient(
                "http-client",
                HttpClientConfig.class,
                RestClientWithoutBody.class,
                $$RestClientWithoutBody::new)
        );
    }
}
