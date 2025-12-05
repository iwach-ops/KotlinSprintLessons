package org.example.app.lesson_15

fun main() {
    val status1 = Temperature("temp", -12.0, "C")
    val status2 = PrecipitationAmount("snow", 10.0, "mm")
    val server = WeatherServer()
    server.sendToServer(status1)
    server.sendToServer(status2)
}

abstract class WeatherStationStats(
    val name: String,
    val value: Double,
    val unit: String,
)

class Temperature(
    name: String,
    value: Double,
    unit: String = "C",
) : WeatherStationStats(name, value, unit)

class PrecipitationAmount(
    name: String,
    value: Double,
    unit: String = "mm"
) : WeatherStationStats(name, value, unit)

class WeatherServer() {
    fun sendToServer(status: WeatherStationStats) {
        when (status) {
            is Temperature -> println("Temperature: ${status.value} ${status.unit}")
            is PrecipitationAmount -> println("Precipitation Amount: ${status.value} ${status.unit}")
            else -> println("unknown status")
        }
    }
}