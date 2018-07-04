package com.example.knootankumar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        final EditText id ;
        final EditText  Password;
        final Button buttonRegLogin = (Button) findViewById(R.id.bRegLogin);
        final TextView  Forgotpassword = (TextView) findViewById(R.id.tvRegLink);

        buttonRegLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText id = (EditText) findViewById(R.id.etRegAcc);
                 EditText  Password = (EditText) findViewById(R.id.etRegPass);
                 Intent boss=new Intent(Main2Activity.this , Main3Activity.class);

                 String Id = id.getText().toString();
                 String Pass = Password.getText().toString();

                if (Id.equals("Srinivas143") && Pass.equals("12345")) {

                    boss.putExtra("ID",Id);
                    Toast.makeText(Main2Activity.this, "Successfully Login to LBF", Toast.LENGTH_SHORT).show();
                    startActivity(boss);

                } else if (Id.equals("Battu143") && Pass.equals("12345")) {

                    boss.putExtra("ID",Id);
                    Toast.makeText(Main2Activity.this, "Successfully Login to D-cafe", Toast.LENGTH_SHORT).show();
                    startActivity(boss);
                } else {
                    Toast.makeText(getApplication(), "Enter Correct details", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}

