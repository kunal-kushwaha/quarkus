/*
 * Copyright 2018 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jboss.shamrock.deployment.builditem;

import org.jboss.builder.item.MultiBuildItem;

/**
 * A marker file that if present indicates that a given archive should be treated as an
 * application archive
 */
public final class AdditionalApplicationArchiveMarkerBuildItem extends MultiBuildItem {

    private final String file;

    public AdditionalApplicationArchiveMarkerBuildItem(String file) {
        this.file = file;
    }

    public String getFile() {
        return file;
    }
}
