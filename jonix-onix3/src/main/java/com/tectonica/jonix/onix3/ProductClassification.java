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
import com.tectonica.jonix.codelist.ProductClassificationTypes;
import com.tectonica.jonix.codelist.RecordSourceTypes;
import com.tectonica.jonix.struct.JonixProductClassification;

import java.io.Serializable;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * <h1>Product classification composite</h1>
 * <p>
 * An optional group of data elements which together define a product classification (<em>not</em> to be confused with a
 * subject classification). The intended use is to enable national or international trade classifications (also known as
 * commodity codes) to be carried in an ONIX record. The composite is repeatable if parts of the product are classified
 * differently within a single product classification scheme, or to provide classification codes from multiple
 * classification schemes.
 * </p>
 * <table border='1' cellpadding='3'>
 * <tr>
 * <td>Reference name</td>
 * <td><tt>&lt;ProductClassification&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Short tag</td>
 * <td><tt>&lt;productclassification&gt;</tt></td>
 * </tr>
 * <tr>
 * <td>Cardinality</td>
 * <td>0&#8230;n</td>
 * </tr>
 * </table>
 * <p/>
 * This tag may be included in the following composites:
 * <ul>
 * <li>&lt;DescriptiveDetail&gt;</li>
 * </ul>
 * <p/>
 * Possible placements within ONIX message:
 * <ul>
 * <li>ONIXMessage ⯈ Product ⯈ DescriptiveDetail ⯈ ProductClassification</li>
 * </ul>
 */
public class ProductClassification
    implements OnixDataCompositeWithKey<JonixProductClassification, ProductClassificationTypes>, Serializable {
    private static final long serialVersionUID = 1L;

    public static final String refname = "ProductClassification";
    public static final String shortname = "productclassification";

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
    public static final ProductClassification EMPTY = new ProductClassification();

    public ProductClassification() {
        exists = false;
        element = null;
        initialized = true; // so that no further processing will be done on this intentionally-empty object
    }

    public ProductClassification(org.w3c.dom.Element element) {
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
                case ProductClassificationType.refname:
                case ProductClassificationType.shortname:
                    productClassificationType = new ProductClassificationType(e);
                    break;
                case ProductClassificationCode.refname:
                case ProductClassificationCode.shortname:
                    productClassificationCode = new ProductClassificationCode(e);
                    break;
                case Percent.refname:
                case Percent.shortname:
                    percent = new Percent(e);
                    break;
                default:
                    break;
            }
        });
    }

    /**
     * @return whether this tag (&lt;ProductClassification&gt; or &lt;productclassification&gt;) is explicitly provided
     * in the ONIX XML
     */
    @Override
    public boolean exists() {
        return exists;
    }

    /////////////////////////////////////////////////////////////////////////////////
    // MEMBERS
    /////////////////////////////////////////////////////////////////////////////////

    private ProductClassificationType productClassificationType = ProductClassificationType.EMPTY;

    /**
     * <p>
     * An ONIX code identifying the scheme from which the identifier in &lt;ProductClassificationCode&gt; is taken.
     * Mandatory in each occurrence of the &lt;ProductClassification&gt; composite, and non-repeating.
     * </p>
     * Jonix-Comment: this field is required
     */
    public ProductClassificationType productClassificationType() {
        _initialize();
        return productClassificationType;
    }

    private ProductClassificationCode productClassificationCode = ProductClassificationCode.EMPTY;

    /**
     * <p>
     * A classification code from the scheme specified in &lt;ProductClassificationType&gt;. Mandatory in each
     * occurrence of the &lt;ProductClassification&gt; composite, and non-repeating.
     * </p>
     * Jonix-Comment: this field is required
     */
    public ProductClassificationCode productClassificationCode() {
        _initialize();
        return productClassificationCode;
    }

    private Percent percent = Percent.EMPTY;

    /**
     * <p>
     * The percentage of the unit value of the product that is assignable to a designated product classification.
     * Optional and non-repeating. Used when a mixed product (<i>eg</i> book and CD) belongs partly to two or more
     * product classes within a particular scheme. If omitted, the product classification code applies to 100% of the
     * product.
     * </p>
     * Jonix-Comment: this field is optional
     */
    public Percent percent() {
        _initialize();
        return percent;
    }

    @Override
    public JonixProductClassification asStruct() {
        _initialize();
        JonixProductClassification struct = new JonixProductClassification();
        struct.productClassificationType = productClassificationType.value;
        struct.percent = percent.value;
        struct.productClassificationCode = productClassificationCode.value;
        return struct;
    }

    @Override
    public ProductClassificationTypes structKey() {
        return productClassificationType().value;
    }
}
