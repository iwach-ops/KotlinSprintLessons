package org.example.app.lesson_14

fun main() {
    val liner = Liner()
    val cargo = CargoShip()
    val iceBreaker = Icebreaker()
}

open class Liner(
    val speed: Int = 100,
    val cargoCapacity: Int = 100,
    val passengerCapacity: Int = 500,
)

class CargoShip : Liner(60, 800, 0)

class Icebreaker(
    val canBreakIce: Boolean = true,
) : Liner(40, 50, 0)