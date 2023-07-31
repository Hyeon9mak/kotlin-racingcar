package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class CompositeOperation_CalculatorTest {

    @Test
    fun `복합 산술 연산이 가능하다`() {
        val actual = Calculator.calc("1 + 2 - 3")

        actual shouldBe 0
    }
}
