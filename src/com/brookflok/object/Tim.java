package com.brookflok.object;

import java.util.ArrayList;

public class Tim {

    String ime;
    ArrayList<Napad> napad;
    ArrayList<Vezni> vezni;
    ArrayList<Odbrana> odbrana;
    Golman golman;
    int score=0;


    public Tim(String ime, ArrayList<Napad> napad, ArrayList<Vezni> vezni, ArrayList<Odbrana> odbrana, Golman golman) {
        this.ime = ime;
        this.napad = napad;
        this.vezni = vezni;
        this.odbrana = odbrana;
        this.golman = golman;
    }


  
}
