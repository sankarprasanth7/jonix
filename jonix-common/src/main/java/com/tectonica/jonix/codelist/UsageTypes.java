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

package com.tectonica.jonix.codelist;

import java.util.HashMap;
import java.util.Map;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT IT
 */

/**
 * Enum that corresponds to ONIX's CodeList145
 * <p>
 * Usage type
 * 
 * @see <a href="http://www.editeur.org/14/code-lists/">http://www.editeur.org/14/code-lists/</a>
 */
public enum UsageTypes
{
	/**
	 * Preview before purchase.
	 */
	Preview("01"), //

	/**
	 * Print paper copy of extract.
	 */
	Print("02"), //

	/**
	 * Make digital copy of extract.
	 */
	Copy_paste("03"), //

	/**
	 * Share product across multiple concurrent devices.
	 */
	Share("04"), //

	/**
	 * ‘Read aloud’ with text to speech functionality.
	 */
	Text_to_speech("05"), //

	/**
	 * Lendable to other device owner or account holder, eg ‘Lend-to-a-friend’, library lending. The ‘primary’ copy becomes unusable while
	 * the secondary copy is ‘on loan’ unless a number of concurrent borrowers is also specified).
	 */
	Lend("06"), //

	/**
	 * E-publication license is time limited. Use with 02 from List 146 and a number of days in <EpubUsageLimit>.
	 */
	Time_limited_license("07"), //

	/**
	 * Maximum quality (in dots per inch) of any allowed printing (see also code 02).
	 * <p>
	 * NOTE: Deprecated in Onix3
	 */
	Max_print_DPI("08");

	public final String value;

	private UsageTypes(String value)
	{
		this.value = value;
	}

	private static Map<String, UsageTypes> map;

	private static Map<String, UsageTypes> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (UsageTypes e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static UsageTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}