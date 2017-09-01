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

import com.tectonica.jonix.OnixCodelist;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * marker interface to assist in IDE navigation to code-list 62 (Tax rate, coded)
 */
interface CodeList62 {
}

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 62</b>
 * <p>
 * Description: Tax rate, coded
 *
 * @see <a href="http://www.editeur.org/14/code-lists">About ONIX Codelists</a>
 * @see <a href="http://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_32.html#codelist62">ONIX
 * Codelist 62 in Reference Guide</a>
 */
public enum TaxRateCodeds implements OnixCodelist, CodeList62 {
    /**
     * Specifies that tax is applied at a higher rate than standard
     */
    Higher_rate("H", "Higher rate"), //

    /**
     * Under Italian tax rules, VAT on books may be paid at source by the publisher, and subsequent transactions through
     * the supply chain are tax-exempt
     */
    Tax_paid_at_source_Italy("P", "Tax paid at source (Italy)"), //

    /**
     * Specifies that tax is applied at a lower rate than standard
     */
    Lower_rate("R", "Lower rate"), //

    Standard_rate("S", "Standard rate"), //

    Zero_rated("Z", "Zero-rated");

    public final String code;
    public final String description;

    private TaxRateCodeds(String code, String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public static TaxRateCodeds byCode(String code) {
        if (code == null || code.isEmpty()) {
            return null;
        }
        for (TaxRateCodeds e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }
}
