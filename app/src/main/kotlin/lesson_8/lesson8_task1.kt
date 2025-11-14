package org.example.app.lesson_8

const val NUMBER_OF_VIEWS_PER_WEEK_REQUEST = "Views per week: "

fun main() {
    var numberOfViewsPerWeekCounter = 0
    val numberOfViewsByDay = intArrayOf(99, 37, 44, 67, 77, 44, 36)

    for (content in numberOfViewsByDay) numberOfViewsPerWeekCounter += content

    println("$NUMBER_OF_VIEWS_PER_WEEK_REQUEST $numberOfViewsPerWeekCounter")
}