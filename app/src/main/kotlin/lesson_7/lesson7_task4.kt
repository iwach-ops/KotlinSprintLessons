package org.example.app.lesson_7

const val TIMER_REQUEST = "How many seconds?: "
const val TIMER_SEC_STEP = 1000L
const val TIMER_OUT_RESPONSE = "Time is out"

fun main() {
    print(TIMER_REQUEST)
    val inputSeconds = readln().toInt()

    for (sec in inputSeconds downTo 1) {
        println("Remaining: $sec")
        Thread.sleep(TIMER_SEC_STEP)
    }

    println(TIMER_OUT_RESPONSE)
}