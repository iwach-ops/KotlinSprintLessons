package org.example.app.lesson_4

const val MAX_CREW_SIZE = 70
const val MIN_CREW_SIZE = 55
const val CRATES_OF_PROVISIONS = 50
val NO_DAMAGE_COND = true
val FAVORABLE_WEATHER_COND = true

fun main() {
    val noDamage = true
    val crewSize = 69
    val cratesOfProvisions = 56
    val favorableWeather = true

    val shipCanSetSail =
        (noDamage==NO_DAMAGE_COND && crewSize >= MIN_CREW_SIZE && crewSize <= MAX_CREW_SIZE && cratesOfProvisions > CRATES_OF_PROVISIONS) || (noDamage!=NO_DAMAGE_COND && crewSize == MAX_CREW_SIZE && cratesOfProvisions >= CRATES_OF_PROVISIONS && favorableWeather==FAVORABLE_WEATHER_COND)

    println("Ship can set sail - Status: $shipCanSetSail")
}