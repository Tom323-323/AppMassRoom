package com.lost.appmassroom.presenter
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.lost.appmassroom.data.repository.UserRepositoryImplement
import com.lost.appmassroom.data.storage.Room
import com.lost.appmassroom.databinding.ActivityAuthenticationBinding
import com.lost.appmassroom.domain.usecase.Registration
import com.lost.appmassroom.domain.usecase.SignIn
import com.lost.appmassroom.domain.model.UserModel

class ActivityAuthentication : AppCompatActivity() {
    lateinit var bindingAuth: ActivityAuthenticationBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)

        val userRepository by lazy { UserRepositoryImplement(userStorage = Room(context = applicationContext)) }
        val registr by lazy {Registration(userRepository = userRepository)}
        val sign by lazy {SignIn(userRepository = userRepository)}

        bindingAuth = ActivityAuthenticationBinding.inflate(layoutInflater)
        setContentView(bindingAuth.root)

        val mail = bindingAuth.etMail.text.toString()
        val passw = bindingAuth.etPassword.toString()

        bindingAuth.btnReg.setOnClickListener(View.OnClickListener {
            registr.registr(UserModel(userTime = "",
                                      email = mail,
                                      passsword = passw))
        })

        bindingAuth.btnSign.setOnClickListener(View.OnClickListener {
            sign.signIn(UserModel(userTime = "",
                                  email = mail,
                                  passsword = passw))
        })
    }
}