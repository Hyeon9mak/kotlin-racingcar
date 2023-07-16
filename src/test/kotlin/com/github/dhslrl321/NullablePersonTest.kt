package com.github.dhslrl321

import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class NullablePersonTest {
    @Test
    fun `nullable types`() {
        val actual = Person("jang", null, null)

        assertAll(
            { actual.name shouldBe "jang" },
            { actual.age shouldBe null },
            { actual.nickname shouldBe null },
        )
    }
}
