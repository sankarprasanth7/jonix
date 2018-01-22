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

public class JonixRecord {
    private final Map<String, Object> globalConfig;

    public final JonixSource source;
    public final OnixProduct product;

    JonixRecord(Map<String, Object> globalConfig, JonixSource source, OnixProduct product) {
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
