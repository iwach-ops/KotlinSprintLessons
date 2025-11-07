package org.example.app.lesson_5

import kotlin.random.Random

const val GRAND_CONGRATULATION = "Congratulations! You guessed all numbers!"
const val CONS_CONGRATULATION = "You guessed 1 number! You get a consolation prize!"
const val UNLUCKY_ANSWER = "Sorry.. You lost!"
const val IF_SAME_NUMBER_RESPONSE = "Unfortunately, you entered the same numbers. Game over!."
const val GUESS_NUMBER_1_REQUEST = "Input a number1 (from 0 to 42): "
const val GUESS_NUMBER_2_REQUEST = "Input a number2 (from 0 to 42): "
const val FROM_RANDOM = 0
const val TO_RANDOM = 42

fun main() {
    val guessRandomNumber1 = Random.nextInt(FROM_RANDOM, TO_RANDOM)
    val guessRandomNumber2 = Random.nextInt(FROM_RANDOM, TO_RANDOM)

    println("Test: $guessRandomNumber1 & $guessRandomNumber2")
    print(GUESS_NUMBER_1_REQUEST)
    val inputNumber1 = readln().toInt()
    print(GUESS_NUMBER_2_REQUEST)
    val inputNumber2 = readln().toInt()

    if (inputNumber1 == inputNumber2) {
        println(IF_SAME_NUMBER_RESPONSE)
        return
    }
    if ((inputNumber1 == guessRandomNumber1 || inputNumber1 == guessRandomNumber2) && (inputNumber2 == guessRandomNumber1 || inputNumber2 == guessRandomNumber2)) {
        println(GRAND_CONGRATULATION)
    } else if ((inputNumber1 == guessRandomNumber1 || inputNumber1 == guessRandomNumber2) || (inputNumber2 == guessRandomNumber1 || inputNumber2 == guessRandomNumber2)) {
        println(CONS_CONGRATULATION)
    } else {
        println(UNLUCKY_ANSWER)
    }
}