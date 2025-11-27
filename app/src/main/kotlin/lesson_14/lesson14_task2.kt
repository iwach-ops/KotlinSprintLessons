package org.example.app.lesson_14

fun main() {
    val liner = LinerB()
    val cargo = CargoShipB()
    val iceBreaker = IcebreakerB()

    liner.displayInfo()
    liner.load()
    cargo.displayInfo()
    cargo.load()
    iceBreaker.displayInfo()
    iceBreaker.load()
}

open class LinerB(
    open val speed: Int = 100,
    open val cargoCapacity: Int = 100,
    open val passengerCapacity: Int = 500,
) {
    open fun load() {
        println("to extend a horizontal ramp from the waist")
    }

    open fun displayInfo() {
        println(
            """
             speed: $speed
             cargoCapacity: $cargoCapacity
             passengerCapacity: $passengerCapacity
        """.trimIndent()
        )
    }
}

class CargoShipB(
    override val speed: Int = 60,
    override val cargoCapacity: Int = 800,
    override val passengerCapacity: Int = 0,
) : LinerB(speed, cargoCapacity, passengerCapacity) {
    override fun load() {
        println("to activate a loading crane")
    }

    override fun displayInfo() {
        println(
            """
             speed: $speed
             cargoCapacity: $cargoCapacity
             passengerCapacity: $passengerCapacity
        """.trimIndent()
        )
    }
}


class IcebreakerB(
    override val speed: Int = 40,
    override val cargoCapacity: Int = 50,
    override val passengerCapacity: Int = 0,
    val canBreakIce: Boolean = true,
) : LinerB(speed, cargoCapacity, passengerCapacity) {
    override fun load() {
        println("to open a gate from the stern")
    }

    override fun displayInfo() {
        println(
            """
             speed: $speed
             cargoCapacity: $cargoCapacity
             passengerCapacity: $passengerCapacity
             canBreakIce: $canBreakIce
        """.trimIndent()
        )
    }
}