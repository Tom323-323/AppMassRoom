package com.lost.appmassroom.data.storage

import android.content.Context
import android.util.Log
import androidx.room.Room
import com.lost.appmassroom.data.model.UserDataModel
import com.lost.appmassroom.data.storage.room.AppDB
import com.lost.appmassroom.data.storage.room.EntityUser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Room(context: Context): UserStorage {

    val db = Room.databaseBuilder(context,AppDB::class.java, "UserData").build()
    val userDao = db.userEntityDao()

    override fun registr(userData: UserDataModel) {

        CoroutineScope(Dispatchers.IO).launch{
            val entityUser = EntityUser(idData = userData.idData, email = userData.email, password = userData.passsword)
            userDao.addUser(entityUser)
            Log.e("AAA", entityUser.email.toString())
        }
    }

    override fun signIn(userData: UserDataModel) {

        CoroutineScope(Dispatchers.IO).launch {
            val user = userDao.getEmail(userData.email.toString())
            //Log.e("AAA", user.password.toString())
            Log.e("AAA", user.email.toString())
            Log.e("AAA", user.id.toString())
            Log.e("AAA", user.idData.toString())

        }
    }
}