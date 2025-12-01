package org.example.app.lesson_14

import kotlin.math.PI

fun main() {
    val rect1 = Rectangle(4.0, 6.0, "black")
    val circle1 = Circle(15.0, "black")
    val rect2 = Rectangle(4.0, 6.0, "white")
    val circle2 = Circle(15.0, "white")
    val rect3 = Rectangle(4.0, 6.0, "white")
    val circle3 = Circle(15.0, "white")

    val figures = mutableListOf<Figure>()

    figures.add(rect1)
    figures.add(rect2)
    figures.add(rect3)
    figures.add(circle1)
    figures.add(circle2)
    figures.add(circle3)

    val whiteFigures = figures.filter { it.color == "white" }
    val blackFigures = figures.filter { it.color == "black" }

    println(
        """
        sum of white figures area: ${"%.2f".format(whiteFigures.sumOf { it.calculateArea()})}
        sum of white figures perimeter: ${"%.2f".format(whiteFigures.sumOf { it.calculatePerimeter()})}
        sum of black figures area: ${"%.2f".format(blackFigures.sumOf { it.calculateArea() })}
        sum of black figures perimeter: ${"%.2f".format(blackFigures.sumOf { it.calculatePerimeter()})}
        
    """.trimIndent()
    )
}

abstract class Figure(
    var color: String
) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Circle(
    val radius: Double,
    color: String,
) : Figure(color) {
    override fun calculateArea(): Double = PI * radius * radius

    override fun calculatePerimeter(): Double = 2 * PI * radius
}

class Rectangle(
    val width: Double,
    val height: Double,
    color: String,
) : Figure(color) {
    override fun calculateArea(): Double = width * height

    override fun calculatePerimeter(): Double = 2 * (width + height)
}