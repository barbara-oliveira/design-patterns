package com.br.exemplo.factorymethod.devmedia;

public class TestApp {
    public static void main(String[] args){
        FactoryPessoa factory = new FactoryPessoa();
        String nome = "Alicia";
        String sexo = "F";
        factory.getPessoa(nome,sexo);
    }
}
