package org.example.app.lesson_1

fun main() {
    val firstSpaceFlightYear: Int = 1961
    var hour: String = "09"
    var minute: String = "07"

    println("first space flight year: $firstSpaceFlightYear")
    println("Start flight hour: $hour")
    println("Start flight minute:  $minute")

    hour = "10"
    minute = "55"

    print("Stop flight time: ")
    print("$hour:$minute")
}