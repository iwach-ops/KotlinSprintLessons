package org.example.app.lesson_17

fun main() {
    val package1 = Package(123)

    package1.displayPackageInfo()

    package1.currentLocation = "Station_B"

    package1.displayPackageInfo()
}

class Package(
    val packageNumber: Int,
) {
    var movementCounter = 0

    var currentLocation: String = "Station_A"
        set(value) {
            if (field != value) {
                field = value
                movementCounter++
            }
        }

    fun displayPackageInfo() {
        println(
            """
        package number: $packageNumber
        current location: $currentLocation
        movement counter: $movementCounter
    """.trimIndent()
        )
    }
}