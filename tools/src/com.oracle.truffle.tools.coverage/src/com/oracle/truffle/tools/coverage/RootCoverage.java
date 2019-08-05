/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package com.oracle.truffle.tools.coverage;

import com.oracle.truffle.api.source.SourceSection;

public class RootCoverage {

    private final SourceSection[] loadedStatements;
    private final SourceSection[] coveredStatements;
    private final boolean covered;
    private final SourceSection sourceSection;
    private final String name;

    RootCoverage(SourceSection[] loadedStatements, SourceSection[] coveredStatements, boolean covered, SourceSection sourceSection, String name) {
        this.loadedStatements = loadedStatements;
        this.coveredStatements = coveredStatements;
        this.covered = covered;
        this.sourceSection = sourceSection;
        this.name = name;
    }

    public SourceSection[] getLoadedStatements() {
        return loadedStatements;
    }

    public SourceSection[] getCoveredStatements() {
        return coveredStatements;
    }

    public boolean isCovered() {
        return covered;
    }

    public SourceSection getSourceSection() {
        return sourceSection;
    }

    public String getName() {
        return name;
    }
}
