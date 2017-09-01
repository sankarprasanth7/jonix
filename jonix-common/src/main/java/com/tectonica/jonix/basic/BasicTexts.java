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

package com.tectonica.jonix.basic;

import com.tectonica.jonix.codelist.TextTypes;

import java.util.List;

/**
 * A {@link List} containing the multiple instances of ONIX2 &lt;OtherText&gt; / ONIX3 &lt;TextContent&gt; that may
 * exist in a product
 *
 * @author Zach Melamed
 */
@SuppressWarnings("serial")
public abstract class BasicTexts extends LazyList<BasicText> {
    public BasicText findText(TextTypes requestedType) {
        // we don't use product.findOtherText() because we need the 'textFormat' attribute, not just the value
        for (BasicText text : this) {
            if (text.textType == requestedType) {
                return text;
            }
        }
        return null;
    }

    public String getUnescapedText(TextTypes requestedType) {
        BasicText found = findText(requestedType);
        return (found == null) ? null : found.getUnescapedText();
    }
}
