package com.github.dhslrl321

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataClassPersonTest {
    @Test
    fun `data class`() {
        val p1 = DataClassPerson("jang", 10, "j")
        val p2 = DataClassPerson("jang", 10, "j")

        assertThat(p1).isEqualTo(p2)
    }
}