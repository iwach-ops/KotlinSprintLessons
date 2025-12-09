package org.example.app.lesson_17

fun main() {
    val ship = Ship("First")
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

class Ship(_name: String) {
    var averageSpeed: Double = 100.0
    var homePort: String = "Island"
    var name = _name
        set(value) {
            println("Changing Name \"$field\"! Not Allowed!")
        }
}