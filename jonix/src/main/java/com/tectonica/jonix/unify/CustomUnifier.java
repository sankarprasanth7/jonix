/*
 * Copyright (C) 2012-2020 Zach Melamed
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

package com.tectonica.jonix.unify;

import com.tectonica.jonix.JonixRecord;
import com.tectonica.jonix.common.OnixHeader;
import com.tectonica.jonix.common.OnixProduct;
import com.tectonica.jonix.onix2.Header;

public interface CustomUnifier<P extends UnifiedProduct, H extends UnifiedHeader, R extends UnifiedRecord<P>> {
    default P unifiedProduct(OnixProduct onixProduct) {
        if (onixProduct instanceof com.tectonica.jonix.onix2.Product) {
            return extractProduct2((com.tectonica.jonix.onix2.Product) onixProduct);
        }
        if (onixProduct instanceof com.tectonica.jonix.onix3.Product) {
            return extractProduct3((com.tectonica.jonix.onix3.Product) onixProduct);
        }
        throw new UnsupportedOperationException("Wrong Product class passed: " + onixProduct.getClass().getName());
    }

    default H unifiedHeader(OnixHeader onixHeader) {
        if (onixHeader instanceof com.tectonica.jonix.onix2.Header) {
            return extractHeader2((Header) onixHeader);
        }
        if (onixHeader instanceof com.tectonica.jonix.onix3.Header) {
            return extractHeader3((com.tectonica.jonix.onix3.Header) onixHeader);
        }
        throw new UnsupportedOperationException("Wrong Product class passed: " + onixHeader.getClass().getName());
    }

    R unifiedRecord(JonixRecord record);

    P extractProduct2(com.tectonica.jonix.onix2.Product onixProduct2);

    P extractProduct3(com.tectonica.jonix.onix3.Product onixProduct3);

    H extractHeader2(Header onixHeader);

    H extractHeader3(com.tectonica.jonix.onix3.Header onixHeader);
}
