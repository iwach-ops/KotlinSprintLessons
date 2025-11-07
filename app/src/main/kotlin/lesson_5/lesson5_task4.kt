package org.example.app.lesson_5

const val USER_ACCESS_NAME = "Zaphod"
const val USER_ACCESS_PASSWORD = "PanGalactic"
const val ROBOT_REQUEST_MESSAGE = "Attention, passenger.\n" +
        "My duty, as usual, is an unenviable one ? to welcome you aboard the Heart of Gold.\"Heart of Gold\".\n" +
        "[sighs...]\n" +
        "Well then, please enter your username so we can begin the login process.\n" +
        "I am always ready to serve, though it brings me no joy? but you probably don?t care about that.\n" +
        "[sighs even deeper...]\n" +
        "Yes, go on, please, enter your credentials\n"
const val ROBOT_WELCOME_MESSAGE = "[sighs...] Your credentials have been verified and?oh, miracle?they are correct\n" +
        "User \"Zaphod\" you are granted permission to board \"The Heart of Gold\".\n" +
        "Not that I care, of course... Well then, go on, come in...\n" +
        "if you really must, after all... [melancholic sigh...]\n" +
        "I hope you enjoy your stay here more than I do.\n"
const val SYSTEM_USER_REG_MESSAGE = "You are registered, but we must check your password?"
const val SYSTEM_USER_NOT_REG_MESSAGE = "You are not registered."
const val SYSTEM_USER_PASSWORD_WRONG_MESSAGE = "Password is wrong"
const val USER_REQUEST_MESSAGE = "Your name: "
const val PASSWORD_REQUEST_MESSAGE = "Your Password: "

fun main() {
    println(ROBOT_REQUEST_MESSAGE)
    print(USER_REQUEST_MESSAGE)
    val userName = readln()

    if (userName == USER_ACCESS_NAME) {
        println(SYSTEM_USER_REG_MESSAGE)
    } else {
        println(SYSTEM_USER_NOT_REG_MESSAGE)
        return
    }

    print(PASSWORD_REQUEST_MESSAGE)
    val userPassword = readln()

    if (userPassword == USER_ACCESS_PASSWORD) {
        println(ROBOT_WELCOME_MESSAGE)
    } else {
        println(SYSTEM_USER_PASSWORD_WRONG_MESSAGE)
    }
}