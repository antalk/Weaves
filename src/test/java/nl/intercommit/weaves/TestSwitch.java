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
package nl.intercommit.weaves;

import org.apache.tapestry5.dom.Element;

import util.WeaveTestCase;

public class TestSwitch extends WeaveTestCase {

	
	
	public void testSwitchComponent() {
	
		org.apache.tapestry5.dom.Document dom = getTester().renderPage("SwitchPage/one");
		assertNotNull(dom.getElementById("switch"));
		Element el = dom.getElementById("switch");
		assertEquals("one!",el.getChildMarkup().trim());

		
		dom = getTester().renderPage("SwitchPage/unknown");
		assertNotNull(dom.getElementById("switch"));
		el = dom.getElementById("switch");
		assertEquals("<h1>default</h1>",el.getChildMarkup().trim());
		
		
		dom = getTester().renderPage("SwitchPage/someother");
		assertNotNull(dom.getElementById("switch"));
		el = dom.getElementById("switch");
		assertEquals("someother...",el.getChildMarkup().trim());
		
		dom = getTester().renderPage("SwitchPage");
		assertNotNull(dom.getElementById("switch"));
		el = dom.getElementById("switch");
		assertEquals("<h1>default</h1>",el.getChildMarkup().trim());
	}

	
	
	
}
