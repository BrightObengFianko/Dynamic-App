package com.example.dynamicquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView quiz ,forgetPassword,newAccount;
    private EditText name,password;
    private ImageView google,twitter,facebook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();

        newAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(MainActivity.this,newAccount.class));
            }
        });
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ForgetPassword.class));
            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("Bright Obeng Fianko");
                password.setText("Open");
            }
        });
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("Bright Obeng Fianko");
                password.setText("Open");
            }
        });
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("Bright Obeng Fianko");
                password.setText("Open");
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(name.getText().toString().trim())){
                    name.setError("Please enter a valid email");
                }else if(TextUtils.isEmpty(password.getText().toString().trim())) {
                    password.setError("Please enter a valid email");
                }else {
                    startActivity(new Intent(MainActivity.this, MainActivity1.class));
                }

            }





    });
}

    private void initialization() {
        button = findViewById(R.id.button1);
        quiz = findViewById(R.id.textQuiz);
        name = findViewById(R.id.editTextName);
        password =findViewById(R.id.editTextPassword);
        forgetPassword = findViewById(R.id.textForgetPassword);
        newAccount = findViewById(R.id.textCreatenewAccount);
        facebook = findViewById(R.id.facebook);
        google = findViewById(R.id.google);
        twitter = findViewById(R.id.twitter);


    }


}
