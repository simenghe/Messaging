package com.example.simen.newmessages

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRegister.setOnClickListener {
            val email=editEmail.text.toString()
            val user =editUser.text.toString()
            val password=editPassword.text.toString()
            Log.d("MainActivity","This is your password "+ password)
        }
        txtLogin.setOnClickListener{
            Log.d("MainActivity","Show login activity")
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }
    }
}
