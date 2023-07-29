package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Plus_CalculatorTest {
    val sut = Calculator()

    @Test
    fun `덧셈 이항연산`() {
        val actual = sut.calc("1 + 2")

        actual shouldBe 3
    }

    @Test
    fun `덧셈 다항연산`() {
        val actual = sut.calc("1 + 2 + 4")

        actual shouldBe 7
    }
}
