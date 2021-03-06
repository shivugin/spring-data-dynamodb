/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socialsignin.spring.data.dynamodb.repository.support;

import java.io.Serializable;
import java.util.Set;

/**
 * Obtains basic hash-and-range-key-related metadata about a DynamoDBEntity
 * 
 * @author Michael Lavelle
 */
public interface DynamoDBHashAndRangeKeyExtractingEntityMetadata<T, ID extends Serializable> extends
		DynamoDBHashKeyExtractingEntityMetadata<T> {

	public <H> HashAndRangeKeyExtractor<ID, H> getHashAndRangeKeyExtractor(Class<ID> idClass);

	public String getRangeKeyPropertyName();

	public Set<String> getIndexRangeKeyPropertyNames();

	boolean isCompositeHashAndRangeKeyProperty(String propertyName);

	public <H> T getHashKeyPropotypeEntityForHashKey(H hashKey);

}
