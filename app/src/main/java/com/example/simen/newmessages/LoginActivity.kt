package com.example.simen.newmessages

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnLogin.setOnClickListener{
            performLogin()
        }
        txtRegister.setOnClickListener(){
            finish()
        }
    }

    private fun performLogin() {
        val email=edit_login_email.text.toString()
        val password=edit_login_password.text.toString()
        Log.d("Login","Attempt login with email/pass $email/****")
        FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password)
    }

}