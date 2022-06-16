package com.example.recycler_view_upload

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.File

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var BtnReg = findViewById<Button>(R.id.tvRegister);
        var email = findViewById<EditText>(R.id.edUsername);
        var password = findViewById<EditText>(R.id.edPassword);
        var BtnLog= findViewById<Button>(R.id.BtnLogin)
        BtnReg.setOnClickListener{
            var hello = Intent(this, RegisterActivity::class.java)
            startActivity(hello)}
        BtnLog.setOnClickListener{
            check_login()}

    }
    //function to validate Login Credentials
    private fun check_login(){
        var found_User = false
        var email = findViewById<EditText>(R.id.edUsername);
        var password = findViewById<EditText>(R.id.edPassword);
        val userName: String = email.text.toString()
        val possword: String = password.text.toString()
        if (userName.isNotEmpty() && possword.isNotEmpty()){
            //create new file or open the existing one
            val internalPath = getFilesDir()

            val LoginFile = File(internalPath, "user-db.txt")
            //creating a dummy user  & password and  append to file
            LoginFile.appendText("a:b\n")

            //check if password and userName are correct
            if (LoginFile.exists()){
                val fileContent = LoginFile.readText()
                val lines = fileContent.split("\n")
                for (line in lines){
                    val parts = line.split(":")
                    if (parts[0] == userName && parts[1] == possword){
                        found_User = true
                        break
                    }
                }
                if (found_User){
                    Toast.makeText(
                        applicationContext,
                        "great success", Toast.LENGTH_SHORT
                    ).show()
                    val hello3 = Intent(this, MainActivity::class.java)
                    startActivity(hello3)
                }else{
                    Toast.makeText(
                        applicationContext,
                        "wrong username or password", Toast.LENGTH_SHORT
                    ).show()
                }
                }




        }





    }
    //end of function checkLogin
}