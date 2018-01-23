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

package com.tectonica.jonix;

import java.util.Map;

/**
 * This class is generated by {@link JonixRecords} when iterating over ONIX source, and basically wraps an ONIX product
 * with some contextual information. It contains the {@link JonixSource} from which the ONIX product was read, which,
 * among others, contains the ONIX header of that source.
 * <p>
 * Note that the ONIX product object contained in this class is a low-level {@link OnixProduct} which requires casting
 * to an actual descendant in order to access the actual product content. For example:
 * <pre>
 * void foo(JonixRecord record) {
 *     if (record.product instanceof com.tectonica.jonix.onix3.Product) {
 *         com.tectonica.jonix.onix3.Product product3 = (com.tectonica.jonix.onix3.Product) record.product;
 *         // TODO: this is an Onix3 &lt;Product>, do something with 'product3' hereafter
 *     } else if (record.product instanceof com.tectonica.jonix.onix2.Product) {
 *         com.tectonica.jonix.onix2.Product product2 = (com.tectonica.jonix.onix2.Product) record.product;
 *         // TODO: this is an Onix2 &lt;Product>, do something with 'product2' hereafter
 *     } else {
 *         throw new IllegalArgumentException();
 *     }
 * }
 * </pre>
 * Alternatively, it is possible to use {@link com.tectonica.jonix.unify.JonixUnifier} in order transform the raw
 * {@link OnixProduct} into a {@link com.tectonica.jonix.unify.base.BaseProduct} which is easier to manipulate:
 * <pre>
 * void foo(JonixRecord record) {
 *     BaseProduct baseProduct = JonixUnifier.unifyProduct(record.product);
 *     // TODO: access the content of 'baseProduct'
 * }
 * </pre>
 */
public class JonixRecord {
    protected final Map<String, Object> globalConfig;

    public final JonixSource source;
    public final OnixProduct product;

    protected JonixRecord(Map<String, Object> globalConfig, JonixSource source, OnixProduct product) {
        assert globalConfig != null;
        assert source != null;
        assert product != null;
        this.globalConfig = globalConfig;
        this.source = source;
        this.product = product;
    }

    public <T> JonixRecord configure(String id, T value) {
        globalConfig.put(id, value);
        return this;
    }

    public Object configValue(String id) {
        return globalConfig.get(id);
    }
}