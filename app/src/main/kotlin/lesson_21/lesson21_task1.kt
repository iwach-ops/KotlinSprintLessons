package org.example.app.lesson_21

fun main() {
    val str = "hello"

    println(str.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    return count { it in vowels }
}