package org.example.app.lesson_21

import java.io.File

fun main() {
    val file = File("words.txt")

    file.writeWordToFile("HeLLO")
}

fun File.writeWordToFile(word: String) {
    val currentText = if(exists()) readText() else ""

    val lowText= word.lowercase()

    writeText("$lowText\n$currentText")
}