package com.velosobr.myapplication.data

import androidx.room.Database
import com.velosobr.myapplication.data.models.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase {

    abstract fun toDoDao(): ToDoDao
}