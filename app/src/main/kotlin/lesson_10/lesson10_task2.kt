package org.example.app.lesson_10

const val MIN_LOGIN_PASSWORD_SIZE = 4
const val WRONG_LONG_PASSWORD_LOGIN_RESPONSE = "The login or password is not long enough"
const val ENTER_YOUR_LOGIN_REQUEST = "Enter your login: "
const val ENTER_YOUR_PASSWORD_REQUEST = "Enter your password: "

fun main() {
    print(ENTER_YOUR_LOGIN_REQUEST)
    val login = readln()
    print(ENTER_YOUR_PASSWORD_REQUEST)
    val password = readln()

    if (!validateLoginPassword(login, MIN_LOGIN_PASSWORD_SIZE) ||
        !validateLoginPassword(password, MIN_LOGIN_PASSWORD_SIZE)
    ) {
        println(WRONG_LONG_PASSWORD_LOGIN_RESPONSE)
    }
}

fun validateLoginPassword(passOrLogin: String, minSize: Int): Boolean = passOrLogin.length >= minSize