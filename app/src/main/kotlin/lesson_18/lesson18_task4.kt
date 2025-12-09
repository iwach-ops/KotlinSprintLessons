package org.example.app.lesson_18

fun main() {
    val rec = Rectangular(12.0, 34.0, 56.0)

    val cub = CubeShaped(32.0)

    println("Area of Rectangular: ${rec.calculateArea()}")
    println("length of Cube Shaped: ${cub.calculateArea()}")
}

abstract class PostBox {
    abstract fun calculateArea(): Double
}

class Rectangular(
    val length: Double,
    val width: Double,
    val height: Double,
) : PostBox() {
    override fun calculateArea(): Double = 2 * (width * height + length * width + length * height)
}

class CubeShaped(
    val length: Double,
) : PostBox() {
    override fun calculateArea(): Double = 6 * length * length
}