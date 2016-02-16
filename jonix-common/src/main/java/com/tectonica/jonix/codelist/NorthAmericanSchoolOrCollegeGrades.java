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
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 77</b>
 * <p>
 * Description: North American school or college grade
 * 
 * @see <a href="http://www.editeur.org/14/code-lists">About ONIX Codelists</a>
 * @see <a
 *      href="http://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_32.html#codelist77">ONIX
 *      Codelist 77 in Reference Guide</a>
 */
public enum NorthAmericanSchoolOrCollegeGrades
{
	/**
	 * Age typically 0-4 years
	 */
	Preschool("P", "Preschool"), //

	/**
	 * Age typically 5 years
	 */
	Kindergarten("K", "Kindergarten"), //

	/**
	 * Age typically 6 years
	 */
	First_Grade("1", "First Grade"), //

	/**
	 * Age typically 7 years
	 */
	Second_Grade("2", "Second Grade"), //

	/**
	 * Age typically 8 years
	 */
	Third_Grade("3", "Third Grade"), //

	/**
	 * Age typically 9 years
	 */
	Fourth_Grade("4", "Fourth Grade"), //

	/**
	 * Age typically 10 years
	 */
	Fifth_Grade("5", "Fifth Grade"), //

	/**
	 * Age typically 11 years
	 */
	Sixth_Grade("6", "Sixth Grade"), //

	/**
	 * Age typically 12 years
	 */
	Seventh_Grade("7", "Seventh Grade"), //

	/**
	 * Age typically 13 years
	 */
	Eighth_Grade("8", "Eighth Grade"), //

	/**
	 * High School Freshman - age typically 14 years
	 */
	Ninth_Grade("9", "Ninth Grade"), //

	/**
	 * High School Sophomore - age typically 15 years
	 */
	Tenth_Grade("10", "Tenth Grade"), //

	/**
	 * High School Junior - age typically 16 years
	 */
	Eleventh_Grade("11", "Eleventh Grade"), //

	/**
	 * High School Senior - age typically 17 years
	 */
	Twelfth_Grade("12", "Twelfth Grade"), //

	/**
	 * Age typically 18 years
	 */
	College_Freshman("13", "College Freshman"), //

	/**
	 * Age typically 19 years
	 */
	College_Sophomore("14", "College Sophomore"), //

	/**
	 * Age typically 20 years
	 */
	College_Junior("15", "College Junior"), //

	/**
	 * Age typically 21 years
	 */
	College_Senior("16", "College Senior"), //

	/**
	 * Age typically 22+ years
	 */
	College_Graduate_Student("17", "College Graduate Student");

	public final String value;
	public final String label;

	private NorthAmericanSchoolOrCollegeGrades(String value, String label)
	{
		this.value = value;
		this.label = label;
	}

	private static Map<String, NorthAmericanSchoolOrCollegeGrades> map;

	private static Map<String, NorthAmericanSchoolOrCollegeGrades> map()
	{
		if (map == null)
		{
			map = new HashMap<>();
			for (NorthAmericanSchoolOrCollegeGrades e : values())
				map.put(e.value, e);
		}
		return map;
	}

	public static NorthAmericanSchoolOrCollegeGrades byValue(String value)
	{
		if (value == null || value.isEmpty())
			return null;
		return map().get(value);
	}
}
