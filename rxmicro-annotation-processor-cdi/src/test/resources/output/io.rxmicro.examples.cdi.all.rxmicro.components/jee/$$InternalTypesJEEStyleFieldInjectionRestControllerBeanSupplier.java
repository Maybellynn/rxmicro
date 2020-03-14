package io.rxmicro.examples.cdi.all.rxmicro.components.jee;

import io.rxmicro.cdi.detail.BeanSupplier;
import io.rxmicro.data.mongo.MongoConfig;
import io.rxmicro.data.sql.r2dbc.postgresql.PostgreSQLConfig;
import io.rxmicro.examples.cdi.all.rxmicro.components.component.MongoRepository;
import io.rxmicro.examples.cdi.all.rxmicro.components.component.PostgreSQLRepository;
import io.rxmicro.examples.cdi.all.rxmicro.components.component.RestClient;
import io.rxmicro.http.client.HttpClientConfig;
import io.rxmicro.rest.server.HttpServerConfig;
import io.rxmicro.rest.server.RestServerConfig;
import io.rxmicro.rest.server.netty.NettyRestServerConfig;

import static io.rxmicro.config.Configs.getConfig;
import static io.rxmicro.data.RepositoryFactory.getRepository;
import static io.rxmicro.data.mongo.MongoClientFactory.getMongoClient;
import static io.rxmicro.data.sql.r2dbc.postgresql.PostgreSQLClientFactory.getPostgreSQLConnectionFactory;
import static io.rxmicro.data.sql.r2dbc.postgresql.PostgreSQLClientFactory.getPostgreSQLConnectionPool;
import static io.rxmicro.rest.client.RestClientFactory.getRestClient;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$InternalTypesJEEStyleFieldInjectionRestControllerBeanSupplier extends BeanSupplier<InternalTypesJEEStyleFieldInjectionRestController> {

    @Override
    public InternalTypesJEEStyleFieldInjectionRestController get() {
        final InternalTypesJEEStyleFieldInjectionRestController bean = new InternalTypesJEEStyleFieldInjectionRestController();
        bean.mongoRepository = getRepository(MongoRepository.class);
        bean.mongoConfig = getConfig("mongo", MongoConfig.class);
        bean.customMongoConfig = getConfig("custom-mongo", MongoConfig.class);
        bean.mongoClient = getMongoClient("mongo");
        bean.customMongoClient = getMongoClient("custom-mongo");
        bean.postgreSQLRepository = getRepository(PostgreSQLRepository.class);
        bean.postgreSQLConfig = getConfig("postgre-sql", PostgreSQLConfig.class);
        bean.customPostgreSQLConfig = getConfig("custom-postgre-sql", PostgreSQLConfig.class);
        bean.connectionFactory = getPostgreSQLConnectionFactory("postgre-sql");
        bean.connectionPool = getPostgreSQLConnectionPool("postgre-sql");
        bean.customConnectionFactory = getPostgreSQLConnectionFactory("custom-postgre-sql");
        bean.customConnectionPool = getPostgreSQLConnectionPool("custom-postgre-sql");
        bean.restClient = getRestClient(RestClient.class);
        bean.httpClientConfig = getConfig("http-client", HttpClientConfig.class);
        bean.customHttpClientConfig = getConfig("custom-http-client", HttpClientConfig.class);
        bean.httpServerConfig = getConfig("http-server", HttpServerConfig.class);
        bean.restServerConfig = getConfig("rest-server", RestServerConfig.class);
        bean.nettyRestServerConfig = getConfig("netty-rest-server", NettyRestServerConfig.class);
        bean.postConstruct();
        return bean;
    }
}
