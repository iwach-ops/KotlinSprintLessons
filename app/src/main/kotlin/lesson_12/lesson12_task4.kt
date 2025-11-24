package org.example.app.lesson_12

const val FROM_KELVIN_TO_CELSIUS = 273.15

fun main() {
    val weather = CountryWeather(273, 270, true)
}

class CountryWeather(
    daytimeTemperatureKelvin: Int,
    nighttimeTemperatureKelvin: Int,
    _precipitation: Boolean
) {
    var daytimeTemperature: Int = (daytimeTemperatureKelvin - FROM_KELVIN_TO_CELSIUS).toInt()
    var nighttimeTemperature: Int = (nighttimeTemperatureKelvin - FROM_KELVIN_TO_CELSIUS).toInt()
    var precipitation: Boolean = _precipitation

    init {
        printWeather()
    }

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