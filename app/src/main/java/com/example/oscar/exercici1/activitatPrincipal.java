package com.example.oscar.exercici1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class activitatPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_principal);
        // Declarem-instanciem els elements del layout
        Button b1 = (Button)findViewById(R.id.b1);
        final EditText introduirNom = (EditText)findViewById(R.id.txtNom);
        final EditText introduirCognom = (EditText)findViewById(R.id.txtCognom);
        final EditText introduirEdat = (EditText) findViewById(R.id.txtEdat);
        final CheckBox CheckBox = (CheckBox)findViewById(R.id.checkBox);

        // b1(el nostre button)
        // a la que fem clic en el button, carregarem en el Bundle, tots els elements, que em de passar a la segona pantalla
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Boolean opcioTriada = CheckBox.isChecked();

                //DEclarem el Bundle (Un carro per a portar els elements de pantalla a pantalla)
                Bundle Bundle = new Bundle();
                // Nom de l'element en el Bundle + Nom declarat de l'element
                Bundle.putString("Nom",introduirNom.getText().toString());
                Bundle.putString("Cognom", introduirCognom.getText().toString());
                Bundle.putString("Edat", introduirEdat.getText().toString());

                if(opcioTriada==true){
                    Bundle.putString("Opcio","Es permet publicar les dades");
                }
                else{
                    Bundle.putString("Opcio","No es permet publicar les dades");
                }

                Intent intencion = new Intent(activitatPrincipal.this,activitatSecundaria.class);
                intencion.putExtras(Bundle);
                startActivity(intencion);
            }

          /*  public void onCheckboxClicked (View s){

                Bundle Bundle1 = new Bundle();
                boolean checked = ((CheckBox) s).isChecked();

                if(checked == true){
                    Bundle1.putString("OpcioTriada","Les dades s'han enviat correctament".toString());
                }
                else{
                    Bundle1.putString("OpcioTriada","Les dades no s'han enviat".toString());
                }

                Intent intencion1 = new Intent(activitatPrincipal.this,activitatSecundaria.class);
                intencion1.putExtras(Bundle1);
                startActivity(intencion1);
            }*/
        });

    }
}
