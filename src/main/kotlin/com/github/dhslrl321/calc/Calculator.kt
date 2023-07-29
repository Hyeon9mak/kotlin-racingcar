package com.github.dhslrl321.calc

import java.lang.ArithmeticException

class Calculator {
    fun calc(input: String): Int {

        val split = input.split(" ")

        var acc = 0
        var skip = false
        for ((i, s) in split.withIndex()) {
            if (isNumeric(s)) {
                if (skip) {
                    skip = false
                    continue
                }
                acc = s.toInt()
            } else {
                when (s) {
                    "+" -> {
                        acc = acc.plus(split[i + 1].toInt())
                        skip = true
                    }
                    "-" -> {
                        acc = acc.minus(split[i + 1].toInt())
                        skip = true
                    }
                    "/" -> {
                        val operand = split[i + 1].toInt()
                        if (operand == 0) {
                            throw ArithmeticException("0으로 나누기가 불가능함")
                        }
                        acc = acc.div(operand)
                        skip = true
                    }
                    "*" -> {
                        acc = acc.times(split[i + 1].toInt())
                        skip = true
                    }
                }
            }
        }
        return acc
    }

    private fun isNumeric(s: String): Boolean = s.toIntOrNull() != null
}
