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

package com.tectonica.jonix.common.codelist;

import com.tectonica.jonix.common.OnixCodelist;

/*
 * NOTE: THIS IS AN AUTO-GENERATED FILE, DO NOT EDIT MANUALLY
 */

/**
 * marker interface to assist in IDE navigation to code-list 223 (Status detail code type)
 */
interface CodeList223 {
}

/**
 * <code>Enum</code> that corresponds to ONIX <b>Codelist 223</b>
 * <p>
 * Description: Status detail code type
 *
 * @see <a href="https://www.editeur.org/14/Code-Lists/">About ONIX Codelists</a>
 * @see <a href="https://www.editeur.org/files/ONIX%20for%20books%20-%20code%20lists/ONIX_BookProduct_Codelists_Issue_45.html#codelist223">ONIX
 * Codelist 223 in Reference Guide</a>
 */
public enum StatusDetailCodeTypes implements OnixCodelist, CodeList223 {
    Proprietary("01", "Proprietary"), //

    /**
     * Status detail code is taken from List 225
     */
    ONIX_Status_detail_code("02", "ONIX Status detail code");

    public final String code;
    public final String description;

    StatusDetailCodeTypes(String code, String description) {
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

    public static StatusDetailCodeTypes byCode(String code) {
        if (code == null || code.isEmpty()) {
            return null;
        }
        for (StatusDetailCodeTypes e : values()) {
            if (e.code.equals(code)) {
                return e;
            }
        }
        return null;
    }
}