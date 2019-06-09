package com.example.guerreroapp.clases;

public class Lugares {
    private String nombre;
    private double locationx;
    private double locationy;
    private String descriptcion;
    private int imagen;

    public Lugares(String nombre, String descriptcion, int imagen) {
        this.nombre = nombre;
        this.descriptcion = descriptcion;
        this.imagen = imagen;
    }

    public Lugares(String nombre, String descriptcion, int imagen , double locationx, double locationy) {
        this.nombre = nombre;
        this.locationx = locationx;
        this.locationy = locationy;
        this.descriptcion = descriptcion;
        this.imagen = imagen;
    }

    public Lugares() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLocationx() {
        return locationx;
    }

    public void setLocationx(double locationx) {
        this.locationx = locationx;
    }

    public double getLocationy() {
        return locationy;
    }

    public void setLocationy(double locationy) {
        this.locationy = locationy;
    }

    public String getDescriptcion() {
        return descriptcion;
    }

    public void setDescriptcion(String descriptcion) {
        this.descriptcion = descriptcion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
