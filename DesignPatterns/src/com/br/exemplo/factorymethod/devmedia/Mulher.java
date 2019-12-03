package com.br.exemplo.factorymethod.devmedia;

public class Mulher extends Pessoa {
    public Mulher(String nome) {
        this.nome = nome;
        System.out.println("Olá senhara: "+this.nome);
    }
}
