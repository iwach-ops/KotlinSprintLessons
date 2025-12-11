package org.example.app.lesson_19

fun main() {
    val ship = SpaceShip()
    ship.takeoff()
    ship.shootBack()
    ship.land()
}

class SpaceShip(){
    fun takeoff(){
        println("Space ship is started")
    }

    fun land(){
        TODO("it is not implemented")
    }

    fun shootBack(){
        // TODO additional logic information is needed here.
    }
}