package com.juandiegodp.tareamascotas.pojo;

public class Perro {
    private int id;
    private int fotoPerro;
    private String nombrePerro;
    private int voto;
    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Perro(int fotoPerro, String nombrePerro, int voto ){
        this.fotoPerro = fotoPerro;
        this.nombrePerro = nombrePerro;
        this.voto = voto;
        this.position = position;

    }

    public Perro() {

    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public int getFotoPerro() {
        return fotoPerro;
    }

    public void setFotoPerro(int fotoPerro) {
        this.fotoPerro = fotoPerro;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
