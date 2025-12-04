package org.example.app.lesson_16

fun main() {
    val dice = Dice()
    dice.displayNumber()
}

class Dice() {
    private val randomNumber = (1..6).random()

    fun displayNumber() {
        println("Random number is: $randomNumber")
    }
}