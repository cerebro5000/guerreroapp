package com.example.guerreroapp.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guerreroapp.R;
import com.example.guerreroapp.clases.Lugares;
import com.example.guerreroapp.clases.Restaurantes;

import java.util.ArrayList;

public class Restaurantesadapter extends RecyclerView.Adapter<Restaurantesadapter.ViewHolderHolderRestaurantes> {

    ArrayList<Restaurantes> restaurante;

    public Restaurantesadapter(ArrayList<Restaurantes> restaurante) {
        this.restaurante = restaurante;
    }

    @NonNull
    @Override
    public ViewHolderHolderRestaurantes onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_restaurantes, null,false);
        return new ViewHolderHolderRestaurantes(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHolderRestaurantes holder, int i) {
        holder.nombre.setText(restaurante.get(i).getNomnbre());
        holder.descripcion.setText(restaurante.get(i).getDireccion());
        holder.imagen.setImageResource(restaurante.get(i).getImagenres());

    }

    @Override
    public int getItemCount() {
        return this.restaurante.size();
    }

    public class ViewHolderHolderRestaurantes extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView descripcion;
        ImageView imagen;
        public ViewHolderHolderRestaurantes(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textonombrerestaurante);
            descripcion = itemView.findViewById(R.id.textodescripcionrestaurante);
            imagen = itemView.findViewById(R.id.idimagenrestaurante);


        }
    }
}
