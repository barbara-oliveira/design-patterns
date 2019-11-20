package com.br.exemplo.strategy.thiengo;

public class Leao extends Felino {
    public Leao(){
        correrStrategy = new CorrerCurtaDistancia();
    }

    public void display(){
        System.out.println("Leão a vista");
    }

    public void rugir(){
        System.out.println("Urghhhhhhh!");
    }
}
