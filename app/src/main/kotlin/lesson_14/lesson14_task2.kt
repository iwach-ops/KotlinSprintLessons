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
    val speed: Int = 100,
    val cargoCapacity: Int = 100,
    val passengerCapacity: Int = 500,
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

class CargoShipB : LinerB(60, 800, 0) {
    override fun load() {
        println("to activate a loading crane")
    }
}

class IcebreakerB(
    val canBreakIce: Boolean = true,
) : LinerB(40, 50, 0) {
    override fun load() {
        println("to open a gate from the stern")
    }

    override fun displayInfo() {
        super.displayInfo()
        println("can break ice: $canBreakIce")
    }
}