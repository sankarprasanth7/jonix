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

package com.tectonica.jonix.common.struct;

import com.tectonica.jonix.common.JonixStruct;
import com.tectonica.jonix.common.codelist.SubjectSchemeIdentifiers;

import java.io.Serializable;
import java.util.List;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * This class is a {@link JonixStruct} that represents both Onix2 <code>&lt;Subject></code> and Onix3
 * <code>&lt;Subject></code>.
 * <p>
 * It can be retrieved from the composite by invoking its <code>asStruct()</code> method.
 */
@SuppressWarnings("serial")
public class JonixSubject implements JonixStruct, Serializable {
    public static final JonixSubject EMPTY = new JonixSubject();

    /**
     * Raw Format: Variable length alphanumeric, suggested maximum length 20 characters
     * <p>
     * (type: dt.NonEmptyString)
     */
    public String subjectCode;

    /**
     * Raw Format: Variable length text, suggested maximum length 500 characters
     * <p>
     * (type: dt.NonEmptyString)
     */
    public List<String> subjectHeadingTexts;

    public SubjectSchemeIdentifiers subjectSchemeIdentifier;

    /**
     * Raw Format: Variable length text, suggested maximum length 100 characters
     * <p>
     * (type: dt.NonEmptyString)
     */
    public String subjectSchemeName;

    /**
     * Raw Format: Variable length alphanumeric, suggested maximum length 10 characters for consistency with other
     * version number elements
     * <p>
     * (type: dt.NonEmptyString)
     */
    public String subjectSchemeVersion;
}
