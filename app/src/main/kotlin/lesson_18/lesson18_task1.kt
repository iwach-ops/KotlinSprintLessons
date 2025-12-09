package org.example.app.lesson_18

fun main() {
    val order1 = Order(111)
    val order2 = Order(222)
    val orderNames = listOf("computer", "printer", "keyboard")

    order1.printOrderInfo("table")
    order2.printOrderInfo(orderNames)
}

class Order(
    val orderNumber: Int,
) {
    fun printOrderInfo(orderName: String) {
        println("Order number: $orderNumber: Ordered product: $orderName")
    }

    fun printOrderInfo(orderNames: List<String>) {
        println("Order number: $orderNumber: The following products were ordered: ${orderNames.joinToString(",")} ")
    }
}