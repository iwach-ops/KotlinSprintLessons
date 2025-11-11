package org.example.app.lesson_7

const val FIRST_GENER_SET_POSITION = 1
const val LAST_GENER_SET_POSITION = 3
const val START_NUMBERS_RANGE = 0
const val STOP_NUMBERS_RANGE = 9
const val START_SYMBOL_RANGE = 'a'
const val STOP_SYMBOL_RANGE = 'z'

fun main() {
    val genericNumberRange = START_NUMBERS_RANGE..STOP_NUMBERS_RANGE
    val genericCharRange = START_SYMBOL_RANGE..STOP_SYMBOL_RANGE
    var password = ""

    for (i in FIRST_GENER_SET_POSITION..LAST_GENER_SET_POSITION) {
        val number = genericNumberRange.random()
        val letter = genericCharRange.random()
        password += "$number$letter"
    }

    println("password: $password")
}