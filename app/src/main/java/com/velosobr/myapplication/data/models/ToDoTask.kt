package com.velosobr.myapplication.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.velosobr.myapplication.util.Constants.DATABASE_TABLE

@Entity(tableName = DATABASE_TABLE)
data class ToDoTask(
    @PrimaryKey(true)
    val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority

)
