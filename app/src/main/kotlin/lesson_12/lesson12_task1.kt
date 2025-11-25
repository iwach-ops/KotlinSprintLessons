package org.example.app.lesson_12

fun main() {
    val winterWeather = Weather()
    winterWeather.daytimeTemperature = 5
    winterWeather.nighttimeTemperature = -2
    winterWeather.hasPrecipitation = true

    winterWeather.displayWeatherInfo()

    val summerWeather = Weather()
    summerWeather.daytimeTemperature = 25
    summerWeather.nighttimeTemperature = 17
    summerWeather.hasPrecipitation = false

    summerWeather.displayWeatherInfo()

}

class Weather {
    var daytimeTemperature = 11
    var nighttimeTemperature = 3
    var hasPrecipitation = false

    fun displayWeatherInfo() {
        println(
            """
    daytime Temperature: $daytimeTemperature
    nighttime Temperature: $nighttimeTemperature
    precipitation: $hasPrecipitation
        
    """.trimIndent()
        )
    }
}