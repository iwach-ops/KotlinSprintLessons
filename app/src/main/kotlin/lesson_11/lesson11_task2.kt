package org.example.app.lesson_11

const val ENTER_BIO_REQUEST = "Fill out your profile bio"
const val ENTER_CURRENT_PASSWORD_REQUEST = "Enter your current password"
const val ENTER_NEW_PASSWORD_REQUEST = "Enter your new Password, please"
const val PASSWORD_CHANGED_RESPONSE = "Your password is changed successfully!"

fun main() {
    val user = User2(123, "Frank", "Start12345", "frank@email.com")
    user.setBio()
    user.changePassword()
    user.printUserInfo()
}

class User2(
    val userId: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {

    fun printUserInfo() {
        println(
            """
            User Info:
            Identifier: $userId
            Login: $login
            Password: $password
            Email: $email
            Bio: $bio
                                
            """.trimIndent()
        )
    }

    fun setBio() {
        println(ENTER_BIO_REQUEST)
        bio = readln()
    }

    fun changePassword() {
        println(ENTER_CURRENT_PASSWORD_REQUEST)
        val currentPassword = readln()
        if (currentPassword == password) {
            println(ENTER_NEW_PASSWORD_REQUEST)
            password = readln()
            println(PASSWORD_CHANGED_RESPONSE)
        }
    }
}