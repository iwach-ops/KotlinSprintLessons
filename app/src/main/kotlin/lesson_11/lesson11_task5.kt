package org.example.app.lesson_11

fun main() {
    val forum = Forum()

    val participant1 = forum.createNewUser("Tom")
    val participant2 = forum.createNewUser("Robert")

    forum.createNewMessage(participant1.userId, "Good Morning..")
    forum.createNewMessage(participant1.userId, "How are you?..")
    forum.createNewMessage(participant2.userId, "It is fine")
    forum.createNewMessage(participant2.userId, "I am going to..")
    forum.printThread()
}

class Participant(
    val userId: Int,
    val userName: String
)

class Message(
    val authorId: Int,
    val message: String
)

class Forum {
    private val participants = mutableListOf<Participant>()
    private val messages = mutableListOf<Message>()
    private var nextUserId = 1

    fun createNewUser(userName: String): Participant {
        val user = Participant(nextUserId++, userName)

        participants.add(user)

        return user
    }

    fun createNewMessage(authorId: Int, text: String): Message? {
        val userExists = participants.any { it.userId == authorId }

        if (!userExists) return null

        val message = Message(authorId, text)

        messages.add(message)

        return message
    }

    fun printThread() {
        messages.forEach { msg ->
            val author = participants.find { it.userId == msg.authorId }
            val name = author?.userName ?: "Unknown"

            println("$name: ${msg.message}")
        }
    }
}