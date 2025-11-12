package org.example.app.lesson_6

const val WELCOME_TO_REGISTRATION_REQUEST6 =
    "Hello, user! Welcome to the Registration Site.\nPlease create your credentials."
const val ENTER_LOGIN_REQUEST6 = "Enter your login name: "
const val ENTER_PASSWORD_REQUEST6 = "Enter your password: "
const val REGISTRATION_DONE_RESPONSE6 = "You have registered successfully!"
const val LOG_IN_REQUEST6 = "Now, please log in to your account."
const val ERROR_WRONG_DATA_RESPONSE6 = "Incorrect login or password. Please try again."
const val AUTHORIZATION_DONE_RESPONSE6 = "Authorization successful!"
const val YOU_BOT_RESPONSE = "Access denied"
const val CALCULATION_REQUEST = "Calculate please"

fun main() {
    println(WELCOME_TO_REGISTRATION_REQUEST6)
    print(ENTER_LOGIN_REQUEST6)
    val registerName = readln()
    print(ENTER_PASSWORD_REQUEST6)
    val registerPassword = readln()

    println(REGISTRATION_DONE_RESPONSE6)
    println(LOG_IN_REQUEST6)
    print(ENTER_LOGIN_REQUEST6)
    var loginName = readln()
    print(ENTER_PASSWORD_REQUEST6)
    var loginPassword = readln()

    var loginStatus = (loginName == registerName) &&
            (loginPassword == registerPassword)
    while (!loginStatus) {
        println(ERROR_WRONG_DATA_RESPONSE6)
        print("Your Login: ")
        loginName = readln()
        print("Your Password: ")
        loginPassword = readln()

        loginStatus = (loginName == registerName) &&
                (loginPassword == registerPassword)
    }
    val randomNumber1 = (1..9).random()
    val randomNumber2 = (1..9).random()
    val sumOfNumbers = randomNumber1 + randomNumber2
    print("$CALCULATION_REQUEST: $randomNumber1 + $randomNumber2 = ")
    val guessSum = readln().toInt()
    if (guessSum == sumOfNumbers) {
        println(AUTHORIZATION_DONE_RESPONSE6)
    } else {
        println(YOU_BOT_RESPONSE)
    }
}