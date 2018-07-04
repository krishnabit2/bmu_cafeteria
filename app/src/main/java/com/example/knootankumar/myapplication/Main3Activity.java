package com.example.knootankumar.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    String Id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i=getIntent();
        Id = i.getStringExtra("ID");
    }



    public void Boost(View view)

    {
        Button b=(Button)view;
        String text=b.getText().toString();
        Intent sun = new Intent(Main3Activity.this, Main4Activity.class);
        sun.putExtra("ID", Id);
        sun.putExtra("timing",text);
        startActivity(sun);
    }

}
