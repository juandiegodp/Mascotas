package com.juandiegodp.tareamascotas.pojo;

public class perfil {
    int foto;
    int meGusta;

    public perfil(int foto, int meGusta){
        this.foto = foto;
        this.meGusta = meGusta;

    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(int meGusta) {
        this.meGusta = meGusta;
    }
}
