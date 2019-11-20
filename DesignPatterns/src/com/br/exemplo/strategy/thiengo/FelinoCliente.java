package com.br.exemplo.strategy.thiengo;

import java.nio.file.LinkOption;

public class FelinoCliente {
    public static void main (String args[]){
        Felino leao = new Leao();
        Felino leopardo = new Leopardo();
        Felino tigreToy = new TigreToy();

        leao.performarCorrer();
        tigreToy.performarCorrer();
        leopardo.performarCorrer();

        leopardo.setCorrerStrategy(new CorrerCurtaDistancia());
        leopardo.performarCorrer();
    }
}
