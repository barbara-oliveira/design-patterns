package com.br.exemplo.strategy.thiengo;

public class CorrerCurtaDistancia implements CorrerStrategy {

    @Override
    public void correr() {
        System.out.println("Correr curta distância, porém com o objetivo bem próximo");
    }
}
