package org.example.app.lesson_5

const val WELCOME_MESSAGE = "Добро пожаловать!"
const val DENIED_MESSAGE = "Доступ запрещен."
const val YOU_NOT_BOT_REQUEST = "Ты не бот?: 2+2 = "
const val CALC_RESULT = 4

fun main() {
    print(YOU_NOT_BOT_REQUEST)
    val result = readLine()?.toInt()
    if (result == CALC_RESULT) {
        println(WELCOME_MESSAGE)
    } else {
        println(DENIED_MESSAGE)
    }
}