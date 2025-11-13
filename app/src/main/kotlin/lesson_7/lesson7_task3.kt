package org.example.app.lesson_7

const val ENTER_NUMBER_REQUEST = "Enter number: "
const val EVEN_NUMBER_RESPONSE = "Even number: "

fun main() {
    print(ENTER_NUMBER_REQUEST)
    val inputNumber = readln().toInt()

    for (counter in 0..inputNumber step (2)) println("$EVEN_NUMBER_RESPONSE $counter")
}