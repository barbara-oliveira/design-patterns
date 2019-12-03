package com.br.exemplo.factorymethod.devmedia;

public class FactoryPessoa {
    public Pessoa getPessoa(String nome, String sexo){
        if(sexo.equalsIgnoreCase("M")){
            return new Homem(nome);
        } else if (sexo.equalsIgnoreCase("F")){
            return new Mulher(nome);
        }
        return null;
    }
}
