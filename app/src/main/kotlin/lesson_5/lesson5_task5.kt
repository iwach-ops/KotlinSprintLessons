package org.example.app.lesson_5

const val GRAND_CONGRATULATION = "Congratulations! You guessed all 3 numbers! Jackpot!"
const val BIG_GIFT_CONGRATULATION = "You guessed 2 numbers! You get a big prize."
const val CONS_CONGRATULATION = "You guessed 1 number! You get a consolation prize!"
const val UNLUCKY_ANSWER = "Sorry.. You lost!"
const val FIRST_GUESS_NUMBER_FROM_RANGE = 0
const val LAST_GUESS_NUMBER_FROM_RANGE = 42
const val NUMBER_OF_GUESS_NUMBERS = 3
const val GUESS_NUMBER_1_REQUEST = "Input a number1 (from 0 to 42): "
const val GUESS_NUMBER_2_REQUEST = "Input a number2 (from 0 to 42): "
const val GUESS_NUMBER_3_REQUEST = "Input a number3 (from 0 to 42): "
const val SAME_NUMBERS_ERROR = "Unfortunately, you entered the same numbers. Game over!"
const val RANDOM_SAME_NUMBERS_ERROR = "Some of our random numbers matched. Restart our game please!"
const val GUESS_NUMBERS_OUTPUT_RESPONSE = "They were guess numbers"
const val NUMBER_OF_GUESS_OF_NUMBERS_3 = 3
const val NUMBER_OF_GUESS_OF_NUMBERS_2 = 2
const val NUMBER_OF_GUESS_OF_NUMBERS_1 = 1

fun main() {
    val inputNumberList = mutableListOf<Int>()
    val guessRandomNumbersList =
        List(NUMBER_OF_GUESS_NUMBERS) { (FIRST_GUESS_NUMBER_FROM_RANGE..LAST_GUESS_NUMBER_FROM_RANGE).random() }

    if (guessRandomNumbersList.distinct().size != NUMBER_OF_GUESS_NUMBERS) {
        println(RANDOM_SAME_NUMBERS_ERROR)
        return
    }

    val guessNumbersRequestList = listOf<String>(
        GUESS_NUMBER_1_REQUEST, GUESS_NUMBER_2_REQUEST, GUESS_NUMBER_3_REQUEST
    )

    for (guessNumberRequest in guessNumbersRequestList) {
        print(guessNumberRequest)
        inputNumberList.add(readln().toInt())
    }

    if (inputNumberList.distinct().size != NUMBER_OF_GUESS_NUMBERS) {
        println(SAME_NUMBERS_ERROR)
        return
    }

    val comparedNumbersList = inputNumberList.intersect(guessRandomNumbersList)

    val resultMessage = when (comparedNumbersList.size) {
        NUMBER_OF_GUESS_OF_NUMBERS_3 -> GRAND_CONGRATULATION
        NUMBER_OF_GUESS_OF_NUMBERS_2 -> BIG_GIFT_CONGRATULATION
        NUMBER_OF_GUESS_OF_NUMBERS_1 -> CONS_CONGRATULATION
        else -> UNLUCKY_ANSWER
    }

    println(
        """
            $resultMessage
            $GUESS_NUMBERS_OUTPUT_RESPONSE $guessRandomNumbersList
        """.trimIndent()
    )
}