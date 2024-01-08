package com.example.demo.models;

public class Models {

    private int ID;
    private String Nombre;
    private String Apellido;
    private String Pais;
    private int Telefono;

    public Models() {
    }

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getPais() {
        return this.Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getTelefono() {
        return this.Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

}
