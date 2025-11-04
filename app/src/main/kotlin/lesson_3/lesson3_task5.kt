package org.example.app.lesson_3

fun main() {
    var fromPosition: String
    var inToPosition: String
    var move: Int
    val moveString: String = "D2-D4;0"

    fromPosition = moveString.substring(0, 2)
    inToPosition = moveString.substring(3, 5)
    move = (moveString.substring(6)).toInt()

    println(
        """
           from position: $fromPosition
           into position: $inToPosition
           move: $move
        """.trimIndent()
    )
}