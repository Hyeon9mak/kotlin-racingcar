package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class Div_CalculatorTest {

    val sut = Calculator()

    @Test
    fun `나누기 이항 연산`() {
        val actual = sut.calc("10 / 2")

        actual shouldBe 5
    }

    @Test
    fun `0으로 나누기는 불가능하다`() {
        assertThatThrownBy { sut.calc("10 / 0") }
            .isInstanceOf(ArithmeticException::class.java)
            .hasMessage("0으로 나누기가 불가능함")
    }
}
