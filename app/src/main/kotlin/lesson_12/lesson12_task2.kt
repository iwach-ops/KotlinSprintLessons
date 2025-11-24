package org.example.app.lesson_12

fun main() {
    val weather = CityWeather(12, 2, "rain")

    weather.printWeather()
}

class CityWeather(
    var daytimeTemperature: Byte,
    var nighttimeTemperature: Byte,
    var precipitation: String,
) {
    fun printWeather() {
        println(
            """
           daytime Temperature: $daytimeTemperature
           nighttime Temperature: $nighttimeTemperature
           precipitation: $precipitation
            
        """.trimIndent()
        )
    }
}