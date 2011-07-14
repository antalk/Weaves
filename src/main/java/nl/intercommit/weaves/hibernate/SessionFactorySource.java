/*  Copyright 2011 InterCommIT b.v.
*
*  This file is part of the "Weaves" project hosted on https://github.com/intercommit/Weaves
*
*  Weaves is free software: you can redistribute it and/or modify
*  it under the terms of the GNU Lesser General Public License as published by
*  the Free Software Foundation, either version 3 of the License, or
*  any later version.
*
*  Weaves is distributed in the hope that it will be useful,
*  but WITHOUT ANY WARRANTY; without even the implied warranty of
*  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*  GNU Lesser General Public License for more details.
*
*  You should have received a copy of the GNU Lesser General Public License
*  along with Weaves.  If not, see <http://www.gnu.org/licenses/>.
*
*/
package nl.intercommit.weaves.hibernate;

import org.apache.tapestry5.ioc.annotations.UsesMappedConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

@UsesMappedConfiguration(key=String.class,value=SessionFactoryConfiguration.class)
public interface SessionFactorySource {
	   public SessionFactory getSessionFactory(String factoryID);

	   public SessionFactory getSessionFactory(Class<?> entityClass);

	   public Session createSession(String factoryID);

	   public String getFactoryID(Class<?> entityClass);
}
