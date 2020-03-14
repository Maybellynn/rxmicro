/*
 * Copyright (c) 2020. http://rxmicro.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rxmicro.examples.rest.controller.model.fields.params.direct;

import io.rxmicro.examples.rest.controller.model.fields.Status;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;

abstract class Abstract {

    Boolean booleanParameter;

    Byte byteParameter;

    Short shortParameter;

    Integer intParameter;

    Long longParameter;

    BigInteger bigIntParameter;

    Float floatParameter;

    Double doubleParameter;

    BigDecimal decimalParameter;

    Character charParameter;

    String stringParameter;

    Instant instantParameter;

    Status status;

    List<Boolean> booleanParameters;

    List<Byte> byteParameters;

    List<Short> shortParameters;

    List<Integer> intParameters;

    List<Long> longParameters;

    List<BigInteger> bigIntParameters;

    List<Float> floatParameters;

    List<Double> doubleParameters;

    List<BigDecimal> decimalParameters;

    List<Character> charParameters;

    List<String> stringParameters;

    List<Instant> instantParameters;

    List<Status> statuses;
}
