package org.example.app.lesson_16

const val ENTER_PASSWORD = "Enter your password: "

fun main() {
    val user = UserA("uu")

    print(ENTER_PASSWORD)
    val inputPassword = readln()

    val isValid = user.validate(inputPassword)

    println(if (isValid) "Password is valid" else "Password is invalid")
}

class UserA(
    val login: String,
    private val password: String = "ABC",
) {
    fun validate(input: String) = input == password
}