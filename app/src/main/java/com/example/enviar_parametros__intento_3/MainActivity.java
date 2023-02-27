package com.example.enviar_parametros__intento_3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText et1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et1 = (EditText)findViewById(R.id.et1);



    }

    //Método para el botón enviar
    public void Enviar(View view){
        Intent i = new Intent(this, MainActivity2.class);
        i.putExtra("dato", et1.getText().toString());
        startActivity(i);
    }



}