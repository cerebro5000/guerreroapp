package com.example.guerreroapp.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guerreroapp.R;
import com.example.guerreroapp.clases.Hoteles;
import com.example.guerreroapp.clases.Lugares;

import java.util.ArrayList;

public class Hotelesadapter extends RecyclerView.Adapter<Hotelesadapter.ViewHolderHolderHoteles> {

    ArrayList<Hoteles> lugares;

    public Hotelesadapter(ArrayList<Hoteles> lugares) {
        this.lugares = lugares;
    }

    @NonNull
    @Override
    public ViewHolderHolderHoteles onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_hoteles, null,false);
        return new ViewHolderHolderHoteles(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHolderHoteles holder, int i) {
        holder.nombre.setText(lugares.get(i).getNomnbre());
        holder.descaipcion.setText(lugares.get(i).getDireccion()+ " "+ lugares.get(i).toString());
        holder.imagen.setImageResource(lugares.get(i).getImagen());

    }

    @Override
    public int getItemCount() {
        return this.lugares.size();
    }

    public class ViewHolderHolderHoteles extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView descaipcion;
        ImageView imagen;
        public ViewHolderHolderHoteles(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textonombrehotel);
            descaipcion = itemView.findViewById(R.id.textodescripcionhotel);
            imagen = itemView.findViewById(R.id.idimagenhotel);

        }

    }
}
