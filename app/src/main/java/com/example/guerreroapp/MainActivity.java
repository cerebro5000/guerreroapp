package com.example.guerreroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etusu;
    private EditText etcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusu = (EditText) findViewById(R.id.texnom);
        etcon = (EditText) findViewById(R.id.texcon);

    }

    public void login(View view){

    }

    public void singin(View view){

    }
}
