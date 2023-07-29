package com.github.dhslrl321.calc

import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class DivCalculatorTest {

    val sut = Calculator()

    @Test
    fun name() {
        val actual = sut.calc("10 / 2")

        actual shouldBe 5
    }

    @Test
    fun name2() {
        assertThatThrownBy { sut.calc("10 / 0") }
            .isInstanceOf(ArithmeticException::class.java)
            .hasMessage("0으로 나누기가 불가능함")
    }
}
