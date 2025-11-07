package org.example.app.lesson_5

import kotlin.random.Random

const val WELCOME_MESSAGE = "Добро пожаловать!"
const val DENIED_MESSAGE = "Доступ запрещен."
const val YOU_NOT_BOT_REQUEST = "Ты не бот?"
const val FROM_RANDOM = 1
const val TO_RANDOM = 9

fun main() {
    val randomNumber1 = Random.nextInt(FROM_RANDOM, TO_RANDOM)
    val randomNumber2 = Random.nextInt(FROM_RANDOM, TO_RANDOM)
    val calcRes = randomNumber1 + randomNumber2

    print("$YOU_NOT_BOT_REQUEST: $randomNumber1 + $randomNumber2 = ")
    val result = readln().toInt()

    if (result == calcRes) {
        println(WELCOME_MESSAGE)
    } else {
        println(DENIED_MESSAGE)
    }
}