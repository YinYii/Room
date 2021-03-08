package com.example.room.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface StudentDAO {
    @Insert
    suspend fun addStudent(student: Student)

    @Query("Select * from student_table")
    suspend fun getAllStudent() : Array<Student>
}