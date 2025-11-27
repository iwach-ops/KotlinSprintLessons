package org.example.app.lesson_14

fun main() {
    val liner = LinerB()
    val cargo = CargoShipB()
    val iceBreaker = IcebreakerB()

    liner.displayInfo()
    liner.extendHorizontalRampFromWaist()
    cargo.displayInfo()
    cargo.activateLoadingCrane()
    iceBreaker.displayInfo()
    iceBreaker.openGateFromStern()
}

open class LinerB(
    open val speed: Int = 100,
    open val capacity: Int = 500,
) {
    fun extendHorizontalRampFromWaist() {
        println("extend a horizontal ramp from the waist")
    }

    open fun displayInfo() {
        println(
            """
             speed: $speed
             capacity: $capacity
        """.trimIndent()
        )
    }
}

class CargoShipB(
    override val speed: Int = 60,
    override val capacity: Int = 800,
) : LinerB(speed, capacity) {
    fun activateLoadingCrane() {
        println("activate a loading crane")
    }
}

class IcebreakerB(
    override val speed: Int = 40,
    override val capacity: Int = 50,
    val canBreakIce: Boolean = true,
) : LinerB(speed, capacity) {
    fun openGateFromStern() {
        println("open a gate from the stern")
    }

    override fun displayInfo() {
        println(
            """
             speed: $speed
             capacity: $capacity
             can break ice: $canBreakIce
        """.trimIndent()
        )
    }
}