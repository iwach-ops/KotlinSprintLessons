package org.example.app.lesson_18

fun main() {
    val screen = Screen()

    println(
        """
      ${screen.draw(2, 4)}
      ${screen.draw(2.5f, 5.7f)}
      ${screen.draw(2, 4, 10.0)}
      ${screen.draw(2.5f, 5.7f, 56.9)}
      ${screen.draw(2, 4, 11.0, 22.0)}
      ${screen.draw(2.5f, 5.7f, 33.1, 44.4)}
    """.trimIndent()
    )
}

class Screen {
    fun draw(x: Int, y: Int): String = "Dot $x; $y"

    fun draw(x: Float, y: Float): String = "Dot $x; $y"

    fun draw(x: Int, y: Int, radius: Double): String = "circle $x; $y; $radius"

    fun draw(x: Float, y: Float, radius: Double): String = "circle $x; $y; $radius"

    fun draw(x: Int, y: Int, width: Double, height: Double): String = "square $x; $y; $width; $height"

    fun draw(x: Float, y: Float, width: Double, height: Double): String = "square $x; $y; $width; $height"
}