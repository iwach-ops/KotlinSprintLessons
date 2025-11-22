package org.example.app.lesson_11

const val ENTER_BIO_REQUEST = "Fill out your profile bio"
const val ENTER_CURRENT_PASSWORD_REQUEST = "Enter your current password"
const val ENTER_NEW_PASSWORD_REQUEST = "Enter your new Password, please"
const val PASSWORD_CHANGED_RESPONSE = "Your password is changed successfully!"
const val CURRENT_PASSWORD_ERROR = "Your password is wrong and cannot be changed"

fun main() {
    val user = User2(123, "Frank", "Start12345", "frank@email.com")

    println(ENTER_BIO_REQUEST)
    val newBio = readln()

    user.addBio(newBio)

    println(ENTER_CURRENT_PASSWORD_REQUEST)
    val currentPassword = readln()

    println(ENTER_NEW_PASSWORD_REQUEST)
    val newPassword = readln()

    user.changePassword(currentPassword, newPassword)

    user.printUserInfo()
}

class User2(
    val userId: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String="",
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

    fun addBio(newBio: String) {
        bio = newBio
    }

    fun changePassword(currentPassword: String, newPassword: String) {
        if (currentPassword == password) {
            password = newPassword

            println(PASSWORD_CHANGED_RESPONSE)
        }
        else println(CURRENT_PASSWORD_ERROR)
    }
}