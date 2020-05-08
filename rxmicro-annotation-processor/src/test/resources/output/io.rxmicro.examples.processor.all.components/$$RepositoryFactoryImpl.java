package rxmicro;

import io.rxmicro.data.RepositoryFactory;
import io.rxmicro.examples.processor.all.components.component.$$MongoMongoDataRepository;
import io.rxmicro.examples.processor.all.components.component.$$PostgreSQLPostgreSQLDataRepository;
import io.rxmicro.examples.processor.all.components.component.MongoDataRepository;
import io.rxmicro.examples.processor.all.components.component.PostgreSQLDataRepository;

import static io.rxmicro.data.mongo.detail.MongoRepositoryFactory.createMongoRepository;
import static io.rxmicro.data.sql.r2dbc.postgresql.detail.PostgreSQLRepositoryFactory.createPostgreSQLRepository;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$RepositoryFactoryImpl extends RepositoryFactory {

    static {
        $$EnvironmentCustomizer.customize();
    }

    public $$RepositoryFactoryImpl() {
        register(MongoDataRepository.class,
                () -> createMongoRepository("mongo", $$MongoMongoDataRepository::new));
        register(PostgreSQLDataRepository.class,
                () -> createPostgreSQLRepository("postgre-sql", $$PostgreSQLPostgreSQLDataRepository::new));
    }
}
