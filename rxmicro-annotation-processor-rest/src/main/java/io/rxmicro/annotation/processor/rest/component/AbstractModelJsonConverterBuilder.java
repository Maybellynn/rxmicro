/*
 * Copyright 2019 https://rxmicro.io
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

package io.rxmicro.annotation.processor.rest.component;

import io.rxmicro.annotation.processor.common.component.impl.AbstractProcessorComponent;
import io.rxmicro.annotation.processor.common.model.ClassStructure;
import io.rxmicro.annotation.processor.rest.model.AbstractModelJsonConverterClassStructure;
import io.rxmicro.annotation.processor.rest.model.HttpMethodMapping;
import io.rxmicro.annotation.processor.rest.model.MappedRestObjectModelClass;
import io.rxmicro.annotation.processor.rest.model.RestObjectModelClass;
import io.rxmicro.annotation.processor.rest.model.converter.ReaderType;
import io.rxmicro.rest.model.ExchangeFormat;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static io.rxmicro.common.util.ExCollectors.toOrderedSet;
import static java.util.function.Function.identity;

/**
 * @author nedis
 * @since 0.1
 */
public abstract class AbstractModelJsonConverterBuilder<T extends AbstractModelJsonConverterClassStructure>
        extends AbstractProcessorComponent {

    protected abstract T newInstance(ReaderType readerType,
                                     RestObjectModelClass modelClass,
                                     ExchangeFormat exchangeFormat,
                                     boolean isRestClientModel);

    public final Set<T> buildFromJson(final List<MappedRestObjectModelClass> mappedRestObjectModelClasses,
                                      final ExchangeFormat exchangeFormat,
                                      final boolean isRestClientModel) {
        return build(mappedRestObjectModelClasses, exchangeFormat, !isRestClientModel, isRestClientModel);
    }

    private Set<T> notEmpty(final Stream<T> source) {
        return source
                .filter(s -> s.getModelClass().isParamsPresent())
                .collect(toOrderedSet());
    }

    public final Set<T> buildToJson(final List<MappedRestObjectModelClass> mappedRestObjectModelClasses,
                                    final ExchangeFormat exchangeFormat,
                                    final boolean isRestClientModel) {
        return build(mappedRestObjectModelClasses, exchangeFormat, false, isRestClientModel);
    }

    @SuppressWarnings("unchecked")
    protected Set<T> build(final List<MappedRestObjectModelClass> mappedRestObjectModelClasses,
                           final ExchangeFormat exchangeFormat,
                           final boolean withHttpBodyOnly,
                           final boolean isRestClientModel) {
        final Set<T> structures = new HashSet<>();
        for (final MappedRestObjectModelClass entry : mappedRestObjectModelClasses) {
            final ReaderType readerType = isRestClientModel ? ReaderType.HTTP_BODY : entry.getReaderType();
            final RestObjectModelClass modelClass = entry.getModelClass();
            final boolean shouldGenerate = !withHttpBodyOnly ||
                    entry.getHttpMethodMappings().stream().anyMatch(HttpMethodMapping::isHttpBody);
            if (shouldGenerate) {
                structures.addAll(notEmpty(Stream.of(
                        Stream.of(
                                newInstance(readerType, modelClass, exchangeFormat, isRestClientModel)
                        ),
                        modelClass.getAllChildrenObjectModelClasses().stream()
                                .map(m -> newInstance(readerType, (RestObjectModelClass) m, exchangeFormat, isRestClientModel))
                                .map(c -> (ClassStructure) c)
                        ).flatMap(identity()).map(t -> (T) t)
                ));
            }
        }
        return structures;
    }
}
