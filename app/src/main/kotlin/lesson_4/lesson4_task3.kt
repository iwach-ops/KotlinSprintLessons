package org.example.app.lesson_4

fun main() {
    var sunnyWeather: Boolean = true
    var openedTent: Boolean = true
    var airHumidity: Int = 20
    var currentSeason: String = "winter"

    var favorableConditions = (sunnyWeather && openedTent && airHumidity < 20 && currentSeason != "winter")

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}