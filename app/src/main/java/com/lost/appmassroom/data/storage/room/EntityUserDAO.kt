package com.lost.appmassroom.data.storage.room

import androidx.room.*
import com.lost.appmassroom.data.model.UserDataModel


@Dao
interface EntityUserDAO {

    @Query("SELECT*FROM userdata")
    fun getAll(): List<EntityUser>

    @Query("SELECT email FROM userdata ")
    fun getAllUserEmail(): List<String>

    @Query("SELECT * FROM userdata WHERE email == :emailUser")
    fun getEmail (emailUser: String):List<EntityUser>

    @Insert
    fun addUser (user:EntityUser)

    @Delete
    fun deleteUser(user: EntityUser)

    @Update
    fun updateUsers(user: EntityUser)


}