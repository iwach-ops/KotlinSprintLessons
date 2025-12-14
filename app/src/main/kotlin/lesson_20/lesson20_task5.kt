package org.example.app.lesson_20

fun main() {
    val robot = Robot()

    robot.say()

    robot.setModifier { text -> text.uppercase() }

    robot.say()
}

class Robot {

    private var phrases: List<String> = listOf(
        "Hi all",
        "I am Robot",
        "My name is Bob"
    )

    private var modifier: ((String) -> String) = { it }

    fun setModifier(modify: (String) -> String) {
        modifier = modify
    }

    fun say() {
        val phrase = phrases.random()
        val result = modifier?.invoke(phrase) ?: phrase
        println(result)
    }
}