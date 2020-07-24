package com.juandiegodp.tareamascotas.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.juandiegodp.tareamascotas.pojo.ConstructorPerros;
import com.juandiegodp.tareamascotas.pojo.Perro;
import com.juandiegodp.tareamascotas.R;

import java.util.ArrayList;

public class PerroAdaptador extends RecyclerView.Adapter<PerroAdaptador.PerroViewHolder> {

    ArrayList<Perro> perros;
    Activity activity;

    public PerroAdaptador(ArrayList<Perro> perros, Activity activity){
        this.perros = perros;
        this.activity = activity;
    }

    @NonNull
    @Override
    public PerroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perros, parent, false);
        return new PerroViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    public void onBindViewHolder(final PerroViewHolder perroViewHolder, int position){
        final Perro perro = perros.get(position);
        perroViewHolder.ivFoto.setImageResource(perro.getFotoPerro());
        perroViewHolder.tvNombrePerro.setText(perro.getNombrePerro());
        perroViewHolder.tvVoto.setText(String.valueOf(perro.getVoto()));

        perroViewHolder.btnVoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(view.getContext(), "Diste Like a " + perroViewHolder.tvNombrePerro.getText(), Toast.LENGTH_SHORT).show();

                ConstructorPerros constructorPerros = new ConstructorPerros(activity);
                constructorPerros.darLikePerro(perro);
                perroViewHolder.tvVoto.setText(String.valueOf(constructorPerros.obtenerLikesPerro(perro)));

                int ultima = constructorPerros.obtenerUltimaPositionRV(perro);

                if (ultima ==0){
                    constructorPerros.agregar1Position(perro);
                }
                else {
                    if (constructorPerros.obtenerIdUltimaPosition(perro) != perro.getId()){
                        constructorPerros.agregar1Position(perro);
                    }
                }


            }
        });

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
        ImageButton btnVoto;

        public PerroViewHolder(View itemview){
            super(itemview);
            cvPerros = (CardView)itemView.findViewById(R.id.cvPerros);

            tvNombrePerro = (TextView)itemView.findViewById(R.id.tvNombrePerro);
            ivFoto = (ImageView)itemView.findViewById(R.id.ivFoto);
            tvVoto = (TextView)itemview.findViewById(R.id.tvNum);
            btnVoto  = (ImageButton) itemView.findViewById(R.id.ivHuesoBlanco);



        }

    }
}
