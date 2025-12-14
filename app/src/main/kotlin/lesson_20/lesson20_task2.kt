package org.example.app.lesson_20

fun main() {
    val player = Player("Ralf", 7, 10)

    println("current health: ${player.currentHealth}")

    val healingPotion: (Player) -> Unit = { player.currentHealth = player.maximumHealth }

    healingPotion(player)

    println("current health after update: ${player.currentHealth}")
}

class Player(
    val name: String,
    var currentHealth: Int,
    val maximumHealth: Int,
)