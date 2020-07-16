package com.juandiegodp.tareamascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Perro> perros;
    private RecyclerView listaPerros;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Cargo el valor de tvNum a votop


        //Mi ActionBar
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

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
        perros.add(new Perro(R.drawable.perro1, "Perruncho1", "2"));
        perros.add(new Perro(R.drawable.perro2, "Perruncho2", "3"));
        perros.add(new Perro(R.drawable.perro3, "Perruncho3","7"));
        perros.add(new Perro(R.drawable.perro4, "Perruncho4", "4"));
        perros.add(new Perro(R.drawable.perro5, "Perruncho5", "1"));
        perros.add(new Perro(R.drawable.perro6, "Perruncho6", "5"));
        perros.add(new Perro(R.drawable.perro7, "Perruncho7", "6"));

    }

    //Uso la Estrella para pasar a la segunda activity
    public void irSengundaActivity(View v){
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);

    }

}