package com.example.loginscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    private lateinit var edtEmail: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnLogin: Button
    private lateinit var btnSignUp: Button
    //private var receiveEmail: String? by lazy{}
    //private var receivePassword: String?
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        makeViews()
        val intent = intent
        var receiveEmail= intent.getStringExtra("email")
        var receivePassword = intent.getStringExtra("password")

        btnLogin.setOnClickListener {
            if(edtEmail.text.toString() == receiveEmail && edtPassword.text.toString() == receivePassword){
                var intent2 = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent2)
            }
            else if(edtEmail.text.toString().equals("email") && edtPassword.text.toString().equals("password")){
                    var intent2 = Intent(applicationContext, MainActivity::class.java)
                    startActivity(intent2)
            }
            else{
                Toast.makeText(baseContext, "Passworrd or USername is incorrect", Toast.LENGTH_SHORT).show()
            }
        }
        btnSignUp.setOnClickListener {
            var intent3 = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent3)
            finish()
        }
    }

    private fun makeViews() {
        edtEmail = findViewById(R.id.edt_email)
        edtPassword = findViewById(R.id.edt_password)
        btnLogin = findViewById(R.id.btn_login)
        btnSignUp = findViewById(R.id.btn_signup)
    }
}