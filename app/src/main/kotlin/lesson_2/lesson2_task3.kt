package org.example.app.lesson_2

fun main() {
    val departureHour: String = "9"
    val departureMinute: String = "39"
    val travelingTime: Int = 457
    val minuteInHour: Int = 60

    val allDepartureMinute = (departureHour.toInt() * minuteInHour) + departureMinute.toInt()

    val allArrivalMinute = allDepartureMinute + travelingTime
    val arrivalHour: Int = allArrivalMinute / minuteInHour
    val arrivalMinute: Int = allArrivalMinute % minuteInHour

    println(String.format("Arrival time: %02d:%02d", arrivalHour, arrivalMinute))
}