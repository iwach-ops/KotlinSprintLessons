package org.example.app.lesson_10

const val ENTER_PASS_LENGTH_REQUEST = "Enter a length of password: "

fun main() {
    print(ENTER_PASS_LENGTH_REQUEST)
    val passwordLength = readln().toInt()

    println("Password: ${generatePassword(passwordLength)}")
}

fun generatePassword(passwordLength: Int): String {
    val digits = ('0'..'9')
    val specialSymbols = (' '..'/')
    val password = mutableListOf<Char>()

    for (position in 1..passwordLength) {
        if (position % 2 == 0) password += specialSymbols.random()
        else password += digits.random()
    }

    return password.joinToString("")
}