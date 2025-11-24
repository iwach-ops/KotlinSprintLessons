package org.example.app.lesson_12

const val FROM_KELVIN_TO_CELSIUS = 273.15

fun main() {
    val weather = CountryWeather(273, 270, "snow")

    weather.printWeather()
}

class CountryWeather(
    daytimeTemperatureKelvin: Int,
    nighttimeTemperatureKelvin: Int,
    _precipitation: String
) {
    var daytimeTemperature: Int = (daytimeTemperatureKelvin - FROM_KELVIN_TO_CELSIUS).toInt()
    var nighttimeTemperature: Int = (nighttimeTemperatureKelvin - FROM_KELVIN_TO_CELSIUS).toInt()
    var precipitation: String = _precipitation

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