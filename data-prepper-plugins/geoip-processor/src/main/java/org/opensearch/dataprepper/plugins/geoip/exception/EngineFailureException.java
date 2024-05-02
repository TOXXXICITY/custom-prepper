/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.dataprepper.plugins.geoip.exception;

public class EngineFailureException extends RuntimeException {
    public EngineFailureException(final String exceptionMsg) {
        super(exceptionMsg);
    }
}
