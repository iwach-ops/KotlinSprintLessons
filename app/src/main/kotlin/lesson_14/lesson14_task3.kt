package org.example.app.lesson_14

import kotlin.math.PI

const val COLOR_BLACK = "black"
const val COLOR_WHITE = "white"

fun main() {
    val rect1 = Rectangle(4.0, 6.0, COLOR_BLACK)
    val circle1 = Circle(15.0, COLOR_BLACK)
    val rect2 = Rectangle(4.0, 6.0, COLOR_WHITE)
    val circle2 = Circle(15.0, COLOR_WHITE)
    val rect3 = Rectangle(4.0, 6.0, COLOR_WHITE)
    val circle3 = Circle(15.0, COLOR_WHITE)

    val figures = listOf(rect1, circle1, rect2, circle2, rect3, circle3)

    val whiteFigures = figures.filter { it.color == COLOR_WHITE }
    val blackFigures = figures.filter { it.color == COLOR_BLACK }

    println(
        """
        sum of white figures area: ${"%.2f".format(whiteFigures.sumOf { it.calculateArea() })}
        sum of white figures perimeter: ${"%.2f".format(whiteFigures.sumOf { it.calculatePerimeter() })}
        sum of black figures area: ${"%.2f".format(blackFigures.sumOf { it.calculateArea() })}
        sum of black figures perimeter: ${"%.2f".format(blackFigures.sumOf { it.calculatePerimeter() })}
        
    """.trimIndent()
    )
}

abstract class Figure(
    val color: String
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