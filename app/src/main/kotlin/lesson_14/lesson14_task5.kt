package org.example.app.lesson_14

fun main() {
    val chat = Chat()
    val message1 = chat.addMessage("Hi friends", "Robert")
    val threadMessage1 = chat.addThreadMessage(message1.id, "Hi Robert", "Tom")
    val threadMessage2 = chat.addThreadMessage(message1.id, "Hi Tom", "Robert")

    chat.printChat()
}

open class Chat(
    val messages: MutableList<Message> = mutableListOf(),
    var nextMessageId: Int = 1,
) {

    fun addMessage(text: String, _author: String): Message {
        val message = Message(
            id = nextMessageId++,
            message = text,
            author = _author,
        )
        messages.add(message)
        return message
    }

    fun addThreadMessage(_parentMessageId: Int, _message: String, _author: String): ChildMessage {
        val child = ChildMessage(
            id = nextMessageId++,
            message = _message,
            author = _author,
            parentMessageId = _parentMessageId
        )
        messages.add(child)
        return child
    }

    fun printChat() {

        val threadsByParentId = messages.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }

        val mainMessages = messages.filter { it !is ChildMessage }
        mainMessages.forEach { it ->
            println("${it.author}: ${it.message}")
            val replies = threadsByParentId[it.id] ?: emptyList()
            replies.forEach { reply ->
                println("\t${reply.author}: ${reply.message}")
            }
        }
    }
}

open class Message(
    val id: Int,
    val message: String,
    val author: String,
)

class ChildMessage(
    id: Int,
    message: String,
    author: String,
    val parentMessageId: Int
) : Message(id, message, author)