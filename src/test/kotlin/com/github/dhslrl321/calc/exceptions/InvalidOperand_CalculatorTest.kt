package com.github.dhslrl321.calc.exceptions

import com.github.dhslrl321.calc.Calculator
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.lang.IllegalArgumentException

class InvalidOperand_CalculatorTest : StringSpec({

    val sut = Calculator()

    "사칙연산자가 아닐 경우" {
        val exMessage = shouldThrow<IllegalArgumentException> { sut.calc("1 & 2") }.message

        exMessage shouldBe "산술연산자가 아닙니다"
    }
})
