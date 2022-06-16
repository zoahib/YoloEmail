package com.example.recycler_view_upload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout
import java.io.File

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        // setting login button to redirect
        var BtnLogin = findViewById<Button>(R.id.tvLogins);
        var BtnReg = findViewById<Button>(R.id.btnRegister);
        var Title = findViewById<TextView>(R.id.regsheg)
        BtnLogin.setOnClickListener {
            var hello = Intent(this, MainActivity2::class.java)
            startActivity(hello)
        }
        BtnReg.setOnClickListener {
         check_register()
        }

    }
    private fun check_register(){
        var editEmail = findViewById<EditText>(R.id.editEmail)
        var editPassword = findViewById<EditText>(R.id.editPassword)
        var editConfirmPassword = findViewById<EditText>(R.id.editCPassword)
        //var email_id = findViewById<TextInputLayout>(R.id.textEmail)
        val text_bc = editEmail.text.toString()
        val text_fk_of = editPassword.text.toString()
        val text_fk_of_2 = editConfirmPassword.text.toString()
        val FinalText = "$text_bc:$text_fk_of\n"

        //check if password and confirm password are same
        if(text_fk_of != text_fk_of_2){
            Toast.makeText(this, "{$text_fk_of}Password and Confirm Password are not same", Toast.LENGTH_LONG).show()
            //ask to enter credentials again
            editPassword.setText("")
            editConfirmPassword.setText("")
            editPassword.requestFocus()
            return
        }
        //check if email is empty
        if(text_bc.isEmpty()){
            Toast.makeText(this, "Email is empty", Toast.LENGTH_LONG).show()
            //ask to enter email again

            editEmail.requestFocus()
        }
        //check if password is empty
        if(text_fk_of.isEmpty()){
            Toast.makeText(this, "Password is empty", Toast.LENGTH_LONG).show()
            //ask to enter password again
            editPassword.requestFocus()
        }
        //check if confirm password is empty
        if(text_fk_of_2.isEmpty()){
            Toast.makeText(this, "Confirm Password is empty", Toast.LENGTH_LONG).show()
            //ask to enter confirm password again
            editConfirmPassword.requestFocus()
        }

        //begin to add in file
        val internalPath = getFilesDir()

        val LoginFile = File(internalPath, "user-db.txt")
        //test append to file
        LoginFile.appendText(FinalText)




        Toast.makeText(this, "$text_bc:$text_fk_of", Toast.LENGTH_SHORT).show()




        var hello = Intent(this, MainActivity2::class.java)
        startActivity(hello)





    }








//        fun registerUser(){
//            Toast.makeText(
//                applicationContext,
//                "Please enter credentials", Toast.LENGTH_SHORT
//            ).show()
//
//
//
//        }

            //parsing data to firebase register


            //parsing data to firebase register
//            BtnReg.setOnClickListener {
//
//                registerUser()
//
//            }
        }