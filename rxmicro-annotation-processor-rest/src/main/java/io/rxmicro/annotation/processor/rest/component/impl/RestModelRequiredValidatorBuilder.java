/*
 * Copyright (c) 2020. https://rxmicro.io
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

package io.rxmicro.annotation.processor.rest.component.impl;

import io.rxmicro.annotation.processor.common.model.type.ModelClass;
import io.rxmicro.annotation.processor.rest.model.RestModelField;
import io.rxmicro.annotation.processor.rest.model.validator.ModelValidatorClassStructure;
import io.rxmicro.validation.constraint.AllowEmptyString;
import io.rxmicro.validation.constraint.Base64URLEncoded;
import io.rxmicro.validation.constraint.CountryCode;
import io.rxmicro.validation.constraint.DigitsOnly;
import io.rxmicro.validation.constraint.DomainName;
import io.rxmicro.validation.constraint.Email;
import io.rxmicro.validation.constraint.Enumeration;
import io.rxmicro.validation.constraint.HostName;
import io.rxmicro.validation.constraint.IP;
import io.rxmicro.validation.constraint.LatinAlphabetOnly;
import io.rxmicro.validation.constraint.Length;
import io.rxmicro.validation.constraint.MinLength;
import io.rxmicro.validation.constraint.Nullable;
import io.rxmicro.validation.constraint.NullableArrayItem;
import io.rxmicro.validation.constraint.Phone;
import io.rxmicro.validation.constraint.Telegram;
import io.rxmicro.validation.constraint.URI;
import io.rxmicro.validation.constraint.Viber;
import io.rxmicro.validation.constraint.WhatsApp;
import io.rxmicro.validation.validator.NotEmptyStringConstraintValidator;
import io.rxmicro.validation.validator.RequiredAndNotEmptyStringConstraintValidator;
import io.rxmicro.validation.validator.RequiredConstraintValidator;
import io.rxmicro.validation.validator.RequiredListConstraintValidator;

import java.lang.annotation.Annotation;

/**
 * @author nedis
 * @since 0.7
 */
public final class RestModelRequiredValidatorBuilder {

    public void addRequiredValidator(final ModelValidatorClassStructure.Builder builder,
                                     final RestModelField restModelField,
                                     final ModelClass modelFieldType) {
        if (modelFieldType.isList()) {
            final Nullable nullable = restModelField.getAnnotation(Nullable.class);
            if (nullable == null || nullable.off()) {
                builder.add(restModelField, Nullable.class.getSimpleName(),
                        RequiredListConstraintValidator.class.getName(), null, false);
            }
            final NullableArrayItem nullableArrayItem = restModelField.getAnnotation(NullableArrayItem.class);
            final boolean isNullable = nullableArrayItem == null || nullableArrayItem.off();
            if (modelFieldType.asList().isPrimitiveList() &&
                    String.class.getName().equals(modelFieldType.asList().getElementModelClass().getJavaFullClassName())) {
                // isString primitive
                addRequiredStringValidator(isNullable, NullableArrayItem.class, builder, restModelField, true);
            } else if (isNullable) {
                builder.add(restModelField, NullableArrayItem.class.getSimpleName(),
                        RequiredConstraintValidator.class.getName(), null, true);
            }
        } else if (modelFieldType.isPrimitive() &&
                String.class.getName().equals(modelFieldType.asPrimitive().getJavaFullClassName())) {
            // isString primitive
            final Nullable nullable = restModelField.getAnnotation(Nullable.class);
            addRequiredStringValidator(nullable == null || nullable.off(), Nullable.class, builder, restModelField, false);
        } else {
            final Nullable nullable = restModelField.getAnnotation(Nullable.class);
            if (nullable == null || nullable.off()) {
                builder.add(restModelField, Nullable.class.getSimpleName(),
                        RequiredConstraintValidator.class.getName(), null, false);
            }
        }
    }

    private void addRequiredStringValidator(final boolean isNullable,
                                            final Class<? extends Annotation> validatorAnnotationClass,
                                            final ModelValidatorClassStructure.Builder builder,
                                            final RestModelField restModelField,
                                            final boolean validateList) {
        if (isNullable) {
            if (shouldNotEmptyValidatorBeAdded(restModelField)) {
                builder.add(restModelField, validatorAnnotationClass.getSimpleName(),
                        RequiredAndNotEmptyStringConstraintValidator.class.getName(), null, validateList);
            } else {
                builder.add(restModelField, validatorAnnotationClass.getSimpleName(),
                        RequiredConstraintValidator.class.getName(), null, validateList);
            }
        } else {
            if (shouldNotEmptyValidatorBeAdded(restModelField)) {
                builder.add(restModelField, validatorAnnotationClass.getSimpleName(),
                        NotEmptyStringConstraintValidator.class.getName(), null, validateList);
            }
        }
    }

    private boolean shouldNotEmptyValidatorBeAdded(final RestModelField restModelField) {
        final AllowEmptyString allowEmptyString = restModelField.getAnnotation(AllowEmptyString.class);
        final MinLength minLength = restModelField.getAnnotation(MinLength.class);
        final Length length = restModelField.getAnnotation(Length.class);
        final WhatsApp whatsApp = restModelField.getAnnotation(WhatsApp.class);
        final Viber viber = restModelField.getAnnotation(Viber.class);
        final Telegram telegram = restModelField.getAnnotation(Telegram.class);
        final Phone phone = restModelField.getAnnotation(Phone.class);
        final LatinAlphabetOnly latinAlphabetOnly = restModelField.getAnnotation(LatinAlphabetOnly.class);
        final URI uri = restModelField.getAnnotation(URI.class);
        final IP ip = restModelField.getAnnotation(IP.class);
        final HostName hostName = restModelField.getAnnotation(HostName.class);
        final DomainName domainName = restModelField.getAnnotation(DomainName.class);
        final Enumeration enumeration = restModelField.getAnnotation(Enumeration.class);
        final Email email = restModelField.getAnnotation(Email.class);
        final DigitsOnly digitsOnly = restModelField.getAnnotation(DigitsOnly.class);
        final CountryCode countryCode = restModelField.getAnnotation(CountryCode.class);
        final Base64URLEncoded base64URLEncoded = restModelField.getAnnotation(Base64URLEncoded.class);
        return (allowEmptyString == null || allowEmptyString.off()) &&
                (minLength == null || minLength.off()) &&
                (length == null || length.off()) &&
                (whatsApp == null || whatsApp.off()) &&
                (viber == null || viber.off()) &&
                (telegram == null || telegram.off()) &&
                (phone == null || phone.off()) &&
                (latinAlphabetOnly == null || latinAlphabetOnly.off()) &&
                (uri == null || uri.off()) &&
                (ip == null || ip.off()) &&
                (hostName == null || hostName.off()) &&
                (domainName == null || domainName.off()) &&
                (enumeration == null || enumeration.off()) &&
                (email == null || email.off()) &&
                (digitsOnly == null || digitsOnly.off()) &&
                (countryCode == null || countryCode.off()) &&
                (base64URLEncoded == null || base64URLEncoded.off());
    }
}
