package com.lost.appmassroom.data.storage.room

import androidx.room.*
import com.lost.appmassroom.data.model.UserDataModel


@Dao
interface EntityUserDAO {

    @Query("SELECT*FROM userdata")
    suspend fun getAll(): List<EntityUser>

    @Query("SELECT email FROM userdata ")
    suspend fun getAllUserEmail(): List<String>

    @Query("SELECT * FROM userdata WHERE email == :emailUser")
    suspend fun getEmail (emailUser: String):EntityUser

    @Insert
    suspend fun addUser (user:EntityUser)

    @Delete
    suspend fun deleteUser(user: EntityUser)

    @Update
    suspend fun updateUsers(user: EntityUser)


}