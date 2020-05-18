package rxmicro;

import static io.rxmicro.runtime.detail.Runtimes.getRuntimeModule;

/**
 * Generated by {@code RxMicro Annotation Processor}
 *
 *
 */
final class $$EnvironmentCustomizer {

    static {
        addExportsToRuntime();
        // All required customization must be here
    }

    public static void customize() {
        //do nothing. All customization is done at the static section
    }

    private static void addExportsToRuntime() {
        final Module currentModule = $$EnvironmentCustomizer.class.getModule();
        currentModule.addExports("rxmicro", getRuntimeModule());
    }

    private $$EnvironmentCustomizer() {
    }
}
