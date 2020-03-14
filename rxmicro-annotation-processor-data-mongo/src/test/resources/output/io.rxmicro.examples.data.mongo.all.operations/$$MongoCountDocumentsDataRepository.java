package io.rxmicro.examples.data.mongo.all.operations;

import com.mongodb.client.model.CountOptions;
import com.mongodb.reactivestreams.client.MongoDatabase;
import io.reactivex.rxjava3.core.Single;
import io.rxmicro.data.Pageable;
import io.rxmicro.data.detail.adapter.PublisherToRequiredMonoFutureAdapter;
import io.rxmicro.data.mongo.detail.AbstractMongoRepository;
import org.bson.Document;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 *
 * @link http://rxmicro.io
 */
public final class $$MongoCountDocumentsDataRepository extends AbstractMongoRepository implements CountDocumentsDataRepository {

    public $$MongoCountDocumentsDataRepository(final MongoDatabase mongoDatabase) {
        super(CountDocumentsDataRepository.class, mongoDatabase.getCollection("collection"));
    }

    @Override
    public Mono<Long> countDocumentsMono1() {
        final Publisher<Long> result = collection
                .countDocuments();
        return Mono.from(result);
    }

    @Override
    public Mono<Long> countDocumentsMono2(final String value, final Pageable pageable) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .limit(pageable.getLimit())
                        .skip(pageable.getSkip())
                );
        return Mono.from(result);
    }

    @Override
    public Mono<Long> countDocumentsMono3(final String value) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .limit(5)
                        .skip(5)
                );
        return Mono.from(result);
    }

    @Override
    public Mono<Long> countDocumentsMono4(final String value) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        // hint = "{filter: 1}
        final Document hint = new Document("filter", 1);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .hint(hint)
                        .limit(5)
                        .skip(5)
                );
        return Mono.from(result);
    }

    @Override
    public Single<Long> countDocumentsSingle1() {
        final Publisher<Long> result = collection
                .countDocuments();
        return Single.fromPublisher(result);
    }

    @Override
    public Single<Long> countDocumentsSingle2(final String value, final Pageable pageable) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .limit(pageable.getLimit())
                        .skip(pageable.getSkip())
                );
        return Single.fromPublisher(result);
    }

    @Override
    public Single<Long> countDocumentsSingle3(final String value) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .limit(5)
                        .skip(5)
                );
        return Single.fromPublisher(result);
    }

    @Override
    public Single<Long> countDocumentsSingle4(final String value) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        // hint = "{filter: 1}
        final Document hint = new Document("filter", 1);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .hint(hint)
                        .limit(5)
                        .skip(5)
                );
        return Single.fromPublisher(result);
    }

    @Override
    public CompletableFuture<Long> countDocumentsCompletableFuture1() {
        final Publisher<Long> result = collection
                .countDocuments();
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletableFuture.class, Long.class)
        );
    }

    @Override
    public CompletableFuture<Long> countDocumentsCompletableFuture2(final String value, final Pageable pageable) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .limit(pageable.getLimit())
                        .skip(pageable.getSkip())
                );
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletableFuture.class, Long.class)
        );
    }

    @Override
    public CompletableFuture<Long> countDocumentsCompletableFuture3(final String value) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .limit(5)
                        .skip(5)
                );
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletableFuture.class, Long.class)
        );
    }

    @Override
    public CompletableFuture<Long> countDocumentsCompletableFuture4(final String value) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        // hint = "{filter: 1}
        final Document hint = new Document("filter", 1);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .hint(hint)
                        .limit(5)
                        .skip(5)
                );
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletableFuture.class, Long.class)
        );
    }

    @Override
    public CompletionStage<Long> countDocumentsCompletionStage1() {
        final Publisher<Long> result = collection
                .countDocuments();
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletionStage.class, Long.class)
        );
    }

    @Override
    public CompletionStage<Long> countDocumentsCompletionStage2(final String value, final Pageable pageable) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .limit(pageable.getLimit())
                        .skip(pageable.getSkip())
                );
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletionStage.class, Long.class)
        );
    }

    @Override
    public CompletionStage<Long> countDocumentsCompletionStage3(final String value) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .limit(5)
                        .skip(5)
                );
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletionStage.class, Long.class)
        );
    }

    @Override
    public CompletionStage<Long> countDocumentsCompletionStage4(final String value) {
        // query = "{filter: ?}
        final Document query = new Document("filter", value);
        // hint = "{filter: 1}
        final Document hint = new Document("filter", 1);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .hint(hint)
                        .limit(5)
                        .skip(5)
                );
        return new PublisherToRequiredMonoFutureAdapter<>(
                result,
                useOptionalExceptionSupplier(CompletionStage.class, Long.class)
        );
    }
}
