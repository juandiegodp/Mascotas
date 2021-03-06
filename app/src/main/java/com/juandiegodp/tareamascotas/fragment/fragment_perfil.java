package com.juandiegodp.tareamascotas.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juandiegodp.tareamascotas.Adapter.PerfilAdaptador;
import com.juandiegodp.tareamascotas.R;
import com.juandiegodp.tareamascotas.pojo.perfil;

import java.util.ArrayList;


public class fragment_perfil extends Fragment {

    ArrayList<perfil> datos;
    private RecyclerView listaPerfil;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        // Inflate the layout for this fragment
        listaPerfil =(RecyclerView) v.findViewById(R.id.RecyclerView_gridPerfil);

        GridLayoutManager glm =new GridLayoutManager(getActivity(),3);
        glm.setOrientation(GridLayoutManager.VERTICAL);

        listaPerfil.setLayoutManager(glm);
        Dataset();
        inicializarAdaptador();
        return v;
    }
    public void inicializarAdaptador(){
        PerfilAdaptador adaptador = new PerfilAdaptador(datos, getActivity());
        listaPerfil.setAdapter(adaptador);
    }
    //Defino mi dataset para generar el Arraylist
    private void Dataset(){
        datos = new ArrayList<perfil>();
        datos.add(new perfil(R.drawable.perro3, 8));
        datos.add(new perfil(R.drawable.perro3, 5));
        datos.add(new perfil(R.drawable.perro3, 1));
        datos.add(new perfil(R.drawable.perro3, 3));
        datos.add(new perfil(R.drawable.perro3, 6));
        datos.add(new perfil(R.drawable.perro3, 7));
        datos.add(new perfil(R.drawable.perro3, 4));

    }
}