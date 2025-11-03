package org.example.app.lesson_1

fun main() {
    val secondsInHour = 3600
    val secondsInMinute = 60
    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / secondsInHour
    val remainingSecondsAfterHours: Int = totalSeconds % secondsInHour
    val minutes: Int = remainingSecondsAfterHours / secondsInMinute
    val seconds: Int = remainingSecondsAfterHours % secondsInMinute

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}