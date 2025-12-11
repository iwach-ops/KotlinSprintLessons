package org.example.app.lesson_19

fun main() {
    val tank = Tank()
    tank.firing()

    for (cartridge in Cartridge.entries) {
        tank.setNewCartridge(cartridge)
        tank.firing()
    }
}

enum class Cartridge(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank() {
    var currentCartridge: Cartridge? = null

    fun setNewCartridge(cartridge: Cartridge) {
        currentCartridge = cartridge
        println("arming the new cartridge $cartridge")
    }

    fun firing() {
        if (currentCartridge == null) println("no cartridges")
        else println("firing with damage: ${currentCartridge!!.damage}")
    }
}