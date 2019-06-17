package com.example.guerreroapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    /*variables usadas
    *@param edtnom
    * sera usada para el nombre del usuario
    *@param edtape
    * sera usada para el apellido del usuario
    *@param edtcta
    *  sera usada para el nombre de la cuenta con la que usara para registrarse
    *@ param edtpass1
    * sera usada para la contraseña de la cuenta
    *@param edtpass2
    * sera usada para la verificacion de la contraseña usada en la cuenta
    */
    private EditText edtnom;
    private EditText edtape;
    private EditText edtcta;
    private EditText edtpass1;
    private EditText edtpass2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        edtnom =  findViewById(R.id.edtnombre);
        edtape =  findViewById(R.id.edtape);
        edtcta =  findViewById(R.id.edtcta);
        edtpass1 =  findViewById(R.id.edtpass1);
        edtpass2 =  findViewById(R.id.edtpass2);
    }

    public void guardar(View view) {
        SharedPreferences preferences = getSharedPreferences("datos", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        if (edtpass1.getText().toString().equals(edtpass2.getText().toString())){
            editor.putInt("autenticado", 0);
            editor.putString("nombre", edtnom.getText().toString());
            editor.putString("apellido", edtape.getText().toString());
            editor.putString("cuenta", edtcta.getText().toString());
            editor.putString("contraseña", edtpass1.getText().toString());
            editor.commit();
            Toast toast = Toast.makeText(this, R.string.creadacta, Toast.LENGTH_LONG);
            toast.show();
            finish();

        }
        else{
            Toast toast = Toast.makeText(this, R.string.nocontrasena, Toast.LENGTH_SHORT);
            toast.show();

        }



    }


}
