package com.lost.appmassroom.data.storage.room

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.lost.appmassroom.data.model.UserDataModel

interface DAO {


    @Query("SELECT*FROM userdata")
    fun getAll(): List<UserDataModel>

    @Query("SELECT*FROM userdata WHERE email IN (:userEmail)")
    fun getUserEmail(userEmail: )

    @Insert
    fun addUser (vararg user:UserDataModel)

    @Delete
    fun deleteUser(user: UserDataModel)


}