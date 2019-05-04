package com.example.guerreroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
}
