package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class CompositeOperation_CalculatorTest {

    val sut = Calculator()

    @Test
    fun `복합 산술 연산이 가능하다`() {
        val actual = sut.calc("1 + 2 - 3")

        actual shouldBe 0
    }
}
