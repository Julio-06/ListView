package com.example.listviewactivity.entidades;

public class Chat {
    private int Foto;
    private String Titulo;
    private String Descripcion;

    public Chat(int foto, String titulo, String descripcion){
        Foto = foto;
        Titulo=titulo;
        Descripcion=descripcion;
    }

    public int getFoto() {
        return Foto;
    }

    public void setFoto(int foto) {
        this.Foto = foto;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        this.Titulo = titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
}
