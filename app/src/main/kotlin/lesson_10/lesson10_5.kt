package org.example.app.lesson_10

const val CREDENTIALS_LOGIN = "user"
const val CREDENTIALS_PASSWORD = "Start12345"
const val AUTHORISATION_ERROR = "Authorisation failed"
const val TOKEN_LENGTH = 32
const val ENTER_LOGIN = "Enter your login"
const val ENTER_PASSWORD = "Enter your password"

fun main() {
    println(ENTER_LOGIN)
    val login = readln()

    println(ENTER_PASSWORD)
    val password = readln()

    val token = verifyUser(login, password)

    if (token != null) println("Shopping Cart: ${getShoppingCart(token)}")
    else println(AUTHORISATION_ERROR)
}

fun verifyUser(login: String, password: String): String? {
    if (login == CREDENTIALS_LOGIN && password == CREDENTIALS_PASSWORD) return generateToken()
    else return null
}

fun getShoppingCart(token: String): String {
    val shoppingCart = listOf("t-shirt", "Jeans", "toys", "tools")

    return shoppingCart.joinToString(", ")
}

fun generateToken(): String {
    var token = ""
    val tokenChars = (('0'..'9') + ('a'..'z'))

    for (i in 1..TOKEN_LENGTH) token += tokenChars.random()

    return token
}