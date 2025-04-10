package com.example.noteapp_11s20018

import  android.app.Application
import com.example.noteapp_11s20018.Repository.NoteRepository
import com.example.noteapp_11s20018.Room.NoteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob

class NoteApplication: Application() {

    val applicationScope = CoroutineScope(SupervisorJob())

    val database by lazy {
        NoteDatabase.getDatabase(this, applicationScope)
    }

    val repository by lazy {
        NoteRepository(database.getNoteDao())
    }

}