package kotlinlang.learn_pack2

fun main() {

    val frequentSender = messages
        .groupBy(Message::sender)
        .maxByOrNull { (_, message) -> message.size }
        ?.key
    println(frequentSender)

    val senders = messages
        .asSequence()
        .filter { it.body.isNotBlank() && !it.isRead }
        .map(Message::sender)
        .distinct()
        .sorted()
        .toList()
    println(senders)

    throw (Exception().message ?: "") as Throwable

}

data class Message(                                           // Create a data class
    val sender: String,
    val body: String,
    val isRead: Boolean = false,                              // Provide a default value for the argument
)

val messages = listOf(                                        // Create a list
    Message("Ma", "Hey! Where are you?"),
    Message("Adam", "Everything going according to plan today?"),
    Message("Ma", "Please reply. I've lost you!"),
)