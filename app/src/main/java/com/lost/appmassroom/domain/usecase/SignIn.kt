package com.lost.appmassroom.domain.usecase


import com.lost.appmassroom.domain.model.UserModel
import com.lost.appmassroom.domain.repository.UserRepository

class SignIn(private val userRepository: UserRepository) {

    fun signIn (userModel: UserModel){
        val user = UserModel(userTime = userModel.userTime, email = userModel.email, passsword = userModel.passsword)
        userRepository.sign(user)
    }
}