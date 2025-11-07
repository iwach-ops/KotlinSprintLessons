package org.example.app.lesson_5

import kotlin.math.pow

const val MIN_NORM_BMI = 18.5
const val MAX_NORM_BMI = 25.0
const val MIN_OVER_BMI = 25.0
const val MAX_OVER_BMI = 30.0
const val OBESITY_BMI = 30.0
const val CM_IN_METER = 100
const val BMI_RESPONSE_UNDER = ": Underweight"
const val BMI_RESPONSE_NORM = ": Normal weight"
const val BMI_RESPONSE_OVER = ": Overweight"
const val BMI_RESPONSE_OBESITY = ": Obesity"
const val INPUT_USER_WEIGHT_REQUEST = "Please, input your weight: "
const val INPUT_USER_HEIGHT_REQUEST = "Please, input your height: "
const val WRONG_DATA_ERROR_RESPONSE = "Wrong data!"

fun main() {
    print(INPUT_USER_WEIGHT_REQUEST)
    val userWeight = readln().toDouble()
    print(INPUT_USER_HEIGHT_REQUEST)
    val userHeight = readln().toDouble()

    val userHeightInMeter = userHeight / CM_IN_METER
    val bmiResult = userWeight / userHeightInMeter.pow(2)

    val bmiCategory = when (bmiResult) {
        in 0.0..MIN_NORM_BMI -> "$BMI_RESPONSE_UNDER"
        in MIN_NORM_BMI..<MAX_NORM_BMI -> "$BMI_RESPONSE_NORM"
        in MIN_OVER_BMI..<MAX_OVER_BMI -> "$BMI_RESPONSE_OVER"
        in OBESITY_BMI..Double.MAX_VALUE -> "$BMI_RESPONSE_OBESITY"
        else -> WRONG_DATA_ERROR_RESPONSE
    }

    println(
        """
            "BMI < $MIN_NORM_BMI: $BMI_RESPONSE_UNDER"
            "$MIN_NORM_BMI <= BMI < $MAX_NORM_BMI: $BMI_RESPONSE_NORM"
            "$MIN_OVER_BMI <= BMI < $MAX_OVER_BMI: $BMI_RESPONSE_OVER"
            "BMI >= $OBESITY_BMI: $BMI_RESPONSE_OBESITY"
        """.trimIndent()
    )

    println("Your BMI: %.2f".format(bmiResult) + bmiCategory)
}