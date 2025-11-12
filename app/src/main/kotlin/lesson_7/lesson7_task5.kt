package org.example.app.lesson_7

const val FIRST_GEN_SET_POSITION = 1
const val START_NUM_RANGE = 0
const val STOP_NUM_RANGE = 9
const val START_SYM_RANGE = 'a'
const val STOP_SYM_RANGE = 'z'
const val START_UP_SYMBOL_RANGE = 'A'
const val STOP_UP_SYMBOL_RANGE = 'Z'
const val MIN_PASSWORD_SIZE = 6
const val ENTER_PASS_REQUEST = "Enter password size: "
const val PASSWORD_RESPONSE = "Password: "

fun main() {
    val genericNumberRange = START_NUM_RANGE..STOP_NUM_RANGE
    val genericCharRange = START_SYM_RANGE..STOP_SYM_RANGE
    val genericCharSymbol = START_UP_SYMBOL_RANGE..STOP_UP_SYMBOL_RANGE
    val allGeneric = (genericNumberRange + genericCharRange + genericCharSymbol).toList()
    var password = ""

    print(ENTER_PASS_REQUEST)
    var passwordSize = readln().toInt()

    while (passwordSize < MIN_PASSWORD_SIZE) {
        print("Min password size is $MIN_PASSWORD_SIZE. $ENTER_PASS_REQUEST")
        passwordSize = readln().toInt()
    }

    for (i in FIRST_GEN_SET_POSITION..passwordSize) {
        val randomSymbol = allGeneric.random()
        if (password.length < passwordSize) {
            password += randomSymbol
        }
    }

    println(PASSWORD_RESPONSE + password)
}