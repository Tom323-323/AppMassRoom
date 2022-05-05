package com.lost.appmassroom.presenter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lost.appmassroom.databinding.ActivityAuthenticationBinding



class ActivityAuthentication : AppCompatActivity() {
    lateinit var bindingAuth: ActivityAuthenticationBinding

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)

        bindingAuth = ActivityAuthenticationBinding.inflate(layoutInflater)
        setContentView(bindingAuth.root)

    }



}