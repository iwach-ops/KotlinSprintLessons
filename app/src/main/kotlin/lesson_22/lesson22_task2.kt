package org.example.app.lesson_22

fun main() {
    val regBook = RegularBook2("Book ABC", "Tom Bayer")
    val dataBook = DataBook2("Book ABC", "Tom Bayer")

    // for regBook: the class and the object's hash code are printed
    println("regBook: ${regBook}")
    // for dataBook: the class and all property values are printed (toString() is generated automatically)
    println("dataBook: ${dataBook}")
}

class RegularBook2(
    val name: String,
    val author: String,
)

data class DataBook2(
    val name: String,
    val author: String,
)