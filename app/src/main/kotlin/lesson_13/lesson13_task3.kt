package org.example.app.lesson_13

fun main() {
    val phoneDirectContact1 = PhoneDir("Tom", 14331431134314, null)
    val phoneDirectContact2 = PhoneDir("John", 57476487648648, null)
    val phoneDirectContact3 = PhoneDir("Fred", 8698699869869, "null")
    val phoneDirectContact4 = PhoneDir("Sven", 8698699869869, "IBM")
    val phoneDirectContact5 = PhoneDir("Rudolph", 8698699869869, "Yandex")

    val phoneDirectValues = mutableListOf<PhoneDir>()
    phoneDirectValues.add(phoneDirectContact1)
    phoneDirectValues.add(phoneDirectContact2)
    phoneDirectValues.add(phoneDirectContact3)
    phoneDirectValues.add(phoneDirectContact4)
    phoneDirectValues.add(phoneDirectContact5)

    phoneDirectValues.forEach { it ->
        it.printPhoneDir()
    }

    println(
        "\nexisting companies:\n${
            phoneDirectValues.mapNotNull { it ->
                it.company
            }.joinToString()
        }"
    )
}

class PhoneDir(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun printPhoneDir() {
        println("- Name: ${name}\n- Phone number: ${phoneNumber}\n- Company: ${company ?: "<not specified>"}")
    }
}