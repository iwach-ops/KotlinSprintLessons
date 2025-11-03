package org.example.app.lesson_3

fun main() {
    var greeting: String
    val morning: String = "morning"
    val evening: String = "evening"
    val name: String = "Ivan"

    greeting = morning
    println("Good $greeting, $name!")
    greeting = evening
    println("Good $greeting, $name!")
}