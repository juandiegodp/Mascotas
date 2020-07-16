package com.juandiegodp.tareamascotas;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PerroAdaptador extends RecyclerView.Adapter<PerroAdaptador.PerroViewHolder> {

    Activity activity;

    //Metodo constructor de PerroAdaptador
    public PerroAdaptador(ArrayList<Perro> perros, Activity activity){
        this.perros = perros;
        this.activity = activity;
    }

    // Voy a pasarle los datos a cada elemento del VIEWHOLDER
    ArrayList<Perro> perros;

    //Inflar el layout y lo pasará al viewholder para que obtenga los views
    @NonNull
    @Override
    public PerroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perros, parent, false);

        return new PerroViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    public void onBindViewHolder(PerroViewHolder perroViewHolder, int position){
        final Perro perro = perros.get(position);
        perroViewHolder.ivFoto.setImageResource(perro.getFotoPerro());
        perroViewHolder.tvNombrePerro.setText(perro.getNombrePerro());
        perroViewHolder.tvVoto.setText(perro.getVoto());

    }



    @Override
    public int getItemCount(){
        return perros.size();
    }

    //Mi ViewHolder
    public static class PerroViewHolder extends RecyclerView.ViewHolder{

        //declarar todos los views
        CardView cvPerros;
        TextView tvNombrePerro;
        ImageView ivFoto;
        TextView tvVoto;

        public PerroViewHolder(View itemview){
            super(itemview);
            cvPerros = (CardView)itemView.findViewById(R.id.cvPerros);
            tvNombrePerro = (TextView)itemView.findViewById(R.id.tvNombrePerro);
            ivFoto = (ImageView)itemView.findViewById(R.id.ivFoto);
            tvVoto = (TextView)itemview.findViewById(R.id.tvNum);



        }

    }
}
