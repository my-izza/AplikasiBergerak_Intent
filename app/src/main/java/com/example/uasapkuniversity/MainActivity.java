package com.example.uasapkuniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnstudent, btnteacher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnstudent = findViewById(R.id.btnstudent);
        btnteacher = findViewById(R.id.btnteacher);

        btnstudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent student = new Intent(MainActivity.this, StudentActivity.class);
                startActivity(student);
            }
        });

        btnteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Teacher = new Intent(MainActivity.this, TeacherActivity.class);
                startActivity(Teacher);
            }
        });
    }
}