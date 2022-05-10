package com.lost.appmassroom.domain.repository

import com.lost.appmassroom.domain.model.UserModel

interface UserRepository {
    fun sign (userData: UserModel)

    fun registr (userData: UserModel)
}