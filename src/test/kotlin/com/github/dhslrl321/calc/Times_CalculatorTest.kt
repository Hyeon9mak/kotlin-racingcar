package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class Times_CalculatorTest {

    val sut = Calculator()

    @Test
    fun `곱셈 이항`() {
        val actual = sut.calc("1 * 2")

        actual shouldBe 2
    }

    @Test
    fun `곱셈 다항`() {
        val actual = sut.calc("1 * 2 * 3")

        actual shouldBe 6
    }
}
