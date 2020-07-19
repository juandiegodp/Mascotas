package com.juandiegodp.tareamascotas.pojo;

public class Perro {
    int fotoPerro;
    String nombrePerro;
    int voto;

    public Perro(int fotoPerro, String nombrePerro, int voto ){
        this.fotoPerro = fotoPerro;
        this.nombrePerro = nombrePerro;
        this.voto = voto;

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
}
