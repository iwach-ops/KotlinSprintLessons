package org.example.app.lesson_3

fun main() {

    val moveString = "D2-D4;0"
    val moveStringParcing = moveString.split("-", ";")
    val fromPosition = moveStringParcing[0]
    val inToPosition = moveStringParcing[1]
    val move = moveStringParcing[2]

    println(
        """
           from position: $fromPosition
           into position: $inToPosition
           move: $move
        """.trimIndent()
    )
}