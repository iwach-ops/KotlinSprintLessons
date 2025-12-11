package org.example.app.lesson_19

fun main() {
    val product1 = Product("hut", 101, Categories.CLOTHING)
    val product2 = Product("tv", 102, Categories.STATIONERY)
    val product3 = Product("gift", 103, Categories.MISCELLANEOUS)

    product1.displayProductInfo()
    product2.displayProductInfo()
    product3.displayProductInfo()
}

enum class Categories {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS;

    fun getCategory(): String {
        when (this) {
            CLOTHING -> return "clothing"
            STATIONERY -> return "stationery"
            MISCELLANEOUS -> return "miscellaneous"
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Categories
) {
    fun displayProductInfo() {
        println(
            """
            name: $name
            id: $id
            category: ${category.getCategory()}
        """.trimIndent()
        )
    }
}