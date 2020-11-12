package rxmicro;

import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.BadHttpRequestRestController;
import io.rxmicro.rest.server.detail.component.RestControllerAggregator;
import io.rxmicro.rest.server.detail.model.mapping.ExactUrlRequestMappingRule;

import java.util.List;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$RestControllerAggregatorImpl extends RestControllerAggregator {

    static {
        $$EnvironmentCustomizer.customize();
    }

    @Override
    protected List<AbstractRestController> listAllRestControllers() {
        return List.of(
                new io.rxmicro.examples.rest.controller.redirect.$$MicroService(),
                new io.rxmicro.examples.rest.controller.redirect.$$MicroService2(),
                // See https://github.com/netty/netty/blob/c10c697e5bf664d9d8d1dcee93569265b19ca03a/codec-http/src/main/java/io/netty/handler/codec/http/HttpRequestDecoder.java#L93
                new BadHttpRequestRestController(new ExactUrlRequestMappingRule("GET", "/bad-request", false))
        );
    }
}
