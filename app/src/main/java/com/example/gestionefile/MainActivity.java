package com.example.gestionefile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLeggi;
        Button btnInserisci;
        EditText edtInserisciFile;
        TextView txtVisualizzaFile;
        Gestore gf;

        btnLeggi =findViewById(R.id.leggi);
        btnInserisci=findViewById(R.id.inserisci);
        edtInserisciFile=findViewById(R.id.editTextFile);
        txtVisualizzaFile=findViewById(R.id.textViewFile);

        String nomeFile = edtInserisciFile.getText().toString();
        gf = new Gestore();
        btnLeggi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gf.leggiFile(nomeFile, getApplicationContext());
            }
        });

        btnInserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gf.scriviFile(nomeFile, getApplicationContext());
            }
        });
    }
}