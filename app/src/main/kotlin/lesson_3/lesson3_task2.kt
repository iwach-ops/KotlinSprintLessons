package org.example.app.lesson_3

fun main() {
    val firstName: String = "Татьяна"
    val fatherName: String = "Сергеевна"
    var surname: String = "Андреева"
    var age: Byte = 20

    println("$surname $firstName $fatherName, $age")
    age = 22
    surname = "Сидорова"
    println("$surname $firstName $fatherName, $age")
}