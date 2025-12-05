package org.example.app.lesson_15

fun main() {
    val instrument1 = Instrument(1, "accordion", 12)
    instrument1.searchProduct()
}

open class Product(
    val id: Int,
    val name: String,
    val numberOfUnits: Int,
)

class Instrument(
    id: Int,
    name: String,
    numberOfUnits: Int,
) : Product(id, name, numberOfUnits), Searchable {
    override fun searchProduct() {
        println("Search is running for the instrument $name")
    }
}

class Accessory(
    id: Int,
    name: String,
    numberOfUnits: Int,
) : Product(id, name, numberOfUnits)

interface Searchable {
    fun searchProduct()
}