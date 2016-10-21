package com.example.oscar.exercici1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class activitatSecundaria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_secundaria);

        TextView mostrarNom = (TextView)findViewById(R.id.mostrarNom);
        TextView mostrarCognom = (TextView)findViewById(R.id.mostrarCognom);
        TextView mostrarEdat = (TextView)findViewById(R.id.mostrarEdat);
        TextView enviarDades = (TextView)findViewById(R.id.enviarDades);

        Bundle Bundle = getIntent().getExtras();

        Toast toast1 = Toast.makeText(getApplicationContext(),Bundle.getString("Opcio"),Toast.LENGTH_SHORT);
        
        mostrarNom.setText(Bundle.getString("Nom"));
        mostrarCognom.setText(Bundle.getString("Cognom"));
        mostrarEdat.setText(Bundle.getString("Edat"));
        enviarDades.setText(Bundle.getString("Opcio"));
        
        toast1.show();

    }
}
