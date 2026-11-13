package com.kalebe.taxis.model;

public class Habito{

    private String nome;
    private Atributo atributo;

    public Habito(String nome){
        this.nome = nome;
    }

    public Habito(String nome, Atributo atributo){
        this.nome = nome;
        this.atributo = atributo;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Atributo getAtributo(){
        return this.atributo;
    }

    public void setAtributo(Atributo atributo){
        this.atributo = atributo;
    }


}