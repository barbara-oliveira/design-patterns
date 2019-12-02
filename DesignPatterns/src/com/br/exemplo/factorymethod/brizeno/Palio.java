package com.br.exemplo.factorymethod.brizeno;

public class Palio implements Carro {
    @Override
    public void exibirInfo() {
        System.out.println("Modelo: Palio\n Fabricante: Fiat");
    }
}
