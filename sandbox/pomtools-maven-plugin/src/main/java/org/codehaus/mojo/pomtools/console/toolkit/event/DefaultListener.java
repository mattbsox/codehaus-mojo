package org.codehaus.mojo.pomtools.console.toolkit.event;

/*
 * Copyright 2005-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.codehaus.mojo.pomtools.console.toolkit.ConsoleEvent;

/**
 * 
 * @author <a href="mailto:dhawkins@codehaus.org">David Hawkins</a>
 * @version $Id$
 */
public abstract class DefaultListener
    extends AbstractEventListener
{
    public DefaultListener()
    {
        super( null );
    }

    public DefaultListener( String description )
    {
        super( description );
    }

    public boolean accept( ConsoleEvent event )
    {
        return "".equalsIgnoreCase( event.getConsoleInput() );
    }
    
    public void validateConfiguration( ConsoleEventDispatcher dispatcher )
    {
        // No validation necessary
    }

    public String getDescriptionKey()
    {
        return "<enter>";
    }
}