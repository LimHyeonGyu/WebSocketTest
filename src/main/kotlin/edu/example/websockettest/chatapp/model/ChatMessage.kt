package edu.example.websockettest.chatapp.model

data class ChatMessage(
    val sender: String,
    val content: String,
    val type: MessageType
)