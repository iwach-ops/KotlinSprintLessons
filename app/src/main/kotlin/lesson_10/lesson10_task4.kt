package org.example.app.lesson_10

const val ROLL_DICE_HUMAN = "Please roll, humanity...CLICK <ENTER>!"
const val ROLL_DICE_MACHINE = "Now Machine is rolling dice..."
const val CONTINUE_GAME = "Would you like to roll the dice again? Enter y/n: "
const val COMPUTER_TIME = 2000L
const val MAX_DICE_VAL = 6
const val HUMAN_RESULT = "Humanity Result: "
const val MACHINE_RESULT = "Machine Result: "
const val HUMANITY_WINS = "Humanity wins"
const val MACHINE_WINS = "The machine wins"
const val FRIENDSHIP_WINS = "Friendship wins"
const val HUMANITY_RESULT = "Humanity won:"

fun main() {
    var humanWinCounter = 0

    do {
        println(ROLL_DICE_HUMAN)
        readln()

        val humanRes = throwDice()
        println("$HUMAN_RESULT $humanRes")
        println(ROLL_DICE_MACHINE)
        Thread.sleep(COMPUTER_TIME)

        val compRes = throwDice()
        println("$MACHINE_RESULT $compRes")

        when {
            humanRes > compRes -> {
                println(HUMANITY_WINS)
                humanWinCounter++
            }

            humanRes < compRes -> println(MACHINE_WINS)
            else -> println(FRIENDSHIP_WINS)
        }
        print(CONTINUE_GAME)

    } while (continueGame(readln().firstOrNull() ?: 'n'))

    println("$HUMANITY_RESULT $humanWinCounter times")
}

fun throwDice(): Int = (1..MAX_DICE_VAL).random()

fun continueGame(answer: Char): Boolean = answer.lowercaseChar() == 'y'