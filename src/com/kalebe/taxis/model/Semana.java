package com.kalebe.taxis.model;

import java.util.ArrayList;

public class Semana {
    private ArrayList<Bloco> listaBlocos;

    public Semana() {
        this.listaBlocos = new ArrayList<>();
    }

    public ArrayList<Bloco> getListaBlocos() {
        return listaBlocos;
    }

    public void setListaBlocos(ArrayList<Bloco> listaBlocos) {
        this.listaBlocos = listaBlocos;
    }

}
