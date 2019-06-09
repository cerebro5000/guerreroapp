package com.example.guerreroapp.adaptadores;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.guerreroapp.MapsLugaresActivity;
import com.example.guerreroapp.R;
import com.example.guerreroapp.clases.Lugares;

import java.util.ArrayList;

public class Lugaresadapter extends RecyclerView.Adapter<Lugaresadapter.ViewHolderHolderLugares> {

    ArrayList<Lugares> lugares;

    public Lugaresadapter(ArrayList<Lugares> lugares) {
        this.lugares = lugares;
    }

    @NonNull
    @Override
    public ViewHolderHolderLugares onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_lugares, null,false);
        return new ViewHolderHolderLugares(view, lugares.get(i));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHolderLugares holder, int i) {
        holder.nombre.setText(lugares.get(i).getNombre());
        holder.descaipcion.setText(lugares.get(i).getDescriptcion());
        holder.imagen.setImageResource(lugares.get(i).getImagen());
    }

    @Override
    public int getItemCount() {
        return this.lugares.size();
    }


    public class ViewHolderHolderLugares extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView nombre;
        TextView descaipcion;
        ImageView imagen;
        LinearLayout vista;
        Lugares lugar;
        public ViewHolderHolderLugares(@NonNull View itemView, Lugares Lugar) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textonombre);
            descaipcion = itemView.findViewById(R.id.textodescripcion);
            imagen = itemView.findViewById(R.id.idimagen);
            vista = itemView.findViewById(R.id.envetoslugares);
            this.lugar = Lugar;
            vista.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent i = new Intent(view.getContext(), MapsLugaresActivity.class);
            i.putExtra("cosdenadax", lugar.getLocationx());
            i.putExtra("cordenaday", lugar.getLocationy());
            view.getContext().startActivity(i);
        }
    }
}
