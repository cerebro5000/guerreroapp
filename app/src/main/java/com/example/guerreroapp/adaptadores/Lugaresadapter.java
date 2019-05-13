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
        return new ViewHolderHolderLugares(view);
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

    public class ViewHolderHolderLugares extends RecyclerView.ViewHolder {
        TextView nombre;
        TextView descaipcion;
        ImageView imagen;
        public ViewHolderHolderLugares(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textonombre);
            descaipcion = itemView.findViewById(R.id.textodescripcion);
            imagen = itemView.findViewById(R.id.idimagen);

        }
    }
}
