/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.processor.aggregate.actions;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum RateLimiterMode {
    DROP("drop"),
    BLOCK("block");

    private static final Map<String, RateLimiterMode> ACTIONS_MAP = Arrays.stream(RateLimiterMode.values())
        .collect(Collectors.toMap(
                value -> value.name,
                value -> value
        ));

    private final String name;

    RateLimiterMode(String name) {
        this.name = name.toLowerCase();
    }

    @Override
    public String toString() {
        return name;
    }

    @JsonCreator
    static RateLimiterMode fromOptionValue(final String option) {
        return ACTIONS_MAP.get(option.toLowerCase());
    }

}
