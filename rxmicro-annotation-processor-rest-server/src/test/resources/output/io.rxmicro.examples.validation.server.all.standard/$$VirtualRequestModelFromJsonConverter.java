package io.rxmicro.examples.validation.server.all.standard;

import io.rxmicro.examples.validation.server.all.standard.model.Color;
import io.rxmicro.exchange.json.detail.ModelFromJsonConverter;

import java.util.Map;

/**
 * Generated by {@code RxMicro Annotation Processor}
 */
public final class $$VirtualRequestModelFromJsonConverter extends ModelFromJsonConverter<$$VirtualRequest> {

    @Override
    public $$VirtualRequest fromJsonObject(final Map<String, Object> params) {
        final $$VirtualRequest model = new $$VirtualRequest();
        model.optionalParameter = toString(params.get("optionalParameter"), "optionalParameter");
        model.booleanParameter = toBoolean(params.get("booleanParameter"), "booleanParameter");
        model.byteParameter = toByte(params.get("byteParameter"), "byteParameter");
        model.shortParameter = toShort(params.get("shortParameter"), "shortParameter");
        model.intParameter = toInteger(params.get("intParameter"), "intParameter");
        model.longParameter = toLong(params.get("longParameter"), "longParameter");
        model.bigIntParameter = toBigInteger(params.get("bigIntParameter"), "bigIntParameter");
        model.floatParameter = toFloat(params.get("floatParameter"), "floatParameter");
        model.doubleParameter = toDouble(params.get("doubleParameter"), "doubleParameter");
        model.decimalParameter = toBigDecimal(params.get("decimalParameter"), "decimalParameter");
        model.charParameter = toCharacter(params.get("charParameter"), "charParameter");
        model.stringParameter = toString(params.get("stringParameter"), "stringParameter");
        model.instantParameter = toInstant(params.get("instantParameter"), "instantParameter");
        model.colorParameter = toEnum(Color.class, params.get("colorParameter"), "colorParameter");
        model.optionalList = toStringArray(params.get("optionalList"), "optionalList");
        model.booleanValues = toBooleanArray(params.get("booleanValues"), "booleanValues");
        model.byteValues = toByteArray(params.get("byteValues"), "byteValues");
        model.shortValues = toShortArray(params.get("shortValues"), "shortValues");
        model.intValues = toIntegerArray(params.get("intValues"), "intValues");
        model.longValues = toLongArray(params.get("longValues"), "longValues");
        model.charValues = toCharacterArray(params.get("charValues"), "charValues");
        model.floatValues = toFloatArray(params.get("floatValues"), "floatValues");
        model.doubleValues = toDoubleArray(params.get("doubleValues"), "doubleValues");
        model.decimals = toBigDecimalArray(params.get("decimals"), "decimals");
        model.bigIntegers = toBigIntegerArray(params.get("bigIntegers"), "bigIntegers");
        model.strings = toStringArray(params.get("strings"), "strings");
        model.instants = toInstantArray(params.get("instants"), "instants");
        model.colors = toEnumArray(Color.class, params.get("colors"), "colors");
        model.countryCodeAlpha2 = toString(params.get("countryCodeAlpha2"), "countryCodeAlpha2");
        model.countryCodeAlpha3 = toString(params.get("countryCodeAlpha3"), "countryCodeAlpha3");
        model.countryCodeNumeric = toString(params.get("countryCodeNumeric"), "countryCodeNumeric");
        model.base64URLEncodedBase = toString(params.get("base64URLEncodedBase"), "base64URLEncodedBase");
        model.base64URLEncodedUrl = toString(params.get("base64URLEncodedUrl"), "base64URLEncodedUrl");
        model.ip = toString(params.get("ip"), "ip");
        model.ip4 = toString(params.get("ip4"), "ip4");
        model.ip6 = toString(params.get("ip6"), "ip6");
        model.lat111km = toBigDecimal(params.get("lat111km"), "lat111km");
        model.lng111km = toBigDecimal(params.get("lng111km"), "lng111km");
        model.lat11km = toBigDecimal(params.get("lat11km"), "lat11km");
        model.lng11km = toBigDecimal(params.get("lng11km"), "lng11km");
        model.lat1km = toBigDecimal(params.get("lat1km"), "lat1km");
        model.lng1km = toBigDecimal(params.get("lng1km"), "lng1km");
        model.lat111m = toBigDecimal(params.get("lat111m"), "lat111m");
        model.lng111m = toBigDecimal(params.get("lng111m"), "lng111m");
        model.lat11m = toBigDecimal(params.get("lat11m"), "lat11m");
        model.lng11m = toBigDecimal(params.get("lng11m"), "lng11m");
        model.lat1m = toBigDecimal(params.get("lat1m"), "lat1m");
        model.lng1m = toBigDecimal(params.get("lng1m"), "lng1m");
        model.lat11cm = toBigDecimal(params.get("lat11cm"), "lat11cm");
        model.lng11cm = toBigDecimal(params.get("lng11cm"), "lng11cm");
        model.lat1cm = toBigDecimal(params.get("lat1cm"), "lat1cm");
        model.lng1cm = toBigDecimal(params.get("lng1cm"), "lng1cm");
        return model;
    }
}
