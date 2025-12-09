package org.example.app.lesson_17

fun main() {
    val user = UserDescription("Gustav", "Start12345")

    user.displayUserInfo()

    user.login = "Tom"

    user.password = "ABC"

    user.displayUserInfo()
}

class UserDescription(
    _login: String,
    _password: String,
) {
    var login = _login
        set(value) {
            field = value
            println("Login is changed successfully")
        }

    var password = _password
        get() = "*".repeat(field.length)
        set(value) {
            println("You cannot change your password.")
        }

    fun displayUserInfo() {
        println(
            """
            login: $login
            password: $password
        """.trimIndent()
        )
    }
}