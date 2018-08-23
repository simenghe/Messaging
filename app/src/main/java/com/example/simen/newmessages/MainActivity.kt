package com.example.simen.newmessages

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email=editEmail.text.toString()
        val user =editUser.text.toString()
        val password=editPassword.text.toString()

        Log.d("MainActivity","This is your password "+ password)
    }
}
