package io.rxmicro.examples.processor.all.components.component;

import com.mongodb.reactivestreams.client.FindPublisher;
import com.mongodb.reactivestreams.client.MongoDatabase;
import io.rxmicro.data.detail.adapter.PublisherToRequiredMonoFutureAdapter;
import io.rxmicro.data.mongo.detail.AbstractMongoRepository;
import io.rxmicro.examples.processor.all.components.model.$$AccountEntityFromMongoDBConverter;
import io.rxmicro.examples.processor.all.components.model.Account;
import org.bson.Document;

import java.util.concurrent.CompletableFuture;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$MongoMongoDataRepository extends AbstractMongoRepository implements MongoDataRepository {

    private final $$AccountEntityFromMongoDBConverter accountEntityFromMongoDBConverter =
            new $$AccountEntityFromMongoDBConverter();

    public $$MongoMongoDataRepository(final MongoDatabase mongoDatabase) {
        super(MongoDataRepository.class, mongoDatabase.getCollection("account"));
    }

    @Override
    public CompletableFuture<Account> get() {
        // query = "{_id: 1}
        final Document query = new Document("_id", 1);
        final FindPublisher<Document> result = collection
                .find(query)
                .returnKey(false);
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletableFuture.class, Account.class)
        ).thenApply(accountEntityFromMongoDBConverter::fromDB);
    }
}
