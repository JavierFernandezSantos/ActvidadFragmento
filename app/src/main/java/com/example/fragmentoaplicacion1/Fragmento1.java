package com.example.fragmentoaplicacion1;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class Fragmento1 extends Fragment {

    private TextView textoFragmento;
    public Fragmento1() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mySelf = inflater.inflate(R.layout.fragment_fragmento1,
                container, false);
        textoFragmento=mySelf.findViewById(R.id.textoFragmento);
        return mySelf;
    }

    public void setTexto(String mensaje){

        textoFragmento.setText(textoFragmento.getText().toString()+System.getProperty ("line.separator")+mensaje);
        this.getView().setBackgroundColor(Color.WHITE);
    }


}