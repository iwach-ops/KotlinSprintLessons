package org.example.app.lesson_14

fun main() {
    val liner = Liner()
    val cargo = CargoShip()
    val iceBreaker = Icebreaker()
}

open class Liner(
    open val speed: Int = 100,
    open val cargoCapacity: Int = 100,
    open val passengerCapacity: Int = 500,
)

class CargoShip(
    override val speed: Int = 60,
    override val cargoCapacity: Int = 800,
    override val passengerCapacity: Int = 0,
) : Liner(speed, cargoCapacity, passengerCapacity)

class Icebreaker(
    override val speed: Int = 40,
    override val cargoCapacity: Int = 50,
    override val passengerCapacity: Int = 0,
    val canBreakIce: Boolean = true,
) : Liner(speed, cargoCapacity, passengerCapacity)