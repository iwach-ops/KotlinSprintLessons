package org.example.app.lesson_20

fun main() {
    val greatUser: (String) -> String = { name -> "Happy New Year, $name" }

   println(greatUser("Tom"))
}