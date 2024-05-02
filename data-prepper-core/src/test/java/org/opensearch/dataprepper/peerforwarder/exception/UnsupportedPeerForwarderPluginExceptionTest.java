/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.peerforwarder.exception;

import org.opensearch.dataprepper.model.plugin.InvalidPluginConfigurationException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class UnsupportedPeerForwarderPluginExceptionTest {
    private String message;

    @BeforeEach
    void setUp() {
        message = UUID.randomUUID().toString();
    }

    private InvalidPluginConfigurationException createObjectUnderTest() {
        return new InvalidPluginConfigurationException(message);
    }

    @Test
    void getMessage_returns_message() {
        assertThat(createObjectUnderTest().getMessage(), equalTo(message));
    }
}
