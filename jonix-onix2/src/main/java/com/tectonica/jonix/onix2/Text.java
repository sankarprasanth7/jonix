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

package com.tectonica.jonix.onix2;

import java.io.Serializable;

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.LanguageCodes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DON'T EDIT MANUALLY
 */

/**
 * <h1>Other text</h1>
 * <p>
 * The text specified in the &lt;TextTypeCode&gt; element, if it is suitable to be sent in full as part of the ONIX
 * record. Either the &lt;Text&gt; element or both of the &lt;TextLinkType&gt; and &lt;TextLink&gt; elements must be
 * present in any occurrence of the &lt;OtherText&gt; composite. Non-repeating.
 * </p>
 * <p>
 * The &lt;Text&gt; element may carry any of the following ONIX attributes: textformat, language, transliteration,
 * textcase.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Variable length text (XHTML is enabled in this element - see ONIX for Books - Product Information Message - XML
 * Message Specification, Section 7)</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td>&lt;Text&gt;</td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td>&lt;d104&gt;</td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td>&lt;Text textformat=&quot;06&quot;&gt;Introduction: aesthetics and modernity; aesthetics and post-modernity. Part
 * 1 Modern philosophy and the emergence of aesthetic theory - Kant: self-consciousness, knowledge and freedom; the
 * unity of the subject; the unification of nature; the purpose of beauty; the limits of beauty. Part 2 German idealism
 * and early German Romanticism: the &#8220;new mythology&#8221;; the romantic &#8220;new mythology&#8221;. Part 3
 * Reflections on the subject - Fichte, Holderlin and Novalis. Part 4 Schelling - art as the &#8220;organ of
 * philosophy&#8221;: the development of consciousness; the structure of the &#8220;system of transcendental
 * idealism&#8221;; the aesthetic absolute; mythology, art and language; mythology, language and being. Part 5 Hegel -
 * the beginning of aesthetic theory and the end of art: the reflexive absolute; music and the idea; language,
 * consciousness and being; the idea as sensuous appearance; the prose of the modern world; aesthetics and non-identity.
 * Part 6 Schleiermacher - aesthetics and hermeneutics: individuality; immediate self-consciousness; art as free
 * production; interpretation as art; literature and the &#8220;musical&#8221;. Part 7 Music, language and literature:
 * language and music; Hegel and music - the sayable and the unsayable; the presence of music; infinite reflection and
 * music. Part 8 Nietzsche - the divorce of art and reason: Schopenhauer - the world as embodied music; Marx, myth and
 * art; art, myth and music in &#8220;The Birth of Tragedy&#8221;; myth, music and language; the illusion of truth;
 * music and metaphysics; aesthetics, interpretation and subjectivity. Appendix: the so-called &#8220;oldest
 * system-programme of German idealism&#8221; (1796).&lt;/Text&gt;</td>
 * </tr>
 * </table>
 */
public class Text implements OnixElement, Serializable
{
	private static final long serialVersionUID = 1L;

	public static final String refname = "Text";
	public static final String shortname = "d104";

	// ///////////////////////////////////////////////////////////////////////////////
	// ATTRIBUTES
	// ///////////////////////////////////////////////////////////////////////////////

	public TextFormats textformat;

	public TextCaseFlags textcase;

	public LanguageCodes language;

	public TransliterationSchemes transliteration;

	/**
	 * (type: DateOrDateTime)
	 */
	public String datestamp;

	public RecordSourceTypes sourcetype;

	public String sourcename;

	// ///////////////////////////////////////////////////////////////////////////////
	// VALUE MEMBER
	// ///////////////////////////////////////////////////////////////////////////////

	/**
	 * Format: Variable length text (XHTML is enabled in this element - see ONIX for Books - Product Information Message
	 * - XML Message Specification, Section 7)
	 * <p>
	 * (type: XHTML)
	 */
	public String value;

	// ///////////////////////////////////////////////////////////////////////////////
	// SERVICES
	// ///////////////////////////////////////////////////////////////////////////////

	public Text()
	{}

	public Text(org.w3c.dom.Element element)
	{
		textformat = TextFormats.byValue(JPU.getAttribute(element, "textformat"));
		textcase = TextCaseFlags.byValue(JPU.getAttribute(element, "textcase"));
		language = LanguageCodes.byValue(JPU.getAttribute(element, "language"));
		transliteration = TransliterationSchemes.byValue(JPU.getAttribute(element, "transliteration"));
		datestamp = JPU.getAttribute(element, "datestamp");
		sourcetype = RecordSourceTypes.byValue(JPU.getAttribute(element, "sourcetype"));
		sourcename = JPU.getAttribute(element, "sourcename");

		value = JPU.getChildXHTML(element, true);
	}
}
