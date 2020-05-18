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

    protected List<AbstractRestController> listAllRestControllers() {
        return List.of(
                // See https://github.com/netty/netty/blob/c10c697e5bf664d9d8d1dcee93569265b19ca03a/codec-http/src/main/java/io/netty/handler/codec/http/HttpRequestDecoder.java#L93
                new BadHttpRequestRestController(new ExactUrlRequestMappingRule("GET", "/bad-request", false)),
                new io.rxmicro.examples.rest.controller.model.fields.$$MappingStrategyMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.headers.$$DirectHeadersMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.headers.$$GetterSetterHeadersMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.headers.$$ReflectionHeadersMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.headers.$$VirtualHeadersMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.internals.$$DirectInternalsMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.internals.$$GetterSetterInternalsMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.internals.$$ReflectionInternalsMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.internals.$$VirtualInternalsMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.params.$$DirectParamsMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.params.$$GetterSetterParamsMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.params.$$ReflectionParamsMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.params.$$VirtualParamsMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.pathvariables.$$DirectPathVariablesMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.pathvariables.$$GetterSetterPathVariablesMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.pathvariables.$$ReflectionPathVariablesMicroService(),
                new io.rxmicro.examples.rest.controller.model.fields.pathvariables.$$VirtualPathVariablesMicroService()
        );
    }
}
