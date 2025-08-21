package com.example.roomdatabase.roomdatabase.presentation

import com.example.roomdatabase.roomdatabase.data.Note

sealed interface NoteEvent {
    object sortNote: NoteEvent

    data class DeleteNote(val note: Note) :NoteEvent

    data class SaveNote(
        val title: String,
        val description: String
    ):NoteEvent
}