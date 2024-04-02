package com.shehryarkamran.chatwithexpert

import android.graphics.Bitmap
import com.shehryarkamran.chatwithexpert.data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
