package com.br.exemplo.strategy.thiengo;

public class CorrerLongaDistancia implements CorrerStrategy {

    @Override
    public void correr() {
        System.out.println("Correr longa distância, caso ncessário");
    }
}
