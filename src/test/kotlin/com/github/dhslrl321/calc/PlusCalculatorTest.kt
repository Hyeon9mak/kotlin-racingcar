package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class PlusCalculatorTest {
    val sut = Calculator()

    @Test
    fun name() {
        val actual = sut.calc("1 + 2")

        actual shouldBe 3
    }

    @Test
    fun name2() {
        val actual = sut.calc("1 + 2 + 4")

        actual shouldBe 7
    }
}
