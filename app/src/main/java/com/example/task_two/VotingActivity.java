package com.example.task_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VotingActivity extends AppCompatActivity {
    TextView txt;
    Button bck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);
        txt=findViewById(R.id.return_home);
        bck = findViewById(R.id.back);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(VotingActivity.this , MainActivity.class);
                startActivity(i);
            }
        });
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VotingActivity.this , DetailsActivity.class);
                startActivity(intent);
            }
        });


}}