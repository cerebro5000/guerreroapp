package com.example.guerreroapp.fragments;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.guerreroapp.R;
import com.example.guerreroapp.adaptadores.Hotelesadapter;
import com.example.guerreroapp.clases.Hoteles;

import java.util.ArrayList;

public class hotel_menu extends Fragment {

    RecyclerView reciclerhotel;
    ArrayList<Hoteles> listaholeles;
    private static final int CALL_PERMISSION_REQUEST_CODE = 1234;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hotel_menu, container, false);
        listaholeles = new ArrayList<>();
        llenar(listaholeles);
        reciclerhotel = view.findViewById(R.id.recilcerhoteles);
        final Hotelesadapter adapter = new Hotelesadapter(listaholeles);
        adapter.setListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("clic","se ha hecho un clic en el objeto" + reciclerhotel.getChildAdapterPosition(view));
                Hoteles hotel = adapter.lugares.get(reciclerhotel.getChildAdapterPosition(view));
                call(hotel.getTelefonocadena());

            }
        });
        reciclerhotel.setLayoutManager(new LinearLayoutManager(getContext()));
        reciclerhotel.setAdapter(adapter);


        return view;
    }
    public void llenar(ArrayList hoteles){
        hoteles.add(new Hoteles("El Tulipan","direccion", 33142157,R.drawable.playa_ventura)) ;
    }

    void call(String telefono) {
        if (ContextCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            Intent callIntent = new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + telefono));
            getActivity().startActivity(callIntent);
        } else {
            ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.CALL_PHONE},
                    CALL_PERMISSION_REQUEST_CODE);
        }
    }


    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CALL_PERMISSION_REQUEST_CODE && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(getContext(), "Permission Granted", Toast.LENGTH_SHORT).show();
        }
    }
}
