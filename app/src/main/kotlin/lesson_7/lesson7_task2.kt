package org.example.app.lesson_7

const val START_NUMB_RANGE = 1000
const val STOP_NUMB_RANGE = 9999
const val ACTIVATION_CODE_RESPONSE = "Your Activation Code: "
const val Authorisation_OK_RESPONSE = "Authorisation successfully"
const val CODE_WRONG_ERROR = "Code is wrong"
const val CODE_REQUEST = "Enter your code: "

fun main() {
    val genericNumberRange = START_NUMB_RANGE..STOP_NUMB_RANGE
    var genericCode = genericNumberRange.random()
    println(ACTIVATION_CODE_RESPONSE + genericCode)

    for (attempt in 1..Int.MAX_VALUE) {
        print(CODE_REQUEST)
        val inputCode = readln().toInt()

        if (inputCode == genericCode) {
            println(Authorisation_OK_RESPONSE)
            return
        } else {
            println(CODE_WRONG_ERROR)
            genericCode = genericNumberRange.random()
            println(ACTIVATION_CODE_RESPONSE + genericCode)
        }
    }
}