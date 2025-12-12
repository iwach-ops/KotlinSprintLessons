package org.example.app.lesson_20

fun main() {

    val player = Player2("Tom", true)

    val openDoor: (Player2) -> String = { p ->
        if (p.haveKey == true) "Player opened the door"
        else "Door is locked"
    }

    println(openDoor(player))
}

class Player2(val name: String, val haveKey: Boolean)