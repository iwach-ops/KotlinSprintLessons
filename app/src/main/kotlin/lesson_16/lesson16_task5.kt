package org.example.app.lesson_16

const val MAX_LIFE_VALUE = 5
const val MAX_ATTACK_POWER = 5

fun main() {
    val gamer = Gamer("Jack")
    gamer.displayStatus()

    for (i in 1..4) gamer.getDamage()

    gamer.displayStatus()

    gamer.getHealth()

    gamer.displayStatus()

    for (i in 1..4) gamer.getDamage()

    gamer.displayStatus()
}

class Gamer(
    val name: String,
    var health: Int = MAX_LIFE_VALUE,
    var attackPower: Int = MAX_ATTACK_POWER,
    var isLived: Boolean = true
) {

    fun getHealth() {
        if (isLived) health = (health + 1).coerceAtMost(MAX_LIFE_VALUE)
    }

    fun getDamage() {
        health = (health - 1).coerceAtLeast(0)

        if ((health <= 0) && (isLived)) die()
    }

    fun displayStatus() {
        println(
            """
            health: $health
            attack Power: $attackPower
        """.trimIndent()
        )
    }

    private fun die() {
        health = 0
        attackPower = 0
        isLived = false

        println("Gamer is died")
    }
}