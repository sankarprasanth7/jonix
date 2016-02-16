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

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 53</b>
 * <p>
 * Description: Returns conditions code type
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">About ONIX Codelists</a>
 * @see <a
 *      href="http://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_32.html#codelist53">ONIX
 *      Codelist 53 in Reference Guide</a>
 */
public enum ReturnsConditionsCodeTypes
{
	Proprietary("00", "Proprietary"), //

	/**
	 * Maintained by CLIL (Commission Interprofessionnel du Livre). Returns conditions values in &lt;ReturnsCode&gt;
	 * should be taken from the CLIL list
	 */
	French_book_trade_returns_conditions_code("01", "French book trade returns conditions code"), //

	/**
	 * Maintained by BISAC: Returns conditions values in &lt;ReturnsCode&gt; should be taken from List 66
	 */
	BISAC_Returnable_Indicator_code("02", "BISAC Returnable Indicator code"), //

	/**
	 * NOT CURRENTLY USED - BIC has decided that it will not maintain a code list for this purpose, since returns
	 * conditions are usually at least partly based on the trading relationship
	 */
	UK_book_trade_returns_conditions_code("03", "UK book trade returns conditions code"), //

	/**
	 * Returns conditions values in &lt;ReturnsCode&gt; should be taken from List 204
	 */
	ONIX_Returns_conditions_code("04", "ONIX Returns conditions code");

	public final String value;
	public final String label;

	private ReturnsConditionsCodeTypes(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	public static ReturnsConditionsCodeTypes byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		for (ReturnsConditionsCodeTypes e : values())
			if (e.value.equals(value))
				return e;
		return null;
	}
}
