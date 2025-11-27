package org.example.app.lesson_14

fun main() {
    val liner = Liner()
    val cargo = CargoShip()
    val iceBreaker = Icebreaker()
}

open class Liner(
    open val speed: Int = 100,
    open val capacity: Int = 500,
)

class CargoShip(
    override val speed: Int = 60,
    override val capacity: Int = 800,
) : Liner(speed, capacity)

class Icebreaker(
    override val speed: Int = 40,
    override val capacity: Int = 50,
    val canBreakIce: Boolean = true,
) : Liner(speed, capacity)