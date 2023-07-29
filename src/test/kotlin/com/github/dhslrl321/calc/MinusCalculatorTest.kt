package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class MinusCalculatorTest {

    val sut = Calculator()

    @Test
    fun name() {
        val actual = sut.calc("1 - 2")

        actual shouldBe -1
    }

    @Test
    fun name2() {
        val actual = sut.calc("1 - 2 - 3")

        actual shouldBe -4
    }
}
