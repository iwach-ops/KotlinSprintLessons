package org.example.app.lesson_12

fun main() {
    val weather = Weather()
    weather.daytimeTemperature = 5
    weather.nighttimeTemperature = -2
    weather.precipitation = "snow"

    println(
        """
    daytime Temperature: ${weather.daytimeTemperature}
    nighttime Temperature: ${weather.nighttimeTemperature}
    precipitation precipitation during the day : ${weather.precipitation}
            
        """.trimIndent()
    )
}

class Weather() {
    var daytimeTemperature = 11
    var nighttimeTemperature = 3
    var precipitation = "rain"
}