package org.example.app.lesson_15

fun main() {
    val temp = Temperature(-15.6)
    val snow= PrecipitationAmount(10.9)

    val server= WeatherServer()

    server.sendStats(temp)
    server.sendStats(snow)
}

abstract class WeatherStationStats()

class Temperature(
    val value: Double,
    val unit: String = "C"
) : WeatherStationStats()

class PrecipitationAmount(
    val value: Double,
    val unit: String = "mm"
) : WeatherStationStats()

class WeatherServer() : WeatherProvider, WeatherNotifier {
    fun sendStats(status: WeatherStationStats) {

        when (status) {
            is Temperature -> println("Temperature is: ${status.value} ${status.unit}")
            is PrecipitationAmount -> println("Temperature is: ${status.value} ${status.unit}")
            else -> print("unknown status")
        }
    }

    override fun getCurrentStats() {
        TODO("Not yet implemented")
    }

    override fun getForecast() {
        TODO("Not yet implemented")
    }

    override fun subscribe() {
        TODO("Not yet implemented")
    }

    override fun unsubscribe() {
        TODO("Not yet implemented")
    }

    override fun refreshWeatherData() {
        TODO("Not yet implemented")
    }
}

interface WeatherProvider {
    fun getCurrentStats()
    fun getForecast()
}

interface WeatherNotifier {
    fun subscribe()
    fun unsubscribe()
    fun refreshWeatherData()
}