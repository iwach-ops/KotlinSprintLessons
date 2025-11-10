package org.example.app.lesson_6

const val TIMER_REQUEST = "How many seconds to count? "
const val MIN_COMPARED_VALUE = 0
const val TIMER_STOP_RESPONSE = "Time's up"

fun main() {
    print(TIMER_REQUEST)
    val counterN = readln().toInt()
    var compareValue = counterN

    while (compareValue > MIN_COMPARED_VALUE) {
        println("Remaining , ${compareValue--} seconds")
        Thread.sleep(1000)
    }
    
    println(TIMER_STOP_RESPONSE)
}