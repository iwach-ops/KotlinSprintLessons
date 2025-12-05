package org.example.app.lesson_16

fun main() {
    val order = Order()

    println("Currrent status: ${order.status}")

    order.requestManager(true)

    println("New status after a request: ${order.status}")
}

class Order(
    private val number: Int = 12345,
    var status: Boolean = false,
) {
    private fun changeStatus(newStatus: Boolean) {
        status = newStatus
    }

    fun requestManager(newStatus: Boolean) {
        println("Request to Manager")
        changeStatus(newStatus)
    }
}