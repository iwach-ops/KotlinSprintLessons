package org.example.app.lesson_22

fun main() {

    val person = Person(101, "Tim", 32)

    val (id, name, age) = person

    println(
        """
        $id
        $name
        $age
    """.trimIndent()
    )
}

data class Person(
    val id: Int,
    val name: String,
    val age: Int
)