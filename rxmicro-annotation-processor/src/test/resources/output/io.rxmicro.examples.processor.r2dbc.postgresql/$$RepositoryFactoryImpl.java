package rxmicro;

import io.rxmicro.data.RepositoryFactory;
import io.rxmicro.examples.processor.r2dbc.postgresql.$$PostgreSQLDataRepository;
import io.rxmicro.examples.processor.r2dbc.postgresql.DataRepository;

import static io.rxmicro.data.sql.r2dbc.postgresql.detail.PostgreSQLRepositoryFactory.createPostgreSQLRepository;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$RepositoryFactoryImpl extends RepositoryFactory {

    static {
        $$EnvironmentCustomizer.customize();
    }

    public $$RepositoryFactoryImpl() {
        register(DataRepository.class,
                () -> createPostgreSQLRepository("postgre-sql", $$PostgreSQLDataRepository::new));
    }
}
