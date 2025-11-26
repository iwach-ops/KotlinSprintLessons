package org.example.app.lesson_13

fun main() {
    val phoneDirectContact1 = PhoneDire("Tom", 14331431134314, null)
    val phoneDirectContact2 = PhoneDire("John", 57476487648648, null)
    val phoneDirectContact3 = PhoneDire("Fred", 8698699869869, "null")
    val phoneDirectContact4 = PhoneDire("Sven", 8698699869869, "IBM")
    val phoneDirectContact5 = PhoneDire("Rudolph", 8698699869869, "Yandex")

    val phoneDirectValues = mutableListOf<PhoneDire>()
    phoneDirectValues.add(phoneDirectContact1)
    phoneDirectValues.add(phoneDirectContact2)
    phoneDirectValues.add(phoneDirectContact3)
    phoneDirectValues.add(phoneDirectContact4)
    phoneDirectValues.add(phoneDirectContact5)

    val inputPhoneDirectValues = mutableListOf<PhoneDire>()
    for (i in 1..2) {

        print("Input your name:")
        val inputName = readln()

        print("Input your phone number:")

        val inputNumber = readln().toLongOrNull()
        if (inputNumber == null) {
            println("You didn't set a number .. contact will not be added.")
            continue
        }

        print("Input your phone company:")
        val inputCompany = readln()
        val inputSetCompany: String? = if (inputCompany.isBlank()) null else inputCompany

        inputPhoneDirectValues.add(PhoneDire(inputName, inputNumber, inputSetCompany))
    }

    inputPhoneDirectValues.forEach { it -> it.printPhoneDir() }

    phoneDirectValues.forEach { it ->
        it.printPhoneDir()
    }

    println(
        "\nexisting companies:\n${
            (phoneDirectValues + inputPhoneDirectValues).mapNotNull { it ->
                it.company
            }.joinToString()
        }"
    )
}

class PhoneDire(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {

    fun printPhoneDir() {
        println("- Name: ${name}\n- Phone number: ${phoneNumber}\n- Company: ${company ?: "<not specified>"}")
    }
}