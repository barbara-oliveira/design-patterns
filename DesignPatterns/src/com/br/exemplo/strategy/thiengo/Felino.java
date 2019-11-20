package com.br.exemplo.strategy.thiengo;

public abstract class Felino {
    protected CorrerStrategy correrStrategy;
    public abstract void display();
    public abstract void rugir();

    public void setCorrerStrategy(CorrerStrategy correrStrategy) {
        this.correrStrategy = correrStrategy;
    }

    public void performarCorrer(){
        correrStrategy.correr();
    }
}
