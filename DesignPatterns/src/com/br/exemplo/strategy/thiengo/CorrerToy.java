package com.br.exemplo.strategy.thiengo;

public class CorrerToy implements CorrerStrategy{

    @Override
    public void correr() {
        System.out.println("Sou um bringuedo, não corro");
    }
}
