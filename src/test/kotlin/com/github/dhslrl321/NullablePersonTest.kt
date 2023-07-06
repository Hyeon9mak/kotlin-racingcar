package com.github.dhslrl321

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class NullablePersonTest {
    @Test
    fun `nullable types`() {
        val actual = NullablePerson("jang", null, null)

        assertAll(
            { assertThat(actual.name).isEqualTo("jang") },
            { assertThat(actual.age).isNull() },
            { assertThat(actual.nickname).isNull() },
        )
    }
}