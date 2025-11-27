package org.example.app.lesson_12

import kotlin.random.Random

const val FROM_KELVIN_TO_CEL = 273.15
const val DAYS_OF_MONTH = 30

fun main() {
    val weathers = List(DAYS_OF_MONTH) {
        EuropeWeather(
            (263..313).random(),
            (263..313).random(),
            Random.nextBoolean()
        )
    }

    println(
        """
    average nighttime temperatures: ${"%.2f".format(weathers.map { it.nighttimeTemperature }.average())}
    average daytime temperatures: ${"%.2f".format(weathers.map { it.daytimeTemperature }.average())}
    the number of days with precipitation: ${weathers.count { it.precipitation }} days
    """.trimIndent()
    )
}

class EuropeWeather(
    daytimeTemperatureKelvin: Int,
    nighttimeTemperatureKelvin: Int,
    _precipitation: Boolean
) {
    val daytimeTemperature: Int = (daytimeTemperatureKelvin - FROM_KELVIN_TO_CEL).toInt()
    val nighttimeTemperature: Int = (nighttimeTemperatureKelvin - FROM_KELVIN_TO_CEL).toInt()
    val precipitation: Boolean = _precipitation
}