package com.example.guerreroapp.clases;

import java.util.ArrayList;

public class Hoteles {
    private String nomnbre;
    private String direccion;
    private int telefono;
    private int imagen;

    @Override
    public String toString() {
        return String.valueOf(telefono) ;
    }

    public Hoteles() {

    }

    public Hoteles(String nomnbre, String direccion, int telefono, int imagen) {
        this.nomnbre = nomnbre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.imagen = imagen;
    }

    public Hoteles(String nomnbre, String direccion, int telefono, int imagen, ArrayList<Servicios> servicios) {
        this.nomnbre = nomnbre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.imagen = imagen;
        this.servicios = servicios;
    }

    private ArrayList<Servicios> servicios;

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
    public ArrayList<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicios> servicios) {
        this.servicios = servicios;
    }

    public void addServicios(Servicios servicio){
        this.servicios.add(servicio);
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
