package com.example.roomdatabase.roomdatabase.presentation

import androidx.lifecycle.ViewModel
import com.example.roomdatabase.roomdatabase.data.NoteDao

class NoteViewModel( private var noteDao: NoteDao): ViewModel()  {
}