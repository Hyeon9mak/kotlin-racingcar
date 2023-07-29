package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Minus_CalculatorTest {

    val sut = Calculator()

    @Test
    fun `뺄셈 이항연산`() {
        val actual = sut.calc("1 - 2")

        actual shouldBe -1
    }

    @Test
    fun `뺄셈 다항연산`() {
        val actual = sut.calc("1 - 2 - 3")

        actual shouldBe -4
    }
}
