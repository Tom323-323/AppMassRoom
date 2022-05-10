package com.lost.appmassroom.data.storage

import com.lost.appmassroom.data.model.UserDataModel


interface UserStorage {

    fun registr(userData: UserDataModel)


    fun signIn(userData: UserDataModel)

}