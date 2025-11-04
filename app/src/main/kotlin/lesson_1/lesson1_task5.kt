package org.example.app.lesson_1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60

fun main() {

    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / SECONDS_IN_HOUR
    val remainingSecondsAfterHours: Int = totalSeconds % SECONDS_IN_HOUR
    val minutes: Int = remainingSecondsAfterHours / SECONDS_IN_MINUTE
    val seconds: Int = remainingSecondsAfterHours % SECONDS_IN_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, seconds))
}