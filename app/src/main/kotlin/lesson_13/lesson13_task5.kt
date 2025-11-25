package org.example.app.lesson_13

fun main() {
    print("Enter phone number:")
    val inputNumber = readln()

    try {
        val phoneNumber = inputNumber.toLong()
        println("Your number is: $phoneNumber")

    } catch (e: Exception) {
        println("Error ${e::class.simpleName}")
    }
}

class PhoneD(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun printPhoneDir() {
        println("- Name: ${name}\n- Phone number: ${phoneNumber}\n- Company: ${company ?: "<not specified>"}")
    }
}