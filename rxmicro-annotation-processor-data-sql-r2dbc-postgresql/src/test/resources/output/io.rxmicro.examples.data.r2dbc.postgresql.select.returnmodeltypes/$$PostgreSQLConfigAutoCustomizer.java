package rxmicro;

import io.rxmicro.data.sql.r2dbc.postgresql.detail.PostgreSQLConfigAutoCustomizer;
import io.rxmicro.examples.data.r2dbc.postgresql.select.returnmodeltypes.model.Role;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$PostgreSQLConfigAutoCustomizer extends PostgreSQLConfigAutoCustomizer{

    private static final Map<String, Class<? extends Enum<?>>> POSTGRES_ENUM_MAPPING = Map.of(
            "role", Role.class
    );

    static {
        // Registers enum codecs for all found enums
        registerAllPostgreSQLCodecs(POSTGRES_ENUM_MAPPING);
    }

    private $$PostgreSQLConfigAutoCustomizer(){
    }
}
