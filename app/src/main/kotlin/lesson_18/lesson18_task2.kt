package org.example.app.lesson_18

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    val dices = listOf(dice4, dice6, dice8)

    dices.forEach { it -> it.rollDice() }
}

abstract class Dice(
    val sides: Int
) {
    abstract fun rollDice()
}

class Dice4 : Dice(4) {
    override fun rollDice() {
        println("Dice$sides: ${(1..sides).random()}")
    }
}

class Dice6 : Dice(6) {
    override fun rollDice() {
        println("Dice$sides: ${(1..sides).random()}")
    }
}

class Dice8 : Dice(8) {
    override fun rollDice() {
        println("Dice$sides: ${(1..sides).random()}")
    }
}