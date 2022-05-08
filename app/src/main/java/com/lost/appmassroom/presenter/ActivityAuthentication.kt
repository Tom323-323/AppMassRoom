package com.lost.appmassroom.presenter
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.lost.appmassroom.databinding.ActivityAuthenticationBinding
import com.lost.appmassroom.domain.usecase.Registration
import com.lost.appmassroom.domain.usecase.SignIn
import com.lost.appmassroom.domain.model.UserModel


class ActivityAuthentication : AppCompatActivity() {
    lateinit var bindingAuth: ActivityAuthenticationBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)

        val registr = Registration()
        val sign = SignIn()

        bindingAuth = ActivityAuthenticationBinding.inflate(layoutInflater)
        setContentView(bindingAuth.root)

        bindingAuth.btnReg.setOnClickListener(View.OnClickListener {
            val mail = bindingAuth.etMail.text.toString()
            val passw = bindingAuth.etPassword.toString()

            registr.registr(UserModel(id="", email = mail, passsword = passw))

        })

    }



}