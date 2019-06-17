package com.example.guerreroapp.adaptadores;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.guerreroapp.R;
import com.example.guerreroapp.clases.Hoteles;
import com.example.guerreroapp.menuprincipal;

import java.util.ArrayList;

public class Hotelesadapter extends RecyclerView.Adapter<Hotelesadapter.ViewHolderHoteles>
        implements View.OnClickListener{

    public ArrayList<Hoteles> lugares;
    private View.OnClickListener listener;

    public Hotelesadapter(ArrayList<Hoteles> lugares) {
        this.lugares = lugares;
    }

    @NonNull
    @Override
    public ViewHolderHoteles onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_hoteles,
                parent,false);
        view.setOnClickListener(this);
        return new ViewHolderHoteles(view, lugares.get(i));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHoteles holder, int i) {

        holder.nombre.setText(lugares.get(i).getNomnbre());
        holder.descaipcion.setText(lugares.get(i).getDireccion()+ " "+ lugares.get(i).toString());
        holder.imagen.setImageResource(lugares.get(i).getImagen());

    }

    @Override
    public int getItemCount() {
        return this.lugares.size();
    }


    public void setListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if(listener != null)
        {
            listener.onClick(view);
        }
    }

    public class ViewHolderHoteles extends RecyclerView.ViewHolder{
        TextView nombre;
        TextView descaipcion;
        ImageView imagen;
        Hoteles hotel;
        LinearLayout vista;
        Activity activity;
        public ViewHolderHoteles(@NonNull View itemView, @NonNull Hoteles hotel) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textonombrehotel);
            descaipcion = itemView.findViewById(R.id.textodescripcionhotel);
            imagen = itemView.findViewById(R.id.idimagenhotel);
            this.hotel = hotel;
            vista = itemView.findViewById(R.id.eventoshoteles);
        }

    }
}
