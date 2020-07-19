package com.juandiegodp.tareamascotas.pojo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.juandiegodp.tareamascotas.Adapter.PerroAdaptador;
import com.juandiegodp.tareamascotas.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ArrayList<Perro> perros;
    private RecyclerView listaPerros;

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Mi ActionBar
        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        //Casteo
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        /*
        listaPerros =(RecyclerView) findViewById(R.id.rvPerros);

        LinearLayoutManager llm =new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPerros.setLayoutManager(llm);
        Dataset();
        inicializarAdaptador();

         */
        if(toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }


    }

    public void inicializarAdaptador(){
        PerroAdaptador adaptador = new PerroAdaptador(perros, this);
        listaPerros.setAdapter(adaptador);
    }
    //Defino mi dataset para generar el Arraylist
    private void Dataset(){
        perros = new ArrayList<Perro>();
        perros.add(new Perro(R.drawable.perro1, "Perruncho1", 0));
        perros.add(new Perro(R.drawable.perro2, "Perruncho2", 0));
        perros.add(new Perro(R.drawable.perro3, "Perruncho3",0));
        perros.add(new Perro(R.drawable.perro4, "Perruncho4", 0));
        perros.add(new Perro(R.drawable.perro5, "Perruncho5", 0));
        perros.add(new Perro(R.drawable.perro6, "Perruncho6", 0));
        perros.add(new Perro(R.drawable.perro7, "Perruncho7", 0));

    }

    //Uso la Estrella para pasar a la segunda activity
    public void irSengundaActivity(View v){
        Intent intent = new Intent(this, MascotasFavoritas.class);
        startActivity(intent);

    }

    //Metodo que nos creara el MENU OPCIONES
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }
    //Controlar las opciones, segun se presionen

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.mContacto:
                Intent intent = new Intent(this, ActivityContacto.class);
                startActivity(intent);
                break;
            case R.id.mAcerca:
                Intent intent1 = new Intent(this, ActivityAcercade.class);
                startActivity(intent1);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}