package com.example.johnny.a8_segundoactivitylistaobjetos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    TextView lblDato;

    private ArrayList<ClsNumero> listaDatos = new ArrayList<ClsNumero>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lblDato = (TextView) findViewById(R.id.lblDatos);

        Bundle bundle = getIntent().getExtras();

        listaDatos = (ArrayList<ClsNumero>) bundle.getSerializable("datos");

        lblDato.setText(leerDatos(listaDatos));
    }


    public String leerDatos(ArrayList<ClsNumero> lista){

        String val="";

        for(int x=0;x<lista.size();x++){
            val=val+lista.get(x).getNum()+" ";
        }

        return val;
    }
}
