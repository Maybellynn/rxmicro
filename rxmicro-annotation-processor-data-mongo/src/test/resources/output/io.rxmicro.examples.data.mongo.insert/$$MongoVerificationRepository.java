package io.rxmicro.examples.data.mongo.insert;

import com.mongodb.reactivestreams.client.FindPublisher;
import com.mongodb.reactivestreams.client.MongoDatabase;
import io.rxmicro.data.mongo.detail.AbstractMongoRepository;
import io.rxmicro.examples.data.mongo.insert.model.$$AccountEntityFromMongoDBConverter;
import io.rxmicro.examples.data.mongo.insert.model.Account;
import org.bson.Document;
import reactor.core.publisher.Mono;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$MongoVerificationRepository extends AbstractMongoRepository implements VerificationRepository {

    private final $$AccountEntityFromMongoDBConverter accountEntityFromMongoDBConverter =
            new $$AccountEntityFromMongoDBConverter();

    public $$MongoVerificationRepository(final MongoDatabase mongoDatabase) {
        super(VerificationRepository.class, mongoDatabase.getCollection("account"));
    }

    @Override
    public Mono<Account> findById(final long id) {
        // query = "{_id: ?}
        final Document query = new Document("_id", id);
        final FindPublisher<Document> result = collection
                .find(query)
                .returnKey(false);
        return Mono.from(result)
                .map(accountEntityFromMongoDBConverter::fromDB);
    }
}