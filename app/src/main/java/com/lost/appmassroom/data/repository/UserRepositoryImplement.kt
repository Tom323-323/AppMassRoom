package com.lost.appmassroom.data.repository

import com.lost.appmassroom.data.model.UserDataModel
import com.lost.appmassroom.data.storage.UserStorage
import com.lost.appmassroom.domain.model.UserModel
import com.lost.appmassroom.domain.repository.UserRepository

class UserRepositoryImplement(private val userStorage: UserStorage): UserRepository {

    override fun registr(userData: UserModel) {
        userStorage.registr(mapToStorage(userData))
    }

    override fun sign(userData: UserModel) {
        userStorage.signIn(mapToStorage(userData))
    }

    fun mapToStorage(user:UserModel):UserDataModel{
        return UserDataModel(idData = user.userTime, email = user.email, passsword = user.passsword)
    }

}