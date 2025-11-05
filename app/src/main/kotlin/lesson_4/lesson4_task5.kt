package org.example.app.lesson_4

fun main() {
    val noDamage = true
    val crewSize = 69
    val cratesOfProvisions = 56
    val favorableWeather = true

    val shipCanSetSail =
        (noDamage && crewSize >= 55 && crewSize <= 70 && cratesOfProvisions > 50) || (!noDamage && crewSize == 70 && cratesOfProvisions >= 50 && favorableWeather)

    println("Ship can set sail - Status: $shipCanSetSail")
}