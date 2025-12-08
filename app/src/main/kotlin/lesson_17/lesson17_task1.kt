package org.example.app.lesson_17

fun main() {
    val quiz1 = QuizElement("2+2", "4")
    val quiz2 = QuizElement("3+3", "6")

    println("quiz1: ${quiz1.question}")
    println("answer1: ${quiz1.answer}")
    println("quiz2: ${quiz2.question}")
    println("answer2: ${quiz2.answer}")
}

class QuizElement(
    _question: String,
    _answer: String
) {
    val question: String = _question
        get() = field
    var answer: String = _answer
        get() = field
        set(value) {
            field = value
        }
}