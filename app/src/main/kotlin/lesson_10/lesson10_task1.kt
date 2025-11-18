package org.example.app.lesson_10

const val MOVE_DICE_HUMAN_REQUEST = "Please move, humanity...CLICK <ENTER>!"
const val MOVE_DICE_COMPUTER = "Now Machine is moving dice..."
const val COMPUTER_PREPARATION_TIME = 2000L
const val MAX_DICE_VALUE = 6
const val HUMAN_RESULT_RESPONSE = "Humanity Result: "
const val MACHINE_RESULT_RESPONSE = "Machine Result: "
const val HUMANITY_WINS_RESPONSE = "Humanity wins"
const val MACHINE_WINS_RESPONSE = "The machine wins"
const val FRIENDSHIP_WINS_RESPONSE = "Friendship wins"

fun main() {
    println(MOVE_DICE_HUMAN_REQUEST)
    readln()

    val humanRes = moveDice(MAX_DICE_VALUE)
    println("$HUMAN_RESULT_RESPONSE $humanRes")

    println(MOVE_DICE_COMPUTER)
    Thread.sleep(COMPUTER_PREPARATION_TIME)

    val compRes = moveDice(MAX_DICE_VALUE)
    println("$MACHINE_RESULT_RESPONSE $compRes")

    if (humanRes > compRes) println(HUMANITY_WINS_RESPONSE)
    else if (humanRes < compRes) println(MACHINE_WINS_RESPONSE)
    else println(FRIENDSHIP_WINS_RESPONSE)
}

fun moveDice(maxDiceValue: Int): Int = (1..maxDiceValue).random()
