package com.juandiegodp.tareamascotas.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juandiegodp.tareamascotas.pojo.Perro;
import com.juandiegodp.tareamascotas.Adapter.PerroAdaptador;
import com.juandiegodp.tareamascotas.R;
import com.juandiegodp.tareamascotas.presentador.IRecyclerViewFragmentPresenter;
import com.juandiegodp.tareamascotas.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;


public class fragment_recycler_view extends Fragment implements IRecyclerViewFragmentView {
    private ArrayList<Perro> perros;
    private RecyclerView listaPerros;
    private IRecyclerViewFragmentPresenter presenter;



     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v=inflater.inflate(R.layout.fragment_recycler_view, container, false);

         listaPerros =(RecyclerView) v.findViewById(R.id.rvPerros);
         presenter = new RecyclerViewFragmentPresenter(this, getContext());
         return v;
    }

    @Override
    public void generarLinearLayoutVertical() {
         LinearLayoutManager llm =new LinearLayoutManager(getActivity());
         llm.setOrientation(LinearLayoutManager.VERTICAL);
         listaPerros.setLayoutManager(llm);


    }

    @Override
    public PerroAdaptador crearAdaptador(ArrayList<Perro> perros) {

         PerroAdaptador adaptador = new PerroAdaptador(perros, getActivity());
         return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(PerroAdaptador adaptador) {
        listaPerros.setAdapter(adaptador);

    }
}