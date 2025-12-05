package org.example.app.lesson_15

fun main() {
    val truck = Truck()
    val car = Car()

    truck.loadCargo(2)
    truck.loadPassengers(1)
    truck.drive()
    truck.unloadCargo(2)
    truck.unloadPassengers(1)
    car.loadPassengers(3)
    car.drive()
    car.unloadPassengers(3)
}

class Truck : CargoTransport, PassengerTransport, VehicleMovement {
    override val maxPassengers: Int = 1
    override val maxCargoTons: Int = 2
    override var currentPassengers: Int = 0
    override var currentCargoTons: Int = 0

    override fun drive() {
        println("truck is driving")
    }
}

class Car : PassengerTransport, VehicleMovement {
    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0

    override fun drive() {
        println("car is driving")
    }
}

interface VehicleMovement {
    fun drive()
}

interface PassengerTransport {
    val maxPassengers: Int
    var currentPassengers: Int

    fun loadPassengers(count: Int) {
        currentPassengers = (currentPassengers + count).coerceAtMost(maxPassengers)

        println("Passengers now: $currentPassengers")
    }

    fun unloadPassengers(count: Int) {
        currentPassengers = (currentPassengers - count).coerceAtLeast(0)

        println("Passengers now: $currentPassengers")
    }
}

interface CargoTransport {
    val maxCargoTons: Int
    var currentCargoTons: Int

    fun loadCargo(tons: Int) {
        currentCargoTons = (currentCargoTons + tons).coerceAtMost(maxCargoTons)

        println("Cargo now: $currentCargoTons tons")
    }

    fun unloadCargo(tons: Int) {
        currentCargoTons = (currentCargoTons - tons).coerceAtLeast(0)

        println("Cargo now: $currentCargoTons tons")
    }
}