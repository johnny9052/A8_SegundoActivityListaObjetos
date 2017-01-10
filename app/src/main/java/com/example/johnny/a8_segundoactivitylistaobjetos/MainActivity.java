package com.example.johnny.a8_segundoactivitylistaobjetos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txtIngreso;

    private ArrayList<ClsNumero> listaDatos = new ArrayList<ClsNumero>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtIngreso = (EditText) findViewById(R.id.txtIngreso);
    }


    public void almacenar(View view) {
        try {

            int num = Integer.parseInt(txtIngreso.getText().toString());
            ClsNumero objNum = new ClsNumero(num);

            listaDatos.add(objNum);

            txtIngreso.setText("");
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "Ingrese un dato valido", Toast.LENGTH_SHORT).show();
        }
    }

    public void enviar(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        intent.putExtra("datos", listaDatos);
        startActivity(intent);
    }
}
