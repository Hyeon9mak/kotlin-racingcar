package com.github.dhslrl321

import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun name() {
        val actual = listOf(
            Person("jang", 10, "j"),
            Person("jang", 10, nickname = "j"),
            Person(name = "jang", nickname = "j", age = 10),
        )

    }
}