package org.example.app.lesson_3

fun main() {
    var fromPosition: String = "E2"
    var inToPosition: String = "E4"
    var move: Int = 1

    println("$fromPosition-$inToPosition;${move++}")

    fromPosition = "D2"
    inToPosition = "D3"

    println("$fromPosition-$inToPosition;${move}")

}