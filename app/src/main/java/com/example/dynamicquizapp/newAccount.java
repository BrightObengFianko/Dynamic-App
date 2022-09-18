package com.example.dynamicquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class newAccount extends AppCompatActivity {
    private static final String TAG ="newAccount";
    private TextView txtName , txtEmail,txtPassword,txtconfirm;
    private Button btnAgree;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);
        initiation();
        btnAgree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initRegister();
            }
        });

    }

    private void initRegister() {
        Log.d(TAG, "initRegister: Started");
        if(ValidateData()){
            if(checkBox.isChecked()){
                startActivity(new Intent(newAccount.this,MainActivity1.class));

            }else{
                Toast.makeText(this, "You to agree to the licence agreement", Toast.LENGTH_SHORT).show();
            }

        }

    }

    private boolean ValidateData() {
        Log.d(TAG, "ValidateData: Started");

        if(TextUtils.isEmpty(txtName.getText().toString().trim())) {
            txtName.setError("Please enter your fullName");
            return false;
        }
        if(TextUtils.isEmpty(txtEmail.getText().toString().trim())){
            txtEmail.setError("Please enter email");
            return false;
        }
        if(TextUtils.isEmpty(txtPassword.getText().toString().trim())){
            txtPassword.setError("please enter password ");
            return false;
        }
        if(TextUtils.isEmpty(txtconfirm.getText().toString().trim())){
            txtconfirm.setError("please confirm your password");
            return false;
        }
        if(!txtPassword.getText().toString().equals(txtconfirm.getText().toString())){
            Toast.makeText(this, "Password doesn't match", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void initiation() {
        Log.d(TAG, "initiation: Started");
        txtName = findViewById(R.id.textnewAccountName);
        txtEmail = findViewById(R.id.txtnewEmail);
        txtPassword = findViewById(R.id.newPassword);
        txtconfirm = findViewById(R.id.newPasswordConfirm);
        checkBox = findViewById(R.id.newAgree);
        btnAgree = findViewById(R.id.newAgreee);
    }
}