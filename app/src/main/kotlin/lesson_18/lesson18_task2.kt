package org.example.app.lesson_18

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    val dices = listOf(dice4, dice6, dice8)

    dices.forEach { it -> it.rollDice() }
}

abstract class Dice {
    abstract val sides: Int

    fun rollDice() {
        println("Dice$sides: ${(1..sides).random()}")
    }
}

class Dice4 : Dice() {
    override val sides: Int = 4
}

class Dice6 : Dice() {
    override val sides: Int = 6
}

class Dice8 : Dice() {
    override val sides: Int = 8
}