package com.br.exemplo.templatemethod.devmedia;

public class TreinoNoInicioDaTemporada extends Treinos {
    @Override
    void preparoFisico() {
        System.out.println("Preparo físico leve.");
    }

    @Override
    void jogoTreino() {
        System.out.println("Jogo treino com equipe Junior");
    }
}
