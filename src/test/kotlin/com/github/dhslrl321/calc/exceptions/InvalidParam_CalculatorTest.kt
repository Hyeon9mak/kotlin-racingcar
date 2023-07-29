package com.github.dhslrl321.calc.exceptions

import com.github.dhslrl321.calc.Calculator
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class InvalidParam_CalculatorTest {
    val sut = Calculator()

    @ParameterizedTest
    @ValueSource(strings = ["", " "])
    fun `계산할 인자가 empty 문자열이면`(input: String?) {
        assertThatThrownBy { sut.calc(input) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("공백 혹은 빈 문자열은 안됨")
    }

    @Test
    fun name() {
        assertThatThrownBy { sut.calc(null) }
            .isInstanceOf(IllegalArgumentException::class.java)
            .hasMessage("공백 혹은 빈 문자열은 안됨")
    }
}
