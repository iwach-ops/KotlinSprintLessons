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

abstract class Transport

class Truck() : Transport(), CargoTransport, PassengerTransport, VehicleMovement {
    override val maxPassengers: Int = 1
    override val maxCargoTons: Int = 2
    override var currentPassengers: Int = 0
    override var currentCargoTons: Int = 0

    override fun drive() {
        println("truck is driving")
    }
}

class Car() : Transport(), PassengerTransport, VehicleMovement {
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
        val newTotal = currentPassengers + count
        if (newTotal > maxPassengers) {
            println("Cannot load $count Passengers. Max is $maxPassengers. Current: $currentPassengers")
        } else {
            currentPassengers = newTotal
            println("Loaded $count. Now: $currentPassengers")
        }
    }

    fun unloadPassengers(count: Int) {
        val newTotal = currentPassengers - count
        if (newTotal < 0) {
            println("Cannot unload $count. Now: $currentPassengers")
        } else {
            currentPassengers = newTotal
            println("Unload $count Now: $currentPassengers")
        }
    }
}

interface CargoTransport {
    val maxCargoTons: Int
    var currentCargoTons: Int

    fun loadCargo(tons: Int) {
        val newTotal = currentCargoTons + tons
        if (newTotal > maxCargoTons) {
            println("cannot load $tons tons. Max: $maxCargoTons. Current: $currentCargoTons")
        } else {
            currentCargoTons = newTotal
            println("Loaded $tons tons. Now: $currentCargoTons")
        }
    }

    fun unloadCargo(tons: Int) {
        val newTotal = currentCargoTons - tons
        if (newTotal < 0) {
            println("Cannot unload $tons tons. On board: $currentCargoTons")
        } else {
            currentCargoTons = newTotal
            println("Unloaded $tons tons. Now: $currentCargoTons")
        }
    }
}