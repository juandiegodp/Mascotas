package com.juandiegodp.tareamascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.juandiegodp.tareamascotas.Adapter.PerroAdaptador;
import com.juandiegodp.tareamascotas.fragment.IRecyclerViewFragmentView;
import com.juandiegodp.tareamascotas.pojo.Perro;
import com.juandiegodp.tareamascotas.presentador.IRecyclerViewFragmentPresenter;
import com.juandiegodp.tareamascotas.presentador.MascotasFavoritasPresenter;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity implements IRecyclerViewFragmentView {

    private RecyclerView listaPerros;
    private MascotasFavoritasPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        //Mi ActionBar2
        Toolbar miActionBar2 = (Toolbar) findViewById(R.id.miActionBar2);
        setSupportActionBar(miActionBar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Casteo
        listaPerros =(RecyclerView) findViewById(R.id.rvPerrosfav);

        presenter = new MascotasFavoritasPresenter(this,getBaseContext());

    }


    @Override
    public void generarLinearLayoutVertical() {
        LinearLayoutManager vista = new LinearLayoutManager(this);
        vista.setOrientation(LinearLayoutManager.VERTICAL);
        listaPerros.setLayoutManager(vista);
    }

    @Override
    public PerroAdaptador crearAdaptador(ArrayList<Perro> perros) {
        PerroAdaptador adaptador= new PerroAdaptador(perros, this);
        return  adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(PerroAdaptador adaptador) {
        listaPerros.setAdapter(adaptador);

    }


    //public void irActivityMain(View v){
    //    Intent intent = new Intent(this, MainActivity.class);
    //    startActivity(intent);

    //}
}