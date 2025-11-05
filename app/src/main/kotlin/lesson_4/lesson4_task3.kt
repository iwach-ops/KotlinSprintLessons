package org.example.app.lesson_4

const val SUNNY_WEATHER = true
const val OPENED_TENT = true
const val AIR_HUMIDITY_CR = 20
const val BAD_SEASON_CR = "зима"

fun main() {
    val sunnyWeather = true
    val openedTent = true
    val airHumidity = 20
    val currentSeason = "зима"

    val favorableConditions =
        (sunnyWeather == SUNNY_WEATHER && openedTent == OPENED_TENT && airHumidity == AIR_HUMIDITY_CR && currentSeason != BAD_SEASON_CR)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}