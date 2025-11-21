package org.example.app.lesson_11

fun main() {

    val worker = User(123, "Frank", "Start12345", "frank@bank.com")
    val banker = User(124, "Tom", "Trats54321", "tom@bank.com")

    println(
        """
            Worker's Data:
            Identifier: ${worker.userId}
            Login: ${worker.login}
            Password: ${worker.password}
            Email: ${worker.email}     
            
            Banker's Data:
            Identifier: ${banker.userId}
            Login: ${banker.login}
            Password: ${banker.password}
            Email: ${banker.email}   
            
        """.trimIndent()
    )
}

class User(
    val userId: Int,
    val login: String,
    val password: String,
    val email: String,
)