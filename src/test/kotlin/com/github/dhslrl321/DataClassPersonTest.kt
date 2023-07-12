package com.github.dhslrl321

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DataClassPersonTest {
    @Test
    fun `data class`() {
        val p1 = Person("jang", 10, "j")
        val p2 = Person("jang", 10, "j")

        assertThat(p1).isEqualTo(p2)
    }
}
