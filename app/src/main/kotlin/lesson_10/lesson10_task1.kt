package org.example.app.lesson_10

const val ROLL_DICE_HUMAN_REQUEST = "Please roll, humanity...CLICK <ENTER>!"
const val ROLL_DICE_COMPUTER = "Now Machine is rolling dice..."
const val COMPUTER_PREPARATION_TIME = 2000L
const val MAX_DICE_VALUE = 6
const val HUMAN_RESULT_RESPONSE = "Humanity Result: "
const val MACHINE_RESULT_RESPONSE = "Machine Result: "
const val HUMANITY_WINS_RESPONSE = "Humanity wins"
const val MACHINE_WINS_RESPONSE = "The machine wins"
const val FRIENDSHIP_WINS_RESPONSE = "Friendship wins"

fun main() {
    println(ROLL_DICE_HUMAN_REQUEST)
    readln()

    val humanRes = rollDice()
    println("$HUMAN_RESULT_RESPONSE $humanRes")

    println(ROLL_DICE_COMPUTER)
    Thread.sleep(COMPUTER_PREPARATION_TIME)

    val compRes = rollDice()
    println("$MACHINE_RESULT_RESPONSE $compRes")

    when {
        humanRes > compRes -> println(HUMANITY_WINS_RESPONSE)
        humanRes < compRes -> println(MACHINE_WINS_RESPONSE)
        else -> println(FRIENDSHIP_WINS_RESPONSE)
    }
}

fun rollDice(): Int = (1..MAX_DICE_VALUE).random()