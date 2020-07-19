package com.juandiegodp.tareamascotas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class fragment_recycler_view extends Fragment {
    ArrayList<Perro> perros;
    private RecyclerView listaPerros;



     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v=inflater.inflate(R.layout.fragment_recycler_view, container, false);
         listaPerros =(RecyclerView) v.findViewById(R.id.rvPerros);

         LinearLayoutManager llm =new LinearLayoutManager(getActivity());
         llm.setOrientation(LinearLayoutManager.VERTICAL);

         listaPerros.setLayoutManager(llm);
         Dataset();
         inicializarAdaptador();

         return v;
    }

    public void inicializarAdaptador(){
        PerroAdaptador adaptador = new PerroAdaptador(perros, getActivity());
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
}