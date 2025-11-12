package org.example.app.lesson_7

const val TIMER_REQUEST = "How many seconds?: "
const val TIMER_SEC_STEP = 1000
const val TIMER_OUT_RESPONSE = "Time is out"
const val FIRST_FINDEX = 1

fun main() {
    val convertSecStepInMSec = TIMER_SEC_STEP.toLong()
    print(TIMER_REQUEST)
    val inputSeconds = readln().toInt()

    for (sec in FIRST_FINDEX..inputSeconds) {
        Thread.sleep(convertSecStepInMSec)
        println("$sec sec - Remaining: ${inputSeconds - sec}")
    }

    println(TIMER_OUT_RESPONSE)
}