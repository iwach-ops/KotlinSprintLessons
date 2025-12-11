package org.example.app.lesson_19

fun main() {
    println("enter the name and gender ${Gender.entries.joinToString()}")

    val persons = mutableListOf<Person>()

    for (i in 1..5) {
        print("Name:")
        val name = readln()

        print("Gender:")
        val gender: Gender = Gender.valueOf(readln())

        persons.add(Person(name, gender))
    }

    persons.forEach { it ->
        println(
            """
       name:    ${it.name}
       gender: ${it.gender}
     """.trimIndent()
        )
    }
}

class Person(val name: String, val gender: Gender)

enum class Gender {
    m,
    w;
}