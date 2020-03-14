package rxmicro;

import java.util.stream.Stream;

import static io.rxmicro.common.util.Formats.format;
import static io.rxmicro.runtime.detail.Runtimes.getRuntimeModule;
import static io.rxmicro.tool.common.Reflections.getToolCommonModule;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$ComponentTestFixer {

    static {
        final Module currentModule = $$ComponentTestFixer.class.getModule();
        currentModule.addExports("rxmicro", getRuntimeModule());
    }

    public $$ComponentTestFixer() {
        final Module currentModule = getClass().getModule();
        if (currentModule.isNamed()) {
            Stream.concat(
                    Stream.of(
                            getClass().getClassLoader().getUnnamedModule()
                    ),
                    Stream.of(
                            getRuntimeModule(),
                            getToolCommonModule()
                    ).filter(m -> m.isNamed())
            ).forEach(moduleName -> currentModule.getPackages().forEach(packageName -> {
                currentModule.addOpens(packageName, moduleName);
                System.out.println(format(
                        "opens ?/? to ?",
                        currentModule.getName(),
                        packageName,
                        moduleName.isNamed() ? moduleName.getName() : "ALL-UNNAMED")
                );
            }));
        }
    }
}
