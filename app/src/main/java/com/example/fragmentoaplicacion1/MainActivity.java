package com.example.fragmentoaplicacion1;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Fragmento1 frag;
    TextView textoAPasar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoAPasar=findViewById(R.id.textoIntroducido);
        frag= (Fragmento1)
                getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);

    }

    public void setMensaje(View v){
        frag.setTexto(textoAPasar.getText().toString());
        frag.getView().setBackgroundColor(Color.MAGENTA);

    }

}