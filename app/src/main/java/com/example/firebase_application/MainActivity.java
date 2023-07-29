package com.example.firebase_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     Handler h =  new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(a);
                finish();
            }
        },2000);

    }
}