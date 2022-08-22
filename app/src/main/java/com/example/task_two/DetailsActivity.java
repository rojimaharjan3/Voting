package com.example.task_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.security.PublicKey;

public class DetailsActivity extends AppCompatActivity {
    TextView full , f_name ,m_name , a_name , mob_num , citizen_name ,check;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        full= findViewById(R.id.full_name);
        f_name =findViewById(R.id.father_name_display);
        m_name=findViewById(R.id.mother_name_display);
        a_name = findViewById(R.id. address_display);
        mob_num = findViewById(R.id.mobile_display);
        citizen_name = findViewById(R.id.citizen_display);
        check=findViewById(R.id.voting_check);
        btn = findViewById(R.id.back_button);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this , VotingActivity.class);
                startActivity(i);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this , MainActivity.class);
                startActivity(i);
            }
        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("full_name");
        String fName = intent.getStringExtra("father_name");
        String mName = intent.getStringExtra("mother_name");
        String adName = intent.getStringExtra("address");
        String mobNum = intent.getStringExtra("mobile_number");
        String citizen = intent.getStringExtra("citizenship");

        full.setText(name);
        f_name.setText(fName);
        m_name.setText(mName);
        a_name.setText(adName);
        mob_num.setText(mobNum);
        citizen_name.setText(citizen);
    }
}