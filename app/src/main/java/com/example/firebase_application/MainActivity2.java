package com.example.firebase_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class MainActivity2 extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText editTextText = findViewById(R.id.editTextText);
        EditText editTextText2 = findViewById(R.id.editTextText2);
        EditText editTextText3 = findViewById(R.id.editTextText3);
        Button submit = findViewById(R.id.button1);
        Button check = findViewById(R.id.button2);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name,Roll,Email;
                Name = editTextText.getText().toString();
                Roll = editTextText2.getText().toString();
                Email = editTextText3.getText().toString();
                Map<String,Object> map = new HashMap<>();
                map.put("name",Name);
                map.put("roll_number",Roll);
                map.put("email",Email);

                db.collection("Users").document().set(map);
                Toast.makeText(MainActivity2.this, "Your profile have been created successfully", Toast.LENGTH_SHORT).show();
                editTextText.setText("");
                editTextText2.setText("");
                editTextText3.setText("");
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });


    }
}