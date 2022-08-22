package com.example.task_two;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText txt , txt1, txt2 , txt3 ,txt4 ,txt5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.home_button);
        txt=findViewById(R.id.full_name);
        txt5=findViewById(R.id.name_father);
        txt1=findViewById(R.id.name_mother);
        txt2=findViewById(R.id.address_name);
        txt3=findViewById(R.id.number);
        txt4=findViewById(R.id.number_citizen);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , DetailsActivity.class);

                String fullName = txt.getText().toString();
                String fatherName = txt1.getText().toString();
                String motherName = txt1.getText().toString();
                String adName = txt2.getText().toString();
                String mobNumber = txt3.getText().toString();
                String citizenName =txt4.getText().toString();

                if(TextUtils.isEmpty(fullName) ||TextUtils.isEmpty(fatherName)|| TextUtils.isEmpty(motherName) || TextUtils.isEmpty(adName) || TextUtils.isEmpty(mobNumber) || TextUtils.isEmpty(citizenName))
                {
                    Toast.makeText(MainActivity.this, "***Please fill all fields*** ", Toast.LENGTH_SHORT).show();
                }
                else{

                    intent.putExtra("full_name",fullName);
                    intent.putExtra("father_name" , fatherName );
                    intent.putExtra("mother_name" , motherName );
                    intent.putExtra("address" , adName );
                    intent.putExtra("mobile_number" , mobNumber );
                    intent.putExtra("citizenship" , citizenName );

                    startActivity(intent);


                }


            }
        });
    }
}