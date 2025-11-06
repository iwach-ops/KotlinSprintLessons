package org.example.app.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18
const val BIRTH_YEAR_REQUEST_MESSAGE = "Пожалуйста, введите год вашего рождения: "
const val ALLOWED_RESPONSE_MESSAGE = "Показать экран со скрытым контентом"
const val NOT_ALLOWED_RESPONSE_MESSAGE = "Назад на главную страницу"

fun main() {
    val currentYear = LocalDate.now().year

    print(BIRTH_YEAR_REQUEST_MESSAGE)
    val userBirthYear = readln().toInt()
    val userAge = currentYear - userBirthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println(ALLOWED_RESPONSE_MESSAGE)
    } else {
        println(NOT_ALLOWED_RESPONSE_MESSAGE)
    }
}