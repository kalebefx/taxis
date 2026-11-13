package com.kalebe.taxis.model;

import java.time.LocalTime;
import java.util.ArrayList;

public class Bloco {
    private String acao;
    private ArrayList<Atributo> atributo;
    private Habito habito;
    private LocalTime horasInicio;
    private LocalTime horasFinal;
    private String diaDaSemana;
    private String descricao;

    public Bloco(String acao,ArrayList<Atributo> atributo,Habito habito, LocalTime horasInicio,LocalTime horasFinal,String diaDaSemana,String descricao){
        this.acao = acao;
        this.atributo = atributo;
        this.habito = habito;
        this.horasInicio = horasInicio;
        this.horasFinal = horasFinal;
        this.diaDaSemana = diaDaSemana;
        this.descricao = descricao;
    }

    public Bloco(String acao,LocalTime horasInicio,LocalTime horasFinal,String diaDaSemana){
        this.acao = acao;
        this.horasInicio = horasInicio;
        this.horasFinal = horasFinal;
        this.diaDaSemana = diaDaSemana;
    }

    public String getAcao(){
        return this.acao;
    }

    public void setAcao(String acao){
        this.acao = acao;
    }

    public ArrayList<Atributo> getAtributo() {
        return atributo;
    }

    public void setAtributo(ArrayList<Atributo> atributo) {
        this.atributo = atributo;
    }

    public Habito getHabito(){
        return this.habito;

    }

    public void setHabito(Habito habito){
        this.habito = habito;
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
