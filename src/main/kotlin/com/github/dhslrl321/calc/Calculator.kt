package com.github.dhslrl321.calc

import com.github.dhslrl321.calc.Operators.*
import com.github.dhslrl321.calc.Operators.Companion.findBy
import java.lang.ArithmeticException
import java.lang.IllegalArgumentException

private const val FIRST_INDEX = 1
private const val UNTIL_OPERAND = 2


object Calculator {
    fun calc(input: String?): Int {
        require(input.isNullOrBlank().not()) { "공백 혹은 빈 문자열은 안됨" }

        val operations = input!!.split(" ")

        return evaluate(operations)
    }

    private fun evaluate(tokens: List<String>): Int {
        val initial = tokens.first().toInt()

        val operations = tokens.drop(FIRST_INDEX).chunked(UNTIL_OPERAND)

        return operations.fold(initial) { accumulator, (operator, operand) ->
            operate(accumulator, operator, operand.toInt())
        }
    }

    private fun operate(acc: Int, operator: String, operand: Int): Int = when (findBy(operator)) {
        PLUS -> acc + operand
        MINUS -> acc - operand
        MULTIPLY -> acc * operand
        DIVIDE -> {
            require(operand != 0) { throw ArithmeticException("0으로 나누기가 불가능함") }
            acc / operand
        }

        else -> throw IllegalArgumentException("산술연산자가 아닙니다")
    }
}
