package rxmicro;

import io.rxmicro.rest.server.detail.component.AbstractRestController;
import io.rxmicro.rest.server.detail.component.RestControllerAggregator;

import java.util.List;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$RestControllerAggregatorImpl extends RestControllerAggregator {

    static {
        $$EnvironmentCustomizer.customize();
    }

    protected List<AbstractRestController> listAllRestControllers() {
        return List.of(
                new io.rxmicro.examples.rest.controller.internals.$$MicroService()
        );
    }
}
