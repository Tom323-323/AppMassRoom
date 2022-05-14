package com.lost.appmassroom.domain.usecase

import com.lost.appmassroom.domain.model.UserModel
import com.lost.appmassroom.domain.repository.UserRepository

class Registration (private val userRepository: UserRepository){

    fun registr(userModel:UserModel){
        val user = UserModel(userTime = userModel.userTime.toString(), passsword = userModel.passsword, email = userModel.email)
        userRepository.registr(user)
    }

}