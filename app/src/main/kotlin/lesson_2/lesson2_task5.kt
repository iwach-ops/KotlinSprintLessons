package org.example.app.lesson_2

import kotlin.math.pow

fun main() {
    val finalAmount: Double
    val initialDeposit: Double = 70000.0
    val annualInterestRate: Double = 16.7
    val numberOfTimesInterest: Byte = 1
    val numberOfYears: Byte = 20

    finalAmount =
        (initialDeposit * (1 + ((annualInterestRate / 100) / numberOfTimesInterest)).pow(numberOfTimesInterest * numberOfYears))

    println("The final amount: %.3f".format(finalAmount))
}