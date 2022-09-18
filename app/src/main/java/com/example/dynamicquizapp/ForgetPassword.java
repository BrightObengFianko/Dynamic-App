package com.example.dynamicquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ForgetPassword extends AppCompatActivity {
    private Button btnForgot;
    private EditText forgetEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);
        btnForgot=findViewById(R.id.forgotPasswordbtn);
        forgetEmail= findViewById(R.id.forgotPasswordEmail);
        btnForgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(forgetEmail.getText().toString().trim())){
                    forgetEmail.setError("Please enter a valid email");
                }else {
                    startActivity(new Intent(ForgetPassword.this,MainActivity.class));
                }
            }
        });
    }
}