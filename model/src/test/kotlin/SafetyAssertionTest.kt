/*
 * Copyright (C) 2026 The OSS Review Toolkit Authors
 *
 * Licensed under the Apache License, Version 2.0
 */

package org.ossreviewtoolkit.model.srac

import io.kotest.matchers.shouldBe

import org.junit.jupiter.api.Test

class SafetyAssertionTest {

    @Test
    fun testCreateSafetyAssertionWithAllFields() {
        val assertion = SafetyAssertion(
            component = "pkg:maven/com.example/telemetry@1.0.0",
            missionFunction = "Telemetry and Command",
            authority = "NASA NPR 7150.2",
            evidence = "Safety assessment",
            rationale = "Mission critical",
            safetyRelevant = true
        )

        assertion.component shouldBe "pkg:maven/com.example/telemetry@1.0.0"
        assertion.missionFunction shouldBe "Telemetry and Command"
        assertion.authority shouldBe "NASA NPR 7150.2"
        assertion.evidence shouldBe "Safety assessment"
        assertion.rationale shouldBe "Mission critical"
        assertion.safetyRelevant shouldBe true
    }

    @Test
    fun testDefaultValuesAreCorrectlyAssigned() {
        val assertion = SafetyAssertion(
            component = "pkg:maven/com.example/demo@1.0.0"
        )

        assertion.component shouldBe "pkg:maven/com.example/demo@1.0.0"
        assertion.missionFunction shouldBe null
        assertion.authority shouldBe null
        assertion.evidence shouldBe null
        assertion.rationale shouldBe null
        assertion.safetyRelevant shouldBe false
    }
}