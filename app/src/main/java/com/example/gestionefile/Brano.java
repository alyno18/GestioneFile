package com.example.gestionefile;

public class Brano {
    private String titolo;
    private String genere;

    public String getTitolo() {
        return titolo;
    }

    public String getGenere() {
        return genere;
    }

    public Brano(String titolo, String genere){
        this.titolo = titolo;
        this.genere = genere;
    }
}
