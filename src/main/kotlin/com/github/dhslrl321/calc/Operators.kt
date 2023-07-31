package com.github.dhslrl321.calc

enum class Operators(val value: String) {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    companion object {
        fun findBy(value: String): Operators? {
            return values().find { it.value == value }
        }
    }
}
