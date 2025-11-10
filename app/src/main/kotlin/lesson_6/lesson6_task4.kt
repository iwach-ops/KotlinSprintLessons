package org.example.app.lesson_6

import kotlin.ranges.random

const val NUMBER_OF_ATTEMPTS = 5
const val GAME_START_REQUEST = "Guess the number from 1 to 9 (You have 5 attempts): "
const val ATTEMPT_REQUEST = "Enter your number: "
const val GAME_RESPONSE = "It was a great game!"
const val WRONG_NUMBER_RESPONSE = "It is wrong..you have "
const val GUESSABLE_NUMBER_RESPONSE = "Guessable number is "

fun main() {
    val guessRandomNumber = (1..9).random()
    var counter = NUMBER_OF_ATTEMPTS

    println("Test: $guessRandomNumber")
    println(GAME_START_REQUEST)

    while (counter > 0) {
        counter--
        print(ATTEMPT_REQUEST)
        val inputNumber = readln().toInt()

        if (inputNumber == guessRandomNumber) {
            println(GAME_RESPONSE)
            return
        } else {
            println("$WRONG_NUMBER_RESPONSE $counter attempts")
        }
    }
    println(GUESSABLE_NUMBER_RESPONSE + guessRandomNumber)
}