package org.example.app.lesson_17

fun main() {
    val shipment1 = Shipment(123, "Station_B")

    shipment1.displayShipmentInfo()

    shipment1.currentLocation = "Station_A"

    shipment1.displayShipmentInfo()
}

class Shipment(
    val packageNumber: Int,
    initialLocation: String,
) {
    var movementCounter = 0

    var currentLocation: String = initialLocation
        set(value) {
            if (field != value) {
                field = value
                movementCounter++
            }
        }

    fun displayShipmentInfo() {
        println(
            """
        package number: $packageNumber
        current location: $currentLocation
        movement counter: $movementCounter
    """.trimIndent()
        )
    }
}