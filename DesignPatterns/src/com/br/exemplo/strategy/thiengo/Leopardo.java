package com.br.exemplo.strategy.thiengo;

public class Leopardo extends Felino {
    public Leopardo(){
        correrStrategy = new CorrerLongaDistancia();
    }

    public void display(){
        System.out.println("Leopardo a vista");
    }

    public void rugir(){
        System.out.println("Argh!");
    }
}
