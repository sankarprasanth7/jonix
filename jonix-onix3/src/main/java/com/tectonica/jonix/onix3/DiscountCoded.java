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
import com.tectonica.jonix.codelist.DiscountCodeTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixDiscountCoded;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

@SuppressWarnings("serial")
public class DiscountCoded implements Serializable
{
	public static final String refname = "DiscountCoded";
	public static final String shortname = "discountcoded";

	public String datestamp; // dt.DateOrDateTime
	public RecordSourceTypes sourcetype;
	public String sourcename;

	public DiscountCodeType discountCodeType; // Required
	public DiscountCodeTypeName discountCodeTypeName; // Optional
	public DiscountCode discountCode; // Required

	public DiscountCoded()
	{}

	public DiscountCoded(org.w3c.dom.Element element)
	{
		this.datestamp = JPU.getAttribute(element, "datestamp");
		this.sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		this.sourcename = JPU.getAttribute(element, "sourcename");

		JPU.forElementsOf(element, new JPU.ElementListener()
		{
			@Override
			public void onElement(org.w3c.dom.Element element)
			{
				final String name = element.getNodeName();
				if (name.equals(DiscountCodeType.refname) || name.equals(DiscountCodeType.shortname))
					discountCodeType = new DiscountCodeType(element);
				else if (name.equals(DiscountCodeTypeName.refname) || name.equals(DiscountCodeTypeName.shortname))
					discountCodeTypeName = new DiscountCodeTypeName(element);
				else if (name.equals(DiscountCode.refname) || name.equals(DiscountCode.shortname))
					discountCode = new DiscountCode(element);
			}
		});
	}

	public DiscountCodeTypes getDiscountCodeTypeValue()
	{
		return (discountCodeType == null) ? null : discountCodeType.value;
	}

	public String getDiscountCodeTypeNameValue()
	{
		return (discountCodeTypeName == null) ? null : discountCodeTypeName.value;
	}

	public String getDiscountCodeValue()
	{
		return (discountCode == null) ? null : discountCode.value;
	}

	public JonixDiscountCoded asJonixDiscountCoded()
	{
		JonixDiscountCoded x = new JonixDiscountCoded();
		x.discountCodeTypeName = getDiscountCodeTypeNameValue();
		x.discountCode = getDiscountCodeValue();
		return x;
	}
}