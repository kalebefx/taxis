package com.kalebe.taxis.service;

import com.kalebe.taxis.model.Atributo;
import java.util.ArrayList;


public class AtributoService {
    private ArrayList<Atributo> atributos = new ArrayList<>();

    public ArrayList<Atributo> getAtributos(){
        return this.atributos;
    }

    public void cadastrarAtributo(String nome){
        if(nome.isBlank()){
            return;
        }
        Atributo novoAtributo = new Atributo(nome);
        this.atributos.add(novoAtributo);
    }

    public void excluirAtributo(String nome){
        if(nome == null || nome.isBlank() ){
            return;
        }
        this.atributos.removeIf(apelido -> apelido.getNome().equalsIgnoreCase(nome));

    }

}
