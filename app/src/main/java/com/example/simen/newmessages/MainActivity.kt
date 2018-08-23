package com.example.simen.newmessages

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnRegister.setOnClickListener {
            performRegister()
        }
        txtLogin.setOnClickListener{
            Log.d("MainActivity","Show login activity")
            val intent= Intent(this,LoginActivity::class.java)
            startActivity(intent)

        }
    }

    private fun performRegister() {
        val email=editEmail.text.toString()
        val user =editUser.text.toString()
        val password=editPassword.text.toString()
        if(email.isEmpty()||password.isEmpty()){
            Toast.makeText(this,"Email and/or Password is empty!",Toast.LENGTH_SHORT).show()
            return
        }
        Log.d("MainActivity","This is your password "+ password)
        //Firebase first time.
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener{
                    if(!it.isSuccessful) return@addOnCompleteListener
                    //else if successfull

                    Log.d("Main","Success:${it.result.user.uid}")
                }
                .addOnFailureListener{
                    Log.d("Main","Failed to create user : ${it.message}")
                }
    }
}
