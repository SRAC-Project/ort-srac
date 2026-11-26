/*
 * Copyright (C) 2026 The OSS Review Toolkit Authors
 *
 * Licensed under the Apache License, Version 2.0
 */

package org.ossreviewtoolkit.model.srac

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include

/**
 * Represents a safety-context assertion associated with a software component.
 */
data class SafetyAssertion(
    val component: String,

    @JsonInclude(Include.NON_NULL)
    val missionFunction: String? = null,

    @JsonInclude(Include.NON_NULL)
    val authority: String? = null,

    @JsonInclude(Include.NON_NULL)
    val evidence: String? = null,

    @JsonInclude(Include.NON_NULL)
    val rationale: String? = null,

    val safetyRelevant: Boolean = false
)
