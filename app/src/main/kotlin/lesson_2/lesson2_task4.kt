package org.example.app.lesson_2

fun main() {
    val buffPercent: Float = 20f
    val hundredPercent: Short = 100
    val crystalOre: Short = 7
    val ironOre: Short = 11

    val buff: Float = buffPercent / hundredPercent
    val crystalOreBonus: Int = (crystalOre * buff).toInt()
    val ironOreBonus: Int = (ironOre * buff).toInt()

    println("Crystal ore bonus: $crystalOreBonus")
    println("Iron ore bonus: $ironOreBonus")
}