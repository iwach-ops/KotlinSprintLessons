package org.example.app.lesson_13

fun main() {
    val phoneDirect1 = PhoneDirect("Tom", 14331431134314,"Reddit")

    phoneDirect1.printPhoneDirect()
}

class PhoneDirect(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {

    fun printPhoneDirect() {
        println("- Name: ${name}\n- Phone number: ${phoneNumber}\n- Company: ${company ?: "<not specified>"}")
    }
}