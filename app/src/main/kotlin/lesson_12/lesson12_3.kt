package org.example.app.lesson_12

const val FROM_KELVIN_TO_CELS = 273.15

fun main() {
    val weather = IslandWeather(273, 270, true)

    weather.printWeather()
}

class IslandWeather(
    daytimeTemperatureKelvin: Int,
    nighttimeTemperatureKelvin: Int,
    _precipitation: Boolean
) {
    val daytimeTemperature: Int = (daytimeTemperatureKelvin - FROM_KELVIN_TO_CELS).toInt()
    val nighttimeTemperature: Int = (nighttimeTemperatureKelvin - FROM_KELVIN_TO_CELS).toInt()
    val precipitation: Boolean = _precipitation

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