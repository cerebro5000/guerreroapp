package com.example.guerreroapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guerreroapp.R;
import com.example.guerreroapp.adaptadores.Lugaresadapter;
import com.example.guerreroapp.adaptadores.Restaurantesadapter;
import com.example.guerreroapp.clases.Lugares;
import com.example.guerreroapp.clases.Restaurantes;

import java.util.ArrayList;

public class res_menu extends Fragment {
    private ArrayList<Restaurantes> res;
    private RecyclerView reclicler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        res = new ArrayList<>();
        llenarlugares(res);

        View v = inflater.inflate(R.layout.fragment_restaurante_menu, container,false);
        reclicler = v.findViewById(R.id.recyclerrestaurante);
        reclicler.setLayoutManager(new LinearLayoutManager(getContext()));
        Restaurantesadapter adapter = new Restaurantesadapter(res);
        reclicler.setLayoutManager(new LinearLayoutManager(getContext()));
        reclicler.setAdapter(adapter);

        return v;
    }

    private void llenarlugares(ArrayList<Restaurantes> lugares) {
        lugares.add(new Restaurantes("Perla Negra","Costera Antelmo Ventura, S/N ", 33142157,R.drawable.playa_ventura));

    }
}
