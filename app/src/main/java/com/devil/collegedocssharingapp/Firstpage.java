package com.devil.collegedocssharingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Firstpage extends AppCompatActivity {
    EditText edtusername,edtpassword;
    Button signinbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        edtusername=(EditText)findViewById(R.id.editText6);
        edtpassword=(EditText)findViewById(R.id.editText7);
        signinbutton=(Button)findViewById(R.id.button);
        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Firstpage.this,Homepage.class);
            }
        });
    }
}
