package org.example.app.lesson_6

const val WELCOME_TO_REGISTRATION_REQUEST =
    "Hello, user! Welcome to the Registration Site.\nPlease create your credentials."
const val ENTER_LOGIN_REQUEST = "Enter your login name: "
const val ENTER_PASSWORD_REQUEST = "Enter your password: "
const val REGISTRATION_DONE_RESPONSE = "You have registered successfully!"
const val LOG_IN_REQUEST = "Now, please log in to your account."
const val ERROR_WRONG_DATA_RESPONSE = "Incorrect login or password. Please try again."
const val AUTHORIZATION_DONE_RESPONSE = "Authorization successful!"

fun main() {
    println(WELCOME_TO_REGISTRATION_REQUEST)
    print(ENTER_LOGIN_REQUEST)
    val registerName = readln()
    print(ENTER_PASSWORD_REQUEST)
    val registerPassword = readln()

    println(REGISTRATION_DONE_RESPONSE)
    println(LOG_IN_REQUEST)
    print(ENTER_LOGIN_REQUEST)
    var loginName = readln()
    print(ENTER_PASSWORD_REQUEST)
    var loginPassword = readln()

    var loginStatus = (loginName == registerName) &&
            (loginPassword == registerPassword)
    while (!loginStatus) {
        println(ERROR_WRONG_DATA_RESPONSE)
        print("Your Login: ")
        loginName = readln()
        print("Your Password: ")
        loginPassword = readln()

        loginStatus = (loginName == registerName) &&
                (loginPassword == registerPassword)
    }
    println(AUTHORIZATION_DONE_RESPONSE)
}