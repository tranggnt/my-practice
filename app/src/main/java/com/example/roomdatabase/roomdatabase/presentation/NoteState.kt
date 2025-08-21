package com.example.roomdatabase.roomdatabase.presentation

import com.example.roomdatabase.roomdatabase.data.Note
import androidx.compose.runtime.MutableState

data class NoteState(

    val notes: List<Note> = emptyList(),
    val title: MutableSt
)
