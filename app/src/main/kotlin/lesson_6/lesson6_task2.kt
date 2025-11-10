package org.example.app.lesson_6
const val TIMER_REQUEST = "How many seconds to count? "
const val START_COMPARED_VALUE = 1

fun main() {
    print(TIMER_REQUEST)
    val counterN = readln().toInt()
    var compareValue = START_COMPARED_VALUE
    while (compareValue <= counterN) {
        Thread.sleep(1000)
        println("Counting , ${compareValue++} seconds")
    }
}