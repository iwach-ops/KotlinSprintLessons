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

class Participant internal constructor(
    val userId: Int,
    val userName: String
)

class Message internal constructor(
    val authorId: Int,
    val message: String
)

class Forum {
    private val participants = mutableListOf<Participant>()
    private val messages = mutableListOf<Message>()
    private var nextUserId = 1

    private class ParticipantBuilder {
        private var userId = 0
        private var userName: String = ""

        fun setId(id: Int): ParticipantBuilder {
            userId = id
            return this
        }

        fun setName(name: String): ParticipantBuilder {
            userName = name
            return this
        }

        fun build(): Participant {
            return Participant(userId, userName)
        }
    }

    private class MessageBuilder {
        private var authorId = 0
        private var message: String = ""

        fun setAuthorId(id: Int): MessageBuilder {
            authorId = id
            return this
        }

        fun setMessage(text: String): MessageBuilder {
            message = text
            return this
        }

        fun build(): Message {
            return Message(authorId, message)
        }


    }

    fun createNewUser(userName: String): Participant {
        val builder = ParticipantBuilder()

        val user = builder.setId(nextUserId++).setName(userName).build()

        participants.add(user)

        return user
    }

    fun createNewMessage(authorId: Int, text: String): Message? {
        val userExists = participants.any { it.userId == authorId }

        if (!userExists) return null

        val builder = MessageBuilder()
        val message = builder.setAuthorId(authorId).setMessage(text).build()

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