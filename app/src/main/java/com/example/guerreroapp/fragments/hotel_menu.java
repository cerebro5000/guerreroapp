package com.example.guerreroapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.guerreroapp.R;
import com.example.guerreroapp.adaptadores.Hotelesadapter;
import com.example.guerreroapp.clases.Hoteles;

import java.util.ArrayList;

public class hotel_menu extends Fragment {

    RecyclerView reciclerhotel;
    ArrayList<Hoteles> listaholeles;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel_menu, container, false);
        listaholeles = new ArrayList<>();
        llenar(listaholeles);
        reciclerhotel = view.findViewById(R.id.recilcerhoteles);
        Hotelesadapter adapter = new Hotelesadapter(listaholeles);
        reciclerhotel.setLayoutManager(new LinearLayoutManager(getContext()));
        reciclerhotel.setAdapter(adapter);

        return view;
    }
    public void llenar(ArrayList hoteles){
        hoteles.add(new Hoteles("El Tulipan","direccion", 33142157,R.drawable.playa_ventura)) ;
    }
}
