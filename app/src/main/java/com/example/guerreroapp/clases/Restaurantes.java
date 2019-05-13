package com.example.guerreroapp.clases;

import java.util.ArrayList;

public class Restaurantes {
    private String nomnbre;
    private String direccion;
    private int telefono;

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
