package io.rxmicro.examples.data.mongo.all.operations;

import com.mongodb.client.result.InsertOneResult;
import com.mongodb.reactivestreams.client.MongoDatabase;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.rxmicro.data.detail.adapter.PublisherToRequiredMonoFutureAdapter;
import io.rxmicro.data.mongo.detail.AbstractMongoRepository;
import io.rxmicro.examples.data.mongo.all.operations.model.$$AccountEntityToMongoDBConverter;
import io.rxmicro.examples.data.mongo.all.operations.model.Account;
import org.bson.Document;
import reactor.core.publisher.Mono;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

/**
 * Generated by rxmicro annotation processor
 *
 * @link https://rxmicro.io
 */
public final class $$MongoInsertDataRepository extends AbstractMongoRepository implements InsertDataRepository {

    private final $$AccountEntityToMongoDBConverter accountEntityToMongoDBConverter =
            new $$AccountEntityToMongoDBConverter();

    public $$MongoInsertDataRepository(final MongoDatabase mongoDatabase) {
        super(InsertDataRepository.class, mongoDatabase.getCollection("collection"));
    }

    @Override
    public Mono<Account> insert1(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return Mono.from(collection.insertOne(document))
                .map(result -> account)
                .doOnSuccess(a -> accountEntityToMongoDBConverter.setId(document, account));
    }

    @Override
    public Mono<Void> insert2(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return Mono.from(collection.insertOne(document))
                .then()
                .doOnSuccess(a -> accountEntityToMongoDBConverter.setId(document, account));
    }

    @Override
    public Mono<InsertOneResult> insert3(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return Mono.from(collection.insertOne(document))
                .doOnSuccess(a -> accountEntityToMongoDBConverter.setId(document, account));
    }

    @Override
    public Single<Account> insert4(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return Single.fromPublisher(collection.insertOne(document))
                .map(result -> account)
                .doOnSuccess(a -> accountEntityToMongoDBConverter.setId(document, account));
    }

    @Override
    public Completable insert5(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return Completable.fromPublisher(collection.insertOne(document))
                .doOnComplete(() -> accountEntityToMongoDBConverter.setId(document, account));
    }

    @Override
    public Single<InsertOneResult> insert6(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return Single.fromPublisher(collection.insertOne(document))
                .doOnSuccess(a -> accountEntityToMongoDBConverter.setId(document, account));
    }

    @Override
    public CompletableFuture<Account> insert7(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return new PublisherToRequiredMonoFutureAdapter<>(
                collection.insertOne(document),
                useOptionalExceptionSupplier(CompletableFuture.class, Account.class)
        ).thenApply(result -> {
            accountEntityToMongoDBConverter.setId(document, account);
            return account;
        });
    }

    @Override
    public CompletableFuture<Void> insert8(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return new PublisherToRequiredMonoFutureAdapter<>(
                collection.insertOne(document),
                useOptionalExceptionSupplier(CompletableFuture.class, Void.class)
        ).thenApply(result -> {
            accountEntityToMongoDBConverter.setId(document, account);
            return null;
        });
    }

    @Override
    public CompletableFuture<InsertOneResult> insert9(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return new PublisherToRequiredMonoFutureAdapter<>(
                collection.insertOne(document),
                useOptionalExceptionSupplier(CompletableFuture.class, InsertOneResult.class)
        ).thenApply(result -> {
            accountEntityToMongoDBConverter.setId(document, account);
            return result;
        });
    }

    @Override
    public CompletionStage<Account> insert10(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return new PublisherToRequiredMonoFutureAdapter<>(
                collection.insertOne(document),
                useOptionalExceptionSupplier(CompletionStage.class, Account.class)
        ).thenApply(result -> {
            accountEntityToMongoDBConverter.setId(document, account);
            return account;
        });
    }

    @Override
    public CompletionStage<Void> insert11(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return new PublisherToRequiredMonoFutureAdapter<>(
                collection.insertOne(document),
                useOptionalExceptionSupplier(CompletionStage.class, Void.class)
        ).thenApply(result -> {
            accountEntityToMongoDBConverter.setId(document, account);
            return null;
        });
    }

    @Override
    public CompletionStage<InsertOneResult> insert12(final Account account) {
        final Document document = accountEntityToMongoDBConverter.toDB(account, true);
        return new PublisherToRequiredMonoFutureAdapter<>(
                collection.insertOne(document),
                useOptionalExceptionSupplier(CompletionStage.class, InsertOneResult.class)
        ).thenApply(result -> {
            accountEntityToMongoDBConverter.setId(document, account);
            return result;
        });
    }
}
