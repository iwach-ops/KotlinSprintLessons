package org.example.app.lesson_7

const val EVEN_NUMBER_RESPONSE = "even number: "
const val START_INDEX = 0

fun main() {
    print("Enter Number: ")
    val inputNumber = readln().toInt()

    for (counter in START_INDEX..inputNumber step (2)) {
        println(EVEN_NUMBER_RESPONSE + counter)
    }
}