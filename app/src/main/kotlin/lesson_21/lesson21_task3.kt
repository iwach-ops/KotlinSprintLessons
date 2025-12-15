package org.example.app.lesson_21

fun main() {
    val player = Player2("Ralf", 7, 10)

    println("current health: ${player.currentHealth}")
    println("is healthy: ${player.isHealthy()}")

    val healingPotion: (Player2) -> Unit = { player.currentHealth = player.maximumHealth }

    healingPotion(player)

    println("current health after update: ${player.currentHealth}")
    println("is healthy: ${player.isHealthy()}")
}

class Player2(
    val name: String,
    var currentHealth: Int,
    val maximumHealth: Int,
)

fun Player2.isHealthy(): Boolean = currentHealth == maximumHealth