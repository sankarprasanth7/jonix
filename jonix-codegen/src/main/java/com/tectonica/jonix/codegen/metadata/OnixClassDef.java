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

package com.tectonica.jonix.codegen.metadata;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class OnixClassDef implements Comparable<OnixClassDef> {
    public String name;
    public List<OnixConst> consts;
    public List<OnixAttribute> attributes;

    // TODO: create a nice getter
    @JsonIgnore
    public List<OnixDoc> onixDocs; // set on postAnalysis()

    @JsonIgnore
    public List<OnixCompositeDef> parents; // set on postAnalysis(), null only on ONIXMessage

    public List<String> getParentClasses() {
        return parents == null ? null : parents.stream().map(oc -> oc.name).collect(Collectors.toList());
    }

    public List<String> paths; // set on postAnalysis(), never null

    public List<String> getDocPaths() {
        return onixDocs == null ? null : onixDocs.stream()
            .map(od -> String.format("%s: %s", od.groupMarker, od.path))
            .collect(Collectors.toList());
    }

    public String constValue(String constName) {
        for (OnixConst aConst : consts) {
            if (aConst.name.equals(constName)) {
                return aConst.value;
            }
        }
        return null;
    }

    public void add(OnixConst onixConst) {
        if (consts == null) {
            consts = new ArrayList<>();
        }
        consts.add(onixConst);
    }

    public void add(OnixAttribute onixAttribute) {
        if (attributes == null) {
            attributes = new ArrayList<>();
        }
        attributes.add(onixAttribute);
    }

    public void add(OnixDoc onixDoc) {
        if (onixDocs == null) {
            onixDocs = new ArrayList<>();
        }
        onixDocs.add(onixDoc);
    }

    public void add(OnixCompositeDef parentOnixClass) {
        if (parents == null) {
            parents = new ArrayList<>();
        }
        parents.add(parentOnixClass);
    }

    public void sortInternally() {
        if (attributes != null) {
            Collections.sort(attributes);
        }
        if (consts != null) {
            Collections.sort(consts);
        }
    }

    @Override
    public int compareTo(OnixClassDef other) {
        return name.compareTo(other.name);
    }
}