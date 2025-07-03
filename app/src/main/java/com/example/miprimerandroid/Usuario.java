package com.example.miprimerandroid;

public class Usuario {
    int id;

    String nombre;

    String mail;

    public Usuario(int id, String nombre, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
