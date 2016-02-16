/*
 * Copyright (C) 2012 Zach Melamed
 * 
 * Latest version available online at https://github.com/zach-m/jonix
 * Contact me at zach@tectonica.co.il
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

package com.tectonica.jonix.onix3;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.PersonOrganizationDateRoles;
import com.tectonica.jonix.codelist.RecordSourceTypes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Contributor date role code</h1>
 * <p>
 * An ONIX code indicating the significance of the date in relation to the contributor name. Mandatory in each
 * occurrence of the &lt;ContributorDate&gt; composite, and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed-length, two digits</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 177</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;ContributorDateRole&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;x417&gt;</td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;ContributorDateRole&gt;50&lt;/ContributorDateRole&gt; (Date of birth)</td>
 * </tr>
 * </table>
 */
public class ContributorDateRole implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "ContributorDateRole";
	public static final String shortname = "x417";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * (type: dt.DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// VALUE MEMBER
	// ///////////////////////////////////////////////////////////////////////////////

	public PersonOrganizationDateRoles value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public ContributorDateRole()
	{}

	public ContributorDateRole(org.w3c.dom.Element element)
	{
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = PersonOrganizationDateRoles.byValue(JPU.getContentAsString(element));
	}
}
