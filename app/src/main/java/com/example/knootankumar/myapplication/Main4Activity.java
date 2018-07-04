package com.example.knootankumar.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main4Activity extends AppCompatActivity {

    EditText edit1,edit2,edit3;
    Button Add;
    String id,timing;
    DatabaseReference df , da;
    AlertDialog.Builder builder1;
    Food f;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        edit1=(EditText)findViewById(R.id.edt1);
        edit2=(EditText)findViewById(R.id.edt2);
        edit3=(EditText)findViewById(R.id.edt3);
        Add=(Button)findViewById(R.id.button3);
        Intent moon=getIntent();
        id=moon.getStringExtra("ID");
        timing=moon.getStringExtra("timing");
    }

    public void onClick(View v)
    {
        String item1 = edit1.getText().toString();
        String item2 = edit2.getText().toString();
        String special = edit3.getText().toString();

        if(id.equals("Srinivas143"))
        {
            df = FirebaseDatabase.getInstance().getReference("LBF");
            da=df.child(timing);
            String firebaseid = da.push().getKey();
            f = new Food(item1,item2,special);

            builder1 = new AlertDialog.Builder(Main4Activity.this);
            builder1.setMessage("Do you want to add the items ?");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            da.setValue(f);
                            edit1.setText("");
                            edit2.setText("");
                            edit3.setText("");
                            Toast.makeText(Main4Activity.this,"Your items are added sucessfully",Toast.LENGTH_LONG).show();
                        }
                    });

            builder1.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            edit1.setText("");
                            edit2.setText("");
                            edit3.setText("");
                            dialog.cancel();
                        }
                    });
            AlertDialog alert11 = builder1.create();
            alert11.show();
        }
        if(id.equals("Battu143"))
        {
            df = FirebaseDatabase.getInstance().getReference("Dcafe");
            da =df.child(timing);
            String firebaseid = df.push().getKey();
            f = new Food(item1,item2,special);

            builder1 = new AlertDialog.Builder(Main4Activity.this);
            builder1.setMessage("Do you want to add the items ?");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            da.setValue(f);
                            edit1.setText("");
                            edit2.setText("");
                            edit3.setText("");
                            Toast.makeText(Main4Activity.this,"Your items are added sucessfully",Toast.LENGTH_LONG).show();
                        }
                    });

            builder1.setNegativeButton(
                    "No",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                            edit1.setText("");
                            edit2.setText("");
                            edit3.setText("");
                        }
                    });
            AlertDialog alert11 = builder1.create();
            alert11.show();
        }



    }
}

