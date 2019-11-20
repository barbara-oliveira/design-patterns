package com.br.exemplo.strategy.thiengo;

public class TigreToy extends Felino {
    public TigreToy(){
        correrStrategy = new CorrerToy();
    }

    public void display(){
        System.out.println("Tigre de borracha na banheira");
    }

    public void rugir(){
        System.out.println("Uen!Uen!");
    }
}
