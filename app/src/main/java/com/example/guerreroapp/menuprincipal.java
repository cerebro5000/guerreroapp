package com.example.guerreroapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ShareActionProvider;
import android.widget.TextView;

import com.example.guerreroapp.fragments.hotel_menu;
import com.example.guerreroapp.fragments.inicio_menu;
import com.example.guerreroapp.fragments.lugares_menu;
import com.example.guerreroapp.fragments.res_menu;

public class menuprincipal extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private TextView nombre;
    private TextView usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuprincipal);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        View header = navigationView.getHeaderView(0);
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        String snombre = preferences.getString("nombre", "") +" " + preferences.getString("apellido","");
        String susuario = preferences.getString("cuenta", "");


        nombre = header.findViewById(R.id.headernavnombre);
        usuario = header.findViewById(R.id.headernavusuario);
        nombre.setText(snombre);
        usuario.setText(susuario);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.abrir, R.string.cerrar);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.layaoutvista, new inicio_menu()).commit();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menuprincipal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getSupportFragmentManager();

        if (id == R.id.nav_inicio) {
            fragmentManager.beginTransaction().replace(R.id.layaoutvista, new inicio_menu()).commit();
        } else if (id == R.id.nav_restaurante) {
            fragmentManager.beginTransaction().replace(R.id.layaoutvista, new res_menu()).commit();
        } else if (id == R.id.nav_hotel) {
            fragmentManager.beginTransaction().replace(R.id.layaoutvista, new hotel_menu()).commit();
        } else if (id == R.id.nav_lugares) {
            fragmentManager.beginTransaction().replace(R.id.layaoutvista, new lugares_menu()).commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
