package org.example.app.lesson_5

const val DISTANCE_OF_TRIP_REQUEST = "The distance of the trip (in kilometers): "
const val FUEL_CONSUMPTION_PER_100_KM_REQUEST = "The fuel consumption per 100 km (in liters): "
const val CURRENT_PRICE_PER_LITER_OF_FUEL_REQUEST = "The current price per liter of fuel: "
const val TOTAL_AMOUNT_OF_FUEL_RESPONSE = "The total amount of fuel: "
const val TOTAL_COST_OF_TRIP_RESPONSE = "The total cost of the trip: "
const val PER_100_KM = 100
const val DISTANCE_OF_TRIP_LIST_POSITION = 0
const val FUEL_CONSUMPTION_PER_100_KM_LIST_POSITION = 1
const val CURRENT_PRICE_PER_LITER_OF_FUEL_LIST_POSITION = 2

fun main() {
    val inputRequestsList = listOf<String>(
        DISTANCE_OF_TRIP_REQUEST, FUEL_CONSUMPTION_PER_100_KM_REQUEST, CURRENT_PRICE_PER_LITER_OF_FUEL_REQUEST
    )

    val inputDataList = mutableListOf<Double>()

    for (inputRequest in inputRequestsList) {
        print(inputRequest)
        inputDataList.add(readln().toDouble())
    }

    val totalAmountOfFuelRequiredForTrip =
        (inputDataList[DISTANCE_OF_TRIP_LIST_POSITION] * inputDataList[FUEL_CONSUMPTION_PER_100_KM_LIST_POSITION]) / PER_100_KM
    val totalCostOfFuel =
        totalAmountOfFuelRequiredForTrip * inputDataList[CURRENT_PRICE_PER_LITER_OF_FUEL_LIST_POSITION]

    println(
        """
            $TOTAL_AMOUNT_OF_FUEL_RESPONSE ${"%.2f".format(totalAmountOfFuelRequiredForTrip)} liter
            $TOTAL_COST_OF_TRIP_RESPONSE ${"%.2f".format(totalCostOfFuel)} RUB
        """.trimIndent()
    )
}