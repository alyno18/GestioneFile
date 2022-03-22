package com.example.gestionefile;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

public class LeggiJSON {
    Gestore g = new Gestore();
    public Brano leggiFileJSON(Context c, int id) {
        //usare il metodo leggi file raw per leggere il file e ottenere la stringa
        //istanziare un oggetto JSONObject a partire dalla stringa
        //recuperare tutti i valori utilizzando getString oppure getInt
        //istanziare oggetto brano


        String jsonText = g.leggiFileRaw(c, id);
        Brano br = null;

        try {
            JSONObject jsonRoot = new JSONObject(jsonText);
            String titolo = jsonRoot.getString("titolo");
            String artista = jsonRoot.getString("artista");
            String durata = jsonRoot.getString("durata");
            br = new Brano(titolo, artista, durata);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return br;
    }
}
