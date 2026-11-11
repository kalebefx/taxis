package com.kalebe.taxis.model;

import java.time.LocalTime;

public class Bloco {
    private String nome;
    private Atributo atributo;
    private LocalTime horasInicio;
    private LocalTime horasFinal;
    private String diaDaSemana;
    private String descricao;

    public Bloco(String nome, Atributo atributo,LocalTime horasInicio,LocalTime horasFinal,String diaDaSemana,String descricao){
        this.nome = nome;
        this.atributo = atributo;
        this.horasInicio = horasInicio;
        this.horasFinal = horasFinal;
        this.diaDaSemana = diaDaSemana;
        this.descricao = descricao;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Atributo getAtributo() {
        return atributo;
    }

    public void setAtributo(Atributo atributo) {
        this.atributo = atributo;
    }

        public LocalTime getHorasInicio() {
        return horasInicio;
    }

    public void setHorasInicio(LocalTime horasInicio) {
        this.horasInicio = horasInicio;
    }

    public LocalTime getHorasFinal() {
        return horasFinal;
    }

    public void setHorasFinal(LocalTime horasFinal) {
        this.horasFinal = horasFinal;
    }

    public String getDiaDaSemana() {
        return diaDaSemana;
    }

    public void setDiaDaSemana(String diaDaSemana) {
        this.diaDaSemana = diaDaSemana;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    




    
}
