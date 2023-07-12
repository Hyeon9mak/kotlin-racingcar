package com.github.dhslrl321

import io.kotest.data.blocking.forAll
import io.kotest.inspectors.forAll
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class PersonTest {
    @Test
    fun name() {
        val actual = listOf(
            Person("jang", 10, "j"),
            Person("jang", 10, nickname = "j"),
            Person(name = "jang", nickname = "j", age = 10),
        )

        actual.forAll {
            it.name shouldBe "jang"
            it.age shouldBe 10
            it.nickname shouldBe "j"
        }
    }
}
