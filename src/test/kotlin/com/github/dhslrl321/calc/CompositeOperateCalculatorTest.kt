package com.github.dhslrl321.calc

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CompositeOperateCalculatorTest {

    val sut = Calculator()

    @Test
    fun name() {
        val actual = sut.calc("1 + 2 - 3")

        actual shouldBe 0
    }
}
