package org.example.app.lesson_4

fun main() {
    var accessStatusToday: Boolean = false
    var accessStatusTomorrow: Boolean = false
    var bookedTablesToday: Byte = 13
    var bookedTablestomorrow: Byte = 9

    accessStatusToday = bookedTablesToday < NUMBER_OF_TABLES
    accessStatusTomorrow = bookedTablestomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $accessStatusToday\nДоступность столиков на завтра: $accessStatusTomorrow")
}

const val NUMBER_OF_TABLES: Byte = 13