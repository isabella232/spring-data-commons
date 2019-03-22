/* Copyright (C) 2010 SpringSource
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.mapping.model;

/**
 * Thrown when an error occurs reading the mapping between object and datastore
 * 
 * @author Graeme Rocher
 * @since 1.0
 */
public class IllegalMappingException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public IllegalMappingException(String s, Throwable throwable) {
		super(s, throwable);
	}

	public IllegalMappingException(String s) {
		super(s);
	}
}
