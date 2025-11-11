package org.example.app.lesson_6

const val TIMER_REQUEST = "How many seconds to count? "
const val SEC_IN_MSEC = 1000

fun main() {
    print(TIMER_REQUEST)
    val counterN = readln().toInt()
    val convertSecInMSec: Long = (counterN*SEC_IN_MSEC).toLong()
    Thread.sleep(convertSecInMSec)
    println("Counted , $counterN seconds")
}