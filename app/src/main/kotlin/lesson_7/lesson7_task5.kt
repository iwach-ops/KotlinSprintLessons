package org.example.app.lesson_7

const val START_NUM_RANGE = '0'
const val STOP_NUM_RANGE = '9'
const val START_SYM_RANGE = 'a'
const val STOP_SYM_RANGE = 'z'
const val START_UP_SYMBOL_RANGE = 'A'
const val STOP_UP_SYMBOL_RANGE = 'Z'
const val MIN_PASSWORD_SIZE = 6
const val ENTER_PASS_REQUEST = "Enter password size: "
const val PASSWORD_RESPONSE = "Password: "

fun main() {
    val genericNumberCharRange = START_NUM_RANGE..STOP_NUM_RANGE
    val genericLoCharRange = START_SYM_RANGE..STOP_SYM_RANGE
    val genericUpCharRange = START_UP_SYMBOL_RANGE..STOP_UP_SYMBOL_RANGE
    val passwordCharList = mutableListOf<Char>()

    val allGeneric = genericNumberCharRange + genericLoCharRange + genericUpCharRange

    print(ENTER_PASS_REQUEST)
    var passwordSize = readln().toInt()

    while (passwordSize < MIN_PASSWORD_SIZE) {
        print("Min password size is $MIN_PASSWORD_SIZE. $ENTER_PASS_REQUEST")
        passwordSize = readln().toInt()
    }

    passwordCharList += genericNumberCharRange.random()
    passwordCharList += genericLoCharRange.random()
    passwordCharList += genericUpCharRange.random()

    for (i in 4..passwordSize) passwordCharList += allGeneric.random()
    passwordCharList.shuffle()
    val password = passwordCharList.joinToString("")

    println("$PASSWORD_RESPONSE $password")
}