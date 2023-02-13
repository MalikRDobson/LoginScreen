package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignupActivity : AppCompatActivity() {

    private lateinit var edtSignupEmail: EditText
    private lateinit var edtSignupPassword: EditText
    private lateinit var btnLoginPage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        makeViews()
        btnLoginPage.setOnClickListener {
            if(edtSignupEmail.text.toString().isEmpty() || edtSignupPassword.text.toString().isEmpty()){
                Toast.makeText(baseContext, "Must fill both fields", Toast.LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(applicationContext, LoginActivity::class.java)
                intent.putExtra("email",edtSignupEmail.text.toString())
                intent.putExtra("password", edtSignupPassword.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }

    private fun makeViews() {
        edtSignupEmail = findViewById(R.id.edt_signup_email)
        edtSignupPassword = findViewById(R.id.edt_signup_password)
        btnLoginPage = findViewById(R.id.btn_signup_login)
    }
}