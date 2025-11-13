package org.example.app.lesson_7

const val START_NUMB_RANGE = 1000
const val STOP_NUMB_RANGE = 9999
const val ACTIVATION_CODE_RESPONSE = "Your Activation Code: "
const val AUTHORISATION_OK_RESPONSE = "Authorisation successfully"
const val CODE_WRONG_ERROR = "Code is wrong"
const val CODE_REQUEST = "Enter your code: "

fun main() {
    val genericNumberRange = START_NUMB_RANGE..STOP_NUMB_RANGE
    var genericCode: Int
    var inputCode: Int
    do {
        genericCode = genericNumberRange.random()
        println(ACTIVATION_CODE_RESPONSE + genericCode)
        print(CODE_REQUEST)
        inputCode = readln().toInt()

        if (inputCode != genericCode) {
            println(CODE_WRONG_ERROR)
        }
    } while (inputCode != genericCode)

    println(AUTHORISATION_OK_RESPONSE)
}