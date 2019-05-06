package com.example.guerreroapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class menu extends AppCompatActivity {

    private DrawerLayout drawer;
    private ActionBarDrawerToggle drawerbutton;
    private TextView nombre;
    private TextView usuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        drawer = (DrawerLayout) findViewById(R.id.drawer);
        drawerbutton = new ActionBarDrawerToggle(this, drawer, R.string.abrir, R.string.cerrar);
        drawer.addDrawerListener(drawerbutton);
        drawerbutton.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (drawerbutton.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
