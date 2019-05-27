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

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixElement;
import com.tectonica.jonix.codelist.Languages;
import com.tectonica.jonix.codelist.NotificationOrUpdateTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.TextCaseFlags;
import com.tectonica.jonix.codelist.TextFormats;
import com.tectonica.jonix.codelist.TransliterationSchemes;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Notification or update type code</h1>
 * <p>
 * An ONIX code which indicates the type of notification or update which you are sending. Mandatory and non-repeating.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Format</td>
 * <td>Fixed-length, two numeric digits.</td>
 * </tr>
 * <tr>
 * <td>Codelist</td>
 * <td>List 1</td>
 * </tr>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;NotificationType&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;a002&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Example</td>
 * <td><tt>&lt;a002&gt;02&lt;/a002&gt;</tt> Advance notification</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;Product&gt;</li>
 * <li>&lt;SubSeriesRecord&gt;</li>
 * <li>&lt;MainSeriesRecord&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>ONIXMessage ⯈ Product ⯈ NotificationType</li>
 * <li>ONIXMessage ⯈ SubSeriesRecord ⯈ NotificationType</li>
 * <li>ONIXMessage ⯈ MainSeriesRecord ⯈ NotificationType</li>
 * </ul>
 */
public class NotificationType implements OnixElement<NotificationOrUpdateTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "NotificationType";
    public static final String shortname = "a002";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    public TextFormats textformat;

    public TextCaseFlags textcase;

    public Languages language;

    public TransliterationSchemes transliteration;

    /**
     * (type: DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // VALUE MEMBER
    /////////////////////////////////////////////////////////////////////////////////

    public NotificationOrUpdateTypes value;

    /**
     * Internal API, use the {@link #value()} method or the {@link #value} field instead
     */
    @Override
    public NotificationOrUpdateTypes _value() {
        return value;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // SERVICES
    /////////////////////////////////////////////////////////////////////////////////

    private final boolean exists;
    public static final NotificationType EMPTY = new NotificationType();

    public NotificationType() {
        exists = false;
    }

    public NotificationType(org.w3c.dom.Element element) {
        exists = true;
        textformat = TextFormats.byCode(JPU.getAttribute(element, "textformat"));
        textcase = TextCaseFlags.byCode(JPU.getAttribute(element, "textcase"));
        language = Languages.byCode(JPU.getAttribute(element, "language"));
        transliteration = TransliterationSchemes.byCode(JPU.getAttribute(element, "transliteration"));
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");

        value = NotificationOrUpdateTypes.byCode(JPU.getContentAsString(element));
    }

    /**
     * @return whether this tag (&lt;NotificationType&gt; or &lt;a002&gt;) is explicitly provided in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }
}
