package org.example.app.lesson_3

fun main() {
    val firstName: String = "Татьяна"
    val fatherName: String = "Сергеевна"
    val surnameBeforeMarriage: String = "Андреева"
    val surnameAfterMarriage: String = "Сидорова"
    val ageBeforeMarriage: Byte = 20
    val ageAfterMarriage: Byte = 22

    var age: Byte = ageBeforeMarriage
    var surname: String = surnameBeforeMarriage
    println("$surname $firstName $fatherName, $age")
    age = ageAfterMarriage
    surname = surnameAfterMarriage
    println("$surname $firstName $fatherName, $age")
}