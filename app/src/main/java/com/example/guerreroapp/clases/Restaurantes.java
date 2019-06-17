package com.example.guerreroapp.clases;

import java.util.ArrayList;

public class Restaurantes {
    private String nomnbre;
    private String direccion;
    private int telefono;
    private int imagenres;

    public Restaurantes(String nomnbre, String direccion, int telefono, int imagenres) {
        this.nomnbre = nomnbre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.imagenres = imagenres;
    }

    public int getImagenres() {
        return imagenres;
    }

    public void setImagenres(int imagenres) {
        this.imagenres = imagenres;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNomnbre() {
        return nomnbre;
    }


    public void setNomnbre(String nomnbre) {
        this.nomnbre = nomnbre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
