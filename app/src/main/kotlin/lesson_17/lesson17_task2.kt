package org.example.app.lesson_17

const val SHIP_NAME = "First"

fun main() {
    val ship = Ship()
    ship.name = SHIP_NAME
    ship.homePort = "Porto"
    ship.averageSpeed = 98.0

    println(
        """
    name: ${ship.name}
    homePort: ${ship.homePort}
    averageSpeed: ${ship.averageSpeed}
    """.trimIndent()
    )

    ship.name = "ABC"

    println("name: ${ship.name}")
}

class Ship {
    var averageSpeed: Double = 100.0
    var homePort: String = "Island"
    var name = SHIP_NAME
        set(value) {
            if (value != field) {
                println("Changing Name \"$SHIP_NAME\"! Not Allowed!")
            }
        }
}