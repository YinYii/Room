package com.example.room.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "student_table")
// by setting data no need set and get
data class Student (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val name:String,
    val programme:String
)