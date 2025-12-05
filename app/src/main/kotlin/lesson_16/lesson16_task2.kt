package org.example.app.lesson_16

private const val PI_VALUE = 3.14

fun main() {
    val circle = Circle(15.0)
    circle.calculateCircumference()
    circle.calculateArea()
}

class Circle(
    private val radius: Double
) {
    fun calculateCircumference() {
        println("Circumference: ${2 * PI_VALUE * radius}")
    }

    fun calculateArea() {
        println("Area: ${PI_VALUE * radius * radius}")
    }
}