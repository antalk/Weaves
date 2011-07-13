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
package nl.intercommit.weaves.test.pages;

import java.util.LinkedList;
import java.util.List;

import org.apache.tapestry5.annotations.Property;

public class EditableSelectPage {

	@Property
	private String item;
	
	public List<String> getList() {
		List<String> items = new LinkedList<String>();
		items.add("psp");
		items.add("ipad");
		items.add("3ds");
		return items;
		
	}
}
