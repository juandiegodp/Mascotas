package com.juandiegodp.tareamascotas.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.juandiegodp.tareamascotas.R;
import com.juandiegodp.tareamascotas.pojo.perfil;

import java.util.ArrayList;

public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder> {

    Activity activity;



    ArrayList<perfil> item;

    public PerfilAdaptador(ArrayList<perfil> item, Activity activity){
        this.item = item;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PerfilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil,parent, false);
        return new PerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PerfilViewHolder holder, int position) {
        final perfil  perfil = item.get(position);
        holder.foto.setImageResource(perfil.getFoto());
        holder.meGusta.setText(Integer.toString(perfil.getMeGusta()));

    }

    @Override
    public int getItemCount() {
        return item.size();
    }


    public static class PerfilViewHolder extends RecyclerView.ViewHolder{
        ImageView foto;
        TextView meGusta;
        CardView cvPerfil;

        public PerfilViewHolder(View itemView){
            super(itemView);
            cvPerfil = (CardView)itemView.findViewById(R.id.cvPerfilPerro);
            foto=(ImageView) itemView.findViewById(R.id.ivFotoPerfil);
            meGusta=(TextView) itemView.findViewById(R.id.tvLike2);
        }
    }
}

