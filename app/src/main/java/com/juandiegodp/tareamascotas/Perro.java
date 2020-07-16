package com.juandiegodp.tareamascotas;

public class Perro {
    int fotoPerro;
    String nombrePerro;
    String voto;

    public Perro(int fotoPerro, String nombrePerro, String voto ){
        this.fotoPerro = fotoPerro;
        this.nombrePerro = nombrePerro;
        this.voto = voto;

    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
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
