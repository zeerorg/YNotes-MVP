package com.example.zeerorg.firstkotlin.model

/**
 * Created by zeerorg on 6/13/17.
 */
interface NoteRepositoryInterface {
    fun pushNote(bareNote: Note) : Boolean

    fun createNote(data: String): Note

    fun getAll() : MutableList<Note>

    fun setUploaded(id : Long, value : Boolean)

    fun setObjectId(id : Long, value : String)

    fun getNotUploaded() : List<Note>

    fun isPresent(note: Note) : Boolean

    fun updateNote(note: Note)

    fun hasBeenUpdated(note: Note)

    fun getNote(id: Long) : Note
}