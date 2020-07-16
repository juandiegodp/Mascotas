package com.juandiegodp.tareamascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        //Mi ActionBar2
        Toolbar miActionBar2 = (Toolbar) findViewById(R.id.miActionBar2);
        setSupportActionBar(miActionBar2);

        //Casteo
        listaPerros =(RecyclerView) findViewById(R.id.rvPerros);

        LinearLayoutManager llm =new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPerros.setLayoutManager(llm);
        Dataset();
        inicializarAdaptador();


    }

    public void inicializarAdaptador(){
        PerroAdaptador adaptador = new PerroAdaptador(perros, this);
        listaPerros.setAdapter(adaptador);
    }
    //Defino mi dataset para generar el Arraylist
    private void Dataset(){
        perros = new ArrayList<Perro>();
        perros.add(new Perro(R.drawable.perro3, "Perruncho3", "7"));
        perros.add(new Perro(R.drawable.perro7, "Perruncho7","6"));
        perros.add(new Perro(R.drawable.perro6, "Perruncho6", "5"));
        perros.add(new Perro(R.drawable.perro4, "Perruncho4", "4"));
        perros.add(new Perro(R.drawable.perro2, "Perruncho2","3"));


    }


    public void irActivityMain(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}