package com.example.dynamicquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity {
private Button startButton;
private TextView welcomeText ,textCodeUnit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        initiation();



        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity1.this,LastPage.class));
            }
        });
    }

    private void initiation() {
        startButton = findViewById(R.id.btnGetStarted);
        welcomeText = findViewById(R.id.txtwelcom);

        textCodeUnit = findViewById(R.id.textCodeUnit);

    }
}