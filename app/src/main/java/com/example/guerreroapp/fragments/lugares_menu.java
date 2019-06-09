package com.example.guerreroapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.guerreroapp.R;
import com.example.guerreroapp.adaptadores.Hotelesadapter;
import com.example.guerreroapp.adaptadores.Lugaresadapter;
import com.example.guerreroapp.clases.Lugares;

import java.util.ArrayList;


public class lugares_menu extends Fragment {

    private ArrayList<Lugares> lugares;
    private RecyclerView reclicler;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        lugares = new ArrayList<Lugares>();
        llenarlugares(lugares);

        final View v = inflater.inflate(R.layout.fragment_lugares_menu, container,false);
        reclicler = v.findViewById(R.id.recyclerlugares);
        reclicler.setLayoutManager(new LinearLayoutManager(getContext()));
        Lugaresadapter adapter = new Lugaresadapter(lugares);
        reclicler.setLayoutManager(new LinearLayoutManager(getContext()));
        reclicler.setAdapter(adapter);
        reclicler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return v;
    }

    private void llenarlugares(ArrayList<Lugares> lugares) {
        lugares.add(new Lugares("Casa de Piedra", "casa de piedra playa bonita", R.drawable.casa_de_piedra, 16.5361107, -98.899232));
        lugares.add(new Lugares("Playa Ventura","playa ventura",R.drawable.playa_ventura, 16.546200, -98.932295));

    }
}
