package org.example.app.lesson_12

fun main() {
    val weather = CityWeather(12, 2, true)

    weather.printWeather()
}

class CityWeather(
    val daytimeTemperature: Byte,
    val nighttimeTemperature: Byte,
    val precipitation: Boolean,
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