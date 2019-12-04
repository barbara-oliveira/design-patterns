package com.br.exemplo.templatemethod.devmedia;

public class TreinoNoMeioDaTemporada extends Treinos{
    @Override
    void preparoFisico() {
        System.out.println("Preparo físico intenso");
    }

    @Override
    void jogoTreino() {
        System.out.println("Jogo treino com equipe reserva");
    }
}
