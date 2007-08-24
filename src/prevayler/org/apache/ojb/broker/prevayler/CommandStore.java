package org.apache.ojb.broker.prevayler;

/* Copyright 2003-2005 The Apache Software Foundation
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

import java.io.Serializable;

import org.prevayler.Command;
import org.prevayler.PrevalentSystem;

/**
 * @author Thomas Mahler
 * Command to store an object in the Database.
 */
public class CommandStore implements Command
{
	private final Object objectToStore;
	
	public CommandStore(Object toStore)
	{
		this.objectToStore = toStore;	
	}

	/**
	 * @see org.prevayler.Command#execute(PrevalentSystem)
	 */
	public Serializable execute(PrevalentSystem ps) throws Exception
	{
		((Database) ps).store(objectToStore);
		return null;
	}

}
