package com.example.guerreroapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*varables que se usaran dentro del activity
    *@param etusu
    * sera usado para saber el edittext del usuario
    *@param etcon
    * sera usado para saber el edittext de la contraseño
    */
    private EditText etusu;
    private EditText etcon;

    //metodo de creacion del activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusu = findViewById(R.id.texnom);
        etcon = findViewById(R.id.texcon);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        if( preferences.getInt("autenticado", 0) == 1){
            Intent i = new Intent(this , menu.class);
            startActivity(i);
            finish();
        }
    }
    //metopdo del boton login
    public void login(View view){
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        Toast toast;
        String usuario =  preferences.getString("cuenta", "");
        String contrasena  = preferences.getString("contraseña","");
        if (!usuario.equals("") && !contrasena.equals("")){
            int val1 = 1;
            int val2 = 1;
            if ( !usuario.equals(etusu.getText().toString())){
                toast = Toast.makeText(this, R.string.nousuario, Toast.LENGTH_SHORT);
                toast.show();
                val1 = 0;
            }
            if ( !contrasena.equals(etcon.getText().toString())){
                toast = Toast.makeText(this, R.string.nocontrasena, Toast.LENGTH_SHORT);
                toast.show();
                val2 = 0;
            }
            if (val1 == 1 && val2 == 1){
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("autenticado", 1);
                editor.commit();
                Intent i = new Intent(this, menu.class);
                startActivity(i);
                finish();
            }
        }else{
            toast = Toast.makeText(this, R.string.vacio, Toast.LENGTH_SHORT);
            toast.show();

        }

    }

    public void singin(View view){
        Intent i = new Intent(this, Registro.class);
        startActivity(i);
    }
}
