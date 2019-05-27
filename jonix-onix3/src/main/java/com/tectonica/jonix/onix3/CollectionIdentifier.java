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

import com.tectonica.jonix.JPU;
import com.tectonica.jonix.OnixComposite.OnixDataCompositeWithKey;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.codelist.SeriesIdentifierTypes;
import com.tectonica.jonix.struct.JonixCollectionIdentifier;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Collection identifier composite</h1>
 * <p>
 * A repeatable group of data elements which together specify an identifier of a bibliographic collection. The composite
 * is optional, and may only repeat if two or more identifiers of different types are sent for the same collection. It
 * is not permissible to have two identifiers of the same type.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;CollectionIdentifier&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;collectionidentifier&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;Collection&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>ONIXMessage ⯈ Product ⯈ DescriptiveDetail ⯈ Collection ⯈ CollectionIdentifier</li>
 * </ul>
 */
public class CollectionIdentifier
    implements OnixDataCompositeWithKey<JonixCollectionIdentifier, SeriesIdentifierTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "CollectionIdentifier";
    public static final String shortname = "collectionidentifier";

    /////////////////////////////////////////////////////////////////////////////////
    // ATTRIBUTES
    /////////////////////////////////////////////////////////////////////////////////

    /**
     * (type: dt.DateOrDateTime)
     */
    public String datestamp;

    public RecordSourceTypes sourcetype;

    /**
     * (type: dt.NonEmptyString)
     */
    public String sourcename;

    /////////////////////////////////////////////////////////////////////////////////
    // CONSTRUCTION
    /////////////////////////////////////////////////////////////////////////////////

    private boolean initialized;
    private final boolean exists;
    private final org.w3c.dom.Element element;
    public static final CollectionIdentifier EMPTY = new CollectionIdentifier();

    public CollectionIdentifier() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public CollectionIdentifier(org.w3c.dom.Element element) {
        exists = true;
        initialized = false;
        this.element = element;
        datestamp = JPU.getAttribute(element, "datestamp");
        sourcetype = RecordSourceTypes.byCode(JPU.getAttribute(element, "sourcetype"));
        sourcename = JPU.getAttribute(element, "sourcename");
    }

    @Override
    public void _initialize() {
        if (initialized) {
            return;
        }
        initialized = true;

        JPU.forElementsOf(element, e -> {
            final String name = e.getNodeName();
            switch (name) {
                case CollectionIDType.refname:
                case CollectionIDType.shortname:
                    collectionIDType = new CollectionIDType(e);
                    break;
                case IDTypeName.refname:
                case IDTypeName.shortname:
                    idTypeName = new IDTypeName(e);
                    break;
                case IDValue.refname:
                case IDValue.shortname:
                    idValue = new IDValue(e);
                    break;
                default:
                    break;
            }
        });
    }

    /**
     * @return whether this tag (&lt;CollectionIdentifier&gt; or &lt;collectionidentifier&gt;) is explicitly provided in
     * the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private CollectionIDType collectionIDType = CollectionIDType.EMPTY;

    /**
     * <p>
     * An ONIX code identifying a scheme from which an identifier in the &lt;IDValue&gt; element is taken. Mandatory in
     * each occurrence of the &lt;CollectionIdentifier&gt; composite, and non-repeating.
     * </p>
     * Jonix-Comment: this field is required
     */
    public CollectionIDType collectionIDType() {
        _initialize();
        return collectionIDType;
    }

    private IDTypeName idTypeName = IDTypeName.EMPTY;

    /**
     * <p>
     * A name which identifies a proprietary identifier scheme (<i>ie</i> a scheme which is not a standard and for which
     * there is no individual ID type code). Must be included when, and only when, the code in &lt;CollectionIDType&gt;
     * indicates a proprietary scheme, <i>eg</i> a publisher’s own code. Optional and non-repeating.
     * </p>
     * Jonix-Comment: this field is optional
     */
    public IDTypeName idTypeName() {
        _initialize();
        return idTypeName;
    }

    private IDValue idValue = IDValue.EMPTY;

    /**
     * <p>
     * An identifier of the type specified in the &lt;CollectionIDType&gt; field. Mandatory in each occurrence of the
     * &lt;CollectionIdentifier&gt; composite, and non-repeating.
     * </p>
     * Jonix-Comment: this field is required
     */
    public IDValue idValue() {
        _initialize();
        return idValue;
    }

    @Override
    public JonixCollectionIdentifier asStruct() {
        _initialize();
        JonixCollectionIdentifier struct = new JonixCollectionIdentifier();
        struct.collectionIDType = collectionIDType.value;
        struct.idTypeName = idTypeName.value;
        struct.idValue = idValue.value;
        return struct;
    }

    @Override
    public SeriesIdentifierTypes structKey() {
        return collectionIDType().value;
    }
}
