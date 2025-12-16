package org.example.app.lesson_22

fun main() {
    val regBook1 = RegularBook("Book ABC", "Tom Bayer")
    val regBook2 = RegularBook("Book ABC", "Tom Bayer")
    val dataBook1 = DataBook("Book ABC", "Tom Bayer")
    val dataBook2 = DataBook("Book ABC", "Tom Bayer")

    // for regBook: reference equality
    println("Is same? ${regBook1} vs ${regBook2}: ${regBook1 == regBook2}")
    // for dataBook: structural  equality
    println("Is same? ${dataBook1} vs ${dataBook2}: ${dataBook1 == dataBook2}")
}

class RegularBook(
    val name: String,
    val author: String,
)

data class DataBook(
    val name: String,
    val author: String,
)