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

package io.rxmicro.examples.rest.client.model.fields.params.reflection;

import io.rxmicro.examples.rest.client.model.fields.Status;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.List;

abstract class Abstract {

    private Boolean booleanParameter;

    private Byte byteParameter;

    private Short shortParameter;

    private Integer intParameter;

    private Long longParameter;

    private BigInteger bigIntParameter;

    private Float floatParameter;

    private Double doubleParameter;

    private BigDecimal decimalParameter;

    private Character charParameter;

    private String stringParameter;

    private Instant instantParameter;

    private Status status;

    private List<Boolean> booleanParameters;

    private List<Byte> byteParameters;

    private List<Short> shortParameters;

    private List<Integer> intParameters;

    private List<Long> longParameters;

    private List<BigInteger> bigIntParameters;

    private List<Float> floatParameters;

    private List<Double> doubleParameters;

    private List<BigDecimal> decimalParameters;

    private List<Character> charParameters;

    private List<String> stringParameters;

    private List<Instant> instantParameters;

    private List<Status> statuses;
}
