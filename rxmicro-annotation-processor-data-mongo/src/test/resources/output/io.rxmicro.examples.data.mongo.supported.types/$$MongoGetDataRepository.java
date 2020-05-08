package io.rxmicro.examples.data.mongo.supported.types;

import com.mongodb.client.model.CountOptions;
import com.mongodb.reactivestreams.client.AggregatePublisher;
import com.mongodb.reactivestreams.client.FindPublisher;
import com.mongodb.reactivestreams.client.MongoDatabase;
import io.rxmicro.data.Pageable;
import io.rxmicro.data.SortOrder;
import io.rxmicro.data.mongo.IndexUsage;
import io.rxmicro.data.mongo.ProjectionType;
import io.rxmicro.data.mongo.detail.AbstractMongoRepository;
import io.rxmicro.data.mongo.detail.MongoQueries;
import io.rxmicro.examples.data.mongo.supported.types.model.$$SupportedTypesEntityEntityFromMongoDBConverter;
import io.rxmicro.examples.data.mongo.supported.types.model.Status;
import io.rxmicro.examples.data.mongo.supported.types.model.SupportedTypesEntity;
import org.bson.Document;
import org.bson.types.ObjectId;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Generated by rxmicro annotation processor
 */
public final class $$MongoGetDataRepository extends AbstractMongoRepository implements GetDataRepository {

    private final $$SupportedTypesEntityEntityFromMongoDBConverter supportedTypesEntityEntityFromMongoDBConverter =
            new $$SupportedTypesEntityEntityFromMongoDBConverter();

    public $$MongoGetDataRepository(final MongoDatabase mongoDatabase) {
        super(GetDataRepository.class, mongoDatabase.getCollection("supportedTypes"));
    }

    @Override
    public Mono<SupportedTypesEntity> aggregate1() {
        // pipeline0 = "{ $match: { _id: ObjectId('507f1f77bcf86cd799439011'), status: 'created', aBoolean : true, aByte : NumberInt(127), aShort : NumberInt(500), aInteger : NumberInt(1000), aLong : NumberLong(999999999999), bigDecimal : NumberDecimal('3.14'), character : 'y', string : 'string', instant : ISODate('2020-02-02T02:20:00.000Z'), uuid : BinData(03, 'Ej5FZ+ibEtOkVlVmQkQAAA==')} }
        final Document pipeline0 = new Document()
                .append("$match", new Document()
                        .append("_id", new ObjectId("507f1f77bcf86cd799439011"))
                        .append("status", "created")
                        .append("aBoolean", true)
                        .append("aByte", 127)
                        .append("aShort", 500)
                        .append("aInteger", 1000)
                        .append("aLong", 999999999999L)
                        .append("bigDecimal", new BigDecimal("3.14"))
                        .append("character", "y")
                        .append("string", "string")
                        .append("instant", Instant.ofEpochMilli(1580610000000L))
                        .append("uuid", UUID.fromString("d3129be8-6745-3e12-0000-4442665556a4"))
                );
        // pipeline1 = "{ $sort: { status: 1, _id: -1 } }
        final Document pipeline1 = new Document()
                .append("$sort", new Document()
                        .append("status", 1)
                        .append("_id", -1)
                );
        // pipeline2 = "{ $limit: 10 }
        final Document pipeline2 = new Document("$limit", 10);
        // pipeline3 = "{ $skip: 0 }
        final Document pipeline3 = new Document("$skip", 0);
        // hint = "{ _id: 1 }
        final Document hint = new Document("_id", 1);
        final List<Document> pipeline = Arrays.asList(pipeline0, pipeline1, pipeline2, pipeline3);
        final AggregatePublisher<Document> result = collection
                .aggregate(pipeline)
                .hint(hint)
                .allowDiskUse(false);
        return Mono.from(result.first())
                .map(supportedTypesEntityEntityFromMongoDBConverter::fromDB);
    }

    @Override
    public Mono<SupportedTypesEntity> aggregate2(final ObjectId objectId, final Status status, final boolean aBoolean, final byte aByte, final short aShort, final int aInteger, final long aLong, final BigDecimal bigDecimal, final Character character, final String string, final Instant instant, final UUID uuid, final SortOrder statusSortOrder, final SortOrder idSortOrder, final int limit, final int skip, final IndexUsage indexUsage) {
        // pipeline0 = "{ $match: { _id: ?, status: ?, aBoolean : ?, aByte : ?, aShort : ?, aInteger : ?, aLong : ?, bigDecimal : ?, character : ?, string : ?, instant : ?, uuid : ?} }
        final Document pipeline0 = new Document()
                .append("$match", new Document()
                        .append("_id", objectId)
                        .append("status", status)
                        .append("aBoolean", aBoolean)
                        .append("aByte", aByte)
                        .append("aShort", aShort)
                        .append("aInteger", aInteger)
                        .append("aLong", aLong)
                        .append("bigDecimal", bigDecimal)
                        .append("character", character)
                        .append("string", string)
                        .append("instant", instant)
                        .append("uuid", uuid)
                );
        // pipeline1 = "{ $sort: { status: ?, _id: ? } }
        final Document pipeline1 = new Document()
                .append("$sort", new Document()
                        .append("status", statusSortOrder.mongo())
                        .append("_id", idSortOrder.mongo())
                );
        // pipeline2 = "{ $limit: ? }
        final Document pipeline2 = new Document("$limit", limit);
        // pipeline3 = "{ $skip: ? }
        final Document pipeline3 = new Document("$skip", skip);
        // hint = "{ _id: ? }
        final Document hint = new Document("_id", indexUsage.mongo());
        final List<Document> pipeline = Arrays.asList(pipeline0, pipeline1, pipeline2, pipeline3);
        final AggregatePublisher<Document> result = collection
                .aggregate(pipeline)
                .hint(hint)
                .allowDiskUse(false);
        return Mono.from(result.first())
                .map(supportedTypesEntityEntityFromMongoDBConverter::fromDB);
    }

    @Override
    public Mono<SupportedTypesEntity> aggregate3(final Pageable pageable) {
        // pipeline0 = "{ $match: { _id: ObjectId('507f1f77bcf86cd799439011'), status: 'created', aBoolean : true, aByte : NumberInt(127), aShort : NumberInt(500), aInteger : NumberInt(1000), aLong : NumberLong(999999999999), bigDecimal : NumberDecimal('3.14'), character : 'y', string : 'string', instant : ISODate('2020-02-02T02:20:00.000Z'), uuid : BinData(03, 'Ej5FZ+ibEtOkVlVmQkQAAA==')} }
        final Document pipeline0 = new Document()
                .append("$match", new Document()
                        .append("_id", new ObjectId("507f1f77bcf86cd799439011"))
                        .append("status", "created")
                        .append("aBoolean", true)
                        .append("aByte", 127)
                        .append("aShort", 500)
                        .append("aInteger", 1000)
                        .append("aLong", 999999999999L)
                        .append("bigDecimal", new BigDecimal("3.14"))
                        .append("character", "y")
                        .append("string", "string")
                        .append("instant", Instant.ofEpochMilli(1580610000000L))
                        .append("uuid", UUID.fromString("d3129be8-6745-3e12-0000-4442665556a4"))
                );
        // pipeline1 = "{ $sort: { status: 1, _id: -1 } }
        final Document pipeline1 = new Document()
                .append("$sort", new Document()
                        .append("status", 1)
                        .append("_id", -1)
                );
        // pipeline2 = "{ $limit: ? }
        final Document pipeline2 = new Document("$limit", pageable.getLimit());
        // pipeline3 = "{ $skip: ? }
        final Document pipeline3 = new Document("$skip", pageable.getSkip());
        final List<Document> pipeline = Arrays.asList(pipeline0, pipeline1, pipeline2, pipeline3);
        final AggregatePublisher<Document> result = collection
                .aggregate(pipeline)
                .allowDiskUse(false);
        return Mono.from(result.first())
                .map(supportedTypesEntityEntityFromMongoDBConverter::fromDB);
    }

    @Override
    public Mono<SupportedTypesEntity> find1() {
        // query = "{ _id: ObjectId('507f1f77bcf86cd799439011'), status: 'created', aBoolean : true, aByte : NumberInt(127), aShort : NumberInt(500), aInteger : NumberInt(1000), aLong : NumberLong(999999999999), bigDecimal : NumberDecimal('3.14'), character : 'y', string : 'string', instant : ISODate('2020-02-02T02:20:00.000Z'), uuid : BinData(03, 'Ej5FZ+ibEtOkVlVmQkQAAA==')}
        final Document query = new Document()
                .append("_id", new ObjectId("507f1f77bcf86cd799439011"))
                .append("status", "created")
                .append("aBoolean", true)
                .append("aByte", 127)
                .append("aShort", 500)
                .append("aInteger", 1000)
                .append("aLong", 999999999999L)
                .append("bigDecimal", new BigDecimal("3.14"))
                .append("character", "y")
                .append("string", "string")
                .append("instant", Instant.ofEpochMilli(1580610000000L))
                .append("uuid", UUID.fromString("d3129be8-6745-3e12-0000-4442665556a4"));
        // hint = "{ _id: 1 }
        final Document hint = new Document("_id", 1);
        // sort = "{ status: 1, _id: -1 }
        final Document sort = new Document()
                .append("status", 1)
                .append("_id", -1);
        final FindPublisher<Document> result = collection
                .find(query)
                .hint(hint)
                .sort(sort)
                .limit(10)
                .skip(0)
                .returnKey(false);
        return Mono.from(result)
                .map(supportedTypesEntityEntityFromMongoDBConverter::fromDB);
    }

    @Override
    public Mono<SupportedTypesEntity> find2(final ObjectId objectId, final Status status, final boolean aBoolean, final byte aByte, final short aShort, final int aInteger, final long aLong, final BigDecimal bigDecimal, final Character character, final String string, final Instant instant, final UUID uuid, final IndexUsage indexUsage, final SortOrder statusSortOrder, final SortOrder idSortOrder, final int limit, final int skip) {
        // query = "{ _id: ?, status: ?, aBoolean : ?, aByte : ?, aShort : ?, aInteger : ?, aLong : ?, bigDecimal : ?, character : ?, string : ?, instant : ?, uuid : ?}
        final Document query = new Document()
                .append("_id", objectId)
                .append("status", status)
                .append("aBoolean", aBoolean)
                .append("aByte", aByte)
                .append("aShort", aShort)
                .append("aInteger", aInteger)
                .append("aLong", aLong)
                .append("bigDecimal", bigDecimal)
                .append("character", character)
                .append("string", string)
                .append("instant", instant)
                .append("uuid", uuid);
        // hint = "{ _id: ? }
        final Document hint = new Document("_id", indexUsage.mongo());
        // sort = "{ status: ?, _id: ? }
        final Document sort = new Document()
                .append("status", statusSortOrder.mongo())
                .append("_id", idSortOrder.mongo());
        final FindPublisher<Document> result = collection
                .find(query)
                .hint(hint)
                .sort(sort)
                .limit(limit)
                .skip(skip)
                .returnKey(false);
        return Mono.from(result)
                .map(supportedTypesEntityEntityFromMongoDBConverter::fromDB);
    }

    @Override
    public Mono<SupportedTypesEntity> find3(final int skip, final int limit) {
        // query = "{ _id: ObjectId('507f1f77bcf86cd799439011'), status: 'created', aBoolean : true, aByte : NumberInt(127), aShort : NumberInt(500), aInteger : NumberInt(1000), aLong : NumberLong(999999999999), bigDecimal : NumberDecimal('3.14'), character : 'y', string : 'string', instant : ISODate('2020-02-02T02:20:00.000Z'), uuid : BinData(03, 'Ej5FZ+ibEtOkVlVmQkQAAA==')}
        final Document query = new Document()
                .append("_id", new ObjectId("507f1f77bcf86cd799439011"))
                .append("status", "created")
                .append("aBoolean", true)
                .append("aByte", 127)
                .append("aShort", 500)
                .append("aInteger", 1000)
                .append("aLong", 999999999999L)
                .append("bigDecimal", new BigDecimal("3.14"))
                .append("character", "y")
                .append("string", "string")
                .append("instant", Instant.ofEpochMilli(1580610000000L))
                .append("uuid", UUID.fromString("d3129be8-6745-3e12-0000-4442665556a4"));
        // sort = "{ status: 1, _id: -1 }
        final Document sort = new Document()
                .append("status", 1)
                .append("_id", -1);
        final FindPublisher<Document> result = collection
                .find(query)
                .sort(sort)
                .limit(limit)
                .skip(skip)
                .returnKey(false);
        return Mono.from(result)
                .map(supportedTypesEntityEntityFromMongoDBConverter::fromDB);
    }

    @Override
    public Mono<SupportedTypesEntity> find4(final Pageable pageable) {
        // query = "{ _id: ObjectId('507f1f77bcf86cd799439011'), status: 'created', aBoolean : true, aByte : NumberInt(127), aShort : NumberInt(500), aInteger : NumberInt(1000), aLong : NumberLong(999999999999), bigDecimal : NumberDecimal('3.14'), character : 'y', string : 'string', instant : ISODate('2020-02-02T02:20:00.000Z'), uuid : BinData(03, 'Ej5FZ+ibEtOkVlVmQkQAAA==')}
        final Document query = new Document()
                .append("_id", new ObjectId("507f1f77bcf86cd799439011"))
                .append("status", "created")
                .append("aBoolean", true)
                .append("aByte", 127)
                .append("aShort", 500)
                .append("aInteger", 1000)
                .append("aLong", 999999999999L)
                .append("bigDecimal", new BigDecimal("3.14"))
                .append("character", "y")
                .append("string", "string")
                .append("instant", Instant.ofEpochMilli(1580610000000L))
                .append("uuid", UUID.fromString("d3129be8-6745-3e12-0000-4442665556a4"));
        // sort = "{ status: 1, _id: -1 }
        final Document sort = new Document()
                .append("status", 1)
                .append("_id", -1);
        final FindPublisher<Document> result = collection
                .find(query)
                .sort(sort)
                .limit(pageable.getLimit())
                .skip(pageable.getSkip())
                .returnKey(false);
        return Mono.from(result)
                .map(supportedTypesEntityEntityFromMongoDBConverter::fromDB);
    }

    @Override
    public Mono<SupportedTypesEntity> find5(final ObjectId objectId, final Status status, final boolean aBoolean, final byte aByte, final short aShort, final int aInteger, final long aLong, final BigDecimal bigDecimal, final Character character, final String string, final Instant instant, final UUID uuid, final ProjectionType bigDecimalProjectionType, final IndexUsage indexUsage, final SortOrder statusSortOrder, final SortOrder idSortOrder, final int limit, final int skip) {
        // query = "{ _id: ?, status: ?, aBoolean : ?, aByte : ?, aShort : ?, aInteger : ?, aLong : ?, bigDecimal : ?, character : ?, string : ?, instant : ?, uuid : ?}
        final Document query = new Document()
                .append("_id", objectId)
                .append("status", status)
                .append("aBoolean", aBoolean)
                .append("aByte", aByte)
                .append("aShort", aShort)
                .append("aInteger", aInteger)
                .append("aLong", aLong)
                .append("bigDecimal", bigDecimal)
                .append("character", character)
                .append("string", string)
                .append("instant", instant)
                .append("uuid", uuid);
        // projection = "{ bigDecimal: ? }
        final Document projection = new Document("bigDecimal", bigDecimalProjectionType.mongo());
        // hint = "{ _id: ? }
        final Document hint = new Document("_id", indexUsage.mongo());
        // sort = "{ status: ?, _id: ? }
        final Document sort = new Document()
                .append("status", statusSortOrder.mongo())
                .append("_id", idSortOrder.mongo());
        final FindPublisher<Document> result = collection
                .find(query)
                .projection(projection)
                .hint(hint)
                .sort(sort)
                .limit(limit)
                .skip(skip)
                .returnKey(false);
        return Mono.from(result)
                .map(supportedTypesEntityEntityFromMongoDBConverter::fromDB);
    }

    @Override
    public Mono<Long> countDocuments1() {
        final Publisher<Long> result = collection
                .countDocuments();
        return Mono.from(result);
    }

    @Override
    public Mono<Long> countDocuments2() {
        // query = "{ _id: ObjectId('507f1f77bcf86cd799439011'), status: 'created', aBoolean : true, aByte : NumberInt(127), aShort : NumberInt(500), aInteger : NumberInt(1000), aLong : NumberLong(999999999999), bigDecimal : NumberDecimal('3.14'), character : 'y', string : 'string', instant : ISODate('2020-02-02T02:20:00.000Z'), uuid : BinData(03, 'Ej5FZ+ibEtOkVlVmQkQAAA==')}
        final Document query = new Document()
                .append("_id", new ObjectId("507f1f77bcf86cd799439011"))
                .append("status", "created")
                .append("aBoolean", true)
                .append("aByte", 127)
                .append("aShort", 500)
                .append("aInteger", 1000)
                .append("aLong", 999999999999L)
                .append("bigDecimal", new BigDecimal("3.14"))
                .append("character", "y")
                .append("string", "string")
                .append("instant", Instant.ofEpochMilli(1580610000000L))
                .append("uuid", UUID.fromString("d3129be8-6745-3e12-0000-4442665556a4"));
        // hint = "{ _id: 1 }
        final Document hint = new Document("_id", 1);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .hint(hint)
                        .limit(10)
                        .skip(0)
                );
        return Mono.from(result);
    }

    @Override
    public Mono<Long> countDocuments3(final int skip, final int limit) {
        // hint = "{ _id: 1 }
        final Document hint = new Document("_id", 1);
        final Publisher<Long> result = collection
                .countDocuments(MongoQueries.NULL, new CountOptions()
                        .hint(hint)
                        .limit(limit)
                        .skip(skip)
                );
        return Mono.from(result);
    }

    @Override
    public Mono<Long> countDocuments4(final Pageable pageable) {
        // query = "{ _id: ObjectId('507f1f77bcf86cd799439011'), status: 'created', aBoolean : true, aByte : NumberInt(127), aShort : NumberInt(500), aInteger : NumberInt(1000), aLong : NumberLong(999999999999), bigDecimal : NumberDecimal('3.14'), character : 'y', string : 'string', instant : ISODate('2020-02-02T02:20:00.000Z'), uuid : BinData(03, 'Ej5FZ+ibEtOkVlVmQkQAAA==')}
        final Document query = new Document()
                .append("_id", new ObjectId("507f1f77bcf86cd799439011"))
                .append("status", "created")
                .append("aBoolean", true)
                .append("aByte", 127)
                .append("aShort", 500)
                .append("aInteger", 1000)
                .append("aLong", 999999999999L)
                .append("bigDecimal", new BigDecimal("3.14"))
                .append("character", "y")
                .append("string", "string")
                .append("instant", Instant.ofEpochMilli(1580610000000L))
                .append("uuid", UUID.fromString("d3129be8-6745-3e12-0000-4442665556a4"));
        // hint = "{ _id: 1 }
        final Document hint = new Document("_id", 1);
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .hint(hint)
                        .limit(pageable.getLimit())
                        .skip(pageable.getSkip())
                );
        return Mono.from(result);
    }

    @Override
    public Mono<Long> countDocuments5(final ObjectId objectId, final Status status, final boolean aBoolean, final byte aByte, final short aShort, final int aInteger, final long aLong, final BigDecimal bigDecimal, final Character character, final String string, final Instant instant, final UUID uuid, final IndexUsage indexUsage, final int limit, final int skip) {
        // query = "{ _id: ?, status: ?, aBoolean : ?, aByte : ?, aShort : ?, aInteger : ?, aLong : ?, bigDecimal : ?, character : ?, string : ?, instant : ?, uuid : ?}
        final Document query = new Document()
                .append("_id", objectId)
                .append("status", status)
                .append("aBoolean", aBoolean)
                .append("aByte", aByte)
                .append("aShort", aShort)
                .append("aInteger", aInteger)
                .append("aLong", aLong)
                .append("bigDecimal", bigDecimal)
                .append("character", character)
                .append("string", string)
                .append("instant", instant)
                .append("uuid", uuid);
        // hint = "{ _id: ? }
        final Document hint = new Document("_id", indexUsage.mongo());
        final Publisher<Long> result = collection
                .countDocuments(query, new CountOptions()
                        .hint(hint)
                        .limit(limit)
                        .skip(skip)
                );
        return Mono.from(result);
    }

    @Override
    public Mono<Long> estimatedDocumentCount() {
        return Mono.from(collection.estimatedDocumentCount());
    }

    @Override
    public Mono<BigDecimal> distinct1() {
        return Mono.from(collection
                .distinct("bigDecimal", BigDecimal.class));
    }

    @Override
    public Mono<BigDecimal> distinct2() {
        // query = "{ _id: ObjectId('507f1f77bcf86cd799439011'), status: 'created', aBoolean : true, aByte : NumberInt(127), aShort : NumberInt(500), aInteger : NumberInt(1000), aLong : NumberLong(999999999999), bigDecimal : NumberDecimal('3.14'), character : 'y', string : 'string', instant : ISODate('2020-02-02T02:20:00.000Z'), uuid : BinData(03, 'Ej5FZ+ibEtOkVlVmQkQAAA==')}
        final Document query = new Document()
                .append("_id", new ObjectId("507f1f77bcf86cd799439011"))
                .append("status", "created")
                .append("aBoolean", true)
                .append("aByte", 127)
                .append("aShort", 500)
                .append("aInteger", 1000)
                .append("aLong", 999999999999L)
                .append("bigDecimal", new BigDecimal("3.14"))
                .append("character", "y")
                .append("string", "string")
                .append("instant", Instant.ofEpochMilli(1580610000000L))
                .append("uuid", UUID.fromString("d3129be8-6745-3e12-0000-4442665556a4"));
        return Mono.from(collection
                .distinct("bigDecimal", query, BigDecimal.class));
    }

    @Override
    public Mono<BigDecimal> distinct3(final ObjectId objectId, final Status status, final boolean aBoolean, final byte aByte, final short aShort, final int aInteger, final long aLong, final BigDecimal bigDecimal, final Character character, final String string, final Instant instant, final UUID uuid) {
        // query = "{ _id: ?, status: ?, aBoolean : ?, aByte : ?, aShort : ?, aInteger : ?, aLong : ?, bigDecimal : ?, character : ?, string : ?, instant : ?, uuid : ?}
        final Document query = new Document()
                .append("_id", objectId)
                .append("status", status)
                .append("aBoolean", aBoolean)
                .append("aByte", aByte)
                .append("aShort", aShort)
                .append("aInteger", aInteger)
                .append("aLong", aLong)
                .append("bigDecimal", bigDecimal)
                .append("character", character)
                .append("string", string)
                .append("instant", instant)
                .append("uuid", uuid);
        return Mono.from(collection
                .distinct("bigDecimal", query, BigDecimal.class));
    }
}
