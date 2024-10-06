package com.example.kotlin.chat.service

import kotlinx.coroutines.flow.Flow

interface MessageService {

    fun latest(): Flow<MessageVM>

    fun after(lastMessageId: String): Flow<MessageVM>

    fun stream(): Flow<MessageVM>

    suspend fun post(messages: Flow<MessageVM>)
}