package org.example.app.lesson_6

const val TIMER_REQUEST = "How many seconds to count? "
const val MIN_COMPARED_VALUE = 0
const val TIMER_STOP_RESPONSE = "Time's up"
const val SEC_IN_MSEC = 1000

fun main() {
    print(TIMER_REQUEST)
    val counterN = readln().toInt()
    var compareValue = counterN

    val convertSecInMSec: Long = (SEC_IN_MSEC).toLong()

    while (compareValue > MIN_COMPARED_VALUE) {
        println("Remaining , ${compareValue--} seconds")
        Thread.sleep(convertSecInMSec)
    }

    println(TIMER_STOP_RESPONSE)
}